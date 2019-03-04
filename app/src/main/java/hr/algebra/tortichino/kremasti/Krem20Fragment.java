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
public class Krem20Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleFila1, tvFila1, tvTitleFila2, tvFila2, tvTitlePriprema, tvPriprema;


    public Krem20Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem20 = inflater.inflate(R.layout.fragment_krem20, container, false);

        toolbar = krem20.findViewById(R.id.actionbar_krem20);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem20.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem20.findViewById(R.id.tvTitleBiskvit20krem);
        tvBiskvit = krem20.findViewById(R.id.tvBiskvit20krem);
        tvTitleFila1 = krem20.findViewById(R.id.tvTitleFilaM20krem);
        tvFila1 = krem20.findViewById(R.id.tvFilaM20krem);
        tvTitleFila2 = krem20.findViewById(R.id.tvTitleFilaK20krem);
        tvFila2 = krem20.findViewById(R.id.tvFilaK20krem);
        tvTitlePriprema = krem20.findViewById(R.id.tvTitlePriprema20krem);
        tvPriprema = krem20.findViewById(R.id.tvPriprema20krem);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti20);
        tvBiskvit.setTypeface(text);
        tvFila2.setTypeface(text);
        tvFila1.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleFila2.setTypeface(title);
        tvTitleFila1.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem20.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        return krem20;
    }

}
