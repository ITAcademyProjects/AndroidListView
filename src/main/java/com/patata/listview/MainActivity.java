package com.patata.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] valores= new String[] { "Manzana",
            "Plátano",
            "Sandia",
            "Melón",
            "Fresas"
    };

    ArrayList<String> nombres;
    ArrayList<Producto> listadoproductos;

    //ArrayAdapter<String> adapter;
    NuestroAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        nombres = new ArrayList<String>();
        nombres.add("Laura");
        nombres.add("Pedro");
        nombres.add("Berta");
        nombres.add("Lucas");


        listadoproductos = new ArrayList<Producto>();
        listadoproductos.add(new Producto("Manzana",5,false));
        listadoproductos.add(new Producto("Pan",1,true));

        //adapter = new ArrayAdapter<String>(this,
          //      android.R.layout.simple_list_item_1, android.R.id.text1, nombres);

        //utilizar nuestro adapter:
        adapter = new NuestroAdapter(this, R.layout.row, listadoproductos);


        listView.setAdapter(adapter);  //Asignar adaptador al listView

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemPosition     = i;      //coger la posición en la lista
                String  itemValue    = ((Producto) listView.getItemAtPosition(i)).getNombre();
                Toast.makeText(getApplicationContext(),  "Posición :"+itemPosition+"  Valor: " +itemValue , Toast.LENGTH_LONG).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "long click" + position, Toast.LENGTH_LONG).show();
                nombres.remove(position);
                adapter.notifyDataSetChanged();
                return true;
            }
        } );




    }
}
