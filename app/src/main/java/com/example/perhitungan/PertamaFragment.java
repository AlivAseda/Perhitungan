package com.example.perhitungan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PertamaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_sisi;
    private TextView hasil_luas, hasil_keliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pertama, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        txt_sisi= v.findViewById(R.id. txt_panjang);
        hasil_luas = v.findViewById(R.id.hasil_luas);
        hasil_keliling = v.findViewById(R.id.hasil_keliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_sisi.getText().toString();

                if (nilai1.isEmpty()){
                    txt_sisi.setError("Data tidak boleh kosong");
                    txt_sisi.requestFocus();
                } else {
                    Integer sisi = Integer.parseInt(nilai1);

                    Integer luas = sisi * sisi;
                    Integer keliling = 4 * sisi;
                    hasil_luas.setText(String.valueOf(luas));
                    hasil_keliling.setText(String.valueOf((keliling)));
                }
            }
        });
        return v;
    }
}