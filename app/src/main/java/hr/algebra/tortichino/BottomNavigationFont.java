package hr.algebra.tortichino;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomNavigationFont extends AppCompatActivity {
    public static void bottom_navigation_font(final Context context, final View v) {
    try {
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            for (int i=0; i < vg.getChildCount(); i++) {
                View child = vg.getChildAt(i);
                bottom_navigation_font(context, child);
            }
        }else if (v instanceof TextView) {
            ((TextView)v).setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/CandyRoundBTN-4.ttf"));
        }
    } catch (Exception e) {

    }
}
}






