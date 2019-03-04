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
public class Slani7Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;


    public Slani7Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View slani7 = inflater.inflate(R.layout.fragment_slani7, container, false);

        toolbar = slani7.findViewById(R.id.actionbar_slani7);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = slani7.findViewById(R.id.tvTitleSlani);
        tvTitleSastojci = slani7.findViewById(R.id.tvTitleSastojci7slani);
        tvSastojci = slani7.findViewById(R.id.tvSastojci7slani);
        tvTitlePriprema = slani7.findViewById(R.id.tvTitlePriprema7slani);
        tvPriprema = slani7.findViewById(R.id.tvPriprema7slani);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvTitle.setText(R.string.slani7);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);


        back = slani7.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SlaniFragment());
                transaction.commit();
            }
        });



        return slani7;
    }

}
