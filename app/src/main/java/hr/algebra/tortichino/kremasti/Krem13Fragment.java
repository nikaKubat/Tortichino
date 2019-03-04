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

import java.lang.reflect.Type;

import hr.algebra.tortichino.KremastiFragment;
import hr.algebra.tortichino.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Krem13Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleUkras, tvUkras, tvTitleKrema, tvKrema, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema;

    public Krem13Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem13 = inflater.inflate(R.layout.fragment_krem13, container, false);

        toolbar = krem13.findViewById(R.id.actionbar_krem13);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem13.findViewById(R.id.tvTitleKremasti);
        tvTitleUkras = krem13.findViewById(R.id.tvTitleUkras13krem);
        tvUkras = krem13.findViewById(R.id.tvUkras13krem);
        tvTitleBiskvit = krem13.findViewById(R.id.tvTitleBiskvit13krem);
        tvBiskvit = krem13.findViewById(R.id.tvBiskvit13krem);
        tvTitleKrema = krem13.findViewById(R.id.tvTitleKrema13krem);
        tvKrema = krem13.findViewById(R.id.tvKrema13krem);
        tvTitlePriprema = krem13.findViewById(R.id.tvTitlePriprema13krem);
        tvPriprema = krem13.findViewById(R.id.tvPriprema13krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti13);
        tvUkras.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleUkras.setTypeface(title);
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = krem13.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        return krem13;
    }

}
