package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.Viewholder> {
    private Context context;
    private ArrayList <WeatherRVModal> weatherRVModalArrayList;

    public WeatherRVAdapter(Context context, ArrayList<WeatherRVModal> weatherRVModalArrayList) {
        this.context = context;
        this.weatherRVModalArrayList = weatherRVModalArrayList;
    }

    @NonNull
    @Override
    public WeatherRVAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.weather_rv_item,parent,false);
       return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherRVAdapter.Viewholder holder, int position) {
        Picasso.get().load("http:".concat()).into(holder.conditionIV);

    }

    @Override
    public int getItemCount() {
        return weatherRVModalArrayList.size();
    }

    private class Viewholder extends RecyclerView.ViewHolder {
        private TextView windTV, temperatureTV,timeTV;
        private ImageView conditionIV;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            windTV=itemView.findViewById(R.id.idTVWindspeed);
            temperatureTV=itemView.findViewById(R.id.idTVTemperature);
            timeTV=itemView.findViewById(R.id.idTVTime);
            conditionIV=itemView.findViewById(R.id.idTVCondition);

        }
    }
}
