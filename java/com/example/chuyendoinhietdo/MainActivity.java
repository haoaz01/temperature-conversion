package com.example.chuyendoinhietdo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;
import java.text.Format;

public class MainActivity extends AppCompatActivity {
    //khai bao cac bien giao dien tai day
    EditText edtF, edtC;
    Button btnCF, btnFC, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //ánh xạ ID
        edtC = findViewById(R.id.edtC);
        edtF = findViewById(R.id.edtF);
        btnCF = findViewById(R.id.btnCF);
        btnFC = findViewById(R.id.btnFC);
        btnClear = findViewById(R.id.btnClear);
        //xử lý click
        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int C = Integer.parseInt(edtC.getText().toString());
                Double F = C * 1.8 + 32;
                edtF.setText(dcf.format(F) + "");
            }
        });
        btnFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dfc = new DecimalFormat("0.00");
                int F = Integer.parseInt(edtF.getText().toString());
                Double C = (F - 32) / 1.8;
                edtC.setText(dfc.format(C) + "");
            }

        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtC.setText("");
                edtF.setText("");
            }
        });
    }

}