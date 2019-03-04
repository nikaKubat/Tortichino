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
public class Trad6Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema, tvTitleNadjev, tvNadjev;


    public Trad6Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad6 = inflater.inflate(R.layout.fragment_trad6, container, false);

        toolbar = trad6.findViewById(R.id.actionbar_trad6);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad6.findViewById(R.id.tvTitleTradicionalni);
        tvTitleBiskvit = trad6.findViewById(R.id.tvTitleBiskvit6trad);
        tvBiskvit = trad6.findViewById(R.id.tvBiskvit6trad);
        tvTitlePriprema = trad6.findViewById(R.id.tvTitlePriprema6trad);
        tvPriprema = trad6.findViewById(R.id.tvPriprema6trad);
        tvTitleNadjev = trad6.findViewById(R.id.tvTitleNadjev6trad);
        tvNadjev = trad6.findViewById(R.id.tvNadjev6trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad6);
        tvBiskvit.setTypeface(text);
        tvNadjev.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleNadjev.setTypeface(title);

        back = trad6.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });




        return trad6;
    }

}
