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
public class Krem27Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvTitleBiskvit1, tvBiskvit1, tvTitleKrema1, tvKrema1;
    private TextView tvTitlePriprema, tvTitleBiskvit2, tvBiskvit2, tvTitleKrema2, tvKrema2;


    public Krem27Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem27 = inflater.inflate(R.layout.fragment_krem27, container, false);

        toolbar = krem27.findViewById(R.id.actionbar_krem27);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem27.findViewById(R.id.tvTitleKremasti);
        tvTitleSastojci =krem27.findViewById(R.id.tvTitleSastojci27krem);
        tvTitleBiskvit1 = krem27.findViewById(R.id.tvTitleBiskvit27_1krem);
        tvBiskvit1 = krem27.findViewById(R.id.tvBiskvit27_1krem);
        tvTitleKrema1 = krem27.findViewById(R.id.tvTitleKrema27_1krem);
        tvKrema1 = krem27.findViewById(R.id.tvKrema27_1kem);
        tvTitlePriprema = krem27.findViewById(R.id.tvTitlePriprema27krem);
        tvTitleBiskvit2 = krem27.findViewById(R.id.tvTitleBiskvit27_2krem);
        tvBiskvit2 = krem27.findViewById(R.id.tvBiksvit27_2krem);
        tvTitleKrema2 = krem27.findViewById(R.id.tvTitleKrema27_2krem);
        tvKrema2 = krem27.findViewById(R.id.tvKrema27_2krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit1.setTypeface(text);
        tvKrema1.setTypeface(text);
        tvBiskvit2.setTypeface(text);
        tvKrema2.setTypeface(text);
        tvTitle.setText(R.string.kremasti27);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitleBiskvit1.setTypeface(title);
        tvTitleBiskvit2.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleKrema1.setTypeface(title);
        tvTitleKrema2.setTypeface(title);

        back = krem27.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem27;
    }

}
