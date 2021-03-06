package com.example.adisuarpala.balifoodiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.HashMap;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

public class IdLokasiActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_lokasi);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Tipat Blayag");
        listDataHeader.add("Loloh CemCem");
        listDataHeader.add("Cincau Hijau");

        List<String> blayag = new ArrayList<>();
        blayag.add("Alamat: Jalan Surapati No.124, Kampung Baru, Kp. Baru, Kec. Buleleng, Kabupaten Buleleng, Bali 81151");
        blayag.add("Buka: Setiap Hari • 09.00–22.00");
        blayag.add("Tlp: +62878-6321-1777");



        List<String> cemcem = new ArrayList<>();
        cemcem.add("Alamat: Desa Penglipuran");
        cemcem.add("Buka: ");
        cemcem.add("Tlp: 082236082787");

        List<String> cincau = new ArrayList<>();
        cincau.add("Alamat: Warung Bu Kadek. Jalan Bisma No.8 (Lewat Jalan Kartini), Denpasar – Bali");
        cincau.add("Buka: ");
        cincau.add("Tlp: 0361 - 262373");



        listHash.put(listDataHeader.get(0),blayag);
        listHash.put(listDataHeader.get(1),cemcem);
        listHash.put(listDataHeader.get(2),cincau);
    }


}
