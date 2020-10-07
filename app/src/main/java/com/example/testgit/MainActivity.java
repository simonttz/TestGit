package com.example.testgit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.testgit.adapter.AdapterTea;
import com.example.testgit.model.Tea;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_tea);
        AdapterTea adapterTea = new AdapterTea(this, Tea.teaList(),R.layout.item_tea);

        LinearLayoutManager ln = new LinearLayoutManager(this);
        ln.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(ln);
        recyclerView.setAdapter(adapterTea);
    }


    public void hola(View view) {

    }
}