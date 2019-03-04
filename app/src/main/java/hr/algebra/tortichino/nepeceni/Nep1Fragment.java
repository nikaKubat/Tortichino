package hr.algebra.tortichino.nepeceni;


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

import hr.algebra.tortichino.NepeceniFragment;
import hr.algebra.tortichino.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Nep1Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;


    public Nep1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View nep1 = inflater.inflate(R.layout.fragment_nep1, container, false);

        toolbar = nep1.findViewById(R.id.actionbar_nep1);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nep1.findViewById(R.id.tvTitleNep);
        tvTitleSastojci = nep1.findViewById(R.id.tvTitleSastojci1nep);
        tvSastojci = nep1.findViewById(R.id.tvSastojci1nep);
        tvTitlePriprema = nep1.findViewById(R.id.TvTitlePriprema1nep);
        tvPriprema = nep1.findViewById(R.id.tvPriprema1nep);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTitle.setText(R.string.nepeceni1);


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = nep1.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.commit();
            }
        });

        return nep1;
    }

}
