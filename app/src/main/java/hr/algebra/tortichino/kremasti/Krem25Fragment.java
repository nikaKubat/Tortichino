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
public class Krem25Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView  tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleKrema1, tvKrema1, tvTitleKrema2, tvKrema2, tvTitlePriprema, tvPriprema;


    public Krem25Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem25 = inflater.inflate(R.layout.fragment_krem25, container, false);

        toolbar = krem25.findViewById(R.id.actionbar_krem25);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem25.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem25.findViewById(R.id.tvTitleBiskvit25krem);
        tvBiskvit = krem25.findViewById(R.id.tvBiskvit25krem);
        tvTitleKrema1 = krem25.findViewById(R.id.tvTitleKrema25_1krem);
        tvKrema1 = krem25.findViewById(R.id.tvKrema25_1krem);
        tvTitleKrema2 = krem25.findViewById(R.id.tvTitleKrema25_2krem);
        tvKrema2 = krem25.findViewById(R.id.tvKrema25_2krem);
        tvTitlePriprema = krem25.findViewById(R.id.tvTitlePriprema25krem);
        tvPriprema = krem25.findViewById(R.id.tvPriprema25krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvKrema1.setTypeface(text);
        tvKrema2.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTitle.setText(R.string.kremasti25);



        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema1.setTypeface(title);
        tvTitleKrema2.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = krem25.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return krem25;
    }

}
