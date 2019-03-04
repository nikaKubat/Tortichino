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
public class Torta3Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleCoko, tvCoko, tvTitlePostupak, tvPostupak;

    public Torta3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta3 = inflater.inflate(R.layout.fragment_torta3, container, false);

        toolbar = torta3.findViewById(R.id.actionbar_torta3);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        tvTitle = torta3.findViewById(R.id.tvTitleTorta);
        tvTitleBiskvit = torta3.findViewById(R.id.tvTitleBiskvit1);
        tvBiskvit = torta3.findViewById(R.id.tvBiskvit1);
        tvTitleCoko = torta3.findViewById(R.id.tvTitleCokoGlazura1);
        tvCoko = torta3.findViewById(R.id.tvCokoGlazura1);
        tvTitlePostupak = torta3.findViewById(R.id.tvTitlePostupak3);
        tvPostupak = torta3.findViewById(R.id.tvPostupak3);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvCoko.setTypeface(text);
        tvPostupak.setTypeface(text);
        tvTitle.setText("Torta od maka i čokolade");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePostupak.setTypeface(title);
        tvTitleCoko.setTypeface(title);

        back = torta3.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });


        return torta3;
    }

}
