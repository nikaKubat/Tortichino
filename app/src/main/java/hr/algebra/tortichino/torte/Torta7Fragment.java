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
public class Torta7Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleCokoBisk, tvTitleSastojci1, tvSastojci1, tvTitlePriprema1, tvPriprema1;
    private TextView tvTitleKremaNar, tvTitleSastojci2, tvSastojci2, tvTitlePriprema2, tvPriprema2;
    private TextView tvTitleCokoGan, tvTitleSastojci3, tvSastojci3, tvTitlePriprema3, tvPriprema3;
    private TextView tvTitleKoreNar, tvTitleSastojci4, tvSastojci4, tvTitlePriprema4, tvPriprema4;
    private TextView tvTitleSlaganje, tvSlaganje;
    private ImageView back;

    public Torta7Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta7 = inflater.inflate(R.layout.fragment_torta7, container, false);

        toolbar = torta7.findViewById(R.id.actionbar_torta7);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        tvTitle = torta7.findViewById(R.id.tvTitleTorta);
        tvTitleCokoBisk = torta7.findViewById(R.id.tvTitleCokoBiskvit);
        tvTitleSastojci1 = torta7.findViewById(R.id.tvTitleSastojci7);
        tvSastojci1 = torta7.findViewById(R.id.tvSastojci7);
        tvTitlePriprema1 = torta7.findViewById(R.id.tvTitlePriprema1);
        tvPriprema1 = torta7.findViewById(R.id.tvPriprema1);
        tvTitleKremaNar = torta7.findViewById(R.id.tvTitleKremaNaran);
        tvTitleSastojci2 = torta7.findViewById(R.id.tvTitleSastojci7_2);
        tvSastojci2 = torta7.findViewById(R.id.tvSastojci7_2);
        tvTitlePriprema2 = torta7.findViewById(R.id.tvTitlePriprema2);
        tvPriprema2 = torta7.findViewById(R.id.tvPriprema2);
        tvTitleCokoGan = torta7.findViewById(R.id.tvTitleGanache);
        tvTitleSastojci3 = torta7.findViewById(R.id.tvTitleSastojci7_3);
        tvSastojci3 = torta7.findViewById(R.id.tvSastojci7_3);
        tvTitlePriprema3 = torta7.findViewById(R.id.tvTitlePriprema3);
        tvPriprema3 = torta7.findViewById(R.id.tvPriprema3);
        tvTitleKoreNar = torta7.findViewById(R.id.tvTitleKoreNar);
        tvTitleSastojci4 = torta7.findViewById(R.id.tvTitleSastojci7_4);
        tvSastojci4 = torta7.findViewById(R.id.tvSastojci7_4);
        tvTitlePriprema4 = torta7.findViewById(R.id.tvTitlePriprema4);
        tvPriprema4 = torta7.findViewById(R.id.tvPriprema4);
        tvTitleSlaganje = torta7.findViewById(R.id.tvTitleSlaganje);
        tvSlaganje = torta7.findViewById(R.id.tvSlaganje);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvSastojci1.setTypeface(text);
        tvSastojci2.setTypeface(text);
        tvSastojci3.setTypeface(text);
        tvSastojci4.setTypeface(text);
        tvPriprema1.setTypeface(text);
        tvPriprema2.setTypeface(text);
        tvPriprema3.setTypeface(text);
        tvPriprema4.setTypeface(text);
        tvSlaganje.setTypeface(text);
        tvTitle.setText("Choco orange hypnotic cake");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleCokoGan.setTypeface(title);
        tvTitleCokoBisk.setTypeface(title);
        tvTitleKremaNar.setTypeface(title);
        tvTitleKoreNar.setTypeface(title);
        tvTitleSlaganje.setTypeface(title);
        tvTitleSastojci1.setTypeface(title);
        tvTitleSastojci2.setTypeface(title);
        tvTitleSastojci3.setTypeface(title);
        tvTitleSastojci4.setTypeface(title);
        tvTitlePriprema1.setTypeface(title);
        tvTitlePriprema2.setTypeface(title);
        tvTitlePriprema3.setTypeface(title);
        tvTitlePriprema4.setTypeface(title);


        back= torta7.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });

        return torta7;
    }

}
