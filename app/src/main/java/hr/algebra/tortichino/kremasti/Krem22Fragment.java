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
public class Krem22Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema1, tvPriprema1;
    private TextView tvTitleKrema,tvKrema, tvTitlePriprema2, tvPriprema2, tvTitleMedusloj, tvMedusloj, tvTitlePriprema3, tvPriprema3;
    private TextView tvTitleGlazura, tvGlazura, tvTitlePriprema4, tvPriprema4, tvTitleSlaganje, tvSlaganje;


    public Krem22Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem22 = inflater.inflate(R.layout.fragment_krem22, container, false);

        toolbar = krem22.findViewById(R.id.actionbar_krem22);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem22.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem22.findViewById(R.id.tvTitleBiskvit22krem);
        tvBiskvit = krem22.findViewById(R.id.tvBiskvit22krem);
        tvTitleKrema = krem22.findViewById(R.id.tvTitleKrema22krem);
        tvKrema = krem22.findViewById(R.id.tvKrema22krem);
        tvTitlePriprema1 = krem22.findViewById(R.id.tvTitlePriprema22_1krem);
        tvPriprema1 = krem22.findViewById(R.id.tvPriprema22_1krem);
        tvTitlePriprema2 = krem22.findViewById(R.id.tvTitlePriprema22_2krem);
        tvPriprema2 = krem22.findViewById(R.id.tvPriprema22_2krem);
        tvTitleMedusloj = krem22.findViewById(R.id.tvTitleMedusloj22krem);
        tvMedusloj = krem22.findViewById(R.id.tvMedusloj22krem);
        tvTitlePriprema3 = krem22.findViewById(R.id.tvTitlePriprema22_3krem);
        tvPriprema3 = krem22.findViewById(R.id.tvPriprema22_3krem);
        tvTitleGlazura = krem22.findViewById(R.id.tvTitleGlazura22krem);
        tvGlazura = krem22.findViewById(R.id.tvGlazura22krem);
        tvTitlePriprema4 = krem22.findViewById(R.id.tvTitlePriprema22_4krem);
        tvPriprema4 = krem22.findViewById(R.id.tvPriprema22_4krem);
        tvTitleSlaganje = krem22.findViewById(R.id.tvTitleSlaganje22krem);
        tvSlaganje = krem22.findViewById(R.id.tvSlaganje22krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti22);
        tvBiskvit.setTypeface(text);
        tvPriprema1.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema2.setTypeface(text);
        tvMedusloj.setTypeface(text);
        tvPriprema3.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvPriprema4.setTypeface(text);
        tvSlaganje.setTypeface(text);


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema1.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePriprema2.setTypeface(title);
        tvTitleMedusloj.setTypeface(title);
        tvTitlePriprema3.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitlePriprema4.setTypeface(title);
        tvTitleSlaganje.setTypeface(title);

        back = krem22.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem22;
    }

}
