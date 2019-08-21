package com.example.recipechef.indah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recipechef.Detail;
import com.example.recipechef.Detail2;
import com.example.recipechef.R;

import java.util.ArrayList;


public class DataApdater2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<DataModel2> dataModelArrayList;
    private Activity activity;

    public DataApdater2(Activity activity, ArrayList<DataModel2> dataModelArrayList) {
        this.activity = activity;
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case 1: {
                View v = inflater.inflate(R.layout.listitem, parent, false);
                viewHolder = new ItemHolder(v);
                break;
            }
            case 2: {
                View v = inflater.inflate(R.layout.liastheader2, parent, false);
                viewHolder = new HeaderHolder(v);
                break;
            }
            case 3: {
                View v = inflater.inflate(R.layout.listfooter, parent, false);
                viewHolder = new FooterHolder(v);
                break;


            }

        }
        return viewHolder;
    }

    public static class ItemHolder extends RecyclerView.ViewHolder {
        public TextView Judul2;
        public ImageView gambar2;

        public ItemHolder(View view) {
            super(view);
            Judul2 = (TextView) view.findViewById(R.id.judul);
            gambar2 = (ImageView)view.findViewById(R.id.gambar);
        }
    }


    public static class HeaderHolder extends RecyclerView.ViewHolder {
        public HeaderHolder(View view) {
            super(view);
        }
    }

    public static class FooterHolder extends RecyclerView.ViewHolder {
        public FooterHolder(View view) {
            super(view);
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {
        switch (getItem(position).getViewType2()) {
            case 1: {
                ItemHolder holder = (ItemHolder) viewHolder;
                holder.Judul2.setText(getItem(position).getJudul2());
                // if (getItem(position).getGambar().isEmpty())
                //pakek picasso


                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        //ke halaman detail
                        Intent intent = new Intent(activity, Detail2.class);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("dataModel",getItem(position)); //getItem( position));
                        intent.putExtras(bundle);
                        activity.startActivity(intent);

                    }
                });



                break;
            }
        }
    }


    @Override
    public int getItemViewType(int position) {
        return dataModelArrayList.get(position).getViewType2();
    }


    public DataModel2 getItem(int position) {
        return dataModelArrayList.get(position);
    }


    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

}