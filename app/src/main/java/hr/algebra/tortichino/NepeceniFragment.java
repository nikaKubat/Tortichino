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
public class NepeceniFragment extends Fragment implements ItemAdapter.OnItemListener {

    private static final String TAG = "NepeceniFragment";
    private Toolbar toolbar;
    private ImageView back;
    private TextView tvTitle;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ItemDetails> detailList;


    public NepeceniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View nepeceni = inflater.inflate(R.layout.fragment_nepeceni, container, false);

        ArrayList<ItemModel> nepeceniList = new ArrayList<>();
        nepeceniList.add(new ItemModel(R.drawable.nepeceni1, getString(R.string.nepeceni1)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni2, getString(R.string.nepeceni2)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni3, getString(R.string.nepeceni3)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni4, getString(R.string.nepeceni4)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni5, getString(R.string.nepeceni5)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni6, getString(R.string.nepeceni6)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni7, getString(R.string.nepeceni7)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni8, getString(R.string.nepeceni8)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni9, getString(R.string.nepeceni9)));
        nepeceniList.add(new ItemModel(R.drawable.nepeceni10, getString(R.string.nepeceni10)));

        detailList = new ArrayList<>();
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep1_desc1) ,
                getString(R.string.priprema), getString(R.string.nep1_desc2), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep2_desc1) ,
                getString(R.string.priprema), getString(R.string.nep2_desc2), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep3_desc1) ,
                getString(R.string.priprema), getString(R.string.nep3_desc2), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.bijela_smjesa) + "\n" +
                getString(R.string.nep4_desc1) + "\n" + getString(R.string.smeda_smjesa) + "\n" +
                getString(R.string.nep4_desc2) + "\n" + getString(R.string.punjenje) + "\n" +
                getString(R.string.nep4_desc3) + "\n" + getString(R.string.dodatno) + "\n" +
                getString(R.string.nep4_desc4), getString(R.string.priprema), getString(R.string.bijela_smjesa) + "\n" +
                getString(R.string.nep4_desc5) + "\n" + getString(R.string.smeda_smjesa) + "\n" +
                getString(R.string.nep4_desc6) + "\n" + getString(R.string.punjenje) + "\n" +
                getString(R.string.nep4_desc7) + "\n" + getString(R.string.priprema) + "\n" +
                getString(R.string.nep4_desc8), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep5_desc1) ,
                getString(R.string.priprema), getString(R.string.nep5_desc2), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep6_desc1) ,
                getString(R.string.priprema), getString(R.string.nep6_desc2), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep7_desc1) ,
                getString(R.string.priprema), getString(R.string.nep7_desc2), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep8_desc1) + "\n" +
                getString(R.string.ukrasavanje) + "\n" + getString(R.string.nep8_desc2)
                ,getString(R.string.priprema), getString(R.string.nep8_desc3), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.krema) + "\n" +
                getString(R.string.nep9_desc1) + "\n" + getString(R.string.glazura) + "\n" +
                getString(R.string.nep9_desc2),
                getString(R.string.priprema), getString(R.string.nep9_desc3), R.drawable.background_tockice_zelene));
        detailList.add(new ItemDetails(getString(R.string.sastojci), getString(R.string.nep10_desc1) ,
                getString(R.string.priprema), getString(R.string.nep10_desc2), R.drawable.background_tockice_zelene));

        toolbar = nepeceni.findViewById(R.id.actionbar_nepeceni);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        tvTitle = nepeceni.findViewById(R.id.tvTitleNepec);

        recyclerView = nepeceni.findViewById(R.id.rvNepeceni);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ItemAdapter(nepeceniList, this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvTitle.setTypeface(title);

        back = nepeceni.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HomeFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return nepeceni;
    }

    @Override
    public void onItemClick(int adapterPosition, String title, int image) {
        Log.d(TAG, "onItemClick: clicked");

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
