package com.example.gopku;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class RS extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] list = new String[]{
                "RS Awal Bros",
                "RS Eka Hospital",
                "RS Ibnu Sina",
                "RS Aulia Hospital",
                "RS Awal Bros Panam",
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object obj = this.getListAdapter().getItem(position);
        String pilihan = obj.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("RS Awal Bros")) {
                a = new Intent(this, RSAwalBros.class);
            } else if (pilihan.equals("RS Eka Hospital")) {
                a = new Intent(this, RSEkaHospital.class);
            } else if (pilihan.equals("RS Ibnu Sina")) {
                a = new Intent(this, RSIbnuSina.class);
            } else if (pilihan.equals("RS Aulia Hospital")) {
                a = new Intent(this, RSAuliaHospital.class);
            } else {
                a = new Intent(this, RSAwalBrosPanam.class);
            }
            startActivity(a);
        } catch (Exception e) {

        }
    }
}
