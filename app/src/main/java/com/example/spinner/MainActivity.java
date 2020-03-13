package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] bankNames = {"GTB","UBA","STANBIC","UNION"};
    List<String> sts = new ArrayList<String>();
    List<String> lga = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        Spinner spin2 = (Spinner)findViewById(R.id.spinner2);
        spin2.setOnItemSelectedListener(this);

//        List<String> sts = new ArrayList<String>();
        sts.add("Lagos");
        sts.add("Abuja");
        sts.add("Akwa ibom");
        sts.add("Enugu");
        sts.add("Kaduna");
        sts.add("Rivers");
        sts.add("Imo");

//        List<String> lga = new ArrayList<String>();
        lga.add("Uyo");
        lga.add("Abak");
        lga.add("Nsit Ibom");
        lga.add("Nsit Ubium");
        lga.add("Ikot Ekpene");


//
//      ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bankNames);
//aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//spin.setAdapter(aa);

        ArrayAdapter stsap = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sts);
        stsap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(stsap);


        ArrayAdapter lgap = new ArrayAdapter(this,android.R.layout.simple_spinner_item,lga);
        lgap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(lgap);




    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId()==R.id.spinner)
        {
            Toast.makeText(getApplicationContext(),sts.get(position),Toast.LENGTH_LONG).show();
        }
        else if(parent.getId()==R.id.spinner2)
        {
//    Toast.makeText(getApplicationContext(),lga[position],Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(),lga.get(position),Toast.LENGTH_LONG).show();
        }



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
    }
}
