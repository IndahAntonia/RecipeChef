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
import com.example.recipechef.Detail3;
import com.example.recipechef.R;

import java.util.ArrayList;


public class DataApdater3 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<DataModel3> dataModelArrayList;
    private Activity activity;

    public DataApdater3(Activity activity, ArrayList<DataModel3> dataModelArrayList) {
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
                View v = inflater.inflate(R.layout.liastheader3, parent, false);
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
        public TextView Judul3;
        public ImageView gambar3;

        public ItemHolder(View view) {
            super(view);
            Judul3 = (TextView) view.findViewById(R.id.judul);
            gambar3 = (ImageView)view.findViewById(R.id.gambar);
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
        switch (getItem(position).getViewType3()) {
            case 1: {
                ItemHolder holder = (ItemHolder) viewHolder;
                holder.Judul3.setText(getItem(position).getJudul3());
                // if (getItem(position).getGambar().isEmpty())
                //pakek picasso


                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        //ke halaman detail
                        Intent intent = new Intent(activity, Detail3.class);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("dataModel", getItem( position));
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
        return dataModelArrayList.get(position).getViewType3();
    }


    public DataModel3 getItem(int position) {
        return dataModelArrayList.get(position);
    }


    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

}