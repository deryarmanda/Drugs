package com.dercoding.antibotic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDrugs;
    private ArrayList<Drugs> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDrugs = findViewById(R.id.rv_drugs);
        rvDrugs.setHasFixedSize(true);

        list.addAll(DrugsData.getListData());
        showRecyclerList();

        //metode nama judul titlebar
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle("Drugs");
        }
    }

    //menampilkan list
    private void showRecyclerList() {
        rvDrugs.setLayoutManager(new LinearLayoutManager(this));
        ListDrugsAdapter listDrugsAdapter = new ListDrugsAdapter(list);
        rvDrugs.setAdapter(listDrugsAdapter);

        //fungsi click callback 3rd
        listDrugsAdapter.setOnClickCallBack((new ListDrugsAdapter.OnClickCallBack() {
            @Override
            public void onItemClicked(Drugs data) {
                //menampilkan data yang di click
                showSelectedDrugs(data);
            }
        }));
    }

    //menampilkan data pada drugdetail
    private void showSelectedDrugs(Drugs drugs) {
        Intent moveActivity = new Intent(MainActivity.this, DrugsDetail.class);

        //disini melakukan pindah activity dengan menambah data (moveActivity.putExtra(data yang dikirim, mengambil data) )

        moveActivity.putExtra(DrugsDetail.EXTRA_NAME,drugs.getName());
        moveActivity.putExtra(DrugsDetail.EXTRA_IMAGE,drugs.getPhoto());
        moveActivity.putExtra(DrugsDetail.EXTRA_DETAIL,drugs.getDetail());
        //tambahan indikasi
        //nilai indikasi yang ada di drudgs di ambil disini ( drugs.getIndikasi() ) dan dikirimkan ke EXTRA_INDIKASI yang ada di DrugsDetail ( DrugsDetail.EXTRA_INDIKASI )
        moveActivity.putExtra(DrugsDetail.EXTRA_INDIKASI,drugs.getIndikasi()); // perintah ini adalah mengambil nilai text yang
        startActivity(moveActivity);
    }

    //MENU

    public boolean onCreateOptionsMenu(Menu menu) {
        //menampilkan menu yang sudah di buat di menu_main.xml
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    // isi di dalam menu
    public void setMode(int itemId) {
        switch (itemId) {
            case R.id.action_about:
                showAbout();
                break;
            case R.id.action_exit:
                exit();
                break;
        }
    }

    //menampilkan about
    private void showAbout() {

        Intent aboutActivity = new Intent(MainActivity.this, about.class);
        aboutActivity.putExtra(about.EXTRA_IMAGE, R.drawable.profile);
        aboutActivity.putExtra(about.EXTRA_NAMEABOUT, "DERY ARMANDA");
        aboutActivity.putExtra(about.EXTRA_EMAIL, "ryuhideyuki.net@gmail.com");
        startActivity(aboutActivity);

    }

    private void exit() { finish(); }

}
