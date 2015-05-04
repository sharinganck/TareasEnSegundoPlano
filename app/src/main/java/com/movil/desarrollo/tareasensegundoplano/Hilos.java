package com.movil.desarrollo.tareasensegundoplano;


import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

/**
 * Created by Marcos on 5/3/2015.
 */
public class Hilos {

    Handler handle = new Handler();
        public  void miThread(){
/*SE CREA UN HILO PARA PODER DETENRLO UNOS SEGUNDOS Y SABER IDENTIFICAR CUANDO EMPIEZA EL METODO DE ORDENACION*/
            Thread t = new Thread(){
                public void run(){
                    try{
                        Thread.sleep(10);

                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    /*SE LLAMA EL HILO DONDE ESTA DENTRO EL METODO DE ORDENACION */
                    handle.post(proceso);
                }
            };
            t.start();
        }

 Runnable proceso = new Runnable(){
    public void run(){
/*AQUI SE INTRODUCE EL OBJETO DE LA CLASE DE ORDENACION Y SE LLAMAN SUS METODOS*/
    }
};}