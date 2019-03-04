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

import hr.algebra.tortichino.sitni.Sitni10Fragment;
import hr.algebra.tortichino.sitni.Sitni11Fragment;
import hr.algebra.tortichino.sitni.Sitni12Fragment;
import hr.algebra.tortichino.sitni.Sitni13Fragment;
import hr.algebra.tortichino.sitni.Sitni14Fragment;
import hr.algebra.tortichino.sitni.Sitni15Fragment;
import hr.algebra.tortichino.sitni.Sitni16Fragment;
import hr.algebra.tortichino.sitni.Sitni17Fragment;
import hr.algebra.tortichino.sitni.Sitni18Fragment;
import hr.algebra.tortichino.sitni.Sitni19Fragment;
import hr.algebra.tortichino.sitni.Sitni1Fragment;
import hr.algebra.tortichino.sitni.Sitni20Fragment;
import hr.algebra.tortichino.sitni.Sitni21Fragment;
import hr.algebra.tortichino.sitni.Sitni22Fragment;
import hr.algebra.tortichino.sitni.Sitni23Fragment;
import hr.algebra.tortichino.sitni.Sitni24Fragment;
import hr.algebra.tortichino.sitni.Sitni25Fragment;
import hr.algebra.tortichino.sitni.Sitni2Fragment;
import hr.algebra.tortichino.sitni.Sitni3Fragment;
import hr.algebra.tortichino.sitni.Sitni4Fragment;
import hr.algebra.tortichino.sitni.Sitni5Fragment;
import hr.algebra.tortichino.sitni.Sitni6Fragment;
import hr.algebra.tortichino.sitni.Sitni7Fragment;
import hr.algebra.tortichino.sitni.Sitni8Fragment;
import hr.algebra.tortichino.sitni.Sitni9Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SitniFragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvSitni1, tvSitni2, tvSitni3, tvSitni4, tvSitni5, tvSitni6, tvSitni7, tvSitni8, tvSitni9;
    private TextView tvSitni10, tvSitni11, tvSitni12, tvSitni13, tvSitni14, tvSitni15, tvSitni16, tvSitni17, tvSitni18, tvSitni19;
    private TextView tvSitni20, tvSitni21, tvSitni22, tvSitni23, tvSitni24, tvSitni25;
    private CardView cvSitni1, cvSitni2, cvSitni3, cvSitni4, cvSitni5, cvSitni6, cvSitni7, cvSitni8, cvSitni9;
    private CardView cvSitni10, cvSitni11, cvSitni12, cvSitni13, cvSitni14, cvSitni15, cvSitni16, cvSitni17, cvSitni18, cvSitni19;
    private CardView cvSitni20, cvSitni21, cvSitni22, cvSitni23, cvSitni24, cvSitni25;
    private ImageView back;

    public SitniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitniFrag = inflater.inflate(R.layout.fragment_sitni, container, false);

        tvTitle = sitniFrag.findViewById(R.id.tvTitleSitni);
        toolbar = sitniFrag.findViewById(R.id.action_bar_sitni);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvSitni1 = sitniFrag.findViewById(R.id.tvSitni1);
        tvSitni2 = sitniFrag.findViewById(R.id.tvSitni2);
        tvSitni3 = sitniFrag.findViewById(R.id.tvSitni3);
        tvSitni4 = sitniFrag.findViewById(R.id.tvSitni4);
        tvSitni5 = sitniFrag.findViewById(R.id.tvSitni5);
        tvSitni6 = sitniFrag.findViewById(R.id.tvSitni6);
        tvSitni7 = sitniFrag.findViewById(R.id.tvSitni7);
        tvSitni8 = sitniFrag.findViewById(R.id.tvSitni8);
        tvSitni9 = sitniFrag.findViewById(R.id.tvSitni9);
        tvSitni10 = sitniFrag.findViewById(R.id.tvSitni10);
        tvSitni11 = sitniFrag.findViewById(R.id.tvSitni11);
        tvSitni12 = sitniFrag.findViewById(R.id.tvSitni12);
        tvSitni13 = sitniFrag.findViewById(R.id.tvSitni13);
        tvSitni14 = sitniFrag.findViewById(R.id.tvSitni14);
        tvSitni15 = sitniFrag.findViewById(R.id.tvSitni15);
        tvSitni16 = sitniFrag.findViewById(R.id.tvSitni16);
        tvSitni17 = sitniFrag.findViewById(R.id.tvSitni17);
        tvSitni18 = sitniFrag.findViewById(R.id.tvSitni18);
        tvSitni19 = sitniFrag.findViewById(R.id.tvSitni19);
        tvSitni20 = sitniFrag.findViewById(R.id.tvSitni20);
        tvSitni21 = sitniFrag.findViewById(R.id.tvSitni21);
        tvSitni22 = sitniFrag.findViewById(R.id.tvSitni22);
        tvSitni23 = sitniFrag.findViewById(R.id.tvSitni23);
        tvSitni24 = sitniFrag.findViewById(R.id.tvSitni24);
        tvSitni25 = sitniFrag.findViewById(R.id.tvSitni25);

        cvSitni1 = sitniFrag.findViewById(R.id.cvSitni1);
        cvSitni2 = sitniFrag.findViewById(R.id.cvSitni2);
        cvSitni3 = sitniFrag.findViewById(R.id.cvSitni3);
        cvSitni4 = sitniFrag.findViewById(R.id.cvSitni4);
        cvSitni5 = sitniFrag.findViewById(R.id.cvSitni5);
        cvSitni6 = sitniFrag.findViewById(R.id.cvSitni6);
        cvSitni7 = sitniFrag.findViewById(R.id.cvSitni7);
        cvSitni8 = sitniFrag.findViewById(R.id.cvSitni8);
        cvSitni9 = sitniFrag.findViewById(R.id.cvSitni9);
        cvSitni10 = sitniFrag.findViewById(R.id.cvSitni10);
        cvSitni11 = sitniFrag.findViewById(R.id.cvSitni11);
        cvSitni12 = sitniFrag.findViewById(R.id.cvSitni12);
        cvSitni13 = sitniFrag.findViewById(R.id.cvSitni13);
        cvSitni14 = sitniFrag.findViewById(R.id.cvSitni14);
        cvSitni15 = sitniFrag.findViewById(R.id.cvSitni15);
        cvSitni16 = sitniFrag.findViewById(R.id.cvSitni16);
        cvSitni17 = sitniFrag.findViewById(R.id.cvSitni17);
        cvSitni18 = sitniFrag.findViewById(R.id.cvSitni18);
        cvSitni19 = sitniFrag.findViewById(R.id.cvSitni19);
        cvSitni20 = sitniFrag.findViewById(R.id.cvSitni20);
        cvSitni21 = sitniFrag.findViewById(R.id.cvSitni21);
        cvSitni22 = sitniFrag.findViewById(R.id.cvSitni22);
        cvSitni23 = sitniFrag.findViewById(R.id.cvSitni23);
        cvSitni24 = sitniFrag.findViewById(R.id.cvSitni24);
        cvSitni25 = sitniFrag.findViewById(R.id.cvSitni25);



        final Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        tvSitni1.setTypeface(title);
        tvSitni2.setTypeface(title);
        tvSitni3.setTypeface(title);
        tvSitni4.setTypeface(title);
        tvSitni5.setTypeface(title);
        tvSitni6.setTypeface(title);
        tvSitni7.setTypeface(title);
        tvSitni8.setTypeface(title);
        tvSitni9.setTypeface(title);
        tvSitni10.setTypeface(title);
        tvSitni11.setTypeface(title);
        tvSitni12.setTypeface(title);
        tvSitni13.setTypeface(title);
        tvSitni14.setTypeface(title);
        tvSitni15.setTypeface(title);
        tvSitni16.setTypeface(title);
        tvSitni17.setTypeface(title);
        tvSitni18.setTypeface(title);
        tvSitni19.setTypeface(title);
        tvSitni20.setTypeface(title);
        tvSitni21.setTypeface(title);
        tvSitni22.setTypeface(title);
        tvSitni23.setTypeface(title);
        tvSitni24.setTypeface(title);
        tvSitni25.setTypeface(title);


        back = sitniFrag.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni2Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni3Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni4Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni5Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni6Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni7Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni8Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni9Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni10Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni11Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni12Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni13Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni14Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni15Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni16Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni17Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni18Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni19Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni20Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni21Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni22Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni23Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni24Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        cvSitni25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new Sitni25Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        return sitniFrag;
    }

}
