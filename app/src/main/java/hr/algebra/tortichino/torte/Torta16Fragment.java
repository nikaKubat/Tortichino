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
public class Torta16Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleKora1, tvKora1, tvTitleKora2, tvKora2, tvTitleFila, tvFila, tvTitleNadjev, tvNadjev;
    private ImageView back;


    public Torta16Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta16 = inflater.inflate(R.layout.fragment_torta16, container, false);

        toolbar = torta16.findViewById(R.id.actionbar_torta16);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = torta16.findViewById(R.id.tvTitleTorta);
        tvTitleKora1 = torta16.findViewById(R.id.tvTitleKora16_1);
        tvTitleKora2 = torta16.findViewById(R.id.tvTitleKoraa16_2);
        tvKora1 = torta16.findViewById(R.id.tvKora16_1);
        tvKora2 = torta16.findViewById(R.id.tvKora16_2);
        tvTitleFila = torta16.findViewById(R.id.tvTitleFila16);
        tvFila = torta16.findViewById(R.id.tvFila16);
        tvTitleNadjev = torta16.findViewById(R.id.tvTitleNadjev16);
        tvNadjev = torta16.findViewById(R.id.tvNadjev16);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvKora1.setTypeface(text);
        tvKora2.setTypeface(text);
        tvFila.setTypeface(text);
        tvNadjev.setTypeface(text);
        tvTitle.setText("Vrhovi Velebita");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleKora1.setTypeface(title);
        tvTitleKora2.setTypeface(title);
        tvTitleFila.setTypeface(title);
        tvTitleNadjev.setTypeface(title);

        back = torta16.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });

        return torta16;
    }

}
