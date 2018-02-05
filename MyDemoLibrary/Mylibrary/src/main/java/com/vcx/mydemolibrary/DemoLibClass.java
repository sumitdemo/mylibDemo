package com.vcx.mydemolibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by sumit.k on 30-01-2018.
 */

public class DemoLibClass {

    Context context;

    DemoLibClass(Context context)
    {
        this.context=context;
    }


    public void showToast()
    {
        Toast.makeText(context,"Message From Library",Toast.LENGTH_LONG).show();
    }
}
