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

import hr.algebra.tortichino.tradicionalni.Trad10Fragment;
import hr.algebra.tortichino.tradicionalni.Trad11Fragment;
import hr.algebra.tortichino.tradicionalni.Trad12Fragment;
import hr.algebra.tortichino.tradicionalni.Trad13Fragment;
import hr.algebra.tortichino.tradicionalni.Trad14Fragment;
import hr.algebra.tortichino.tradicionalni.Trad15Fragment;
import hr.algebra.tortichino.tradicionalni.Trad16Fragment;
import hr.algebra.tortichino.tradicionalni.Trad17Fragment;
import hr.algebra.tortichino.tradicionalni.Trad18Fragment;
import hr.algebra.tortichino.tradicionalni.Trad19Fragment;
import hr.algebra.tortichino.tradicionalni.Trad1Fragment;
import hr.algebra.tortichino.tradicionalni.Trad2Fragment;
import hr.algebra.tortichino.tradicionalni.Trad3Fragment;
import hr.algebra.tortichino.tradicionalni.Trad4Fragment;
import hr.algebra.tortichino.tradicionalni.Trad5Fragment;
import hr.algebra.tortichino.tradicionalni.Trad6Fragment;
import hr.algebra.tortichino.tradicionalni.Trad7Fragment;
import hr.algebra.tortichino.tradicionalni.Trad8Fragment;
import hr.algebra.tortichino.tradicionalni.Trad9Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TradicionalniFragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageView back;
    private TextView tvTrad1, tvTrad2, tvTrad3, tvTrad4, tvTrad5, tvTrad6, tvTrad7, tvTrad8, tvTrad9, tvTrad10;
    private TextView tvTrad11, tvTrad12, tvTrad13, tvTrad14, tvTrad15, tvTrad16, tvTrad17, tvTrad18, tvTrad19;
    private CardView cvTrad1, cvTrad2, cvTrad3, cvTrad4, cvTrad5, cvTrad6, cvTrad7, cvTrad8, cvTrad9, cvTrad10;
    private CardView cvTrad11, cvTrad12, cvTrad13, cvTrad14, cvTrad15, cvTrad16, cvTrad17, cvTrad18, cvTrad19;

    public TradicionalniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View tradFragment = inflater.inflate(R.layout.fragment_tradicionalni, container, false);

        tvTitle = tradFragment.findViewById(R.id.tvTitleTrad);
        toolbar = tradFragment.findViewById(R.id.action_bar_trad);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTrad1 = tradFragment.findViewById(R.id.tvTradicionalni1);
        tvTrad2 = tradFragment.findViewById(R.id.tvTradicionalni2);
        tvTrad3 = tradFragment.findViewById(R.id.tvTradicionalni3);
        tvTrad4 = tradFragment.findViewById(R.id.tvTradicionalni4);
        tvTrad5 = tradFragment.findViewById(R.id.tvTradicionalni5);
        tvTrad6 = tradFragment.findViewById(R.id.tvTradicionalni6);
        tvTrad7 = tradFragment.findViewById(R.id.tvTradicionalni7);
        tvTrad8 = tradFragment.findViewById(R.id.tvTradicionalni8);
        tvTrad9 = tradFragment.findViewById(R.id.tvTradicionalni9);
        tvTrad10 = tradFragment.findViewById(R.id.tvTradicionalni10);
        tvTrad11 = tradFragment.findViewById(R.id.tvTradicionalni11);
        tvTrad12 = tradFragment.findViewById(R.id.tvTradicionalni12);
        tvTrad13 = tradFragment.findViewById(R.id.tvTradicionalni13);
        tvTrad14 = tradFragment.findViewById(R.id.tvTradicionalni14);
        tvTrad15 = tradFragment.findViewById(R.id.tvTradicionalni15);
        tvTrad16 = tradFragment.findViewById(R.id.tvTradicionalni16);
        tvTrad17 = tradFragment.findViewById(R.id.tvTradicionalni17);
        tvTrad18 = tradFragment.findViewById(R.id.tvTradicionalni18);
        tvTrad19 = tradFragment.findViewById(R.id.tvTradicionalni19);

        cvTrad1 = tradFragment.findViewById(R.id.cvTradicionalni1);
        cvTrad2 = tradFragment.findViewById(R.id.cvTradicionalni2);
        cvTrad3 = tradFragment.findViewById(R.id.cvTradicionalni3);
        cvTrad4 = tradFragment.findViewById(R.id.cvTradicionalni4);
        cvTrad5 = tradFragment.findViewById(R.id.cvTradicionalni5);
        cvTrad6 = tradFragment.findViewById(R.id.cvTradicionalni6);
        cvTrad7 = tradFragment.findViewById(R.id.cvTradicionalni7);
        cvTrad8 = tradFragment.findViewById(R.id.cvTradicionalni8);
        cvTrad9 = tradFragment.findViewById(R.id.cvTradicionalni9);
        cvTrad10 = tradFragment.findViewById(R.id.cvTradicionalni10);
        cvTrad11 = tradFragment.findViewById(R.id.cvTradicionalni11);
        cvTrad12 = tradFragment.findViewById(R.id.cvTradicionalni12);
        cvTrad13 = tradFragment.findViewById(R.id.cvTradicionalni13);
        cvTrad14 = tradFragment.findViewById(R.id.cvTradicionalni14);
        cvTrad15 = tradFragment.findViewById(R.id.cvTradicionalni15);
        cvTrad16 = tradFragment.findViewById(R.id.cvTradicionalni16);
        cvTrad17 = tradFragment.findViewById(R.id.cvTradicionalni17);
        cvTrad18 = tradFragment.findViewById(R.id.cvTradicionalni18);
        cvTrad19 = tradFragment.findViewById(R.id.cvTradicionalni19);



        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        tvTrad1.setTypeface(title);
        tvTrad2.setTypeface(title);
        tvTrad3.setTypeface(title);
        tvTrad4.setTypeface(title);
        tvTrad5.setTypeface(title);
        tvTrad6.setTypeface(title);
        tvTrad7.setTypeface(title);
        tvTrad8.setTypeface(title);
        tvTrad9.setTypeface(title);
        tvTrad10.setTypeface(title);
        tvTrad11.setTypeface(title);
        tvTrad12.setTypeface(title);
        tvTrad13.setTypeface(title);
        tvTrad14.setTypeface(title);
        tvTrad15.setTypeface(title);
        tvTrad16.setTypeface(title);
        tvTrad17.setTypeface(title);
        tvTrad18.setTypeface(title);
        tvTrad19.setTypeface(title);

        back = tradFragment.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad2Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad3Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad4Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad5Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad6Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad7Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad8Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad9Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad10Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad11Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad12Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad13Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad14Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad15Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad16Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad17Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad18Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvTrad19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Trad19Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return tradFragment;
    }

}
