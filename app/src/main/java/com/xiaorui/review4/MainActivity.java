package com.xiaorui.review4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView mainlist;

    private String[] activities = new String[]{

            "XML解析"
    };

    private ArrayAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,activities);
        mainlist = (ListView) findViewById(R.id.mainlist);

        mainlist.setAdapter(adapter);
        mainlist.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0:
                startActivity(new Intent(MainActivity.this,ActivityforXML.class));
            break;

            default:
                break;

        }




    }
}
