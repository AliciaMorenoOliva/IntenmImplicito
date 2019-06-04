package com.ng.a.intenmimplicito;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //debajo creo una constante con la direccion de busqueda de google
    private static final String URL_BUSCADOR = "https://www.google.es/search?q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//creamos el metodo del boton buscar en internet
   /* public void buscar(View view) {
      EditText editText = findViewById(R.id.editTex); //recojo el boton
      String texto = editText.getText().toString(); //
        String cad_busqueda = URL_BUSCADOR + texto;// creamos variable donde indicamos la direccion de email mas lo que indiquemos en el editex
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(cad_busqueda));//para ir a la pagina y Uri añade el formato de internet adecuado para ir a la pagina
        startActivity(intent);//lanza
    }*/

   public void buscar2 (View view) {
       EditText editText = findViewById(R.id.editTex);
       String query = editText.getText().toString();
       Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
       intent.putExtra(SearchManager.QUERY,query);
       if(intent.resolveActivity(getPackageManager())!=null){//si hay alguna actividad compatible
           startActivity(intent);
       }
   }
}
