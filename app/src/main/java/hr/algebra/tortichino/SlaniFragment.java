package hr.algebra.tortichino;


import android.content.ClipData;
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
public class SlaniFragment extends Fragment implements ItemAdapter.OnItemListener {

    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageView back;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ItemDetails> detailList;


    public SlaniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View slaniFrag = inflater.inflate(R.layout.fragment_slani, container, false);

        ArrayList<ItemModel> slaniList = new ArrayList<>();
        slaniList.add(new ItemModel(R.drawable.slani1, getString(R.string.slani1)));
        slaniList.add(new ItemModel(R.drawable.slani2, getString(R.string.slani2)));
        slaniList.add(new ItemModel(R.drawable.slani3, getString(R.string.slani3)));
        slaniList.add(new ItemModel(R.drawable.slani4, getString(R.string.slani4)));
        slaniList.add(new ItemModel(R.drawable.slani5, getString(R.string.slani5)));
        slaniList.add(new ItemModel(R.drawable.slani6, getString(R.string.slani6)));
        slaniList.add(new ItemModel(R.drawable.slani7, getString(R.string.slani7)));

        detailList = new ArrayList<>();
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.slani1_desc1) ,
                getString(R.string.priprema), getString(R.string.slani1_desc2), R.drawable.background_tockice_plave));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.slani2_desc1) + "\n" +
                getString(R.string.za_premazivanje) + "\n" + getString(R.string.slani2_desc2) ,
                getString(R.string.priprema), getString(R.string.slani2_desc3), R.drawable.background_tockice_plave));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nadjev) + "\n" +
                getString(R.string.slani3_desc1) + "\n" + getString(R.string.tijesto) + "\n" +
                getString(R.string.slani3_desc2), getString(R.string.priprema), getString(R.string.slani3_desc3),
                R.drawable.background_tockice_plave));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.slani4_desc1) ,
                getString(R.string.priprema), getString(R.string.slani4_desc2), R.drawable.background_tockice_plave));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.slani5_desc1) ,
                getString(R.string.priprema), getString(R.string.slani5_desc2), R.drawable.background_tockice_plave));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.slani6_desc1) ,
                getString(R.string.priprema), getString(R.string.slani6_desc2), R.drawable.background_tockice_plave));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.slani7_desc1) ,
                getString(R.string.priprema), getString(R.string.slani7_desc2), R.drawable.background_tockice_plave));


        tvTitle = slaniFrag.findViewById(R.id.tvTitleSlani);
        toolbar = slaniFrag.findViewById(R.id.action_bar_slani);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        back  = slaniFrag.findViewById(R.id.back);

        recyclerView = slaniFrag.findViewById(R.id.rvSlani);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ItemAdapter(slaniList, this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return slaniFrag;
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
