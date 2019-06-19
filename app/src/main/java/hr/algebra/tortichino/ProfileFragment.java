package hr.algebra.tortichino;


import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.drm.DrmStore;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import hr.algebra.tortichino.database.CustomFontListView;
import hr.algebra.tortichino.database.DatabaseHelper;
import hr.algebra.tortichino.database.MyContentProvider;
import hr.algebra.tortichino.preference.PreferenceScreen;
import hr.algebra.tortichino.preference.PreferenceScreenActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvMojiRecepti, tvNaziv;
    private EditText etNaziv, etSastojci, etPostupak;
    private Button bDodaj, bUredi;
    private ImageView trash;
    private ListView listView;
    private CustomFontListView adapter;
    private long selectedID = -1;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View profil = inflater.inflate(R.layout.fragment_profile, container, false);

        setHasOptionsMenu(true);
        toolbar = profil.findViewById(R.id.action_bar_profil);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        tvMojiRecepti = profil.findViewById(R.id.tvMojiRecepti);
        etNaziv = profil.findViewById(R.id.etNaziv);
        etSastojci = profil.findViewById(R.id.etSastojci);
        etPostupak = profil.findViewById(R.id.etPostupak);
        bDodaj = profil.findViewById(R.id.bDodaj);
        bUredi = profil.findViewById(R.id.bUredi);
        trash = profil.findViewById(R.id.ivSmece);
        listView = profil.findViewById(R.id.lvRecepti);
        tvNaziv = profil.findViewById(R.id.tvNazivMojRecept);


        String[] columns = {DatabaseHelper.COLUMN_NAZIV};
        int[] viewIds = {R.id.tvNazivMojRecept};
        adapter = new CustomFontListView(getContext(), R.layout.list_view_moji_recepti, null, columns, viewIds, 0);
        listView.setAdapter(adapter);
        CursorLoader cursorLoader = new CursorLoader(getContext(), MyContentProvider.CONTENT_URI, null, null, null, null);
        final Cursor cursor = cursorLoader.loadInBackground();
        adapter.swapCursor(cursor);



        bDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etNaziv.getText().length() == 0) {
                    Toast.makeText(getContext(), R.string.unesite_naziv_recepta, Toast.LENGTH_SHORT).show();
                    etNaziv.setError("Unesite naziv recepta");
                    etNaziv.requestFocus();
                }

                if (etSastojci.getText().length() == 0) {
                    Toast.makeText(getContext(), "Unesite sastojke", Toast.LENGTH_SHORT).show();
                    etSastojci.setError("Unesite sastojke");
                    etSastojci.requestFocus();
                }

                if (etPostupak.getText().length() == 0) {
                    Toast.makeText(getContext(), "Unesite postupak", Toast.LENGTH_SHORT).show();
                    etPostupak.setError("Unesite postupak");
                    etPostupak.requestFocus();
                }

                if (etNaziv.getText().length() != 0 &&
                        etSastojci.getText().length() != 0 &&
                        etPostupak.getText().length() != 0) {
                    String naziv = etNaziv.getText().toString();
                    String sastojci = etSastojci.getText().toString();
                    String postupak = etPostupak.getText().toString();

                    ContentValues values = new ContentValues();
                    values.put(DatabaseHelper.COLUMN_NAZIV, naziv);
                    values.put(DatabaseHelper.COLUMN_SASTOJCI, sastojci);
                    values.put(DatabaseHelper.COLUMN_POSTUPAK, postupak);
                    getActivity().getContentResolver().insert(MyContentProvider.CONTENT_URI, values);

                    CursorLoader cursorLoader = new CursorLoader(getContext(), MyContentProvider.CONTENT_URI, null, null, null, null);
                    final Cursor cursor = cursorLoader.loadInBackground();
                    adapter.swapCursor(cursor);

                    etNaziv.setText("");
                    etPostupak.setText("");
                    etSastojci.setText("");
                    selectedID = -1;
                    getPreferences();
                }
            }
        });

        bUredi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedID != -1) {
                    String naziv = etNaziv.getText().toString();
                    String sastojci = etSastojci.getText().toString();
                    String postupak = etPostupak.getText().toString();

                    ContentValues values = new ContentValues();
                    values.put(DatabaseHelper.COLUMN_NAZIV, naziv);
                    values.put(DatabaseHelper.COLUMN_SASTOJCI, sastojci);
                    values.put(DatabaseHelper.COLUMN_POSTUPAK, postupak);
                    Uri uri = Uri.parse(MyContentProvider.CONTENT_URI + "/" + selectedID);
                    getActivity().getContentResolver().update(uri, values, null, null);

                    CursorLoader cursorLoader = new CursorLoader(getContext(), MyContentProvider.CONTENT_URI, null, null, null, null);
                    final Cursor cursor = cursorLoader.loadInBackground();
                    adapter.swapCursor(cursor);

                    etNaziv.setText("");
                    etPostupak.setText("");
                    etSastojci.setText("");
                    selectedID = -1;
                } else {
                    Toast.makeText(getContext(), "Izaberite recept", Toast.LENGTH_SHORT).show();
                }

            }
        });

        trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedID != -1) {
                    Uri uri = Uri.parse(MyContentProvider.CONTENT_URI + "/" + selectedID);
                    getActivity().getContentResolver().delete(uri, null, null);

                    CursorLoader cursorLoader = new CursorLoader(getContext(), MyContentProvider.CONTENT_URI, null, null, null, null);
                    final Cursor cursor = cursorLoader.loadInBackground();
                    adapter.swapCursor(cursor);

                    etNaziv.setText("");
                    etPostupak.setText("");
                    etSastojci.setText("");
                    selectedID = -1;
                } else {
                    Toast.makeText(getContext(), "Izaberite recept", Toast.LENGTH_SHORT).show();
                }
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                selectedID = id;

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                MojReceptFragment mojReceptFragment = new MojReceptFragment();

                Uri uri = Uri.parse(MyContentProvider.CONTENT_URI + "/" + selectedID);
                CursorLoader cursorLoader = new CursorLoader(getContext(), uri, null, null, null, null);
                Cursor cursor = cursorLoader.loadInBackground();

                if (cursor.moveToFirst()) {
                    String naziv = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_NAZIV));
                    etNaziv.setText(naziv);
                }
                String sastojci = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_SASTOJCI));
                String postupak = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_POSTUPAK));
                etSastojci.setText(sastojci);
                etPostupak.setText(postupak);
                String naziv = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_NAZIV));
                etNaziv.setText(naziv);

                Bundle bundle = new Bundle();
                bundle.putString("SASTOJCI_KEY", sastojci);
                bundle.putString("POSTUPAK_KEY", postupak);
                bundle.putString("NAZIV_KEY", naziv);

                mojReceptFragment.setArguments(bundle);
                transaction.replace(R.id.fragment_container, mojReceptFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvMojiRecepti.setTypeface(title);
        etNaziv.setTypeface(title);
        etPostupak.setTypeface(title);
        etSastojci.setTypeface(title);





        Typeface button = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        bUredi.setTypeface(button);
        bDodaj.setTypeface(button);


        return profil;
    }

    private void getPreferences() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        if (preferences.contains("boja")) {
            if (preferences.getString("boja", "0").equals("1")) {
                getActivity().getWindow().getDecorView().setBackgroundResource(R.color.darkWhite);
            } else if (preferences.getString("boja", "0").equals("2")) {
                getActivity().getWindow().getDecorView().setBackgroundResource(R.drawable.background_tockice_roze);
            } else if (preferences.getString("boja", "0").equals("3")) {
                getActivity().getWindow().getDecorView().setBackgroundResource(R.drawable.background_tockice_zelene);
            } else if (preferences.getString("boja", "0").equals("4")) {
                getActivity().getWindow().getDecorView().setBackgroundResource(R.drawable.background_tockice_tirk);
            } else if (preferences.getString("boja", "0").equals("5")) {
                getActivity().getWindow().getDecorView().setBackgroundResource(R.drawable.background_tockice_plave);
            } else if (preferences.getString("boja", "0").equals("6")) {
                getActivity().getWindow().getDecorView().setBackgroundResource(R.drawable.background_tockice_crvene);
            }
        }
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.action_bar_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.preference) {
            Intent intent = new Intent(getActivity(), PreferenceScreenActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResume() {
        super.onResume();
        getPreferences();
    }
}
