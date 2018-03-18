package com.hao.myapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hao.myapplication.R;
import com.hao.myapplication.di.component.DaggerMain4Component;
import com.hao.myapplication.di.component.Main4Component;
import com.hao.myapplication.di.module.Main4Module;

public class Main4Activity extends AppCompatActivity {

    private Main4Component main4Component;

    public Main4Component getMain4Component() {
        return main4Component;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        main4Component = DaggerMain4Component.builder().main4Module(new Main4Module(10)).build();
        main4Component.inject(this);

        getSupportFragmentManager().beginTransaction().add(R.id.frame,new Main4Fragment()).commit();
    }
}
