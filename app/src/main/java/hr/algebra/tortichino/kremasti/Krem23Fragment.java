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
public class Krem23Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitle1dio, tv1dio, tvTitlePriprema1, tvPriprema1, tvTitle2dio, tv2dio, tvTitlePriprema2, tvPriprema2;
    private TextView tvTitle3dio, tv3dio, tvTitlePriprema3, tvPriprema3;


    public Krem23Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View krem23 = inflater.inflate(R.layout.fragment_krem23, container, false);

        toolbar = krem23.findViewById(R.id.actionbar_krem23);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = krem23.findViewById(R.id.tvTitleKremasti);
        tvTitle1dio = krem23.findViewById(R.id.tvTitle1dio23krem);
        tv1dio = krem23.findViewById(R.id.tv1dio23krem);
        tvTitlePriprema1 = krem23.findViewById(R.id.tvTitlePriprema23_1krem);
        tvPriprema1 = krem23.findViewById(R.id.tvPriprema23_1krem);
        tvTitle2dio = krem23.findViewById(R.id.tvTitle2dio23krem);
        tv2dio = krem23.findViewById(R.id.tv2dio23krem);
        tvTitlePriprema2 = krem23.findViewById(R.id.tvTitlePriprema23_2krem);
        tvPriprema2 = krem23.findViewById(R.id.tvPriprema23_2);
        tvTitle3dio = krem23.findViewById(R.id.tvTitle3dio23krem);
        tv3dio = krem23.findViewById(R.id.tv3dio23krem);
        tvTitlePriprema3 = krem23.findViewById(R.id.tvTitlePriprema23_3krem);
        tvPriprema3 = krem23.findViewById(R.id.tvPriprema23_3krem);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.kremasti23);
        tv1dio.setTypeface(text);
        tvPriprema1.setTypeface(text);
        tv2dio.setTypeface(text);
        tvPriprema2.setTypeface(text);
        tv3dio.setTypeface(text);
        tvPriprema3.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitle1dio.setTypeface(title);
        tvTitlePriprema1.setTypeface(title);
        tvTitle2dio.setTypeface(title);
        tvTitlePriprema2.setTypeface(title);
        tvTitle3dio.setTypeface(title);
        tvTitlePriprema3.setTypeface(title);

        back = krem23.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });





        return krem23;
    }

}
