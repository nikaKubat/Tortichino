package hr.algebra.tortichino.kremasti;


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

import hr.algebra.tortichino.KremastiFragment;
import hr.algebra.tortichino.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Krem10Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleGlazura, tvGlazura, tvTitleKrema1, tvKrema1, tvTitleKrema2, tvKrema2, tvTitlePriprema, tvPriprema;

    public Krem10Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View krem10 = inflater.inflate(R.layout.fragment_krem10, container, false);

        toolbar = krem10.findViewById(R.id.actionbar_krem10);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem10.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem10.findViewById(R.id.tvTitleBiskvit10krem);
        tvBiskvit = krem10.findViewById(R.id.tvBiskvit10krem);
        tvTitleGlazura = krem10.findViewById(R.id.tvTitleGlazura10krem);
        tvGlazura = krem10.findViewById(R.id.tvGlazura10krem);
        tvKrema1 = krem10.findViewById(R.id.tvKrema10_1krem);
        tvTitleKrema1 = krem10.findViewById(R.id.tvTitleKrema10_1krem);
        tvTitleKrema2 = krem10.findViewById(R.id.tvTitleKrema10_2krem);
        tvKrema2 = krem10.findViewById(R.id.tvKrema10_2krem);
        tvTitlePriprema = krem10.findViewById(R.id.tvTitlePriprema10krem);
        tvPriprema = krem10.findViewById(R.id.tvPriprema10krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti10);
        tvBiskvit.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvKrema1.setTypeface(text);
        tvKrema2.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitleKrema1.setTypeface(title);
        tvTitleKrema2.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem10.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem10;
    }



}
