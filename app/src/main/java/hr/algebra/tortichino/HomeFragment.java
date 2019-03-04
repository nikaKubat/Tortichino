package hr.algebra.tortichino;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private Toolbar toolbar;
    private TextView tvLogo, tvTorte, tvKremasti, tvTrad, tvSitni, tvSlani, tvNepeceni;
    private CardView cvTorte, cvKrem, cvTrad, cvSitni, cvSlani, cvNepeceni;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View homeFragment = inflater.inflate(R.layout.fragment_home, container, false);

        tvLogo = homeFragment.findViewById(R.id.tvLogo);
        toolbar = homeFragment.findViewById(R.id.action_bar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTorte = homeFragment.findViewById(R.id.tvTorte);
        tvKremasti = homeFragment.findViewById(R.id.tvKremasti);
        tvTrad = homeFragment.findViewById(R.id.tvTradicionalni);
        tvSitni = homeFragment.findViewById(R.id.tvSitni);
        tvSlani = homeFragment.findViewById(R.id.tvSlani);
        tvNepeceni = homeFragment.findViewById(R.id.tvNepeceni);
        cvTorte = homeFragment.findViewById(R.id.cvTorte);
        cvKrem = homeFragment.findViewById(R.id.cvKremasti);
        cvTrad = homeFragment.findViewById(R.id.cvTradicionalni);
        cvSitni = homeFragment.findViewById(R.id.cvSitni);
        cvSlani = homeFragment.findViewById(R.id.cvSlani);
        cvNepeceni = homeFragment.findViewById(R.id.cvNepeceni);


        Typeface logo = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvLogo.setTypeface(logo);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTorte.setTypeface(title);
        tvKremasti.setTypeface(title);
        tvTrad.setTypeface(title);
        tvSitni.setTypeface(title);
        tvSlani.setTypeface(title);
        tvNepeceni.setTypeface(title);


        cvTorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TorteFragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        cvTrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new TradicionalniFragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        cvKrem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new KremastiFragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        cvSitni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SitniFragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        cvSlani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new SlaniFragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        cvNepeceni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new NepeceniFragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });


        return homeFragment;
    }

}
