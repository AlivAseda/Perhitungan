package com.example.perhitungan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KeduaFragment extends Fragment {
    private EditText txt_alas, txt_tinggi, txt_sisi;
    private Button btnHasil;
    private TextView hasil_luas, hasil_keliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kedua, container, false);
        txt_alas = v.findViewById(R.id.txt_alas);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        txt_sisi = v.findViewById(R.id.txt_sisi);
        btnHasil = v.findViewById(R.id.btnHasil);
        hasil_luas = v.findViewById(R.id.hasil_luas);
        hasil_keliling = v.findViewById(R.id.hasil_keliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();
                String nilai3 = txt_sisi.getText().toString();

                if (nilai1.isEmpty()){
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                } else if (nilai2.isEmpty()){
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                } else if (nilai3.isEmpty()){
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                } else {
                    Double alas= Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);
                    Integer panjang = Integer.parseInt(nilai3);

                    Double luas = 0.5 * alas * tinggi;
                    Integer sisi = 3 * panjang;
                    hasil_luas.setText(String.format("%.2f", luas));
                    hasil_keliling.setText((String.valueOf(sisi)));
                }
            }
        });

        return v;
    }
}