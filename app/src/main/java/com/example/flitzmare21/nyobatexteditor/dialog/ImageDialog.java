package com.example.flitzmare21.nyobatexteditor.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.flitzmare21.nyobatexteditor.R;

/**
 * Created by flitzmare21 on 26/10/17.
 */

public class ImageDialog extends Dialog implements android.view.View.OnClickListener {

    public Activity c;
    public Button yes;
    public EditText eturl;

    public String imageurl;

    public ImageDialog(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.image_dialog);
        yes = (Button) findViewById(R.id.btn_yes);
        yes.setOnClickListener(this);
        eturl = (EditText)findViewById(R.id.eturl);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                imageurl = eturl.getText().toString();
                this.dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}