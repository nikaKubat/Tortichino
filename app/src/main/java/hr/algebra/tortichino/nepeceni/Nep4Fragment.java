package hr.algebra.tortichino.nepeceni;


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

import hr.algebra.tortichino.NepeceniFragment;
import hr.algebra.tortichino.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Nep4Fragment extends Fragment {

    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle, tvTitleSmjesa1, tvSmjesa1, tvTitlePriprema1, tvPriprema1;
    private TextView tvTitleSmjesa2, tvSmjesa2, tvTitlePriprema2, tvPriprema2;
    private TextView tvTitlePunjenje, tvPunjenje, tvPriprema3, tvTitlePriprema3;
    private TextView tvTitleDodatno, tvDodatno, tvTitlePriprema4, tvPriprema4;


    public Nep4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View nep4 = inflater.inflate(R.layout.fragment_nep4, container, false);

        toolbar = nep4.findViewById(R.id.actionbar_nep4);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nep4.findViewById(R.id.tvTitleNep);
        tvTitleSmjesa1 = nep4.findViewById(R.id.tvTitleSmjesa4_1nep);
        tvSmjesa1 = nep4.findViewById(R.id.tvSmjesa4_1nep);
        tvTitlePriprema1 = nep4.findViewById(R.id.TvTitlePriprema4_1nep);
        tvPriprema1 = nep4.findViewById(R.id.tvPriprema4_1nep);
        tvTitleSmjesa2 = nep4.findViewById(R.id.tvTitleSmjesa4_2nep);
        tvSmjesa2 = nep4.findViewById(R.id.tvSmjesa4_2nep);
        tvTitlePriprema2 = nep4.findViewById(R.id.TvTitlePriprema4_2nep);
        tvPriprema2 = nep4.findViewById(R.id.tvPriprema4_2nep);
        tvTitlePunjenje = nep4.findViewById(R.id.tvTitlePunjenje4nep);
        tvPunjenje = nep4.findViewById(R.id.tvPunjenje4nep);
        tvTitlePriprema3 = nep4.findViewById(R.id.TvTitlePriprema4_3nep);
        tvPriprema3 = nep4.findViewById(R.id.tvPriprema4_3nep);
        tvTitleDodatno = nep4.findViewById(R.id.tvTitleDodatno4nep);
        tvDodatno = nep4.findViewById(R.id.tvDodatno4nep);
        tvTitlePriprema4 = nep4.findViewById(R.id.TvTitlePriprema4_4nep);
        tvPriprema4 = nep4.findViewById(R.id.tvPriprema4_4nep);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvTitle.setText(R.string.nepeceni4);
        tvSmjesa1.setTypeface(text);
        tvSmjesa2.setTypeface(text);
        tvPunjenje.setTypeface(text);
        tvDodatno.setTypeface(text);
        tvPriprema1.setTypeface(text);
        tvPriprema2.setTypeface(text);
        tvPriprema3.setTypeface(text);
        tvPriprema4.setTypeface(text);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSmjesa1.setTypeface(title);
        tvTitleSmjesa2.setTypeface(title);
        tvTitlePunjenje.setTypeface(title);
        tvTitleDodatno.setTypeface(title);
        tvTitlePriprema1.setTypeface(title);
        tvTitlePriprema2.setTypeface(title);
        tvTitlePriprema3.setTypeface(title);
        tvTitlePriprema4.setTypeface(title);

        back = nep4.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.commit();
            }
        });


        return nep4;
    }

}
