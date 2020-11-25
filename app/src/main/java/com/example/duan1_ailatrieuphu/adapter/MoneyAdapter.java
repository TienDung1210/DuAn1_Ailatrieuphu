package com.example.duan1_ailatrieuphu.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.duan1_ailatrieuphu.R;

import java.util.ArrayList;
import java.util.List;

public class MoneyAdapter extends ArrayAdapter<String> {
    Context context;
    ArrayList<String> arrayList;
    int viTricauhoi =1;

    public MoneyAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);

        this.context = context;
        this.arrayList= new ArrayList<>(objects);


    }

    public void setViTricauhoi(int viTricauhoi) {
        this.viTricauhoi = viTricauhoi;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =inflater.inflate(R.layout.item_tienthuong,null);

        }

        if (arrayList.size()>0){
            int pos =15 - position;
            TextView tvTienThuong = convertView.findViewById(R.id.tvTienthuong);
            if (pos%5 ==0){
                tvTienThuong.setTextColor(Color.parseColor("#FFFFFF"));
            }
            else {
                tvTienThuong.setTextColor(Color.parseColor("#FFEB3B"));
            }

            String tvHienthi = pos+" "+"$"+arrayList.get(position);
            tvTienThuong.setText(tvHienthi);




            if(pos == viTricauhoi){
                tvTienThuong.setBackgroundColor(Color.parseColor("#FF9800"));
                tvTienThuong.setTextColor(Color.parseColor("#1C1C1C"));

            }else {
                tvTienThuong.setBackgroundColor(Color.parseColor("#00FF9800"));

            }
        }
        return convertView;
    }
}
