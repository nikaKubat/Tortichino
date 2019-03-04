package hr.algebra.tortichino.sitni;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import hr.algebra.tortichino.R;
import hr.algebra.tortichino.SitniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sitni20Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleTjesto, tvTijesto, tvTitleSirup, tvSirup, tvTitlePriprema, tvPriprema;


    public Sitni20Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitni20 = inflater.inflate(R.layout.fragment_sitni20, container, false);

        toolbar = sitni20.findViewById(R.id.actionbar_sitni20);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = sitni20.findViewById(R.id.tvTitleSitni);
        tvTitleTjesto = sitni20.findViewById(R.id.tvTitleTijesto20sit);
        tvTijesto = sitni20.findViewById(R.id.tvTijesto20sit);
        tvTitleSirup = sitni20.findViewById(R.id.tvTitleSirup20sit);
        tvSirup = sitni20.findViewById(R.id.tvSirup20sit);
        tvTitlePriprema = sitni20.findViewById(R.id.tvTitlePriprema20sit);
        tvPriprema = sitni20.findViewById(R.id.tvPriprema20sit);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTijesto.setTypeface(text);
        tvSirup.setTypeface(text);
        tvTitle.setText(R.string.sitni20);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleTjesto.setTypeface(title);
        tvTitleSirup.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = sitni20.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SitniFragment());
                transaction.commit();
            }
        });




        return sitni20;
    }

}
