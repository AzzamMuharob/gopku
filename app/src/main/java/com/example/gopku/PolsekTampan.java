package com.example.gopku;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class PolsekTampan extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] list = new String[] {
                "Call Center",
                "SMS Center",
                "Driving Direction",
                "Website",
                "Info Google",
                "Exit",
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
            if (pilihan.equals("Call Center")){
                String notel = "tel:076164110";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(notel));
            }
            else if (pilihan.equals("SMS Center")){
                String smstext = "Halo, saya azzam";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:076164110"));
                a.putExtra("sms_body",smstext);
            }
            else if (pilihan.equals("Driving Direction")){
                String lokasi = "google.navigation:q=0.4651175,101.3879368";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));
            }
            else if (pilihan.equals("Website")){
                String website = "https://www.goriau.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            }
            else if (pilihan.equals("Info Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Polsek Tampan");
            }
            startActivity(a);
        } catch (Exception e){

        }
    }
}
