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
import hr.algebra.tortichino.SitniFragment;
import hr.algebra.tortichino.SlaniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Slani1Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;

    public Slani1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View slani1 = inflater.inflate(R.layout.fragment_slani1, container, false);

        toolbar = slani1.findViewById(R.id.actionbar_slani1);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = slani1.findViewById(R.id.tvTitleSlani);
        tvTitleSastojci = slani1.findViewById(R.id.tvTitleSastojci1slani);
        tvSastojci = slani1.findViewById(R.id.tvSastojci1slani);
        tvTitlePriprema = slani1.findViewById(R.id.tvTitlePriprema1slani);
        tvPriprema = slani1.findViewById(R.id.tvPriprema1slani);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvTitle.setText(R.string.slani1);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = slani1.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SlaniFragment());
                transaction.commit();
            }
        });




        return slani1;
    }

}
