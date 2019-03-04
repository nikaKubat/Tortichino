package hr.algebra.tortichino.slani;


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

import hr.algebra.tortichino.R;
import hr.algebra.tortichino.SlaniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Slani2Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema, tvTitlePremaz, tvPremaz;

    public Slani2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View slani2 = inflater.inflate(R.layout.fragment_slani2, container, false);

        toolbar = slani2.findViewById(R.id.actionbar_slani2);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = slani2.findViewById(R.id.tvTitleSlani);
        tvTitleSastojci = slani2.findViewById(R.id.tvTitleSastojci2slani);
        tvSastojci = slani2.findViewById(R.id.tvSastojci2slani);
        tvTitlePriprema = slani2.findViewById(R.id.tvTitlePriprema2slani);
        tvPriprema = slani2.findViewById(R.id.tvPriprema2slani);
        tvTitlePremaz = slani2.findViewById(R.id.tvTitlePremaz2slani);
        tvPremaz = slani2.findViewById(R.id.tvPremaz2slani);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvPremaz.setTypeface(text);
        tvTitle.setText(R.string.slani2);


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitlePremaz.setTypeface(title);


        back = slani2.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SlaniFragment());
                transaction.commit();
            }
        });





        return slani2;
    }

}
