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
public class Trad4Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvPriprema1, tvPriprema2;


    public Trad4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad4 = inflater.inflate(R.layout.fragment_trad4, container, false);

        toolbar = trad4.findViewById(R.id.actionbar_trad4);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad4.findViewById(R.id.tvTitleTradicionalni);
        tvPriprema1 = trad4.findViewById(R.id.tvPriprema4_1trad);
        tvPriprema2 = trad4.findViewById(R.id.tvPriprema4_2trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad4);
        tvPriprema1.setTypeface(text);
        tvPriprema2.setTypeface(text);


        back = trad4.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });



        return trad4;
    }

}
