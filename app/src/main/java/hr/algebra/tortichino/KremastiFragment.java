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

import hr.algebra.tortichino.kremasti.Krem10Fragment;
import hr.algebra.tortichino.kremasti.Krem11Fragment;
import hr.algebra.tortichino.kremasti.Krem12Fragment;
import hr.algebra.tortichino.kremasti.Krem13Fragment;
import hr.algebra.tortichino.kremasti.Krem14Fragment;
import hr.algebra.tortichino.kremasti.Krem15Fragment;
import hr.algebra.tortichino.kremasti.Krem16Fragment;
import hr.algebra.tortichino.kremasti.Krem17Fragment;
import hr.algebra.tortichino.kremasti.Krem18Fragment;
import hr.algebra.tortichino.kremasti.Krem19Fragment;
import hr.algebra.tortichino.kremasti.Krem1Fragment;
import hr.algebra.tortichino.kremasti.Krem20Fragment;
import hr.algebra.tortichino.kremasti.Krem21Fragment;
import hr.algebra.tortichino.kremasti.Krem22Fragment;
import hr.algebra.tortichino.kremasti.Krem23Fragment;
import hr.algebra.tortichino.kremasti.Krem24Fragment;
import hr.algebra.tortichino.kremasti.Krem25Fragment;
import hr.algebra.tortichino.kremasti.Krem26Fragment;
import hr.algebra.tortichino.kremasti.Krem27Fragment;
import hr.algebra.tortichino.kremasti.Krem28Fragment;
import hr.algebra.tortichino.kremasti.Krem29Fragment;
import hr.algebra.tortichino.kremasti.Krem2Fragment;
import hr.algebra.tortichino.kremasti.Krem3Fragment;
import hr.algebra.tortichino.kremasti.Krem4Fragment;
import hr.algebra.tortichino.kremasti.Krem5Fragment;
import hr.algebra.tortichino.kremasti.Krem6Fragment;
import hr.algebra.tortichino.kremasti.Krem8Fragment;
import hr.algebra.tortichino.kremasti.Krem9Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class KremastiFragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvKrem1, tvKrem2, tvKrem3, tvKrem4, tvKrem5, tvKrem6, tvKrem8, tvKrem9, tvKrem10;
    private TextView tvKrem11, tvKrem12, tvKrem13, tvKrem14, tvKrem15, tvKrem16, tvKrem17, tvKrem18, tvKrem19, tvKrem20;
    private TextView tvKrem21, tvKrem22, tvKrem23, tvKrem24, tvKrem25, tvKrem26, tvKrem27, tvKrem28, tvKrem29;
    private CardView cvKrem1, cvKrem2, cvKrem3, cvKrem4, cvKrem5, cvKrem6, cvKrem8, cvKrem9, cvKrem10;
    private CardView cvKrem11, cvKrem12, cvKrem13, cvKrem14, cvKrem15, cvKrem16, cvKrem17, cvKrem18, cvKrem19, cvKrem20;
    private CardView cvKrem21, cvKrem22, cvKrem23, cvKrem24, cvKrem25, cvKrem26, cvKrem27, cvKrem28, cvKrem29;
    private ImageView back;


    public KremastiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View kremastiFragment = inflater.inflate(R.layout.fragment_kremasti, container, false);

        toolbar = kremastiFragment.findViewById(R.id.action_bar_krem);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = kremastiFragment.findViewById(R.id.tvTitleKrem);
        tvKrem1 = kremastiFragment.findViewById(R.id.tvKremasti1);
        tvKrem2 = kremastiFragment.findViewById(R.id.tvKremasti2);
        tvKrem3 = kremastiFragment.findViewById(R.id.tvKremasti3);
        tvKrem4 = kremastiFragment.findViewById(R.id.tvKremasti4);
        tvKrem5 = kremastiFragment.findViewById(R.id.tvKremasti5);
        tvKrem6 = kremastiFragment.findViewById(R.id.tvKremasti6);
        tvKrem8 = kremastiFragment.findViewById(R.id.tvKremasti8);
        tvKrem9 = kremastiFragment.findViewById(R.id.tvKremasti9);
        tvKrem10 = kremastiFragment.findViewById(R.id.tvKremasti10);
        tvKrem11 = kremastiFragment.findViewById(R.id.tvKremasti11);
        tvKrem12 = kremastiFragment.findViewById(R.id.tvKremasti12);
        tvKrem13 = kremastiFragment.findViewById(R.id.tvKremasti13);
        tvKrem14 = kremastiFragment.findViewById(R.id.tvKremasti14);
        tvKrem15 = kremastiFragment.findViewById(R.id.tvKremasti15);
        tvKrem16 = kremastiFragment.findViewById(R.id.tvKremasti16);
        tvKrem17 = kremastiFragment.findViewById(R.id.tvKremasti17);
        tvKrem18 = kremastiFragment.findViewById(R.id.tvKremasti18);
        tvKrem19 = kremastiFragment.findViewById(R.id.tvKremasti19);
        tvKrem20 = kremastiFragment.findViewById(R.id.tvKremasti20);
        tvKrem21 = kremastiFragment.findViewById(R.id.tvKremasti21);
        tvKrem22 = kremastiFragment.findViewById(R.id.tvKremasti22);
        tvKrem23 = kremastiFragment.findViewById(R.id.tvKremasti23);
        tvKrem24 = kremastiFragment.findViewById(R.id.tvKremasti24);
        tvKrem25 = kremastiFragment.findViewById(R.id.tvKremasti25);
        tvKrem26 = kremastiFragment.findViewById(R.id.tvKremasti26);
        tvKrem27 = kremastiFragment.findViewById(R.id.tvKremasti27);
        tvKrem28 = kremastiFragment.findViewById(R.id.tvKremasti28);
        tvKrem29 = kremastiFragment.findViewById(R.id.tvKremasti29);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        tvKrem1.setTypeface(title);
        tvKrem2.setTypeface(title);
        tvKrem3.setTypeface(title);
        tvKrem4.setTypeface(title);
        tvKrem5.setTypeface(title);
        tvKrem6.setTypeface(title);
        tvKrem8.setTypeface(title);
        tvKrem9.setTypeface(title);
        tvKrem10.setTypeface(title);
        tvKrem11.setTypeface(title);
        tvKrem12.setTypeface(title);
        tvKrem13.setTypeface(title);
        tvKrem14.setTypeface(title);
        tvKrem15.setTypeface(title);
        tvKrem16.setTypeface(title);
        tvKrem17.setTypeface(title);
        tvKrem18.setTypeface(title);
        tvKrem19.setTypeface(title);
        tvKrem20.setTypeface(title);
        tvKrem21.setTypeface(title);
        tvKrem22.setTypeface(title);
        tvKrem23.setTypeface(title);
        tvKrem24.setTypeface(title);
        tvKrem25.setTypeface(title);
        tvKrem26.setTypeface(title);
        tvKrem27.setTypeface(title);
        tvKrem28.setTypeface(title);
        tvKrem29.setTypeface(title);



        cvKrem1 = kremastiFragment.findViewById(R.id.cvKremasti1);
        cvKrem2 = kremastiFragment.findViewById(R.id.cvKremasti2);
        cvKrem3 = kremastiFragment.findViewById(R.id.cvKremasti3);
        cvKrem4 = kremastiFragment.findViewById(R.id.cvKremasti4);
        cvKrem5 = kremastiFragment.findViewById(R.id.cvKremasti5);
        cvKrem6 = kremastiFragment.findViewById(R.id.cvKremasti6);
        cvKrem8 = kremastiFragment.findViewById(R.id.cvKremasti8);
        cvKrem9 = kremastiFragment.findViewById(R.id.cvKremasti9);
        cvKrem10 = kremastiFragment.findViewById(R.id.cvKremasti10);
        cvKrem11 = kremastiFragment.findViewById(R.id.cvKremasti11);
        cvKrem12 = kremastiFragment.findViewById(R.id.cvKremasti12);
        cvKrem13 = kremastiFragment.findViewById(R.id.cvKremasti13);
        cvKrem14 = kremastiFragment.findViewById(R.id.cvKremasti14);
        cvKrem15 = kremastiFragment.findViewById(R.id.cvKremasti15);
        cvKrem16 = kremastiFragment.findViewById(R.id.cvKremasti16);
        cvKrem17 = kremastiFragment.findViewById(R.id.cvKremasti17);
        cvKrem18 = kremastiFragment.findViewById(R.id.cvKremasti18);
        cvKrem19 = kremastiFragment.findViewById(R.id.cvKremasti19);
        cvKrem20 = kremastiFragment.findViewById(R.id.cvKremasti20);
        cvKrem21 = kremastiFragment.findViewById(R.id.cvKremasti21);
        cvKrem22 = kremastiFragment.findViewById(R.id.cvKremasti22);
        cvKrem23 = kremastiFragment.findViewById(R.id.cvKremasti23);
        cvKrem24 = kremastiFragment.findViewById(R.id.cvKremasti24);
        cvKrem25 = kremastiFragment.findViewById(R.id.cvKremasti25);
        cvKrem26 = kremastiFragment.findViewById(R.id.cvKremasti26);
        cvKrem27 = kremastiFragment.findViewById(R.id.cvKremasti27);
        cvKrem28 = kremastiFragment.findViewById(R.id.cvKremasti28);
        cvKrem29 = kremastiFragment.findViewById(R.id.cvKremasti29);

        cvKrem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem2Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem3Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem4Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem5Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem6Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        cvKrem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem8Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem9Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem10Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem11Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem12Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem13Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem14Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem15Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem16Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem17Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem18Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem19Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem20Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem21Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem22Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem23Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem24Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem25Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem26Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem27Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem28Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvKrem29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Krem29Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        back = kremastiFragment.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return kremastiFragment;
    }

}
