package com.example.gopku;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class School extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] list = new String[] {
                "MAN 1 Pekanbaru",
                "SMKN 1 Pekanbaru",
                "SMAN 4 Pekanbaru",
                "SMAN 5 Pekanbaru",
                "SMA Handayani",
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
            if (pilihan.equals("MAN 1 Pekanbaru")){
                a = new Intent(this, MAN1Pekanbaru.class);
            }
            else if (pilihan.equals("SMKN 1 Pekanbaru")){
              a = new Intent(this,SMKN1Pekanbaru.class);
            }
            else if (pilihan.equals("SMAN 4 Pekanbaru")){
              a = new Intent(this, SMAN4Pekanbaru.class);
            }
            else if (pilihan.equals("SMAN 5 Pekanbaru")){
              a = new Intent(this, SMAN5Pekanbaru.class);
            }
            else {
              a = new Intent(this, SMAHandayani.class);
            }
            startActivity(a);
        } catch (Exception e){

        }
    }

}
