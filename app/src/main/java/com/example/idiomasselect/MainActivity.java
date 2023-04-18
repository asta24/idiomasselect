package com.example.idiomasselect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private Spinner sp1;
     String lugares [] = {"Francia", "España", "Portugal", "Rusia", "Albania", "Bielorrusia", "Bulgaria", "Croacia", "República Checa", "Dinamarca"};
     String idiomas [] = {"francés", "castellano", "portugués", "ruso", "albanes", "bielorruso y ruso", "búlgaro", "croata", "checo", "danés"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String lugares [] = {"Francia", "España", "Portugal", "Rusia", "Albania", "Bielorrusia", "Bulgaria", "Croacia", "República Checa", "Dinamarca"};
        String idiomas [] = {"francés", "castellano", "portugués", "ruso", "albanes", "bielorruso y ruso", "búlgaro", "croata", "checo", "danés"};

        setContentView(R.layout.activity_main);tv1 = (TextView) findViewById(R.id.tv1);
        sp1 = (Spinner) findViewById(R.id.sp1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_rcorp, lugares);
        sp1.setAdapter(adapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                tv1.setText("En " + sp1.getItemAtPosition(position) + " se habla " + idiomas[position] + " tontito ");

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });

    }
}