package hr.algebra.tortichino;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import hr.algebra.tortichino.kremasti.ItemAdapter;
import hr.algebra.tortichino.kremasti.ItemDetails;
import hr.algebra.tortichino.kremasti.ItemKremastiFragment;
import hr.algebra.tortichino.kremasti.ItemModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class TorteFragment extends Fragment implements ItemAdapter.OnItemListener {

    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageView back;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ItemDetails> detailList;

    public TorteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View torteFragment = inflater.inflate(R.layout.fragment_torte, container, false);

        ArrayList<ItemModel> torteList = new ArrayList<>();
        torteList.add(new ItemModel(R.drawable.torta1, getString(R.string.torta1)));
        torteList.add(new ItemModel(R.drawable.torta2, getString(R.string.torta2)));
        torteList.add(new ItemModel(R.drawable.torta3, getString(R.string.torta3)));
        torteList.add(new ItemModel(R.drawable.torta5, getString(R.string.torta5)));
        torteList.add(new ItemModel(R.drawable.torta6, getString(R.string.torta6)));
        torteList.add(new ItemModel(R.drawable.torta7, getString(R.string.torta7)));
        torteList.add(new ItemModel(R.drawable.torta8, getString(R.string.torta8)));
        torteList.add(new ItemModel(R.drawable.torta9, getString(R.string.torta9)));
        torteList.add(new ItemModel(R.drawable.torta10, getString(R.string.torta10)));
        torteList.add(new ItemModel(R.drawable.torta11, getString(R.string.torta11)));
        torteList.add(new ItemModel(R.drawable.torta12, getString(R.string.torta12)));
        torteList.add(new ItemModel(R.drawable.torta13, getString(R.string.torta13)));
        torteList.add(new ItemModel(R.drawable.torta14, getString(R.string.torta14)));
        torteList.add(new ItemModel(R.drawable.torta15, getString(R.string.torta15)));


        detailList = new ArrayList<>();
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.torta1_desc1) ,
                getString(R.string.priprema), getString(R.string.torta1_desc2), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.torta2_desc1) ,
                getString(R.string.priprema), getString(R.string.torta2_desc2), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci),getString(R.string.biskvit) + "\n" +
                getString(R.string.torta3_desc1) + "\n" + getString(R.string.cokoladna_glazura) + "\n" +
                getString(R.string.torta3_desc2) , getString(R.string.priprema), getString(R.string.torta3_desc3),
                R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.torta5_desc1) ,
                getString(R.string.priprema), getString(R.string.biskvit) + "\n" + getString(R.string.torta5_desc2)  + "\n" +
                getString(R.string.fila) + "\n" + getString(R.string.torta5_desc3)  + "\n" + getString(R.string.preljev_za_koru)  + "\n" +
                getString(R.string.torta5_desc4), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.torta6_desc1) + "\n" +
                getString(R.string.glazura) + "\n" + getString(R.string.torta6_desc2) ,
                getString(R.string.priprema), getString(R.string.torta6_desc3)  + "\n" +
                getString(R.string.glazura) + "\n" + getString(R.string.torta6_desc4),  R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.cokoladni_biskvit)  + "\n" +
                getString(R.string.torta7_desc1) + "\n" + getString(R.string.cokoladni_ganache)  + "\n" +
                getString(R.string.torta7_desc2) + "\n" + getString(R.string.krema_od_narance)  + "\n" +
                getString(R.string.torta7_desc3) + "\n" + getString(R.string.kore_od_narance)  + "\n" +
                getString(R.string.torta7_desc4), getString(R.string.priprema), getString(R.string.cokoladni_biskvit)  + "\n" +
                getString(R.string.torta7_desc5) + "\n" + getString(R.string.cokoladni_ganache)  + "\n" +
                getString(R.string.torta7_desc6) + "\n" + getString(R.string.krema_od_narance)  + "\n" +
                getString(R.string.torta7_desc7) + "\n" + getString(R.string.kore_od_narance)  + "\n" +
                getString(R.string.torta7_desc8) + "\n" + getString(R.string.slaganje_torte)  + "\n" +
                getString(R.string.torta7_desc9), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.torta8_desc1) + "\n" +
                getString(R.string.torta8_desc2) , getString(R.string.priprema),
                getString(R.string.torta8_desc3) + "\n" + getString(R.string.torta8_desc4), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.kore), getString(R.string.torta9_desc1) ,
                getString(R.string.karamel), getString(R.string.torta9_desc2) + "\n" +
                getString(R.string.torta9_desc3) + "\n" + getString(R.string.torta9_desc4), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.biskvit),getString(R.string.trokut) + "\n" +
                getString(R.string.torta10_desc1) + "\n" + getString(R.string.pravokutnik) + "\n" +
                getString(R.string.torta10_desc2) + "\n" + getString(R.string.kugla_napola_kao_kupola) + "\n" +
                getString(R.string.torta10_desc3) + "\n" + getString(R.string.torta10_desc4),
                getString(R.string.glazura), getString(R.string.trokut) + "\n" +
                getString(R.string.torta10_desc5) + "\n" + getString(R.string.pravokutnik) + "\n" +
                getString(R.string.torta10_desc6) + "\n" + getString(R.string.kugla_napola_kao_kupola) + "\n" +
                getString(R.string.torta10_desc7), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.torta11_desc1) ,
                getString(R.string.priprema), getString(R.string.torta11_desc2), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.krema) + "\n" +
                getString(R.string.torta12_desc1) + "\n" + getString(R.string.za_dekoraciju) + "\n" +
                getString(R.string.torta12_desc2), getString(R.string.priprema), getString(R.string.torta12_desc3),
                R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit_1) + "\n" +
                getString(R.string.torta13_desc1) + "\n" + getString(R.string.biskvit_2) + "\n" +
                getString(R.string.torta13_desc2) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.torta13_desc3), getString(R.string.priprema), getString(R.string.biskvit_1) + "\n" +
                getString(R.string.torta13_desc1) + "\n" + getString(R.string.biskvit_2) + "\n" +
                getString(R.string.torta13_desc2) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.torta13_desc3), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.torta14_desc1) + "\n" + getString(R.string.cokoladna_krema) + "\n" +
                getString(R.string.torta14_desc2) + "\n" + getString(R.string.ostalo) + "\n" +
                getString(R.string.torta14_desc3), getString(R.string.priprema), getString(R.string.torta14_desc4) + "\n" +
                getString(R.string.torta14_desc5), R.drawable.background_tockice_smede));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.torta15_desc1) + "\n" + getString(R.string.krema_1) + "\n" +
                getString(R.string.torta15_desc2) + "\n" + getString(R.string.krema_2) + "\n" +
                getString(R.string.torta15_desc3) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.torta15_desc4), getString(R.string.priprema),getString(R.string.biskvit) + "\n" +
                getString(R.string.torta15_desc5) + "\n" + getString(R.string.krema_1) + "\n" +
                getString(R.string.torta15_desc6) + "\n" + getString(R.string.krema_2) + "\n" +
                getString(R.string.torta15_desc7) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.torta15_desc8) , R.drawable.background_tockice_smede));

        toolbar = torteFragment.findViewById(R.id.action_bar_torte);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = torteFragment.findViewById(R.id.tvTitleTorte);
        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);
        back = torteFragment.findViewById(R.id.back);

        recyclerView = torteFragment.findViewById(R.id.rvTorte);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ItemAdapter(torteList, this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.commit();
            }
        });

        return torteFragment;
    }


    @Override
    public void onItemClick(int adapterPosition, String title, int image) {

        ItemKremastiFragment itemDetailFragment = new ItemKremastiFragment();
        ItemDetails itemDetails = this.detailList.get(adapterPosition);

        Bundle bundle = new Bundle();
        bundle.putString("TITLE_KEY", title);
        bundle.putInt("IMAGE_KEY", image);
        bundle.putString("TITLE_1", itemDetails.getTitle1());
        bundle.putString("DESC_1", itemDetails.getDesc1());
        bundle.putString("TITLE_2", itemDetails.getTitle2());
        bundle.putString("DESC_2", itemDetails.getDesc2());
        bundle.putInt("BACKGROUND_KEY", itemDetails.getBackground());
        itemDetailFragment.setArguments(bundle);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, itemDetailFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
