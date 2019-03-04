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
public class Nep9Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleKrema, tvKrema, tvTitleGlazura, tvGlazura, tvTitlePriprema, tvPriprema;


    public Nep9Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View nep9 = inflater.inflate(R.layout.fragment_nep9, container, false);

        toolbar = nep9.findViewById(R.id.actionbar_nep9);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nep9.findViewById(R.id.tvTitleNep);
        tvTitleKrema = nep9.findViewById(R.id.tvTitleKrema9nep);
        tvKrema = nep9.findViewById(R.id.tvKrema9nep);
        tvTitlePriprema = nep9.findViewById(R.id.tvTitlePriprema9nep);
        tvPriprema = nep9.findViewById(R.id.tvPriprema9nep);
        tvTitleGlazura = nep9.findViewById(R.id.tvTitleGlazura9nep);
        tvGlazura = nep9.findViewById(R.id.tvGlazura9nep);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvKrema.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvTitle.setText(R.string.nepeceni9);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleKrema.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = nep9.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.commit();
            }
        });



        return nep9;
    }

}
