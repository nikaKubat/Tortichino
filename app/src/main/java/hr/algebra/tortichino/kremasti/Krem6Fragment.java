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

import java.lang.reflect.Type;

import hr.algebra.tortichino.KremastiFragment;
import hr.algebra.tortichino.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Krem6Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleNadjev, tvNadjev, tvTitlePriprema, tvPriprema;


    public Krem6Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem6 = inflater.inflate(R.layout.fragment_krem6, container, false);

        toolbar = krem6.findViewById(R.id.actionbar_krem6);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem6.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem6.findViewById(R.id.tvTitleBiskvit6krem);
        tvBiskvit = krem6.findViewById(R.id.tvBiskvit6krem);
        tvTitleNadjev = krem6.findViewById(R.id.tvTitleNadjev6krem);
        tvNadjev = krem6.findViewById(R.id.tvNadjev6krem);
        tvPriprema = krem6.findViewById(R.id.tvPriprema6krem);
        tvTitlePriprema = krem6.findViewById(R.id.tvTitlePriprema6krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvBiskvit.setTypeface(text);
        tvNadjev.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTitle.setText(R.string.kremasti6);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleNadjev.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem6.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });



        return krem6;
    }

}
