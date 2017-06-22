package com.example.sunrin.todo;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView list;
    LinearLayout noTodoContainer;
    FloatingActionButton fab;
    FrameLayout contian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.main_toobar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setTitle(getString(R.string.app_name));
        }

        contian = (FrameLayout) findViewById(R.id.container);
        noTodoContainer = (LinearLayout) findViewById(R.id.no_do_continer);
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click FAB", Toast.LENGTH_SHORT).show();
            }
        });

        list = (ListView) findViewById(R.id.main_list);
    }

}
