package com.example.karabogh.padoru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class SonAdapteur extends BaseAdapter {

    private ArrayList<Son> tabSon = new ArrayList<>();
    private LayoutInflater layout;

    public SonAdapteur(Context context, ArrayList<Son> sons) {
        tabSon = sons;
        layout = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = layout.inflate(R.layout.affiche_son, null);
            holder.nomSon = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        if (tabSon.get(position) != null) {
            holder.nomSon.setText(tabSon.get(position).getNomSon());
        }
        return convertView;
    }

    private static class ViewHolder {
        TextView nomSon;
        ImageView sFlowerPhotoPath;
    }

    @Override
    public int getCount() {
        return tabSon.size();
    }

    @Override
    public Object getItem(int position) {
        return tabSon.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
