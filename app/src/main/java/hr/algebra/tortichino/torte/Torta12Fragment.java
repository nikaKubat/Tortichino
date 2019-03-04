package hr.algebra.tortichino.torte;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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
public class Torta12Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleKrema, tvKrema, tvTitleDekor, tvDekor, tvTitlePostupak, tvPostupak;
    private ImageView back;


    public Torta12Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta12 = inflater.inflate(R.layout.fragment_torta12, container, false);


        toolbar = torta12.findViewById(R.id.actionbar_torta12);
        tvTitle = torta12.findViewById(R.id.tvTitleTorta);
        tvTitleKrema = torta12.findViewById(R.id.tvTitleKrema);
        tvKrema = torta12.findViewById(R.id.tvKrema);
        tvTitleDekor = torta12.findViewById(R.id.tvTitleDekor);
        tvDekor = torta12.findViewById(R.id.tvDekor);
        tvTitlePostupak = torta12.findViewById(R.id.tvTitlePostupak12);
        tvPostupak = torta12.findViewById(R.id.tvPostupak12);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvKrema.setTypeface(text);
        tvDekor.setTypeface(text);
        tvPostupak.setTypeface(text);
        tvTitle.setText("Brza torta s jagodama");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitlePostupak.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitleDekor.setTypeface(title);

        back = torta12.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });




        return torta12;
    }

}
