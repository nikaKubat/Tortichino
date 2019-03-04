package hr.algebra.tortichino.torte;


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
import hr.algebra.tortichino.TorteFragment;
import hr.algebra.tortichino.TradicionalniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Torta15Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvSastojci, tvTitleBiskvit1, tvBiskvit1, tvTitleKrema1, tvKrema1, tvTitleKrema2, tvKrema2, tvTitleGlazura, tvGlazura;
    private TextView tvPostupak,tvTitleBiskvit2, tvBiskvit2, tvTitleKrema3, tvKrema3, tvTitleKrema4, tvKrema4, tvTitleGlazura2, tvGlazura2;
    private ImageView back;


    public Torta15Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta15 = inflater.inflate(R.layout.fragment_torta15, container, false);

        toolbar = torta15.findViewById(R.id.actionbar_torta15);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = torta15.findViewById(R.id.tvTitleTorta);
        tvSastojci = torta15.findViewById(R.id.tvTitleSastojci15);
        tvTitleBiskvit1 = torta15.findViewById(R.id.tvTitleBiskvit15);
        tvBiskvit1 = torta15.findViewById(R.id.tvBiskvit15);
        tvTitleKrema1 = torta15.findViewById(R.id.tvTitleKrema15_1);
        tvKrema1 = torta15.findViewById(R.id.tvKrema15_1);
        tvKrema2 = torta15.findViewById(R.id.tvKrema15_2);
        tvTitleKrema2 = torta15.findViewById(R.id.tvTitleKrema15_2);
        tvTitleGlazura = torta15.findViewById(R.id.tvTitleGlazura15);
        tvGlazura = torta15.findViewById(R.id.tvGlazura15);
        tvPostupak = torta15.findViewById(R.id.tvTitlePostupak15);
        tvTitleBiskvit2 = torta15.findViewById(R.id.tvTitleBiskvit15_2);
        tvBiskvit2 = torta15.findViewById(R.id.tvBiskvit15_2);
        tvTitleKrema3 = torta15.findViewById(R.id.tvTitleKrema15_3);
        tvKrema3 = torta15.findViewById(R.id.tvKrema15_3);
        tvTitleKrema4 = torta15.findViewById(R.id.tvTitleKrema15_4);
        tvKrema4 = torta15.findViewById(R.id.tvKrema15_4);
        tvTitleGlazura2 = torta15.findViewById(R.id.tvTitleGlazura15_2);
        tvGlazura2 = torta15.findViewById(R.id.tvGlazura15_2);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit1.setTypeface(text);
        tvBiskvit2.setTypeface(text);
        tvKrema1.setTypeface(text);
        tvKrema2.setTypeface(text);
        tvKrema3.setTypeface(text);
        tvKrema4.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvGlazura2.setTypeface(text);
        tvTitle.setText("Torta a 'la Palace");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvSastojci.setTypeface(title);
        tvTitleBiskvit1.setTypeface(title);
        tvTitleBiskvit2.setTypeface(title);
        tvTitleKrema1.setTypeface(title);
        tvTitleKrema2.setTypeface(title);
        tvTitleKrema3.setTypeface(title);
        tvTitleKrema4.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitleGlazura2.setTypeface(title);
        tvPostupak.setTypeface(title);


        back = torta15.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });

        return torta15;
    }

}
