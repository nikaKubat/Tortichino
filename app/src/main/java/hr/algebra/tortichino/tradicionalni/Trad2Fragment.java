package hr.algebra.tortichino.tradicionalni;


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

import hr.algebra.tortichino.NepeceniFragment;
import hr.algebra.tortichino.R;
import hr.algebra.tortichino.TradicionalniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Trad2Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema, tvTitleKrema, tvKrema;

    public Trad2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad2 = inflater.inflate(R.layout.fragment_trad2, container, false);

        toolbar = trad2.findViewById(R.id.actionbar_trad2);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad2.findViewById(R.id.tvTitleTradicionalni);
        tvTitleSastojci = trad2.findViewById(R.id.tvTitleSastojci2trad);
        tvSastojci = trad2.findViewById(R.id.tvSastojci2trad);
        tvTitlePriprema = trad2.findViewById(R.id.TvTitlePriprema2trad);
        tvPriprema = trad2.findViewById(R.id.tvPriprema2trad);
        tvTitleKrema = trad2.findViewById(R.id.tvTitleKrema2trad);
        tvKrema = trad2.findViewById(R.id.tvKrema2trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad2);
        tvSastojci.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleKrema.setTypeface(title);

        back = trad2.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });





        return trad2;
    }

}
