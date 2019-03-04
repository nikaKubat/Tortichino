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
public class Nep3Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;

    public Nep3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View nep3 = inflater.inflate(R.layout.fragment_nep3, container, false);

        toolbar = nep3.findViewById(R.id.actionbar_nep3);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nep3.findViewById(R.id.tvTitleNep);
        tvTitleSastojci = nep3.findViewById(R.id.tvTitleSastojci3nep);
        tvSastojci = nep3.findViewById(R.id.tvSastojci3nep);
        tvTitlePriprema = nep3.findViewById(R.id.TvTitlePriprema3nep);
        tvPriprema = nep3.findViewById(R.id.tvPriprema3nep);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.nepeceni3);
        tvSastojci.setTypeface(text);
        tvPriprema.setTypeface(text);


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = nep3.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.commit();
            }
        });


        return nep3;
    }

}
