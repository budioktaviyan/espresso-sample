package com.airsystem.sample.espresso;

import com.airsystem.sample.espresso.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author Budi Oktaviyan Suryanto (budi.oktaviyan@icloud.com)
 */
public class MainActivity extends Activity implements OnClickListener {
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_click);
        button.setOnClickListener(this);

        mEditText = (EditText) findViewById(R.id.et_something);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_click: {
                if (!TextUtils.isEmpty(mEditText.getText())) {
                    Toast.makeText(this, mEditText.getText(), Toast.LENGTH_LONG).show();
                }
                break;
            }

            default: {
                view.getId();
            }
        }
    }
}