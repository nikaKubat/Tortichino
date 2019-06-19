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
public class TradicionalniFragment extends Fragment implements ItemAdapter.OnItemListener {

    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageView back;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private ArrayList<ItemDetails> detailList;

    public TradicionalniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View tradFragment = inflater.inflate(R.layout.fragment_tradicionalni, container, false);

        ArrayList<ItemModel> tradList = new ArrayList<>();
        tradList.add(new ItemModel(R.drawable.trad1, getString(R.string.trad1)));
        tradList.add(new ItemModel(R.drawable.trad2, getString(R.string.trad2)));
        tradList.add(new ItemModel(R.drawable.trad3, getString(R.string.trad3)));
        tradList.add(new ItemModel(R.drawable.trad4, getString(R.string.trad4)));
        tradList.add(new ItemModel(R.drawable.trad5, getString(R.string.trad5)));
        tradList.add(new ItemModel(R.drawable.trad6, getString(R.string.trad6)));
        tradList.add(new ItemModel(R.drawable.trad7, getString(R.string.trad7)));
        tradList.add(new ItemModel(R.drawable.trad8, getString(R.string.trad8)));
        tradList.add(new ItemModel(R.drawable.trad9, getString(R.string.trad9)));
        tradList.add(new ItemModel(R.drawable.trad10, getString(R.string.trad10)));
        tradList.add(new ItemModel(R.drawable.trad11, getString(R.string.trad11)));
        tradList.add(new ItemModel(R.drawable.trad12, getString(R.string.trad12)));
        tradList.add(new ItemModel(R.drawable.trad13, getString(R.string.trad13)));
        tradList.add(new ItemModel(R.drawable.trad14, getString(R.string.trad14)));
        tradList.add(new ItemModel(R.drawable.trad15, getString(R.string.trad15)));
        tradList.add(new ItemModel(R.drawable.trad16, getString(R.string.trad16)));
        tradList.add(new ItemModel(R.drawable.trad17, getString(R.string.trad17)));
        tradList.add(new ItemModel(R.drawable.trad18, getString(R.string.trad18)));
        tradList.add(new ItemModel(R.drawable.trad19, getString(R.string.trad19)));

        detailList = new ArrayList<>();
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.fila) + "\n" +
                getString(R.string.trad1_desc1) + "\n" + getString(R.string.tijesto) + "\n" +
                getString(R.string.trad1_desc2) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.trad1_desc3),
                getString(R.string.priprema), getString(R.string.trad1_desc4), R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad2_desc1) + "\n" +
                getString(R.string.krema) + "\n" +
                getString(R.string.trad2_desc2), getString(R.string.priprema), getString(R.string.trad2_desc3), R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad3_desc1) + "\n" + getString(R.string.preljev) + "\n" +
                getString(R.string.trad3_desc2), getString(R.string.priprema), getString(R.string.trad3_desc3),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.priprema), getString(R.string.trad4_desc1),
                null, getString(R.string.trad4_desc2), R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad5_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.trad5_desc2), getString(R.string.priprema), getString(R.string.trad5_desc3),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad6_desc1) + "\n" + getString(R.string.nadjev) + "\n" +
                getString(R.string.trad6_desc2), getString(R.string.priprema), getString(R.string.trad6_desc3),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad7_desc1) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.trad7_desc2), getString(R.string.priprema), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad7_desc3) + "\n" + getString(R.string.krema) + "\n" +
                getString(R.string.trad7_desc4), R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad8_desc1),
                getString(R.string.priprema), getString(R.string.trad8_desc2),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad9_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.trad9_desc2) + "\n" + getString(R.string.posip) + "\n" +
                getString(R.string.trad9_desc3), getString(R.string.priprema), getString(R.string.trad9_desc4),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad10_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.trad10_desc2), getString(R.string.priprema), getString(R.string.trad10_desc3),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.tijesto) + "\n" +
                getString(R.string.trad11_desc1) + "\n" + getString(R.string.biskvit) + "\n" +
                getString(R.string.trad11_desc2) + "\n" + getString(R.string.preljev) + "\n" +
                getString(R.string.trad11_desc3), getString(R.string.priprema), getString(R.string.trad11_desc4),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad12_desc1),
                getString(R.string.priprema), getString(R.string.trad12_desc2),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad13_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.trad13_desc2), getString(R.string.priprema), getString(R.string.trad13_desc3),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad14_desc1) ,
                getString(R.string.priprema), getString(R.string.trad14_desc2),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad15_desc1),
                getString(R.string.priprema), getString(R.string.trad15_desc2),
                R.drawable.background_tockice_crvene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad16_desc1),
                getString(R.string.priprema), getString(R.string.trad16_desc2),
                R.drawable.background_tockice_crvene));

        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad17_desc1),
                getString(R.string.priprema), getString(R.string.korak_1) + "\n" + getString(R.string.trad17_desc2) + "\n" +
                getString(R.string.korak_2) + "\n" + getString(R.string.trad17_desc3) + "\n" +
                getString(R.string.korak_3) + "\n" + getString(R.string.trad17_desc4) + "\n" +
                getString(R.string.korak_4) + "\n" + getString(R.string.trad17_desc5),
                R.drawable.background_tockice_crvene));

        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.trad18_desc1),
                getString(R.string.priprema), getString(R.string.trad18_desc2),
                R.drawable.background_tockice_crvene));

        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.biskvit) + "\n" +
                getString(R.string.trad19_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.trad19_desc2), getString(R.string.priprema), getString(R.string.trad19_desc3),
                R.drawable.background_tockice_crvene));



        tvTitle = tradFragment.findViewById(R.id.tvTitleTrad);
        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);

        toolbar = tradFragment.findViewById(R.id.action_bar_trad);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        recyclerView = tradFragment.findViewById(R.id.rvTrad);
        recyclerView.setHasFixedSize(true);
        adapter = new ItemAdapter(tradList, this);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        back = tradFragment.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return tradFragment;
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
