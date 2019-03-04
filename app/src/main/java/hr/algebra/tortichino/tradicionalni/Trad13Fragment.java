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
public class Trad13Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleBiskvit, tvBiskvit, tvTitlePriprema, tvPriprema, tvTitleFila, tvFila;


    public Trad13Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trad13 = inflater.inflate(R.layout.fragment_trad13, container, false);

        toolbar = trad13.findViewById(R.id.actionbar_trad13);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = trad13.findViewById(R.id.tvTitleTradicionalni);
        tvTitleBiskvit = trad13.findViewById(R.id.tvTitleBiskvit13trad);
        tvBiskvit = trad13.findViewById(R.id.tvBiskvit13trad);
        tvTitlePriprema = trad13.findViewById(R.id.tvTitlePriprema13trad);
        tvPriprema = trad13.findViewById(R.id.tvPriprema13trad);
        tvTitleFila = trad13.findViewById(R.id.tvTitleFila13trad);
        tvFila = trad13.findViewById(R.id.tvFila13trad);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.trad13);
        tvBiskvit.setTypeface(text);
        tvFila.setTypeface(text);
        tvPriprema.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleBiskvit.setTypeface(title);
        tvTitlePriprema.setTypeface(title);
        tvTitleFila.setTypeface(title);

        back = trad13.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.commit();
            }
        });





        return trad13;
    }

}
