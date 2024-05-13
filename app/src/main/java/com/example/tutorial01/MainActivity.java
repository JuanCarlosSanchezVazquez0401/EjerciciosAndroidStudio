package com.example.tutorial01;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    // nombre original savedInstanced = si
    public void  onCreate(Bundle si){
        super.onCreate(si);
        // mi vista va en minuscula y sin espaciotodo lo que sea recursos
        setContentView(R.layout.mivista);


    }

}
