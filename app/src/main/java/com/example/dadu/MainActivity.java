package com.example.dadu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button bt_acak;
    private TextView txtAcak;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_acak = findViewById(R.id.btAcak);
        txtAcak=findViewById(R.id.txt_angka);
        img = findViewById(R.id.imgAngka);
        bt_acak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lemparDadu();
                gantiImage();
                toast();
            }
        });
    }

    private void lemparDadu() {
        Random acak = new Random();
        String angka = String.valueOf(1 + acak.nextInt(6));
      txtAcak.setText(angka);
        }
    private void toast() {

        if (txtAcak.getText().toString().equals("6") ){
            Toast.makeText(MainActivity.this, "sudah maximal",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "tombol ditekan",Toast.LENGTH_LONG).show();
        }
    }
    private void gantiImage() {
        Random acak = new Random();
        int[] gambar = new int[6];
        gambar[0] = R.drawable.dice_1;
        gambar[1] = R.drawable.dice_2;
        gambar[2] = R.drawable.dice_3;
        gambar[3] = R.drawable.dice_4;
        gambar[4] = R.drawable.dice_5;
        gambar[5] = R.drawable.dice_6;
        img.setImageResource(gambar[acak.nextInt(5)]);
    }
}
