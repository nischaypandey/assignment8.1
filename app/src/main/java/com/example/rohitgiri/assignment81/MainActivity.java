package com.example.rohitgiri.assignment81;
//importing packages
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//creating class which is extending AppCpat Activity and implementing On Click Listener
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ListView listView;                 //making object of list view
    private ArrayList<String> arrayList;   // making object of array list
    private Button ascButton;             // making objects of Button
    private Button dscButton;

     //on Create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.l1);  //setting listView with its ID
        arrayList=new ArrayList<>();
        ascButton=(Button)findViewById(R.id.b1);   //setting Button with its ID
        dscButton=(Button)findViewById(R.id.b2);   //setting Button with its ID
        ascButton.setOnClickListener(this);          //setting click Listner
        dscButton.setOnClickListener(this);
        addData();                                  //method to add data to array list

        //using array Adapter and making Connection between array list and list view
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);     //setting adapter for list view

    }

    private void addData()               //assigning value to arraylist
    {
        arrayList.add(0,"Jan");
        arrayList.add(1,"Feb");
        arrayList.add(2,"March");
        arrayList.add(3,"April");
        arrayList.add(4,"May");
        arrayList.add(5,"June");
        arrayList.add(6,"July");
        arrayList.add(7,"Aug");
        arrayList.add(8,"Sep");
        arrayList.add(9,"Oct");
        arrayList.add(10,"Nov");
        arrayList.add(11,"Dec");


    }



    @Override                                        //method onClick
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1 : Collections.sort(arrayList);        //sorting data on clicking
                           break;
            case R.id.b2: Collections.sort(arrayList);
                          Collections.reverse(arrayList);        //sorting in descending order
                          break;

        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);                   //Setting adapter
    }


}
