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
public class Krem15Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleGlazura, tvGlazura;

    public Krem15Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem15 = inflater.inflate(R.layout.fragment_krem15, container, false);

        toolbar = krem15.findViewById(R.id.actionbar_krem15);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem15.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem15.findViewById(R.id.tvTitleBiskvit15krem);
        tvBiskvit = krem15.findViewById(R.id.tvBiskvit15krem);
        tvGlazura = krem15.findViewById(R.id.tvGlazura15krem);
        tvTitleGlazura = krem15.findViewById(R.id.tvTitleGlazura15krem);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti15);
        tvBiskvit.setTypeface(text);
        tvGlazura.setTypeface(text);


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleGlazura.setTypeface(title);

        back = krem15.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        return krem15;
    }

}
