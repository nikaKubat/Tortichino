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
public class Torta5Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePostupak, tvTitleBiskvit, tvBiskvit, tvTitleFila, tvFila, tvTitlePreljev, tvPreljev;
    private ImageView back;

    public Torta5Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta5 = inflater.inflate(R.layout.fragment_torta5, container, false);

        toolbar = torta5.findViewById(R.id.actionbar_torta5);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        tvTitle = torta5.findViewById(R.id.tvTitleTorta);
        tvTitleSastojci = torta5.findViewById(R.id.tvTitleSastojci5);
        tvSastojci = torta5.findViewById(R.id.tvSastojci5);
        tvTitlePostupak = torta5.findViewById(R.id.tvTitlePostupak5);
        tvTitleBiskvit = torta5.findViewById(R.id.tvTitleBiskvit3);
        tvBiskvit = torta5.findViewById(R.id.tvBiskvit3);
        tvTitleFila = torta5.findViewById(R.id.tvTitleFila1);
        tvFila = torta5.findViewById(R.id.tvFila1);
        tvTitlePreljev = torta5.findViewById(R.id.tvTitlePreljev1);
        tvPreljev = torta5.findViewById(R.id.tvPreljev1);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvPreljev.setTypeface(text);
        tvTitle.setText("Čoko-Rum torta");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePostupak.setTypeface(title);
        tvTitleBiskvit.setTypeface(title);
        tvTitleFila.setTypeface(title);
        tvTitlePreljev.setTypeface(title);

        back = torta5.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });

        return torta5;
    }

}
