package hr.algebra.tortichino.database;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class MyContentProvider extends ContentProvider {
    private DatabaseHelper databaseHelper;
    private static final String AUTHORITY = "hr.algebra.tortichino.provider";
    private static final String PATH = "recepti";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + PATH);

    private static final int RECEPTI = 10;
    private static final int RECEPT_ID = 20;
    private static final UriMatcher URI_MATCHER = createUriMatcher();





    private static UriMatcher createUriMatcher() {
        UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(AUTHORITY, PATH, RECEPTI);
        uriMatcher.addURI(AUTHORITY, PATH + "/#", RECEPT_ID);
        return uriMatcher;
    }

    //nula ili više dohvacenih podataka
    public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/recepti";

    //jedan dohvacen podatak
    public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/recept";


    public MyContentProvider() {
    }


    @Override
    public String getType(Uri uri) {
        switch (URI_MATCHER.match(uri)) {
            case RECEPTI:
                return CONTENT_TYPE;

            case RECEPT_ID:
                return CONTENT_ITEM_TYPE;

            default: return null;
        }
    }

    @Override
    public boolean onCreate() {
        databaseHelper = new DatabaseHelper(getContext());
        return true;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        final int match = URI_MATCHER.match(uri);
        long id = databaseHelper.insert(values);
        switch (match){
            case RECEPTI:
                Uri returnUri = ContentUris.withAppendedId(CONTENT_URI, id);
            return returnUri;

                default:
                    throw new IllegalArgumentException("Insertion is not supported for " + uri);
        }

    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        String id = null;
        if (URI_MATCHER.match(uri) == RECEPT_ID) {
            id = uri.getPathSegments().get(1);
        }
        return databaseHelper.query(id, projection, selection, selectionArgs, sortOrder);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        String id = null;
        if (URI_MATCHER.match(uri) == RECEPT_ID) {
            id = uri.getPathSegments().get(1);
        }
        return databaseHelper.update(id, values);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        String id = null;
        if (URI_MATCHER.match(uri) == RECEPT_ID) {
            id = uri.getPathSegments().get(1);
        }
        return databaseHelper.delete(id);
    }




}
