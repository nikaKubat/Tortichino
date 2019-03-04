package hr.algebra.tortichino.kremasti;


import android.content.ContentValues;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import hr.algebra.tortichino.KremastiFragment;
import hr.algebra.tortichino.R;
import hr.algebra.tortichino.database.DatabaseHelper;
import hr.algebra.tortichino.database.MyContentProvider;

/**
 * A simple {@link Fragment} subclass.
 */
public class Krem1Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleFila, tvFila, tvTitleTijesto1, tvTijesto1, tvTitleTijesto2, tvTijesto2, tvTitlePriprema, tvPriprema;


    public Krem1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem1 = inflater.inflate(R.layout.fragment_krem1, container, false);

        toolbar = krem1.findViewById(R.id.actionbar_krem1);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle =krem1.findViewById(R.id.tvTitleKremasti);
        tvTitleFila = krem1.findViewById(R.id.tvTitleFila1krem);
        tvFila = krem1.findViewById(R.id.tvFila1krem);
        tvTitleTijesto1 = krem1.findViewById(R.id.tvTitleTijesto1krem);
        tvTijesto1 = krem1.findViewById(R.id.tvTijesto1krem);
        tvTitleTijesto2 = krem1.findViewById(R.id.tvTitleTijesto2krem);
        tvTijesto2 = krem1.findViewById(R.id.tvTijesto2krem);
        tvTitlePriprema = krem1.findViewById(R.id.tvTitlePriprema1krem);
        tvPriprema = krem1.findViewById(R.id.tvPriprema1krem);
        back = krem1.findViewById(R.id.back);



        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvFila.setTypeface(text);
        tvTijesto1.setTypeface(text);
        tvTijesto2.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTitle.setText(R.string.kremasti1);


        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleFila.setTypeface(title);
        tvTitleTijesto1.setTypeface(title);
        tvTitleTijesto2.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.commit();
            }
        });



        return krem1;
    }

}
