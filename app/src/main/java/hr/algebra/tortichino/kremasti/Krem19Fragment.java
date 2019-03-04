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
public class Krem19Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleFila, tvFila, tvTilePriprema, tvPriprema;


    public Krem19Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem19 = inflater.inflate(R.layout.fragment_krem19, container, false);

        toolbar = krem19.findViewById(R.id.actionbar_krem19);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem19.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem19.findViewById(R.id.tvTitleBiskvit19krem);
        tvBiskvit = krem19.findViewById(R.id.tvBiskvit19krem);
        tvTitleFila = krem19.findViewById(R.id.tvTitleFila19krem);
        tvFila = krem19.findViewById(R.id.tvFila19krem);
        tvTilePriprema = krem19.findViewById(R.id.tvTitlePriprema19krem);
        tvPriprema = krem19.findViewById(R.id.tvPriprema19krem);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti19);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleFila.setTypeface(title);
        tvTilePriprema.setTypeface(title);


        back = krem19.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem19;
    }

}
