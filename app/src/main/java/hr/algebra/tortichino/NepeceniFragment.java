package hr.algebra.tortichino;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import hr.algebra.tortichino.nepeceni.Nep10Fragment;
import hr.algebra.tortichino.nepeceni.Nep1Fragment;
import hr.algebra.tortichino.nepeceni.Nep2Fragment;
import hr.algebra.tortichino.nepeceni.Nep3Fragment;
import hr.algebra.tortichino.nepeceni.Nep4Fragment;
import hr.algebra.tortichino.nepeceni.Nep5Fragment;
import hr.algebra.tortichino.nepeceni.Nep6Fragment;
import hr.algebra.tortichino.nepeceni.Nep7Fragment;
import hr.algebra.tortichino.nepeceni.Nep8Fragment;
import hr.algebra.tortichino.nepeceni.Nep9Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class NepeceniFragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvNepeceni1, tvNepeceni2, tvNepeceni3, tvNepeceni4, tvNepeceni5, tvNepeceni6, tvNepeceni7, tvNepeceni8, tvNepeceni9, tvNepeceni10;
    private CardView cvNepeceni1, cvNepeceni2, cvNepeceni3, cvNepeceni4, cvNepeceni5, cvNepeceni6, cvNepeceni7, cvNepeceni8, cvNepeceni9, cvNepeceni10;


    public NepeceniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View nepeceni = inflater.inflate(R.layout.fragment_nepeceni, container, false);

        toolbar = nepeceni.findViewById(R.id.actionbar_nepeceni);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nepeceni.findViewById(R.id.tvTitleNepec);
        tvNepeceni1 = nepeceni.findViewById(R.id.tvNepeceni1);
        tvNepeceni2 = nepeceni.findViewById(R.id.tvNepeceni2);
        tvNepeceni3 = nepeceni.findViewById(R.id.tvNepeceni3);
        tvNepeceni4 = nepeceni.findViewById(R.id.tvNepeceni4);
        tvNepeceni5 = nepeceni.findViewById(R.id.tvNepeceni5);
        tvNepeceni6 = nepeceni.findViewById(R.id.tvNepeceni6);
        tvNepeceni7 = nepeceni.findViewById(R.id.tvNepeceni7);
        tvNepeceni8 = nepeceni.findViewById(R.id.tvNepeceni8);
        tvNepeceni9 = nepeceni.findViewById(R.id.tvNepeceni9);
        tvNepeceni10 = nepeceni.findViewById(R.id.tvNepeceni10);
        cvNepeceni1 = nepeceni.findViewById(R.id.cvNepeceni1);
        cvNepeceni2 = nepeceni.findViewById(R.id.cvNepeceni2);
        cvNepeceni3 = nepeceni.findViewById(R.id.cvNepeceni3);
        cvNepeceni4 = nepeceni.findViewById(R.id.cvNepeceni4);
        cvNepeceni5 = nepeceni.findViewById(R.id.cvNepeceni5);
        cvNepeceni6 = nepeceni.findViewById(R.id.cvNepeceni6);
        cvNepeceni7 = nepeceni.findViewById(R.id.cvNepeceni7);
        cvNepeceni8 = nepeceni.findViewById(R.id.cvNepeceni8);
        cvNepeceni9 = nepeceni.findViewById(R.id.cvNepeceni9);
        cvNepeceni10 = nepeceni.findViewById(R.id.cvNepeceni10);


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        tvNepeceni1.setTypeface(title);
        tvNepeceni2.setTypeface(title);
        tvNepeceni3.setTypeface(title);
        tvNepeceni4.setTypeface(title);
        tvNepeceni5.setTypeface(title);
        tvNepeceni6.setTypeface(title);
        tvNepeceni7.setTypeface(title);
        tvNepeceni8.setTypeface(title);
        tvNepeceni9.setTypeface(title);
        tvNepeceni10.setTypeface(title);



        cvNepeceni1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep2Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep3Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep4Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep5Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep6Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep7Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep9Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep10Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvNepeceni8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Nep8Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        back = nepeceni.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return nepeceni;
    }

}
