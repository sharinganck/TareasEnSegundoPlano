package com.movil.desarrollo.tareasensegundoplano;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;


class MyAsyncTask extends AsyncTask<Void, Integer, Boolean> {

    private static final String LOGTAG = "LogsAndroid";


    protected Boolean doInBackground(Void... params) {


        // METODOS DE ORDENAMIENTO

        Log.d(LOGTAG, "Ordenando AsyncTask");

        return true;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

    }

    @Override
    protected void onPreExecute() {
        // METODO DEPUES DE TERMINAR TAREA ASINCRONA
        Log.i(LOGTAG, "Ordenamiento Terminado");

    }

    @Override
    protected void onPostExecute(Boolean result) {

    }

    @Override
    protected void onCancelled() {
        // METODO DE CANCELANCION DE TAREA ASINCRONA
        Log.e(LOGTAG, "Ordenamiento Cancelado");
    }

}