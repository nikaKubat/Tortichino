package hr.algebra.tortichino.torte;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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
public class Torta11Fragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvTitle, tvTitleSastojci, tvSastojci, tvTitlePriprema, tvPriprema;
    private ImageView back;

    public Torta11Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View torta11 = inflater.inflate(R.layout.fragment_torta11, container, false);

        toolbar = torta11.findViewById(R.id.actionbar_torta11);
        tvTitle = torta11.findViewById(R.id.tvTitleTorta);
        tvTitleSastojci = torta11.findViewById(R.id.tvTitleSastojci11);
        tvTitlePriprema = torta11.findViewById(R.id.tvTitlePostupak11);
        tvSastojci = torta11.findViewById(R.id.tvSastojci11);
        tvPriprema = torta11.findViewById(R.id.tvPostupak11);

        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvPriprema.setTypeface(text);
        tvTitle.setText("Zdrava torta");

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePriprema.setTypeface(title);

        back = torta11.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.commit();
            }
        });


        return torta11;
    }

}
