package hr.algebra.tortichino;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private TextView tvLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();


        loadFragment(new HomeFragment());
    }

    private void initWidgets() {
        BottomNavigationView navigation = findViewById(R.id.navigation);
        BottomNavigationFont.bottom_navigation_font(getApplicationContext(), navigation);
        navigation.setOnNavigationItemSelectedListener(this);
        tvLogo = findViewById(R.id.tvLogo);

    }


    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;


            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;

        }


        return loadFragment(fragment);
    }
}
