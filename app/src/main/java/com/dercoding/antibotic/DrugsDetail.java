package com.dercoding.antibotic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DrugsDetail extends AppCompatActivity {

    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    //tambahan indikasi
    public static final String EXTRA_INDIKASI = "extra_indikasi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drugs_detail);

        TextView tvName = findViewById(R.id.tv_item_name);
        ImageView imgDetail = findViewById(R.id.img_item_drugs);
        TextView tvDetail = findViewById(R.id.tv_item_detail);
        //disini juga TextView Indikasi yang di xml belum terdaftar/terpanggil
        //disini di panggil dulu
        TextView tvIndikasi = findViewById(R.id.tv_indikasi); //cuma inidikasinya tvIndikasinya masih abu, karna belum di hubungkan dengan EXTRA_INDIKASI

        String name = getIntent().getStringExtra(EXTRA_NAME);
        Integer image = getIntent().getIntExtra(EXTRA_IMAGE,0);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        //EXTRA_INDIKASI
        String indikasi = getIntent().getStringExtra(EXTRA_INDIKASI); //  perintah ini untuk ngambil data dari inten mainactivity >> disini juga indikasi masih abu karna belum ada yang manggil

        Glide.with(this).load(image).into(imgDetail);
        tvName.setText(name);
        tvDetail.setText(detail);
        // disini tvIndikasi akan dikasih nilai yang diambil dari nilai yang ada di indikasi
        tvIndikasi.setText(indikasi); //nilai tvIndikasi di set text nya dengan nilai text yang ada pada indikasi

        if (getSupportActionBar()   !=null){
            getSupportActionBar().setTitle("Drugs Detail");
        }
    }
}
