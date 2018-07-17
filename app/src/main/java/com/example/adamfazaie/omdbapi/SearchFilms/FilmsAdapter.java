package com.example.adamfazaie.omdbapi.SearchFilms;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.adamfazaie.omdbapi.R;
import com.example.adamfazaie.omdbapi.SearchFilms.Pojo.FilmSearcher;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.MyHolder> {

    Context context;
    List<FilmSearcher>list;

    public FilmsAdapter(Context context, List<FilmSearcher> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override

    public FilmsAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_films_list_item, viewGroup, false);
        MyHolder h = new MyHolder(view);
        return h;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsAdapter.MyHolder myHolder, int i) {

        myHolder.title.setText(list.get(i).getTitle());
        myHolder.actor.setText(list.get(i).getActors());
        myHolder.year.setText(list.get(i).getYear());
        myHolder.genre.setText(list.get(i).getGenre());
        Picasso.with(context).load(list.get(i).getPoster()).into(myHolder.img);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title,actor,year,genre;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            actor = itemView.findViewById(R.id.actor);
            year = itemView.findViewById(R.id.year);
            genre = itemView.findViewById(R.id.genre);
            img = itemView.findViewById(R.id.img);
        }
    }
}
