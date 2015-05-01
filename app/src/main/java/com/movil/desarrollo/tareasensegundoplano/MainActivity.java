package com.movil.desarrollo.tareasensegundoplano;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//QUIICKSORT
        MyQuickSort sorter = new MyQuickSort();//Se manda a llamar a la clase MyQuickSort

        double[] input = {543,65,23,4,7,2,5,6,76,0,4,1,23,4,71,40,2,4}; //Se lleno el arreglo con numeros aleatorios
        sorter.sort(input);
        for(double i:input){
            System.out.print(i);
            System.out.print(" ");//Se imprime en consola el resultado
        }
        //TERMINA QUICKSORT

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
