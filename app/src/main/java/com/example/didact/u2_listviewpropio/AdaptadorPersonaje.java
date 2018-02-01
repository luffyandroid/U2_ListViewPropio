package com.example.didact.u2_listviewpropio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 31/01/2018.
 */

public class AdaptadorPersonaje extends ArrayAdapter<Personaje> {

    ArrayList<Personaje> personajes;
    Context c;

    public AdaptadorPersonaje(Context c, ArrayList<Personaje> personajes){
        super(c, R.layout.item_personaje, personajes);
        this.c = c;
        this.personajes = personajes;



    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_personaje, null);

        TextView tv_marca=(TextView)item.findViewById(R.id.item_tvnombre);
        tv_marca.setText(personajes.get(position).getNombre());


        TextView tv_modelo=(TextView)item.findViewById(R.id.item_tvorigen);
        tv_modelo.setText(personajes.get(position).getOrigen());


        String imagen = personajes.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen, "drawable",c.getPackageName());
        ImageView iv_imagen = (ImageView)item.findViewById(R.id.item_imagenpersonaje);
        iv_imagen.setImageResource(idImagen);


        return item;
    }
}
