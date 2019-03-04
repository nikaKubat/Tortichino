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
public class Krem3Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvSastojci, tvTitleBiskvit1, tvBiskvit1, tvTitlePreljev, tvPreljev, tvTitleGrans, tvGrans, tvTitleKrema1, tvKrema1;
    private TextView tvPriprema, tvTitleBiskvit2, tvBiskvit2, tvTitleKrema2, tvKrema2, tvTitleGrans2, tvGrans2, tvTitlePostupak, tvPostupak;


    public Krem3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem3 = inflater.inflate(R.layout.fragment_krem3, container, false);

        toolbar = krem3.findViewById(R.id.actionbar_krem3);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem3.findViewById(R.id.tvTitleKremasti);
        tvSastojci = krem3.findViewById(R.id.tvTitleSastojci3krem);
        tvTitleBiskvit1 = krem3.findViewById(R.id.tvTitleBiskvit3_1krem);
        tvBiskvit1 = krem3.findViewById(R.id.tvBiskvit3_1krem);
        tvPreljev = krem3.findViewById(R.id.tvPreljev3_1krem);
        tvTitlePreljev = krem3.findViewById(R.id.tvTitlePreljev3_1krem);
        tvTitleGrans = krem3.findViewById(R.id.tvTitleGrans3_1krem);
        tvGrans = krem3.findViewById(R.id.tvGrans3_1krem);
        tvTitleKrema1 = krem3.findViewById(R.id.tvTitleKrema3_1krem);
        tvKrema1 = krem3.findViewById(R.id.tvKrema3_1krem);
        tvPriprema = krem3.findViewById(R.id.tvTitlePriprema3krem);
        tvTitleBiskvit2 = krem3.findViewById(R.id.tvTitleBiskvit3_2krem);
        tvBiskvit2 = krem3.findViewById(R.id.tvBiskvit3_2krem);
        tvTitleKrema2 = krem3.findViewById(R.id.tvTitleKrema3_2krem);
        tvKrema2 = krem3.findViewById(R.id.tvKrema3_2krem);
        tvGrans2 = krem3.findViewById(R.id.tvGrans3_2krem);
        tvTitleGrans2 = krem3.findViewById(R.id.tvTitleGrans3_2krem);
        tvTitlePostupak = krem3.findViewById(R.id.tvTitlePostupak3krem);
        tvPostupak = krem3.findViewById(R.id.tvPostupak3krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti3);
        tvBiskvit1.setTypeface(text);
        tvBiskvit2.setTypeface(text);
        tvGrans.setTypeface(text);
        tvGrans2.setTypeface(text);
        tvKrema1.setTypeface(text);
        tvKrema2.setTypeface(text);
        tvPreljev.setTypeface(text);
        tvPostupak.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit1.setTypeface(title);
        tvTitleBiskvit2.setTypeface(title);
        tvTitleGrans.setTypeface(title);
        tvTitleGrans2.setTypeface(title);
        tvTitleKrema1.setTypeface(title);
        tvTitleKrema2.setTypeface(title);
        tvTitlePreljev.setTypeface(title);
        tvTitlePostupak.setTypeface(title);
        tvSastojci.setTypeface(title);
        tvPriprema.setTypeface(title);


        back = krem3.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });

        return krem3;
    }

}
