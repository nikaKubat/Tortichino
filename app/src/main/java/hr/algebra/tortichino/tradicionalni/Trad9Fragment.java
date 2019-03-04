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
public class Trad9Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema, tvTitleFila, tvFila, tvTitlePosip, tvPosip;


    public Trad9Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad9 = inflater.inflate(R.layout.fragment_trad9, container, false);

        toolbar = trad9.findViewById(R.id.actionbar_trad9);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad9.findViewById(R.id.tvTitleTradicionalni);
        tvTitleBiskvit = trad9.findViewById(R.id.tvTitleBiskvit9trad);
        tvBiskvit = trad9.findViewById(R.id.tvBiskvit9trad);
        tvTitlePriprema = trad9.findViewById(R.id.tvTitlePriprema9trad);
        tvPriprema = trad9.findViewById(R.id.tvPriprema9trad);
        tvTitleFila = trad9.findViewById(R.id.tvTitleFila9trad);
        tvFila = trad9.findViewById(R.id.tvFila9trad);
        tvTitlePosip = trad9.findViewById(R.id.tvTitlePosip9trad);
        tvPosip = trad9.findViewById(R.id.tvPosip9trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad9);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvPosip.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitlePosip.setTypeface(title);
        tvTitleFila.setTypeface(title);

        back = trad9.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });





        return trad9;
    }

}
