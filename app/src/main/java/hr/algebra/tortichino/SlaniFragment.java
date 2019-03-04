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

import hr.algebra.tortichino.slani.Slani1Fragment;
import hr.algebra.tortichino.slani.Slani2Fragment;
import hr.algebra.tortichino.slani.Slani3Fragment;
import hr.algebra.tortichino.slani.Slani4Fragment;
import hr.algebra.tortichino.slani.Slani5Fragment;
import hr.algebra.tortichino.slani.Slani6Fragment;
import hr.algebra.tortichino.slani.Slani7Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SlaniFragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvSlani1, tvSlani2, tvSlani3, tvSlani4, tvSlani5, tvSlani6, tvSlani7;
    private CardView cvSlani1, cvSlani2, cvSlani3, cvSlani4, cvSlani5, cvSlani6, cvSlani7;
    private ImageView back;

    public SlaniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View slaniFrag = inflater.inflate(R.layout.fragment_slani, container, false);

        tvTitle = slaniFrag.findViewById(R.id.tvTitleSlani);
        toolbar = slaniFrag.findViewById(R.id.action_bar_slani);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        back  = slaniFrag.findViewById(R.id.back);
        tvSlani1 = slaniFrag.findViewById(R.id.tvSlani1);
        tvSlani2 = slaniFrag.findViewById(R.id.tvSlani2);
        tvSlani3 = slaniFrag.findViewById(R.id.tvSlani3);
        tvSlani4 = slaniFrag.findViewById(R.id.tvSlani4);
        tvSlani5 = slaniFrag.findViewById(R.id.tvSlani5);
        tvSlani6 = slaniFrag.findViewById(R.id.tvSlani6);
        tvSlani7 = slaniFrag.findViewById(R.id.tvSlani7);

        cvSlani1 = slaniFrag.findViewById(R.id.cvSlani1);
        cvSlani2 = slaniFrag.findViewById(R.id.cvSlani2);
        cvSlani3 = slaniFrag.findViewById(R.id.cvSlani3);
        cvSlani4 = slaniFrag.findViewById(R.id.cvSlani4);
        cvSlani5 = slaniFrag.findViewById(R.id.cvSlani5);
        cvSlani6 = slaniFrag.findViewById(R.id.cvSlani6);
        cvSlani7 = slaniFrag.findViewById(R.id.cvSlani7);



        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        tvSlani1.setTypeface(title);
        tvSlani2.setTypeface(title);
        tvSlani3.setTypeface(title);
        tvSlani4.setTypeface(title);
        tvSlani5.setTypeface(title);
        tvSlani6.setTypeface(title);
        tvSlani7.setTypeface(title);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSlani1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Slani1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSlani2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Slani2Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSlani3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Slani3Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSlani4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Slani4Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSlani5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Slani5Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSlani6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Slani6Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSlani7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Slani7Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return slaniFrag;
    }

}
