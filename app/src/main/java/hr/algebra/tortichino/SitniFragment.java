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
public class SitniFragment extends Fragment implements ItemAdapter.OnItemListener {

    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageView back;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ItemDetails> detailList;

    public SitniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sitniFrag = inflater.inflate(R.layout.fragment_sitni, container, false);

        ArrayList<ItemModel> sitniList = new ArrayList<>();
        sitniList.add(new ItemModel(R.drawable.sitni1, getString(R.string.sitni1)));
        sitniList.add(new ItemModel(R.drawable.sitni2, getString(R.string.sitni2)));
        sitniList.add(new ItemModel(R.drawable.sitni3, getString(R.string.sitni3)));
        sitniList.add(new ItemModel(R.drawable.sitni4, getString(R.string.sitni4)));
        sitniList.add(new ItemModel(R.drawable.sitni5, getString(R.string.sitni5)));
        sitniList.add(new ItemModel(R.drawable.sitni6, getString(R.string.sitni6)));
        sitniList.add(new ItemModel(R.drawable.sitni7, getString(R.string.sitni7)));
        sitniList.add(new ItemModel(R.drawable.sitni8, getString(R.string.sitni8)));
        sitniList.add(new ItemModel(R.drawable.sitni9, getString(R.string.sitni9)));
        sitniList.add(new ItemModel(R.drawable.sitni10, getString(R.string.sitni10)));
        sitniList.add(new ItemModel(R.drawable.sitni11, getString(R.string.sitni11)));
        sitniList.add(new ItemModel(R.drawable.sitni12, getString(R.string.sitni12)));
        sitniList.add(new ItemModel(R.drawable.sitni13, getString(R.string.sitni13)));
        sitniList.add(new ItemModel(R.drawable.sitni14, getString(R.string.sitni14)));
        sitniList.add(new ItemModel(R.drawable.sitni15, getString(R.string.sitni15)));
        sitniList.add(new ItemModel(R.drawable.sitni16, getString(R.string.sitni16)));
        sitniList.add(new ItemModel(R.drawable.sitni17, getString(R.string.sitni17)));
        sitniList.add(new ItemModel(R.drawable.sitni18, getString(R.string.sitni18)));
        sitniList.add(new ItemModel(R.drawable.sitni19, getString(R.string.sitni19)));
        sitniList.add(new ItemModel(R.drawable.sitni20, getString(R.string.sitni20)));
        sitniList.add(new ItemModel(R.drawable.sitni21, getString(R.string.sitni21)));
        sitniList.add(new ItemModel(R.drawable.sitni22, getString(R.string.sitni22)));
        sitniList.add(new ItemModel(R.drawable.sitni23, getString(R.string.sitni23)));
        sitniList.add(new ItemModel(R.drawable.sitni24, getString(R.string.sitni24)));
        sitniList.add(new ItemModel(R.drawable.sitni25, getString(R.string.sitni25)));

        detailList = new ArrayList<>();
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni1_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni1_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni2_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni2_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni3_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni3_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni4_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni4_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni5_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni5_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni6_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni6_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni7_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni7_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni8_desc2) ,
                getString(R.string.priprema), getString(R.string.sitni8_desc1), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni9_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni9_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.tijesto) + "\n" +
                getString(R.string.sitni10_desc1) + "\n" + getString(R.string.fila) + "\n" +
                getString(R.string.sitni10_desc2) + "\n" + getString(R.string.preljev) + "\n" +
                getString(R.string.sitni10_desc3) , getString(R.string.priprema), getString(R.string.sitni10_desc4), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni11_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni11_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni12_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni12_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni13_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni13_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni14_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni14_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni15_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni15_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.tijesto), getString(R.string.sitni16_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni16_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni17_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni17_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni18_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni18_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni19_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni19_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.tijesto) + "\n" +
                getString(R.string.sitni20_desc1) + "\n" + getString(R.string.secerni_sirup) + "\n" +
                getString(R.string.sitni20_desc2) , getString(R.string.priprema), getString(R.string.sitni20_desc3), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni21_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni21_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni22_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni22_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni23_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni23_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni24_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni24_desc2), R.drawable.background_tockice_roze));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.sitni25_desc1) ,
                getString(R.string.priprema), getString(R.string.sitni25_desc2), R.drawable.background_tockice_roze));




        tvTitle = sitniFrag.findViewById(R.id.tvTitleSitni);
        toolbar = sitniFrag.findViewById(R.id.action_bar_sitni);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        recyclerView = sitniFrag.findViewById(R.id.rvSitni);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ItemAdapter(sitniList, this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        final Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);

        back = sitniFrag.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return sitniFrag;
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
