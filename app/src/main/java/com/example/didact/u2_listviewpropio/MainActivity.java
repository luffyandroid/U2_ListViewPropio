package com.example.didact.u2_listviewpropio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPersonajes;
    ArrayList<Personaje> lista_personajes = new ArrayList<Personaje>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
        lvPersonajes= (ListView)findViewById(R.id.lvpersonajes);
        AdaptadorPersonaje adaptador=new AdaptadorPersonaje(this,lista_personajes);
        lvPersonajes.setAdapter(adaptador);

        lvPersonajes.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
              Personaje c =((Personaje)parent.getItemAtPosition(position));
              String ano = c.getAno();
                Toast.makeText(getApplicationContext(),"Año: "+ano,
                        Toast.LENGTH_LONG).show();
            }
        });

        lvPersonajes.setOnItemLongClickListener(new
        AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Personaje c =((Personaje)parent.getItemAtPosition(position));
                String frase = c.getFrase();
                Toast.makeText(getApplicationContext(),frase,
                        Toast.LENGTH_LONG).show();
                return true;

            }
        });

    }//fin onCreate

    private void cargarDatos(){
        lista_personajes.add(new Personaje("Crash Bandicoot","Crash Bandicoot","crash", "1996", "WHOAAA"));
        lista_personajes.add(new Personaje("Mario Bros","Super Mario Bros","mario", "1985", "It´s me Mario!!!"));
        lista_personajes.add(new Personaje("Kirby","Kirby´s Dream Land","kirby", "1992", "Sonido de sorber"));
        lista_personajes.add(new Personaje("Sonic","Rad Mobile","sonic", "1991", "I´m Sonic The Hedgehog"));
        lista_personajes.add(new Personaje("Lara Croft","Tomb Raider","lara", "1996", "La suerte se la forja uno mismo"));
        lista_personajes.add(new Personaje("Rojo","Pokemon azul/ rojo","red", "1996", "Te elijo a tí!!!"));
        lista_personajes.add(new Personaje("Sans","Undertale","sans", "2015", "Ese click largo ha sido Sansacional!!!"));
        lista_personajes.add(new Personaje("Ryu","Street Fighter","ryu", "1964", "HADOUKEN!!!"));
        lista_personajes.add(new Personaje("Jin Kazama","Tekken 3","jin", "1997", "Are you ready for the next battle?"));
        lista_personajes.add(new Personaje("Jefe Maestro","Halo","jefe","2001", "Tengo algo que los demas no, suerte"));
    }

}//fin MainActivity
