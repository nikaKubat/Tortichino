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
public class Krem14Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePreljev, tvPreljev, tvTitleKrema, tvKrema, tvTitlePriprema, tvPriprema;


    public Krem14Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem14 = inflater.inflate(R.layout.fragment_krem14, container, false);

        toolbar = krem14.findViewById(R.id.actionbar_krem14);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem14.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem14.findViewById(R.id.tvTitleBiskvit14krem);
        tvBiskvit = krem14.findViewById(R.id.tvBiskvit14krem);
        tvTitlePreljev = krem14.findViewById(R.id.tvTitlePreljev14krem);
        tvPreljev = krem14.findViewById(R.id.tvPreljev14krem);
        tvTitlePriprema = krem14.findViewById(R.id.tvTitlePriprema14krem);
        tvPriprema = krem14.findViewById(R.id.tvPriprema14krem);
        tvTitleKrema = krem14.findViewById(R.id.tvTitleKrema14krem);
        tvKrema = krem14.findViewById(R.id.tvKrema14krem);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti14);
        tvBiskvit.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvPreljev.setTypeface(text);
        tvKrema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitlePreljev.setTypeface(title);


        back = krem14.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem14;
    }

}
