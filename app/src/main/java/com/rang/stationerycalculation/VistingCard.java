package com.rang.stationerycalculation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class VistingCard extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] users = { "300 GSM", "100 GSM", "170 GSM", "250 GSM", "330 GSM" };
    private Toolbar toolbar;
    public Button btnTotal;
    private LinearLayout llTotal;
    private int Total;
    public TextView tvPrice1,tvTotal,tvPrice2,tvPrice3,tvPrice4,tvPrice5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detail);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("VistingCard");
        setSupportActionBar(toolbar);
        tvPrice1=findViewById(R.id.tvPrice1);
        tvPrice2=findViewById(R.id.tvPrice2);
        tvPrice3=findViewById(R.id.tvPrice3);
        tvPrice4=findViewById(R.id.tvPrice4);
        tvPrice5=findViewById(R.id.tvPrice5);
        tvTotal=findViewById(R.id.tvTotal);
        btnTotal=findViewById(R.id.btnTotal);
        llTotal=findViewById(R.id.llTotal);

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llTotal.setVisibility(View.VISIBLE);
                Total= Integer.parseInt(tvPrice1.getText().toString());
                tvTotal.setText(Total);

            }
        });

        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);

        setUpToolbar();
    }
    private void setUpToolbar() {

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(getApplicationContext(), "Selected User: "+users[i] ,Toast.LENGTH_SHORT).show();
        String selectedItem = adapterView.getItemAtPosition(i).toString();
        if (selectedItem.equals("300 GSM")) {
            tvPrice1.setVisibility(View.VISIBLE);
            tvPrice1.setText("300");
        }else if (selectedItem.equals("100 GSM")) {
            tvPrice1.setVisibility(View.VISIBLE);
            tvPrice1.setText("100");
        }else if (selectedItem.equals("170 GSM")) {
            tvPrice1.setVisibility(View.VISIBLE);
            tvPrice1.setText("170");
        }else if (selectedItem.equals("250 GSM")) {
            tvPrice1.setVisibility(View.VISIBLE);
            tvPrice1.setText("250");
        }else if (selectedItem.equals("330 GSM")) {
            tvPrice1.setVisibility(View.VISIBLE);
            tvPrice1.setText("170");
        }else tvPrice1.setText("0");

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
