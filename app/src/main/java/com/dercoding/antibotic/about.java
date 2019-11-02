package com.dercoding.antibotic;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class about extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_NAMEABOUT = "extra_nameabout";
    public static final String EXTRA_EMAIL = "extra_email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);

        TextView tvNameAbout = findViewById(R.id.tv_about_name);
        TextView tvEmail = findViewById(R.id.tv_about_email);
        ImageView profile = (ImageView) findViewById(R.id.photo_profile);

        //variable image tetap string tapi saat memanggil harus integer dengan value 0(string)
        Integer image = getIntent().getIntExtra(EXTRA_IMAGE,0);
        String name = getIntent().getStringExtra(EXTRA_NAMEABOUT);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);

        Glide.with(this).load(image).into(profile);
        tvNameAbout.setText(name);
        tvEmail.setText(email);

        if (getSupportActionBar() !=null)   {
            getSupportActionBar().setTitle("About");
        }
    }
}
