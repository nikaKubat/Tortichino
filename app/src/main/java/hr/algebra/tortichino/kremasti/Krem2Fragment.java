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
public class Krem2Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvSastojci, tvTitleTijesto1, tvTitleTijesto2, tvTitleKrema, tvPriprema, tvTitleTijesto3, tvTitleTijesto4, tvTitleKrema2;
    private TextView tvTijesto1, tvTijesto2, tvKrema, tvTijesto3, tvTijesto4, tvKrema2;

    public Krem2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem2 = inflater.inflate(R.layout.fragment_krem2, container, false);

        toolbar = krem2.findViewById(R.id.actionbar_krem2);

        if (((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }
        tvTitle = krem2.findViewById(R.id.tvTitleKremasti);
        tvTitleTijesto1 = krem2.findViewById(R.id.tvTitleTijesto2_1krem);
        tvTijesto1 = krem2.findViewById(R.id.tvTijesti2_1krem);
        tvTitleTijesto2 = krem2.findViewById(R.id.tvTitleTijesto2_2krem);
        tvTitleTijesto3 = krem2.findViewById(R.id.tvTitleTijesto2_3krem);
        tvTitleTijesto4 = krem2.findViewById(R.id.tvTitleTijesto2_4krem);
        tvTijesto2 = krem2.findViewById(R.id.tvTijesto2_2krem);
        tvTijesto3 = krem2.findViewById(R.id.tvTijesto2_3krem);
        tvTijesto4 = krem2.findViewById(R.id.tvTijesti2_4krem);
        tvPriprema = krem2.findViewById(R.id.tvTitlePriprema2krem);
        tvSastojci = krem2.findViewById(R.id.tvTitleSastojci2krem);
        tvTitleKrema = krem2.findViewById(R.id.tvTitleKrema2_1krem);
        tvTitleKrema2 = krem2.findViewById(R.id.tvTitleKrema2_2krem);
        tvKrema = krem2.findViewById(R.id.tvKrema2_1krem);
        tvKrema2 = krem2.findViewById(R.id.tvKrema2_2krem);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti2);
        tvTijesto1.setTypeface(text);
        tvTijesto2.setTypeface(text);
        tvTijesto3.setTypeface(text);
        tvTijesto4.setTypeface(text);
        tvKrema.setTypeface(text);
        tvKrema2.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleTijesto1.setTypeface(title);
        tvTitleTijesto2.setTypeface(title);
        tvTitleTijesto3.setTypeface(title);
        tvTitleTijesto4.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitleKrema2.setTypeface(title);
        tvPriprema.setTypeface(title);
        tvSastojci.setTypeface(title);

        back = krem2.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });
        return krem2;
    }

}
