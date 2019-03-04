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

import hr.algebra.tortichino.R;
import hr.algebra.tortichino.TradicionalniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Trad7Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema, tvTitleKrema1, tvKrema1, tvTitleKrema2, tvKrema2;


    public Trad7Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad7 = inflater.inflate(R.layout.fragment_trad7, container, false);

        toolbar = trad7.findViewById(R.id.actionbar_trad7);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad7.findViewById(R.id.tvTitleTradicionalni);
        tvTitleBiskvit = trad7.findViewById(R.id.tvTitleBiskvit7trad);
        tvBiskvit = trad7.findViewById(R.id.tvBiskvit7trad);
        tvTitlePriprema = trad7.findViewById(R.id.tvTitlePriprema7trad);
        tvPriprema = trad7.findViewById(R.id.tvPriprema7trad);
        tvKrema1 = trad7.findViewById(R.id.tvKrema7_1trad);
        tvTitleKrema1 = trad7.findViewById(R.id.tvTitleKrema7_1trad);
        tvTitleKrema2 = trad7.findViewById(R.id.tvTitleKrema7_2trad);
        tvKrema2 = trad7.findViewById(R.id.tvKrema7_2trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad7);
        tvBiskvit.setTypeface(text);
        tvKrema1.setTypeface(text);
        tvKrema2.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleKrema1.setTypeface(title);
        tvTitleKrema2.setTypeface(title);

        back = trad7.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });



        return trad7;
    }

}
