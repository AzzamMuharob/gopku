package com.example.gopku;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class PoliceStation extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] list = new String[] {
                "Polresta Pekanbaru",
                "Polsek Sukajadi",
                "Polsek Tampan",
                "Polsek Bukit Raya",
                "Polsek Tenayan Raya",
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
            if (pilihan.equals("Polresta Pekanbaru")){
                a = new Intent(this, PolrestaPekanbaru.class);
            }
            else if (pilihan.equals("Polsek Sukajadi")){
              a = new Intent(this, PolsekSukajadi.class);
            }
            else if (pilihan.equals("Polsek Tampan")){
              a = new Intent(this, PolsekTampan.class);
            }
            else if (pilihan.equals("Polsek Bukit Raya")){
              a = new Intent(this, PolsekBukitRaya.class);
            }
            else {
              a = new Intent(this, PolsekTenayanRaya.class);
            }
            startActivity(a);
        } catch (Exception e){

        }
    }

}
