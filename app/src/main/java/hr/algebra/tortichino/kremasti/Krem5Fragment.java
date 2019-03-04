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
public class Krem5Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleKore, tvKore, tvTitleGlazura, tvGlazura, tvTitleKrema, tvKrema, tvTitlePriprema, tvPriprema;

    public Krem5Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem5 = inflater.inflate(R.layout.fragment_krem5, container, false);

        toolbar = krem5.findViewById(R.id.actionbar_krem5);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem5.findViewById(R.id.tvTitleKremasti);
        tvTitleKore = krem5.findViewById(R.id.tvTitleKore5krem);
        tvKore = krem5.findViewById(R.id.tvKore5krem);
        tvTitleGlazura = krem5.findViewById(R.id.tvTitleGlazura5krem);
        tvGlazura = krem5.findViewById(R.id.tvGlazura5krem);
        tvTitleKrema = krem5.findViewById(R.id.tvTitleKrema5krem);
        tvKrema = krem5.findViewById(R.id.tvKrema5krem);
        tvPriprema = krem5.findViewById(R.id.tvPriprema5krem);
        tvTitlePriprema = krem5.findViewById(R.id.tvTitlePriprema5krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti5);
        tvKore.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvKrema.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleKore.setTypeface(title);
        tvTitleKrema.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = krem5.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });



        return krem5;
    }

}
