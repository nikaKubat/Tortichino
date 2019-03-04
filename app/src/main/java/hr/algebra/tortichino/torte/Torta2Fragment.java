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
public class Torta2Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle,tvTitleSastojci, tvSastojci, tvTitlePostupak, tvPostupak;
    private ImageView back;


    public Torta2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta2 = inflater.inflate(R.layout.fragment_torta2, container, false);

        toolbar = torta2.findViewById(R.id.actionbar_torta2);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = torta2.findViewById(R.id.tvTitleTorta);
        tvTitleSastojci = torta2.findViewById(R.id.tvTitleSastojci2);
        tvSastojci = torta2.findViewById(R.id.tvSastojci2);
        tvTitlePostupak = torta2.findViewById(R.id.tvTitlePostupak2);
        tvPostupak = torta2.findViewById(R.id.tvPostupak2);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        tvTitle.setText("Vege torta bez glutena");
        tvSastojci.setTypeface(title);
        tvPostupak.setTypeface(title);

        Typeface title2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title2);
        tvTitlePostupak.setTypeface(title2);

        back = torta2.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });


        return torta2;
    }

}
