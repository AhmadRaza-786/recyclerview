package com.example.recyclerview.activity.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.RecyclerItemClickListener;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Film;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Film> filmList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        this.createFilm();

        Adapter adapter = new Adapter(filmList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        mRecyclerView.setAdapter(adapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        mRecyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Film film = filmList.get(position);
                                Toast.makeText(getApplicationContext(),
                                        "Item press: " + film.getTitleFilm(), Toast.LENGTH_SHORT
                                        ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Film film = filmList.get(position);
                                Toast.makeText(getApplicationContext(),
                                        "Item long press: " + film.getTitleFilm(), Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
                );
    }

    public void createFilm() {
        Film film = new Film("Bonnie and Clyde","Penn", "2014");
        filmList.add(film);

       film = new Film("Airplane!", "Jerry Zucker", "2014");
       filmList.add(film);

        film = new Film("Pan's Labyrinth", "Guillermo del Toro", "2014");
        filmList.add(film);

        film = new Film("Doctor Zhivago", "David Lean", "2014");
        filmList.add(film);

        film = new Film("The Deer Hunter", "Michael Cimino", "2014");
        filmList.add(film);

        film = new Film("Close Encounters of the Third Kind", "Steven Spielberg", "2014");
        filmList.add(film);

        film = new Film("Hate Story 4", "Vishal Pandya", "2014");
        filmList.add(film);

        film = new Film("Veerey Ki Wedding", "Ashu Trikha", "2014");
        filmList.add(film);

        film = new Film("Aiyaary", "Neeraj Pandey", "2014");
        filmList.add(film);

        film = new Film("3 Storeys", "Arjun Mukerjee", "2014");
        filmList.add(film);

        film = new Film("Nawabzaade", "Nikhil Bhatt", "2014");
        filmList.add(film);

        film = new Film("Aiyaary", "Atul Manjrekar", "2014");
        filmList.add(film);

        film = new Film("Pad Man", "R. Balki", "2014");
        filmList.add(film);

        film = new Film("Nirdosh", "Pradeep Rangwani", "2014");
        filmList.add(film);

        film = new Film("Vodka Diaries", "Kushal Srivastava", "2014");
        filmList.add(film);

        film = new Film("My Birthday Song", "Samir Soni", "2014");
        filmList.add(film);

        film = new Film("Phir Se...", "Kunal Kohli", "2014");
        filmList.add(film);

        film = new Film("Mukkabaaz", "Anurag Kashyap", "2014");
        filmList.add(film);

        film = new Film("Kaalakaandi", "Akshat Verma", "2014");
        filmList.add(film);
    }
}