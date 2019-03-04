package hr.algebra.tortichino.kremasti;


import android.app.ActionBar;
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
public class Krem24Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBeze, tvBeze, tvTitlePriprema1, tvPriprema1;
    private TextView tvTitleKrema, tvKrema, tvTitlePriprema2, tvPriprema2, tvTitleUkras, tvUkras;


    public Krem24Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem24 = inflater.inflate(R.layout.fragment_krem24, container, false);

        toolbar = krem24.findViewById(R.id.actionbar_krem24);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem24.findViewById(R.id.tvTitleKremasti);
        tvTitleBeze = krem24.findViewById(R.id.tvTitleBeze24krem);
        tvBeze = krem24.findViewById(R.id.tvBeze24krem);
        tvTitleKrema = krem24.findViewById(R.id.tvTitleKrema24krem);
        tvKrema = krem24.findViewById(R.id.tvKrema24krem);
        tvTitlePriprema1 = krem24.findViewById(R.id.tvTitlePriprema24_1krem);
        tvPriprema1 = krem24.findViewById(R.id.tvPriprema24_1krem);
        tvTitlePriprema2 = krem24.findViewById(R.id.tvTitlePriprema24_2krem);
        tvPriprema2 = krem24.findViewById(R.id.tvPriprema24_2krem);
        tvTitleUkras = krem24.findViewById(R.id.tvTitleUkras24krem);
        tvUkras = krem24.findViewById(R.id.tvUkras24krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBeze.setTypeface(text);
        tvPriprema1.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema2.setTypeface(text);
        tvUkras.setTypeface(text);
        tvTitle.setText(R.string.kremasti24);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBeze.setTypeface(title);
        tvTitlePriprema2.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePriprema1.setTypeface(title);
        tvTitleUkras.setTypeface(title);

        back = krem24.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });



        return krem24;
    }

}
