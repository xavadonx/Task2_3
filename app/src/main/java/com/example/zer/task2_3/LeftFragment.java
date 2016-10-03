package com.example.zer.task2_3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LeftFragment extends Fragment {

    private ISender sender;

    private EditText etbinary;
    private EditText etoctal;
    private EditText ethexadecimal;

    private Button binary;
    private Button octal;
    private Button hexadecimal;

    public static LeftFragment newInstance() {
        return new LeftFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_left, container, false);

        etbinary = (EditText) root.findViewById(R.id.fl_et_binary);
        etoctal = (EditText) root.findViewById(R.id.fl_et_octal);
        ethexadecimal = (EditText) root.findViewById(R.id.fl_et_hexadecimal);

        binary = (Button) root.findViewById(R.id.fl_bt_binary);
        octal = (Button) root.findViewById(R.id.fl_bt_octal);
        hexadecimal = (Button) root.findViewById(R.id.fl_bt_hexadecimal);

        binary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sender != null) {
                    Integer i = Integer.valueOf(etbinary.getText().toString());
                    sender.sendBinaryText(Integer.toBinaryString(i));
                }
            }
        });

        octal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sender != null) {
                    Integer i = Integer.valueOf(etoctal.getText().toString());
                    sender.sendOctalText(Integer.toOctalString(i));
                }
            }
        });

        hexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sender != null) {
                    Integer i = Integer.valueOf(ethexadecimal.getText().toString());
                    sender.sendHexText(Integer.toHexString(i));
                }
            }
        });

        return root;
    }

    public void setSender(ISender sender) {
        this.sender = sender;
    }
}
