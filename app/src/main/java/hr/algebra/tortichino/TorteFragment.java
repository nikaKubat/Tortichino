package hr.algebra.tortichino;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import hr.algebra.tortichino.torte.Torta10Fragment;
import hr.algebra.tortichino.torte.Torta11Fragment;
import hr.algebra.tortichino.torte.Torta12Fragment;
import hr.algebra.tortichino.torte.Torta13Fragment;
import hr.algebra.tortichino.torte.Torta14Fragment;
import hr.algebra.tortichino.torte.Torta15Fragment;
import hr.algebra.tortichino.torte.Torta16Fragment;
import hr.algebra.tortichino.torte.Torta1Fragment;
import hr.algebra.tortichino.torte.Torta2Fragment;
import hr.algebra.tortichino.torte.Torta3Fragment;
import hr.algebra.tortichino.torte.Torta5Fragment;
import hr.algebra.tortichino.torte.Torta6Fragment;
import hr.algebra.tortichino.torte.Torta7Fragment;
import hr.algebra.tortichino.torte.Torta8Fragment;
import hr.algebra.tortichino.torte.Torta9Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TorteFragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTorta1, tvTorta2, tvTorta3, tvTorta5, tvTorta6, tvTorta7, tvTorta8;
    private TextView tvTorta9, tvTorta10, tvTorta11, tvTorta12, tvTorta13, tvTorta14, tvTorta15, tvTorta16;
    private CardView cvTorta1, cvTorta2, cvTorta3, cvTorta5, cvTorta6, cvTorta7, cvTorta8, cvTorta9;
    private CardView cvTorta10, cvTorta11, cvTorta12, cvTorta13, cvTorta14, cvTorta15, cvTorta16;
    private ImageView back;


    public TorteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View torteFragment = inflater.inflate(R.layout.fragment_torte, container, false);

        toolbar = torteFragment.findViewById(R.id.action_bar_torte);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
       // ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
       // ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        back = torteFragment.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.commit();
            }
        });


        tvTitle = torteFragment.findViewById(R.id.tvTitleTorte);
        tvTorta1 = torteFragment.findViewById(R.id.tvTorta1);
        tvTorta2 = torteFragment.findViewById(R.id.tvTorta2);
        tvTorta3 = torteFragment.findViewById(R.id.tvTorta3);
        tvTorta5 = torteFragment.findViewById(R.id.tvTorta5);
        tvTorta6 = torteFragment.findViewById(R.id.tvTorta6);
        tvTorta7 = torteFragment.findViewById(R.id.tvTorta7);
        tvTorta8 = torteFragment.findViewById(R.id.tvTorta8);
        tvTorta9 = torteFragment.findViewById(R.id.tvTorta9);
        tvTorta10 = torteFragment.findViewById(R.id.tvTorta10);
        tvTorta11 = torteFragment.findViewById(R.id.tvTorta11);
        tvTorta12 = torteFragment.findViewById(R.id.tvTorta12);
        tvTorta13 = torteFragment.findViewById(R.id.tvTorta13);
        tvTorta14 = torteFragment.findViewById(R.id.tvTorta14);
        tvTorta15 = torteFragment.findViewById(R.id.tvTorta15);
        tvTorta16 = torteFragment.findViewById(R.id.tvTorta16);
        cvTorta1 = torteFragment.findViewById(R.id.cvTorta1);
        cvTorta2 = torteFragment.findViewById(R.id.cvTorta2);
        cvTorta3 = torteFragment.findViewById(R.id.cvTorta3);
        cvTorta5 = torteFragment.findViewById(R.id.cvTorta5);
        cvTorta6 = torteFragment.findViewById(R.id.cvTorta6);
        cvTorta7 = torteFragment.findViewById(R.id.cvTorta7);
        cvTorta8 = torteFragment.findViewById(R.id.cvTorta8);
        cvTorta9 = torteFragment.findViewById(R.id.cvTorta9);
        cvTorta10 = torteFragment.findViewById(R.id.cvTorta10);
        cvTorta11 = torteFragment.findViewById(R.id.cvTorta11);
        cvTorta12 = torteFragment.findViewById(R.id.cvTorta12);
        cvTorta13 = torteFragment.findViewById(R.id.cvTorta13);
        cvTorta14 = torteFragment.findViewById(R.id.cvTorta14);
        cvTorta15 = torteFragment.findViewById(R.id.cvTorta15);
        cvTorta16 = torteFragment.findViewById(R.id.cvTorta16);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        tvTorta1.setTypeface(title);
        tvTorta2.setTypeface(title);
        tvTorta3.setTypeface(title);
        tvTorta5.setTypeface(title);
        tvTorta6.setTypeface(title);
        tvTorta7.setTypeface(title);
        tvTorta8.setTypeface(title);
        tvTorta9.setTypeface(title);
        tvTorta10.setTypeface(title);
        tvTorta11.setTypeface(title);
        tvTorta12.setTypeface(title);
        tvTorta13.setTypeface(title);
        tvTorta14.setTypeface(title);
        tvTorta15.setTypeface(title);
        tvTorta16.setTypeface(title);






        cvTorta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta2Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta3Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        cvTorta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta5Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta6Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta7Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta8Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta9Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta10Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta11Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta12Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta13Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta14Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta15Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTorta16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Torta16Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return torteFragment;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {




        return super.onOptionsItemSelected(item);
    }
}
