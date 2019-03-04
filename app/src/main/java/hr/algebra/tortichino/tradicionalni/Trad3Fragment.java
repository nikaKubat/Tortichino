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
public class Trad3Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema, tvTitlePreljev, tvPreljev;


    public Trad3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad3 = inflater.inflate(R.layout.fragment_trad3, container, false);

        toolbar = trad3.findViewById(R.id.actionbar_trad3);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad3.findViewById(R.id.tvTitleTradicionalni);
        tvTitleBiskvit = trad3.findViewById(R.id.tvTitleBiskvit3trad);
        tvBiskvit = trad3.findViewById(R.id.tvBiskvit3trad);
        tvTitlePriprema = trad3.findViewById(R.id.TvTitlePriprema3trad);
        tvPriprema = trad3.findViewById(R.id.tvPriprema3trad);
        tvPreljev = trad3.findViewById(R.id.tvPreljev3trad);
        tvTitlePreljev = trad3.findViewById(R.id.tvTitlePreljev3trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad3);
        tvBiskvit.setTypeface(text);
        tvPreljev.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitlePreljev.setTypeface(title);

        back = trad3.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });





        return trad3;
    }

}
