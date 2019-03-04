package hr.algebra.tortichino.tradicionalni;


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
import hr.algebra.tortichino.TradicionalniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Trad1Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleTijesto, tvTijesto, tvTitleFila, tvFila, tvTitleGlazura, tvGlazura;
    private TextView tvTitlePriprema, tvPriprema;


    public Trad1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View trad1 = inflater.inflate(R.layout.fragment_trad1, container, false);

        toolbar = trad1.findViewById(R.id.actionbar_trad1);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad1.findViewById(R.id.tvTitleTradicionalni);
        tvTitleTijesto = trad1.findViewById(R.id.tvTitleTijesto1trad);
        tvTijesto = trad1.findViewById(R.id.tvTijesto1trad);
        tvTitleFila = trad1.findViewById(R.id.tvTitleFila1trad);
        tvFila = trad1.findViewById(R.id.tvFila1trad);
        tvTitleGlazura = trad1.findViewById(R.id.tvTitleGlazura1trad);
        tvGlazura = trad1.findViewById(R.id.tvGlazura1trad);
        tvTitlePriprema = trad1.findViewById(R.id.tvTitlePriprema1trad);
        tvPriprema = trad1.findViewById(R.id.tvPriprema1trad);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad1);
        tvFila.setTypeface(text);
        tvTijesto.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleFila.setTypeface(title);
        tvTitleTijesto.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = trad1.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });



        return trad1;
    }

}
