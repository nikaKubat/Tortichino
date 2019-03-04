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
public class Krem21Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePreljev, tvPreljev, tvTitlePriprema, tvPriprema;


    public Krem21Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem21 = inflater.inflate(R.layout.fragment_krem21, container, false);

        toolbar = krem21.findViewById(R.id.actionbar_krem21);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem21.findViewById(R.id.tvTitleKremasti);
        tvTitleSastojci = krem21.findViewById(R.id.tvTitleSastojci21krem);
        tvSastojci = krem21.findViewById(R.id.tvSastojci21krem);
        tvTitlePreljev = krem21.findViewById(R.id.tvTitlePreljev21krem);
        tvPreljev = krem21.findViewById(R.id.tvPreljev21krem);
        tvTitlePriprema = krem21.findViewById(R.id.tvTitlePriprema21krem);
        tvPriprema = krem21.findViewById(R.id.tvPriprema21krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti21);
        tvSastojci.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvPreljev.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitlePreljev.setTypeface(title);

        back = krem21.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return krem21;
    }

}
