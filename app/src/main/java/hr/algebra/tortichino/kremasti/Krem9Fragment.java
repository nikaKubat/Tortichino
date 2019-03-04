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
public class Krem9Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitleNadjev, tvNadjev, tvTitleGlazura, tvGlazura, tvTitlePriprema, tvPriprema;

    public Krem9Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem9 = inflater.inflate(R.layout.fragment_krem9, container, false);

        toolbar = krem9.findViewById(R.id.actionbar_krem9);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem9.findViewById(R.id.tvTitleKremasti);
        tvTitleBiskvit = krem9.findViewById(R.id.tvTitleBiskvit9krem);
        tvBiskvit = krem9.findViewById(R.id.tvBiskvit9krem);
        tvTitleGlazura = krem9.findViewById(R.id.tvTitleGlazura9krem);
        tvGlazura = krem9.findViewById(R.id.tvGlazura9krem);
        tvTitleNadjev = krem9.findViewById(R.id.tvTitleNadjev9krem);
        tvNadjev = krem9.findViewById(R.id.tvNadjev9krem);
        tvPriprema = krem9.findViewById(R.id.tvPriprema9krem);
        tvTitlePriprema = krem9.findViewById(R.id.tvTitlePriprema9krem);


        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti9);
        tvBiskvit.setTypeface(text);
        tvNadjev.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitleNadjev.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem9.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });


        return krem9;
    }

}
