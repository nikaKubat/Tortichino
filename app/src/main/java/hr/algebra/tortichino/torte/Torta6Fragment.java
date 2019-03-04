package hr.algebra.tortichino.torte;


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
import hr.algebra.tortichino.TorteFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Torta6Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitleGlazura, tvGlazura, tvTitlePostupak, tvPostupak;
    private ImageView back;

    public Torta6Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta6 = inflater.inflate(R.layout.fragment_torta6, container, false);

        toolbar = torta6.findViewById(R.id.actionbar_torta6);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        tvTitle = torta6.findViewById(R.id.tvTitleTorta);
        tvTitleSastojci = torta6.findViewById(R.id.tvTitleSastojci6);
        tvSastojci = torta6.findViewById(R.id.tvSastojci6);
        tvTitleGlazura = torta6.findViewById(R.id.tvTitleGlazura);
        tvGlazura = torta6.findViewById(R.id.tvGlazura);
        tvTitlePostupak = torta6.findViewById(R.id.tvTitlePostupak6);
        tvPostupak = torta6.findViewById(R.id.tvPostupak6);

        final Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvGlazura.setTypeface(text);
        tvPostupak.setTypeface(text);
        tvTitle.setText("Panj");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitleGlazura.setTypeface(title);
        tvTitlePostupak.setTypeface(title);

        back = torta6.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });

        return torta6;
    }

}
