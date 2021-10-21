package com.example.perhitungan;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KetigaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_jari_jari;
    private TextView hasil_luas, hasil_keliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_jari_jari = v.findViewById(R.id.txt_jari_jari);
        hasil_luas = v.findViewById(R.id.hasil_luas);
        hasil_keliling = v.findViewById(R.id.hasil_keliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                String nilai = txt_jari_jari.getText().toString();
                if (nilai.isEmpty()){
                    txt_jari_jari.setError("Data tidak boleh kosong");
                    txt_jari_jari.requestFocus();
                } else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14 * (jari * 2);
                    Double keliling = 3.14 * (jari*jari);
                    hasil_luas.setText(String.format("%.2f", luas));
                    hasil_keliling.setText(String.format("%.2f", keliling));
                }
            }
        });
        return v;
    }
}