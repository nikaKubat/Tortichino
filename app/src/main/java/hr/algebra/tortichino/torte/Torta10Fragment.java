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
public class Torta10Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleTrokut, tvTrokut, tvTitlePravokutnik, tvPravokutnik, tvTitleKugla, tvKugla;
    private ImageView back;


    public Torta10Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta10 = inflater.inflate(R.layout.fragment_torta10, container, false);

        toolbar = torta10.findViewById(R.id.actionbar_torta10);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = torta10.findViewById(R.id.tvTitleTorta);
        tvTitleKugla = torta10.findViewById(R.id.tvTitleKugla);
        tvTitleTrokut = torta10.findViewById(R.id.tvTitleTrokut);
        tvTitlePravokutnik = torta10.findViewById(R.id.tvTitlePravokutnik);
        tvTrokut = torta10.findViewById(R.id.tvTrokut);
        tvPravokutnik = torta10.findViewById(R.id.tvPravokutnik);
        tvKugla = torta10.findViewById(R.id.tvKugla);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTrokut.setTypeface(text);
        tvPravokutnik.setTypeface(text);
        tvKugla.setTypeface(text);
        tvTitle.setText("Matematika za 2. razred");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleTrokut.setTypeface(title);
        tvTitlePravokutnik.setTypeface(title);
        tvTitleKugla.setTypeface(title);

        back = torta10.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });




        return torta10;
    }

}
