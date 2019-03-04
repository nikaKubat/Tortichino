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
public class Nep5Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;


    public Nep5Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View nep5 = inflater.inflate(R.layout.fragment_nep5, container, false);

        toolbar = nep5.findViewById(R.id.actionbar_nep5);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nep5.findViewById(R.id.tvTitleNep);
        tvTitleSastojci = nep5.findViewById(R.id.tvTitleSastojci5nep);
        tvSastojci = nep5.findViewById(R.id.tvSastojci5nep);
        tvTitlePriprema = nep5.findViewById(R.id.tvTitlePriprema5nep);
        tvPriprema = nep5.findViewById(R.id.tvPriprema5nep);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvTitle.setText(R.string.nepeceni5);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = nep5.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.commit();
            }
        });



        return nep5;
    }

}
