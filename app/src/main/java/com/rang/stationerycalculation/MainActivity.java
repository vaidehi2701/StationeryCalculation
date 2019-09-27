package com.rang.stationerycalculation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rang.stationerycalculation.Adapter.CategoryAdapter;
import com.rang.stationerycalculation.Model.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCartItem;
    private CategoryAdapter categoryAdapter;
    private List<CategoryModel> categoryModels = new ArrayList<>();
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCartItem = findViewById(R.id.rvCartItem);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Stationary Calculation");
        setSupportActionBar(toolbar);


//        categoryAdapter = new CategoryAdapter(categoryModels, getApplicationContext());
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false);
//        rvCartItem.setLayoutManager(linearLayoutManager);
//        rvCartItem.setAdapter(categoryAdapter);


        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        rvCartItem.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryModels);
        rvCartItem.setAdapter(categoryAdapter);

       AddCategory();

    }
//

    private void AddCategory() {

        CategoryModel cat1 = new CategoryModel( "LetterHead",R.drawable.letter);
        CategoryModel cat2 = new CategoryModel("Visiting Card",R.drawable.visiting);
        CategoryModel cat3 = new CategoryModel("Envelopes",R.drawable.envelope);
        CategoryModel cat4 = new CategoryModel("Brouchers",R.drawable.broucher);
        CategoryModel cat5 = new CategoryModel( "Flyers",R.drawable.flyers);
        CategoryModel cat6 = new CategoryModel("Menu Desgin",R.drawable.menu);
        CategoryModel cat7 = new CategoryModel("Posters",R.drawable.poster);
        CategoryModel cat8 = new CategoryModel("Banners",R.drawable.banner);

        categoryModels.add(cat1);
        categoryModels.add(cat2);
        categoryModels.add(cat3);
        categoryModels.add(cat4);
        categoryModels.add(cat5);
        categoryModels.add(cat6);
        categoryModels.add(cat7);
        categoryModels.add(cat8);

    }
}
