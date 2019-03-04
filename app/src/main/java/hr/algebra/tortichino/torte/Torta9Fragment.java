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
public class Torta9Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleKore, tvKore, tvTitleKaramel, tvKaramel;
    private ImageView back;


    public Torta9Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta9 = inflater.inflate(R.layout.fragment_torta9, container, false);

        tvTitle = torta9.findViewById(R.id.tvTitleTorta);
        tvTitleKore = torta9.findViewById(R.id.tvTitleKore);
        tvKore = torta9.findViewById(R.id.tvKore);
        tvTitleKaramel = torta9.findViewById(R.id.tvTitleKaramel);
        tvKaramel = torta9.findViewById(R.id.tvKaramel);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvKore.setTypeface(text);
        tvKaramel.setTypeface(text);
        tvTitle.setText("'Samo malo' torta");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleKore.setTypeface(title);
        tvTitleKaramel.setTypeface(title);

        back = torta9.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });


        return torta9;
    }

}
