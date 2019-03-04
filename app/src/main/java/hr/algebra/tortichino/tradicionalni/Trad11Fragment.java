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
public class Trad11Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema, tvTitleTijesto, tvTijesto, tvTitlePreljev, tvPreljev;


    public Trad11Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad11 = inflater.inflate(R.layout.fragment_trad11, container, false);

        toolbar = trad11.findViewById(R.id.actionbar_trad5);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad11.findViewById(R.id.tvTitleTradicionalni);
        tvTitleBiskvit = trad11.findViewById(R.id.tvTitleBiskvit11trad);
        tvBiskvit = trad11.findViewById(R.id.tvBiskvit11trad);
        tvTitlePriprema = trad11.findViewById(R.id.tvTitlePriprema11trad);
        tvPriprema = trad11.findViewById(R.id.tvPriprema11trad);
        tvTitleTijesto = trad11.findViewById(R.id.tvTitleTijesto11trad);
        tvTijesto = trad11.findViewById(R.id.tvTijesto11trad);
        tvTitlePreljev = trad11.findViewById(R.id.tvTitlePreljev11trad);
        tvPreljev = trad11.findViewById(R.id.tvPreljev11trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad11);
        tvBiskvit.setTypeface(text);
        tvTijesto.setTypeface(text);
        tvPreljev.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleTijesto.setTypeface(title);
        tvTitlePreljev.setTypeface(title);

        back = trad11.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });




        return trad11;
    }

}
