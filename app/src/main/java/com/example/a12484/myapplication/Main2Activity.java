package com.example.a12484.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private List<Text> textList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        final TextAdapter adapter = new TextAdapter(textList);
        recyclerView.setAdapter(adapter);
        Button button = (Button) findViewById(R.id.button2);
        final EditText edit = (EditText) findViewById(R.id.edit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = edit.getText().toString();
                textList.add(0,new Text(string));
                adapter.notifyItemInserted(0);
                recyclerView.getLayoutManager().scrollToPosition(0);
            }
        });
    }
}
