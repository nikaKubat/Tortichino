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
public class Trad19Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema, tvTitleFila, tvFila;

    public Trad19Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad19 = inflater.inflate(R.layout.fragment_trad19, container, false);

        toolbar = trad19.findViewById(R.id.actionbar_trad19);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad19.findViewById(R.id.tvTitleTradicionalni);
        tvTitleBiskvit = trad19.findViewById(R.id.tvTitleBiskvit19trad);
        tvBiskvit = trad19.findViewById(R.id.tvBiskvit19trad);
        tvTitlePriprema = trad19.findViewById(R.id.tvTitlePriprema19trad);
        tvPriprema = trad19.findViewById(R.id.tvPriprema19trad);
        tvTitleFila = trad19.findViewById(R.id.tvTitleFila19trad);
        tvFila = trad19.findViewById(R.id.tvFila19trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad19);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleFila.setTypeface(title);

        back = trad19.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });





        return trad19;
    }

}
