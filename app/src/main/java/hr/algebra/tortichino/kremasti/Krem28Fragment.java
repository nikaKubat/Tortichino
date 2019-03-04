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
public class Krem28Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;


    public Krem28Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem28 = inflater.inflate(R.layout.fragment_krem28, container, false);

        toolbar = krem28.findViewById(R.id.actionbar_krem28);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem28.findViewById(R.id.tvTitleKremasti);
        tvTitleSastojci = krem28.findViewById(R.id.tvTitleSastojci28krem);
        tvSastojci = krem28.findViewById(R.id.tvSastojci28krem);
        tvTitlePriprema = krem28.findViewById(R.id.tvTitlePriprema28krem);
        tvPriprema = krem28.findViewById(R.id.tvPriprema28krem);


        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti28);
        tvSastojci.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitlePriprema.setTypeface(title);
        tvTitleSastojci.setTypeface(title);

        back = krem28.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return krem28;
    }

}
