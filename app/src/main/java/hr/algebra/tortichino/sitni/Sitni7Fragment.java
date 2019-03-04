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
public class Sitni7Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;

    public Sitni7Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitni7 = inflater.inflate(R.layout.fragment_sitni7, container, false);

        toolbar = sitni7.findViewById(R.id.actionbar_sitni7);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = sitni7.findViewById(R.id.tvTitleSitni);
        tvTitleSastojci = sitni7.findViewById(R.id.tvTitleSastojci7sit);
        tvSastojci = sitni7.findViewById(R.id.tvSastojci7sit);
        tvTitlePriprema = sitni7.findViewById(R.id.tvTitlePriprema7sit);
        tvPriprema = sitni7.findViewById(R.id.tvPriprema7sit);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvTitle.setText(R.string.sitni7);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = sitni7.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SitniFragment());
                transaction.commit();
            }
        });




        return sitni7;
    }

}
