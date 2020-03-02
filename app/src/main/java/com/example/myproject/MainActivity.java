package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView hasil;
    EditText angka1, angka2;
    Button clickBtn, moveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        hasil = findViewById(R.id.hasil);
        clickBtn = findViewById(R.id.btnClick);
        moveBtn = findViewById(R.id.btnMove);

        clickBtn.setOnClickListener(this);
        moveBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()){
            case R.id.btnClick:
                int res = Integer.parseInt(angka1.getText().toString()) + Integer.parseInt(angka2.getText().toString());
                hasil.setText(res+"");
                break;
            case R.id.btnMove:
                Intent namanya = new Intent(MainActivity.this, Main2Activity.class);
                namanya.putExtra("result", hasil.getText().toString());
                startActivity(namanya);
                break;
        }
    }
}
