package com.example.inmobiliaria.ui.contarto;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.inmobiliaria.R;
import com.example.inmobiliaria.data.contrato.ContratoData;
import com.example.inmobiliaria.ui.pago.PagoAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContratoFragment extends Fragment {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_contrato, container, false);
        expandableListView = (ExpandableListView) root.findViewById(R.id.listViewContrato);
        expandableListDetail = ContratoData.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new PagoAdapter(getContext(), expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        return root;
    }
}