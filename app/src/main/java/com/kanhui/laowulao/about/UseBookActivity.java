package com.kanhui.laowulao.about;

import android.os.Bundle;
import android.view.View;

import com.kanhui.laowulao.R;
import com.kanhui.laowulao.base.BaseActivity;

import androidx.annotation.Nullable;

public class UseBookActivity extends BaseActivity implements View.OnClickListener{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        findViewById(R.id.iv_back).setOnClickListener(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_usebook;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_back:
                finish();
                break;
        }
    }
}
