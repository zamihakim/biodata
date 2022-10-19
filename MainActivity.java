package com.example.biodata;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callphone(View View) {
        Uri Uri = android.net.Uri.parse("tel:085156441283");
        Intent it = new Intent(Intent.ACTION_VIEW, Uri);
        startActivity(it);
    }

    public void showMaps(View View) {
        Uri Uri = android.net.Uri.parse("geo:-6.8391644,109.0723023,18.56z");
        Intent it = new Intent(Intent.ACTION_VIEW, Uri);
        startActivity(it);
    }

    public void openEmail(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "zamihakim0@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Aplikasi Biodata email");
        startActivity(intent);
    }

}