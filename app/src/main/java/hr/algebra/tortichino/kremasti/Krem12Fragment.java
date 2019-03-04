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
public class Krem12Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleSastojci, tvSastojci, tvTitleKrema, tvKrema, tvTitlePriprema, tvPriprema;


    public Krem12Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem12 = inflater.inflate(R.layout.fragment_krem12, container, false);

        toolbar = krem12.findViewById(R.id.actionbar_krem12);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem12.findViewById(R.id.tvTitleKremasti);
        tvTitleSastojci = krem12.findViewById(R.id.tvTitleSastojci12krem);
        tvSastojci = krem12.findViewById(R.id.tvSastojci12krem);
        tvTitleBiskvit = krem12.findViewById(R.id.tvTitleBiskvit12krem);
        tvBiskvit = krem12.findViewById(R.id.tvBiskvit12krem);
        tvTitleKrema = krem12.findViewById(R.id.tvTileKrema12krem);
        tvKrema = krem12.findViewById(R.id.tvKrema12krem);
        tvPriprema = krem12.findViewById(R.id.tvPriprema12krem);
        tvTitlePriprema = krem12.findViewById(R.id.tvTitlePriprema12krem);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti12);
        tvBiskvit.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);

        back = krem12.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });






        return krem12;
    }

}
