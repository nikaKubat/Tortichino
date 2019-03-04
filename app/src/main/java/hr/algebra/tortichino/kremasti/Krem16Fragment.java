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
public class Krem16Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleKrema, tvKrema, tvTitlePriprema, tvPriprema;

    public Krem16Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem16 = inflater.inflate(R.layout.fragment_krem16, container, false);

        toolbar = krem16.findViewById(R.id.actionbar_krem16);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem16.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem16.findViewById(R.id.tvTitleBiskvit16krem);
        tvBiskvit = krem16.findViewById(R.id.tvBiskvit16krem);
        tvKrema = krem16.findViewById(R.id.tvKrema16krem);
        tvTitleKrema = krem16.findViewById(R.id.tvTitleKrema16krem);
        tvTitlePriprema = krem16.findViewById(R.id.tvTitlePriprema16krem);
        tvPriprema = krem16.findViewById(R.id.tvPriprema16krem);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti16);
        tvBiskvit.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem16.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem16;
    }

}
