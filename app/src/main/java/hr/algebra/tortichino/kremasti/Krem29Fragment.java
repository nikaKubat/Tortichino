package hr.algebra.tortichino.kremasti;


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

import hr.algebra.tortichino.KremastiFragment;
import hr.algebra.tortichino.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Krem29Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleFila, tvFila, tvTitleGlazura, tvGlazura, tvTitlePriprema, tvPriprema;


    public Krem29Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem29 = inflater.inflate(R.layout.fragment_krem29, container, false);

        toolbar = krem29.findViewById(R.id.actionbar_krem29);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem29.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem29.findViewById(R.id.tvTitleBiskvit29krem);
        tvBiskvit = krem29.findViewById(R.id.tvBiskvit29krem);
        tvTitleFila = krem29.findViewById(R.id.tvTitleFila29krem);
        tvFila = krem29.findViewById(R.id.tvFila29krem);
        tvTitleGlazura = krem29.findViewById(R.id.tvTitleGlazura29krem);
        tvGlazura = krem29.findViewById(R.id.tvGlazura29krem);
        tvTitlePriprema = krem29.findViewById(R.id.tvTitlePriprema29krem);
        tvPriprema = krem29.findViewById(R.id.tvPriprema29krem);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti29);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleFila.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem29.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        return krem29;
    }

}
