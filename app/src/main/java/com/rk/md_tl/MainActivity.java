package com.rk.md_tl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);

        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.addTab(tabLayout.newTab().setText("Bujur Sangkar"));
        tabLayout.addTab(tabLayout.newTab().setText("Persegi Panjang"));
        tabLayout.addTab(tabLayout.newTab().setText("Segitiga"));
        tabLayout.addTab(tabLayout.newTab().setText("Trapesium"));
        tabLayout.addTab(tabLayout.newTab().setText("Belah Ketupat"));
        tabLayout.addTab(tabLayout.newTab().setText("Jajar Genjang"));
        tabLayout.addTab(tabLayout.newTab().setText("Bujur Lingkaran"));
        tabLayout.addTab(tabLayout.newTab().setText("Elips"));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getPosition();
                tab.getText();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                /* Biarkan Kosong seperti hatimu */
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                /* Sama. Kosongkan juga. */
            }
        });

    }
}
