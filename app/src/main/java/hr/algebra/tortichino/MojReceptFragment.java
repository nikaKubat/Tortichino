package hr.algebra.tortichino;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class MojReceptFragment extends Fragment {

    private TextView tvNaziv, tvTitleSastojci, tvSastojci, tvTitlePostupak, tvPostupak;
    private Toolbar toolbar;
    private ImageView back;

    public MojReceptFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mojRecept = inflater.inflate(R.layout.fragment_moj_recept, container, false);

        toolbar = mojRecept.findViewById(R.id.actionbar_recept);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        tvNaziv = mojRecept.findViewById(R.id.tvMojiRecepti);
        tvTitleSastojci = mojRecept.findViewById(R.id.tvTitleSastojciMojRecept);
        tvSastojci = mojRecept.findViewById(R.id.tvSastojciMojRecept);
        tvTitlePostupak = mojRecept.findViewById(R.id.tvTitlePostupakMojRecept);
        tvPostupak = mojRecept.findViewById(R.id.tvPostupakMojRecept);
        back = mojRecept.findViewById(R.id.back);

        Bundle bundle = getArguments();

        String naziv = bundle.getString("NAZIV_KEY");
        String sastojci = bundle.getString("SASTOJCI_KEY");
        String postupak = bundle.getString("POSTUPAK_KEY");

        tvNaziv.setText(naziv);
        tvSastojci.setText(sastojci);
        tvPostupak.setText(postupak);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTNBold-1.ttf");
        tvTitleSastojci.setTypeface(title);
        tvTitlePostupak.setTypeface(title);


        Typeface text = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvNaziv.setTypeface(text);
        tvSastojci.setTypeface(text);
        tvPostupak.setTypeface(text);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ProfileFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return mojRecept;
    }

}
