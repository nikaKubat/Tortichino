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
public class Krem18Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleFila, tvFila, tvTitlePriprema, tvPriprema;

    public Krem18Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem18 = inflater.inflate(R.layout.fragment_krem18, container, false);

        toolbar = krem18.findViewById(R.id.actionbar_krem18);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem18.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem18.findViewById(R.id.tvTitleBiskvit18krem);
        tvBiskvit = krem18.findViewById(R.id.tvBiskvit18krem);
        tvTitleFila = krem18.findViewById(R.id.tvTitleFila18krem);
        tvFila = krem18.findViewById(R.id.tvFila18krem);
        tvTitlePriprema = krem18.findViewById(R.id.tvTitlePriprema18krem);
        tvPriprema = krem18.findViewById(R.id.tvPriprema18krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti18);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleFila.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem18.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });





        return krem18;
    }

}
