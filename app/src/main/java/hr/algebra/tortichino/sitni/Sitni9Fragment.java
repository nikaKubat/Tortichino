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
public class Sitni9Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;

    public Sitni9Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitni9 = inflater.inflate(R.layout.fragment_sitni9, container, false);

        toolbar = sitni9.findViewById(R.id.actionbar_sitni9);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = sitni9.findViewById(R.id.tvTitleSitni);
        tvTitleSastojci = sitni9.findViewById(R.id.tvTitleSastojci9sit);
        tvSastojci = sitni9.findViewById(R.id.tvSastojci9sit);
        tvTitlePriprema = sitni9.findViewById(R.id.tvTitlePriprema9sit);
        tvPriprema = sitni9.findViewById(R.id.tvPriprema9sit);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvTitle.setText(R.string.sitni9);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = sitni9.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SitniFragment());
                transaction.commit();
            }
        });


        return sitni9;
    }

}