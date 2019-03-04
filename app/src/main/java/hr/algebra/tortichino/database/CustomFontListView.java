package hr.algebra.tortichino.database;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import hr.algebra.tortichino.R;


public class CustomFontListView extends SimpleCursorAdapter {

    private Typeface listFont;

    public CustomFontListView(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
        listFont = Typeface.createFromAsset(context.getAssets(), "fonts/CandyRoundBTN-4.ttf");
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        super.bindView(view, context, cursor);
        final TextView textViewNaziv = view.findViewById(R.id.tvNazivMojRecept);
        textViewNaziv.setTypeface(listFont);
    }
}
