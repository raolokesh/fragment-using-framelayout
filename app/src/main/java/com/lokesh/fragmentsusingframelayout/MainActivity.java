package com.lokesh.fragmentsusingframelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFrag1,btnFrag2,btnFrag3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrag3 = findViewById(R.id.btnFrag3);
        btnFrag2 = findViewById(R.id.btnFrag2);
        btnFrag1 = findViewById(R.id.btnFrag1);

        loadFrag(new Second_Fragment(),0);


        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loadFrag(new First_Fragment(),1);

            }
        });
        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFrag(new Second_Fragment(),1);
            }
        });
        btnFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment third_fragment = new Third_Fragment();
                loadFrag(third_fragment,1);

            }
        });
    }

//    private void loadFrag(Fragment fragment) {
//        FragmentManager fm =getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.add(R.id.container,fragment);
//        ft.commit();
//    }

    public void loadFrag(Fragment fragment,int flag){
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag == 0){
        ft.add(R.id.container,fragment);}
        else {
        ft.replace(R.id.container,fragment);}
        ft.commit();
    }

}