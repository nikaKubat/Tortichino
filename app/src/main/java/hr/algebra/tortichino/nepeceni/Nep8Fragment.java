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
public class Nep8Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema, tvTitleUkras, tvUkras;

    public Nep8Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View nep8 = inflater.inflate(R.layout.fragment_nep8, container, false);

        toolbar = nep8.findViewById(R.id.actionbar_nep8);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nep8.findViewById(R.id.tvTitleNep);
        tvTitleSastojci = nep8.findViewById(R.id.tvTitleSastojci8nep);
        tvSastojci = nep8.findViewById(R.id.tvSastojci8nep);
        tvTitlePriprema = nep8.findViewById(R.id.tvTitlePriprema8nep);
        tvPriprema = nep8.findViewById(R.id.tvPriprema8nep);
        tvTitleUkras = nep8.findViewById(R.id.tvTitleUkras8nep);
        tvUkras = nep8.findViewById(R.id.tvUkras8nep);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvUkras.setTypeface(text);
        tvTitle.setText(R.string.nepeceni8);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleUkras.setTypeface(title);


        back = nep8.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.commit();
            }
        });






        return nep8;
    }

}
