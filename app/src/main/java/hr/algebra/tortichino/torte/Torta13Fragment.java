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

/**
 * A simple {@link Fragment} subclass.
 */
public class Torta13Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleSastojci, tvTitleBiskvit1, tvBiskvit1, tvTitleBiskvit2, tvBiskvit2, tvTitleKrema, tvKrema;
    private TextView tvTitlePostupak, tvTitleBiskvit3, tvBiskvit3, tvTitleBiskvit4, tvBiskvit4, tvTitleKrema2, tvKrema2;
    private ImageView back;


    public Torta13Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta13 = inflater.inflate(R.layout.fragment_torta13, container, false);

        toolbar = torta13.findViewById(R.id.actionbar_torta13);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = torta13.findViewById(R.id.tvTitleTorta);
        tvTitleSastojci = torta13.findViewById(R.id.tvTitleSastojci13);
        tvTitleBiskvit1 = torta13.findViewById(R.id.tvTitleBiskvit4_1);
        tvBiskvit1 = torta13.findViewById(R.id.tvBiskvit4_1);
        tvTitleBiskvit2 = torta13.findViewById(R.id.tvTitleBiskvit4_2);
        tvBiskvit2 = torta13.findViewById(R.id.tvBiskvit4_2);
        tvTitleKrema = torta13.findViewById(R.id.tvTitleKrema13);
        tvKrema = torta13.findViewById(R.id.tvKrema13);
        tvTitlePostupak = torta13.findViewById(R.id.tvTitlePostupak13);
        tvTitleBiskvit3 = torta13.findViewById(R.id.tvTitleBiskvit4_3);
        tvBiskvit3 = torta13.findViewById(R.id.tvBiskvit4_4);
        tvTitleBiskvit4 = torta13.findViewById(R.id.tvTitleBiskvit4_5);
        tvBiskvit4 = torta13.findViewById(R.id.tvBiskvit4_5);
        tvTitleKrema2 = torta13.findViewById(R.id.tvTitleKrema13_1);
        tvKrema2 = torta13.findViewById(R.id.tvKrema13_1);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit1.setTypeface(text);
        tvBiskvit2.setTypeface(text);
        tvKrema.setTypeface(text);
        tvBiskvit3.setTypeface(text);
        tvBiskvit4.setTypeface(text);
        tvKrema2.setTypeface(text);
        tvTitle.setText("Torta sa bademima i lješnjacima");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePostupak.setTypeface(title);
        tvTitleBiskvit1.setTypeface(title);
        tvTitleBiskvit2.setTypeface(title);
        tvTitleBiskvit3.setTypeface(title);
        tvTitleBiskvit4.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitleKrema2.setTypeface(title);

        back = torta13.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });




        return torta13;
    }

}
