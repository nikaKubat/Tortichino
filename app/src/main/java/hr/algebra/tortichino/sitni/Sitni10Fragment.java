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
public class Sitni10Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleTijesto, tvTijesto, tvTitleFila, tvFila, tvTitlePreljev, tvPreljev, tvTitlePriprema, tvPriprema;

    public Sitni10Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitni10 = inflater.inflate(R.layout.fragment_sitni10, container, false);

        toolbar = sitni10.findViewById(R.id.actionbar_sitni10);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = sitni10.findViewById(R.id.tvTitleSitni);
        tvTitleTijesto = sitni10.findViewById(R.id.tvTitleTijesto10sit);
        tvTijesto = sitni10.findViewById(R.id.tvTijesto10sit);
        tvTitleFila = sitni10.findViewById(R.id.tvTitleFila10sit);
        tvFila = sitni10.findViewById(R.id.tvFila10sit);
        tvTitlePreljev = sitni10.findViewById(R.id.tvTitlePreljev10sit);
        tvPreljev = sitni10.findViewById(R.id.tvPreljev10sit);
        tvTitlePriprema = sitni10.findViewById(R.id.tvTitlePriprema10sit);
        tvPriprema = sitni10.findViewById(R.id.tvPriprema10sit);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTijesto.setTypeface(text);
        tvFila.setTypeface(text);
        tvPreljev.setTypeface(text);
        tvTitle.setText(R.string.sitni10);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleTijesto.setTypeface(title);
        tvTitleFila.setTypeface(title);
        tvTitlePreljev.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = sitni10.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SitniFragment());
                transaction.commit();
            }
        });




        return sitni10;
    }

}
