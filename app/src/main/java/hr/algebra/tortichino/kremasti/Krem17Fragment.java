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
public class Krem17Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleKrema, tvKrema, tvTitlePriprema, tvPriprema;


    public Krem17Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem17 = inflater.inflate(R.layout.fragment_krem17, container, false);

        toolbar = krem17.findViewById(R.id.actionbar_krem17);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem17.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem17.findViewById(R.id.tvTitleBiskvit17krem);
        tvBiskvit = krem17.findViewById(R.id.tvBiskvit17krem);
        tvTitlePriprema = krem17.findViewById(R.id.tvTitlePriprema17krem);
        tvPriprema = krem17.findViewById(R.id.tvPriprema17krem);
        tvTitleKrema = krem17.findViewById(R.id.tvTitleKrema17krem);
        tvKrema = krem17.findViewById(R.id.tvKrema17krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTitle.setText(R.string.kremasti17);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem17.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem17;
    }

}
