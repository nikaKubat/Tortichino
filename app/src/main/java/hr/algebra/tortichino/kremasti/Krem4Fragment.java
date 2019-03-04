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
public class Krem4Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleKrema, tvKrema, tvPriprema, tvTitlePriprema;

    public Krem4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem4 = inflater.inflate(R.layout.fragment_krem4, container, false);

        toolbar = krem4.findViewById(R.id.actionbar_krem4);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem4.findViewById(R.id.tvTitleKremasti);
        tvBiskvit = krem4.findViewById(R.id.tvBiskvit4krem);
        tvTitleBiskvit = krem4.findViewById(R.id.tvTitleBiskvit4krem);
        tvTitleKrema = krem4.findViewById(R.id.tvTitleKrema4krem);
        tvKrema = krem4.findViewById(R.id.tvKrema4krem);
        tvPriprema = krem4.findViewById(R.id.tvPriprema4krem);
        tvTitlePriprema = krem4.findViewById(R.id.tvTitlePriprema4krem);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti4);
        tvBiskvit.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem4.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });



        return krem4;
    }

}
