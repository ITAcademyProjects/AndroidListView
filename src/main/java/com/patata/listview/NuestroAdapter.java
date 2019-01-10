package com.patata.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NuestroAdapter extends ArrayAdapter<Producto> {
    int layoutResourceId;
    Context context;
    ArrayList<Producto> data;

    public NuestroAdapter(Context context, int layoutResourceId, ArrayList<Producto> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        row = inflater.inflate(layoutResourceId, parent, false);
        TextView tv_nombre = (TextView) row.findViewById(R.id.texto);
        tv_nombre.setText(data.get(position).getNombre());
        if (data.get(position).getNombre().startsWith("L"))
        {
            tv_nombre.setTextColor(context.getResources().getColor(R.color.colorAccent));
        }
        //Más campos...
        return row;
    }

}

