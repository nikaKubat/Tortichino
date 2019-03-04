package hr.algebra.tortichino.slani;


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
import hr.algebra.tortichino.SlaniFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Slani3Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleNadjev, tvNadjev, tvTitleTijesto, tvTijesto, tvTitlePriprema, tvPriprema;

    public Slani3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View slani3 = inflater.inflate(R.layout.fragment_slani3, container, false);

        toolbar = slani3.findViewById(R.id.actionbar_slani3);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = slani3.findViewById(R.id.tvTitleSlani);
        tvTitleTijesto = slani3.findViewById(R.id.tvTitleTijesto3slani);
        tvTijesto = slani3.findViewById(R.id.tvTijesto3slani);
        tvTitleNadjev = slani3.findViewById(R.id.tvTitleNadjev3slani);
        tvNadjev = slani3.findViewById(R.id.tvNadjev3slani);
        tvTitlePriprema = slani3.findViewById(R.id.tvTitlePriprema3slani);
        tvPriprema = slani3.findViewById(R.id.tvPriprema3slani);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTijesto.setTypeface(text);
        tvNadjev.setTypeface(text);
        tvTitle.setText(R.string.slani3);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleTijesto.setTypeface(title);
        tvTitleNadjev.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = slani3.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SlaniFragment());
                transaction.commit();
            }
        });




        return slani3;
    }

}
