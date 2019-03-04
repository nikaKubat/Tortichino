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
public class Torta14Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvSastojci, tvTitleBiskvit, tvBiskvit, tvTitleKrema, tvKrema, tvTitleOstalo, tvOstalo;
    private TextView tvTitlePostupak, tvPostupak;
    private ImageView back;


    public Torta14Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta14 = inflater.inflate(R.layout.fragment_torta14, container, false);

        toolbar = torta14.findViewById(R.id.actionbar_torta14);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = torta14.findViewById(R.id.tvTitleTorta);
        tvSastojci = torta14.findViewById(R.id.tvTitleSastojci14);
        tvTitleBiskvit = torta14.findViewById(R.id.tvTitleBiskvit14);
        tvBiskvit = torta14.findViewById(R.id.tvBiskvit14);
        tvTitleKrema = torta14.findViewById(R.id.tvTitleCokoKrema);
        tvKrema = torta14.findViewById(R.id.tvCokoKrem);
        tvTitleOstalo = torta14.findViewById(R.id.tvTitleOstalo);
        tvOstalo = torta14.findViewById(R.id.tvOstalo);
        tvTitlePostupak = torta14.findViewById(R.id.tvTitlePostupak14);
        tvPostupak = torta14.findViewById(R.id.tvPostupak14);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvKrema.setTypeface(text);
        tvOstalo.setTypeface(text);
        tvPostupak.setTypeface(text);
        tvTitle.setText("Čokoladna torta - Lopta");


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvSastojci.setTypeface(title);
        tvTitleBiskvit.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitleOstalo.setTypeface(title);
        tvTitlePostupak.setTypeface(title);

        back = torta14.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });

        return torta14;
    }

}
