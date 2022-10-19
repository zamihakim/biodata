package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edtPanjang, edtLebar;
    TextView txtNilai1, txtNilai2, txtLuas, txtKeliling;
    Button btnPersegi, btnSegitiga, btnLingkaran;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtNilai1 = findViewById(R.id.txtNilai1);
        txtNilai2 = findViewById(R.id.txtNilai2);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);
        btnPersegi = findViewById(R.id.btnPersegi);
    }

    public void htgPersegi(View v) {
        String nilai1 = edtPanjang.getText().toString();
        String nilai2 = edtLebar.getText().toString();

        if(nilai1.isEmpty()){
            edtPanjang.setError("Data tidak boleh kosong");
            edtPanjang.requestFocus();
        }else if(nilai2.isEmpty()){
            edtLebar.setError("Data tidak boleh kosong");
            edtLebar.requestFocus();
        }else{
            Double panjang = Double.parseDouble(nilai1);
            Double lebar = Double.parseDouble(nilai2);

            Double luas = panjang * lebar;
            Double keliling = (2*panjang) + (2*lebar);

            txtNilai1.setText("Panjang : " +nilai1);
            txtNilai2.setText("Lebar : " +nilai2);
            txtLuas.setText("Luas = " +String.valueOf(luas));
            txtKeliling.setText("Keliling = " +String.valueOf(keliling));
        }
    }
    public void htgSegitiga(View v) {
        String nilai1 = edtPanjang.getText().toString();
        String nilai2 = edtLebar.getText().toString();

        if(nilai1.isEmpty()){
            edtPanjang.setError("Data tidak boleh kosong");
            edtPanjang.requestFocus();
        }else if(nilai2.isEmpty()){
            edtLebar.setError("Data tidak boleh kosong");
            edtLebar.requestFocus();
        }else{
            Double alas = Double.parseDouble(nilai1);
            Double tinggi = Double.parseDouble(nilai2);
            Double sisi = Math.sqrt(((alas*alas)+(tinggi*tinggi)));


            Double luas = 0.5 * alas * tinggi;
            Double keliling = 3 * sisi;

            txtNilai1.setText("Alas : " +nilai1);
            txtNilai2.setText("Tinggi : " +nilai2);
            txtLuas.setText("Luas = " +String.valueOf(luas));
            txtKeliling.setText("Keliling = " +String.valueOf(keliling));
        }
    }
    public void htgLingkaran(View v) {
        String nilai1 = edtPanjang.getText().toString();

        if(nilai1.isEmpty()){
            edtPanjang.setError("Data tidak boleh kosong");
            edtPanjang.requestFocus();
        }else{
            Double diameter = Double.parseDouble(nilai1);

            Double luas = Math.PI * Math.pow(diameter/2, 2);
            Double keliling = 2 * Math.PI * (diameter/2);

            txtNilai1.setText("Diameter : " +nilai1);
            txtLuas.setText("Luas = " +String.valueOf(luas));
            txtKeliling.setText("Keliling = " +String.valueOf(keliling));
        }
    }
}