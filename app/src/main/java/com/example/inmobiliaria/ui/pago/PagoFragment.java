package com.example.inmobiliaria.ui.pago;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.inmobiliaria.R;
import com.example.inmobiliaria.data.pago.PagoData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PagoFragment extends Fragment {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pago, container, false);
        expandableListView = (ExpandableListView) root.findViewById(R.id.listViewPago);
        expandableListDetail = PagoData.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new PagoAdapter(getContext(), expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        return root;
    }
}