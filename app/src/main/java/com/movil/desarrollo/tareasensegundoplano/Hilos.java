package com.movil.desarrollo.tareasensegundoplano;


import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

/**
 * Created by Marcos on 5/3/2015.
 */
public class Hilos extends ActionBarActivity {
float [] edad = {45, 23, 11, 9};
    Handler handle = new Handler();
        public  void miThread(){

            Thread t = new Thread(){
                public void run(){
                    try{
                        Thread.sleep(10);

                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    handle.post(proceso);
                }
            };
            t.start();
        }

 Runnable proceso = new Runnable(){
    public void run(){
Bubble bu=new Bubble();
        bu.sort(edad);
    }
};}