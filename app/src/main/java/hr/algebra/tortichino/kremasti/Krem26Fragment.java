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
public class Krem26Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleFila, tvFila, tvTitlePriprema, tvPriprema;


    public Krem26Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem26 = inflater.inflate(R.layout.fragment_krem26, container, false);

        toolbar = krem26.findViewById(R.id.actionbar_krem26);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem26.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem26.findViewById(R.id.tvTitleBiskvit26krem);
        tvBiskvit = krem26.findViewById(R.id.tvBiskvit26krem);
        tvTitleFila = krem26.findViewById(R.id.tvTitleFila26krem);
        tvFila = krem26.findViewById(R.id.tvFila26krem);
        tvTitlePriprema = krem26.findViewById(R.id.tvTitlePriprema26krem);
        tvPriprema = krem26.findViewById(R.id.tvPriprema26krem);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti26);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleFila.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem26.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem26;
    }

}
