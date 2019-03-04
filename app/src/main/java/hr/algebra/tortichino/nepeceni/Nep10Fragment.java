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
public class Nep10Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;


    public Nep10Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View nep10 = inflater.inflate(R.layout.fragment_nep10, container, false);

        toolbar = nep10.findViewById(R.id.actionbar_nep10);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nep10.findViewById(R.id.tvTitleNep);
        tvTitleSastojci = nep10.findViewById(R.id.tvTitleSastojci10nep);
        tvSastojci = nep10.findViewById(R.id.tvSastojci10nep);
        tvTitlePriprema = nep10.findViewById(R.id.tvTitlePriprema10nep);
        tvPriprema = nep10.findViewById(R.id.tvPriprema10nep);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvTitle.setText(R.string.nepeceni10);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = nep10.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.commit();
            }
        });




        return nep10;
    }

}
