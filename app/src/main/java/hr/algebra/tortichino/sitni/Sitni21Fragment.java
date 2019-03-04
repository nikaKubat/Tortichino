package hr.algebra.tortichino.sitni;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class Sitni21Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;


    public Sitni21Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitni21 = inflater.inflate(R.layout.fragment_sitni21, container, false);

        toolbar = sitni21.findViewById(R.id.actionbar_sitni21);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = sitni21.findViewById(R.id.tvTitleSitni);
        tvTitleSastojci = sitni21.findViewById(R.id.tvTitleSastojci21sit);
        tvSastojci = sitni21.findViewById(R.id.tvSastojci21sit);
        tvTitlePriprema = sitni21.findViewById(R.id.tvTitlePriprema21sit);
        tvPriprema = sitni21.findViewById(R.id.tvPriprema21sit);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvTitle.setText(R.string.sitni21);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = sitni21.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SitniFragment());
                transaction.commit();
            }
        });




        return sitni21;
    }

}
