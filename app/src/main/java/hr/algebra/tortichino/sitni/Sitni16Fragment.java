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
public class Sitni16Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleTijesto, tvTijesto, tvTitlePriprema, tvPriprema;

    public Sitni16Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitni16 = inflater.inflate(R.layout.fragment_sitni16, container, false);

        toolbar = sitni16.findViewById(R.id.actionbar_sitni16);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = sitni16.findViewById(R.id.tvTitleSitni);
        tvTitleTijesto = sitni16.findViewById(R.id.tvTitleTijesto16sit);
        tvTijesto = sitni16.findViewById(R.id.tvTijesto16sit);
        tvTitlePriprema = sitni16.findViewById(R.id.tvTitlePriprema16sit);
        tvPriprema = sitni16.findViewById(R.id.tvPriprema16sit);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTijesto.setTypeface(text);
        tvTitle.setText(R.string.sitni16);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleTijesto.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = sitni16.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SitniFragment());
                transaction.commit();
            }
        });





        return sitni16;
    }

}
