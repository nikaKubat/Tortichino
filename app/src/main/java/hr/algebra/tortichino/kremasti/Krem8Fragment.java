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
public class Krem8Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleKrema, tvKrema, tvTitlePiprema, tvPriprema;

    public Krem8Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krema8 = inflater.inflate(R.layout.fragment_krem8, container, false);

        toolbar = krema8.findViewById(R.id.actionbar_krem8);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krema8.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krema8.findViewById(R.id.tvTitleBiskvit8krem);
        tvBiskvit = krema8.findViewById(R.id.tvBiskvit8krem);
        tvTitleKrema = krema8.findViewById(R.id.tvTitleKrema8krem);
        tvKrema = krema8.findViewById(R.id.tvKrema8krem);
        tvTitlePiprema = krema8.findViewById(R.id.tvTitlePriprema8krem);
        tvPriprema = krema8.findViewById(R.id.tvPriprema8krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTitle.setText(R.string.kremasti8);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePiprema.setTypeface(title);

        back = krema8.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });

        return krema8;
    }

}
