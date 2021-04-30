package com.example.gopku;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class SuperMarket extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] list = new String[] {
                "Pasar Buah Pekanbaru",
                "Lucky Supermarket",
                "Toko Lotte Grosir",
                "Guardian"
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
        try{
            Intent a = null;
            if (pilihan.equals("Pasar Buah Pekanbaru")){
                a = new Intent(this, PasarBuahPekanbaru.class);
            }
            else if (pilihan.equals("Lucky Supermarket")){
              a = new Intent(this, LuckySupermarket.class);
            }
            else if (pilihan.equals("Toko Lotte Grosir")){
              a = new Intent(this, TokoLotteGrosir.class);
            }
            else {
              a = new Intent(this, Guardian.class);
            }
            startActivity(a);
        } catch (Exception e){

        }
    }

}
