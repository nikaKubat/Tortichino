package hr.algebra.tortichino;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
public class KremastiFragment extends Fragment implements ItemAdapter.OnItemListener{

    private static final String TAG = "KremastiFragment";
    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageView back;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> kremastiList;
    ArrayList<ItemDetails> detailList;

    public KremastiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View kremastiFragment = inflater.inflate(R.layout.fragment_kremasti, container, false);

        kremastiList = new ArrayList<>();
        kremastiList.add(new ItemModel(R.drawable.kremasti1, getString(R.string.kremasti1)));
        kremastiList.add(new ItemModel(R.drawable.kremasti2, getString(R.string.kremasti2)));
        kremastiList.add(new ItemModel(R.drawable.kremasti3, getString(R.string.kremasti3)));
        kremastiList.add(new ItemModel(R.drawable.kremasti4, getString(R.string.kremasti4)));
        kremastiList.add(new ItemModel(R.drawable.kremasti5, getString(R.string.kremasti5)));
        kremastiList.add(new ItemModel(R.drawable.kremasti6, getString(R.string.kremasti6)));
        kremastiList.add(new ItemModel(R.drawable.kremasti8, getString(R.string.kremasti8)));
        kremastiList.add(new ItemModel(R.drawable.kremasti9, getString(R.string.kremasti9)));
        kremastiList.add(new ItemModel(R.drawable.kremasti10, getString(R.string.kremasti10)));
        kremastiList.add(new ItemModel(R.drawable.kremasti11, getString(R.string.kremasti11)));
        kremastiList.add(new ItemModel(R.drawable.kremasti12, getString(R.string.kremasti12)));
        kremastiList.add(new ItemModel(R.drawable.kremasti13, getString(R.string.kremasti13)));
        kremastiList.add(new ItemModel(R.drawable.kremasti14, getString(R.string.kremasti14)));
        kremastiList.add(new ItemModel(R.drawable.kremasti15, getString(R.string.kremasti15)));
        kremastiList.add(new ItemModel(R.drawable.kremasti16, getString(R.string.kremasti16)));
        kremastiList.add(new ItemModel(R.drawable.kremasti17, getString(R.string.kremasti17)));
        kremastiList.add(new ItemModel(R.drawable.kremasti18, getString(R.string.kremasti18)));
        kremastiList.add(new ItemModel(R.drawable.kremasti19, getString(R.string.kremasti19)));
        kremastiList.add(new ItemModel(R.drawable.kremasti20, getString(R.string.kremasti20)));
        kremastiList.add(new ItemModel(R.drawable.kremasti21, getString(R.string.kremasti21)));
        kremastiList.add(new ItemModel(R.drawable.kremasti22, getString(R.string.kremasti22)));
        kremastiList.add(new ItemModel(R.drawable.kremasti23, getString(R.string.kremasti23)));
        kremastiList.add(new ItemModel(R.drawable.kremasti24, getString(R.string.kremasti24)));
        kremastiList.add(new ItemModel(R.drawable.kremasti25, getString(R.string.kremasti25)));
        kremastiList.add(new ItemModel(R.drawable.kremasti26, getString(R.string.kremasti26)));
        kremastiList.add(new ItemModel(R.drawable.kremasti27, getString(R.string.kremasti27)));
        kremastiList.add(new ItemModel(R.drawable.kremasti28, getString(R.string.kremasti28)));
        kremastiList.add(new ItemModel(R.drawable.kremasti29, getString(R.string.kremasti29)));

        detailList = new ArrayList<>();
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.fila) +"\n"
        + getString(R.string.krem1_desc1) + "\n" + getString(R.string._1_tijesto) + "\n" +
                getString(R.string.krem1_desc2) + "\n" + getString(R.string._2_tijesto) + "\n" +
                getString(R.string.krem1_desc3), getString(R.string.priprema), getString(R.string.krem1_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string._1_tijesto) +"\n"
                + getString(R.string.krem2_desc1) + "\n" + getString(R.string._2_tijesto) + "\n" +
                getString(R.string.krem2_desc2) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem2_desc3), getString(R.string.priprema), getString(R.string._1_tijesto) +"\n"
                + getString(R.string.krem2_desc4) + "\n" + getString(R.string._2_tijesto) + "\n" +
                getString(R.string.krem2_desc5) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.kem2_desc6), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem3_desc1) + "\n" + getString(R.string.preljev_za_biskvit) + "\n" +
                getString(R.string.krem3_desc2) + "\n" + getString(R.string.grans) + "\n" +
                getString(R.string.kre3_desc3) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem3_desc4), getString(R.string.priprema), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem3_desc5) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem3_desc6) + "\n" + getString(R.string.grans) + "\n" +
                getString(R.string.krem3_desc7) + "\n" +
                getString(R.string.postupak) + "\n" + getString(R.string.krem3_desc8), R.drawable.background_tockice_tirk ));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem4_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem4_desc2) , getString(R.string.priprema), getString(R.string.krem4_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sastojci_za_4_kore) +"\n"
                + getString(R.string.krem5_desc1) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.krem5_desc2) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem5_desc3), getString(R.string.priprema), getString(R.string.krem5_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem6_desc1) + "\n" + getString(R.string.nadjev) + "\n" +
                getString(R.string.krem6_desc2), getString(R.string.priprema), getString(R.string.krem6_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.krema) +"\n"
                + getString(R.string.krem8_desc1) + "\n" + getString(R.string.biskvit) + "\n" +
                getString(R.string.krem8_desc2) , getString(R.string.priprema), getString(R.string.krem8_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem9_desc1) + "\n" + getString(R.string.nadjev) + "\n" +
                getString(R.string.krem9_desc2) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.krem9_desc3), getString(R.string.priprema), getString(R.string.krem9_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem10_desc1) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.krem10_desc2) + "\n" + getString(R.string.zuta_krema) + "\n" +
                getString(R.string.krem10_desc3) + "\n" + getString(R.string.bijela_krema) + "\n" +
                getString(R.string.krem10_desc4), getString(R.string.priprema), getString(R.string.krem10_desc5), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.krem11_desc1),
                getString(R.string.priprema), getString(R.string.krem11_desc2), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.krem12_desc1) +
                "\n" + getString(R.string.biskvit) + "\n" +
                getString(R.string.krem12_desc2) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem12_desc3), getString(R.string.priprema), getString(R.string.krem12_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.ukrasavanje) +"\n"
                + getString(R.string.krem13_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem13_desc2) + "\n" + getString(R.string.biskvit) + "\n" +
                getString(R.string.krem13_desc3), getString(R.string.priprema), getString(R.string.krem13_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem14_desc1) + "\n" + getString(R.string.preljev_za_biskvit) + "\n" +
                getString(R.string.krem14_desc2) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem14_desc3), getString(R.string.priprema), getString(R.string.krem14_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.biskvit), getString(R.string.krem15_desc1),
                getString(R.string.glazura), getString(R.string.krem15_desc2), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem16_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem16_desc2) , getString(R.string.priprema), getString(R.string.krem16_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem17_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem17_desc2) , getString(R.string.priprema), getString(R.string.krem17_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem18_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.krem18_desc2) , getString(R.string.priprema), getString(R.string.krem18_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem19_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.krem19_desc2) , getString(R.string.priprema), getString(R.string.krem19_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem20_desc1) + "\n" + getString(R.string.fila_mak) + "\n" +
                getString(R.string.krem20_desc2) + "\n" + getString(R.string.fila_kokos) + "\n" +
                getString(R.string.krem20_desc3), getString(R.string.priprema), getString(R.string.krem20_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.krem21_desc1) + "\n" +
                getString(R.string.preljev_za_biskvit) + "\n" +
                getString(R.string.krem21_desc2) , getString(R.string.priprema), getString(R.string.krem21_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem22_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem22_desc2) + "\n" + getString(R.string.medusloj) + "\n" +
                getString(R.string.krem22_desc3) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.krem22_desc4), getString(R.string.priprema),getString(R.string.biskvit) +"\n"
                + getString(R.string.krem22_desc5) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem22_desc6) + "\n" + getString(R.string.medusloj) + "\n" +
                getString(R.string.krem22_desc7) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.krem22_desc8) + "\n" + getString(R.string.slaganje) + "\n" +
                getString(R.string.krem22_desc9), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string._1_dio) +"\n"
                + getString(R.string.krem23_desc1) + "\n" + getString(R.string._2_dio) + "\n" +
                getString(R.string.krem23_desc2) + "\n" + getString(R.string._3_dio) + "\n" +
                getString(R.string.krem23_desc3), getString(R.string.priprema), getString(R.string._1_dio) +"\n"
                + getString(R.string.krem23_desc4) + "\n" + getString(R.string._2_dio) + "\n" +
                getString(R.string.krem23_desc5) + "\n" + getString(R.string._3_dio) + "\n" +
                getString(R.string.krem23_desc6), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.beze) +"\n"
                + getString(R.string.krem24_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem24_desc2) , getString(R.string.priprema),getString(R.string.beze) +"\n"
                + getString(R.string.krem24_desc3) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem24_desc4) + "\n" + getString(R.string.ukrasavanje) + "\n" +
                getString(R.string.krem24_desc5), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem25_desc1) + "\n" + getString(R.string._1_krema) + "\n" +
                getString(R.string.krem25_desc2) + "\n" + getString(R.string._2_krema) + "\n" +
                getString(R.string.krem25_desc3), getString(R.string.priprema), getString(R.string.krem25_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem26_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.krem26_desc2) , getString(R.string.priprema), getString(R.string.krem26_desc3), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem27_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem27_desc2) , getString(R.string.priprema),getString(R.string.biskvit) +"\n"
                + getString(R.string.krem27_desc3) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.krem27_desc4), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.krem28_desc1) ,
                getString(R.string.priprema), getString(R.string.krem28_desc2), R.drawable.background_tockice_tirk));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) +"\n"
                + getString(R.string.krem29_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.krem29_desc2) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.krem29_desc3), getString(R.string.priprema), getString(R.string.krem29_desc4), R.drawable.background_tockice_tirk));




        toolbar = kremastiFragment.findViewById(R.id.action_bar_krem);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = kremastiFragment.findViewById(R.id.tvTitleKrem);
        back = kremastiFragment.findViewById(R.id.back);

        Typeface title = Typeface.createFromAsset(kremastiFragment.getContext().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);

        recyclerView = kremastiFragment.findViewById(R.id.rvKremasti);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ItemAdapter(kremastiList, this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return kremastiFragment;
    }

    @Override
    public void onItemClick(int adapterPosition, String title, int imageResource) {
        Log.d(TAG, "onItemClick: clicked");
        ItemKremastiFragment itemDetailFragment = new ItemKremastiFragment();
        ItemDetails itemDetails = this.detailList.get(adapterPosition);

        Bundle bundle = new Bundle();
        bundle.putString("TITLE_KEY", title);
        bundle.putInt("IMAGE_KEY", imageResource);
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
