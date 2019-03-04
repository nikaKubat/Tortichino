package hr.algebra.tortichino.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "recepti.db";
    public static final String TABLE_NAME = "recepti";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAZIV = "naziv";
    public static final String COLUMN_SASTOJCI = "sastojci";
    public static final String COLUMN_POSTUPAK = "postupak";

    private static final String CREATE_SQL = "create table " + TABLE_NAME
            + "(" + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_NAZIV + " text not null, "
            + COLUMN_SASTOJCI + " text not null, "
            + COLUMN_POSTUPAK + " text not null );";
    private static final String DROP_SQL = "DROP TABLE " + TABLE_NAME + ";";


    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_SQL);
        onCreate(db);
    }

    public long insert(ContentValues values) {
        long id = getWritableDatabase().insert(TABLE_NAME, null, values);
        return id;
    }

    public Cursor query(String id, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
        sqLiteQueryBuilder.setTables(TABLE_NAME);

        if (id != null) {
            sqLiteQueryBuilder.appendWhere("_id" + " = " + id);
        }

        Cursor cursor = sqLiteQueryBuilder.query(getReadableDatabase(), projection, selection, selectionArgs, null, null, sortOrder);

        return cursor;
    }

    public int update(String id, ContentValues values) {
        if (id == null) {
            //null - svi podaci
            return getWritableDatabase().update(TABLE_NAME, values, null, null);
        } else {
            //_id=? - jedan redak
            return getWritableDatabase().update(TABLE_NAME, values, "_id=?", new String[]{id});
        }
    }

    public int delete(String id) {
        if (id == null) {
            return getWritableDatabase().delete(TABLE_NAME, null, null);
        } else {
            return getWritableDatabase().delete(TABLE_NAME, "_id=?", new String[]{id});
        }
    }




}
