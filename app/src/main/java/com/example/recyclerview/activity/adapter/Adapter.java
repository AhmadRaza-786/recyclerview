package com.example.recyclerview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.model.Film;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Film>  mFilmList;
    public Adapter(List<Film> list) {
        this.mFilmList = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Film film = mFilmList.get(position);

        holder.title.setText(film.getTitleFilm());
        holder.genre.setText(film.getGenre());
        holder.year.setText(film.getYear());
    }

    @Override
    public int getItemCount() {
        return mFilmList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView year;
        TextView genre;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textTitle);
            year = itemView.findViewById(R.id.textYear);
            genre = itemView.findViewById(R.id.textGenre);
        }
    }
}
