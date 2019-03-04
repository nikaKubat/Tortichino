package hr.algebra.tortichino.tradicionalni;


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

import hr.algebra.tortichino.R;
import hr.algebra.tortichino.TradicionalniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Trad12Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;


    public Trad12Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad12 = inflater.inflate(R.layout.fragment_trad12, container, false);

        toolbar = trad12.findViewById(R.id.actionbar_trad12);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad12.findViewById(R.id.tvTitleTradicionalni);
        tvTitleSastojci = trad12.findViewById(R.id.tvTitleSastojci12trad);
        tvSastojci= trad12.findViewById(R.id.tvSastojci12trad);
        tvTitlePriprema = trad12.findViewById(R.id.tvTitlePriprema12trad);
        tvPriprema = trad12.findViewById(R.id.tvPriprema12trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad12);
        tvSastojci.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = trad12.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });




        return trad12;
    }

}
