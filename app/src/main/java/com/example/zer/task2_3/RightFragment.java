package com.example.zer.task2_3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightFragment extends Fragment implements ISender {

    private TextView binary;
    private TextView octal;
    private TextView hexadecimal;

    public static RightFragment newInstance() {
        return new RightFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_right, container, false);
        binary = (TextView) root.findViewById(R.id.fr_binary);
        octal = (TextView) root.findViewById(R.id.fr_octal);
        hexadecimal = (TextView) root.findViewById(R.id.fr_hexadecimal);
        return root;
    }


    @Override
    public void sendBinaryText(String str) {
        binary.setText(str);
    }

    @Override
    public void sendOctalText(String str) {
        octal.setText(str);
    }

    @Override
    public void sendHexText(String str) {
        hexadecimal.setText(str);
    }
}
