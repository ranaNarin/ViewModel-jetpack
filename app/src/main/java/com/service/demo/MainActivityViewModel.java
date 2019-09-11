package com.service.demo;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String TAG=this.getClass().getSimpleName();
    private String myRandomNumber;

    public String getNumber(){
        Log.e(TAG, "Get Number");

        if(myRandomNumber==null){
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber(){
        Log.e(TAG, "Create new number");
        Random random=new Random();
        myRandomNumber="Number: "+(random.nextInt(10-1)+1);

    }

}
