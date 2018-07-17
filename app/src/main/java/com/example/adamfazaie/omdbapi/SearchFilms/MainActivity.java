package com.example.adamfazaie.omdbapi.SearchFilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.adamfazaie.omdbapi.R;
import com.example.adamfazaie.omdbapi.SearchFilms.Pojo.FilmSearcher;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private RecyclerView recyclerView;
    //private TextView textView1,textView2,textView3,textView4,textView5, textView6;
    //private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindviewbyId();
        recyclerView.setHasFixedSize(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                SearchMoviesApi.getClient().create(SearchMoviesWebServices.class).filmsearcher(s.toString()).enqueue(new Callback<FilmSearcher>() {
                    @Override
                    public void onResponse(Call<FilmSearcher> call, Response<FilmSearcher> response) {

                        FilmSearcher body = response.body();
                        FilmSearcher searcher = FilmSearcher.newBuilder()
                                .title(body.getTitle().toString())
                                .actors(body.getActors().toString())
                                .director(body.getDirector().toString())
                                .genre(body.getGenre().toString())
                                .year(body.getYear().toString())
                                .poster(body.getPoster().toString())
                                .build();

//
                        List<FilmSearcher> filmSearchers = new ArrayList<>();
                        filmSearchers.add(searcher);
                        FilmsAdapter adapter = new FilmsAdapter(MainActivity.this, filmSearchers);
                        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                        adapter.notifyDataSetChanged();
                        recyclerView.setLayoutManager(lm);
                        recyclerView.setAdapter(adapter);



                       /* textView1.setText(" Title: "+body.getTitle().toString());
                        textView2.setText(" Actors: "+body.getActors().toString());
                        textView3.setText( " Awards:" +body.getAwards().toString());
                        textView4.setText(" Directors: "+body.getDirector().toString());
                        textView5.setText(" Genre: "+body.getGenre().toString());
                        textView6.setText(" Year: "+body.getYear().toString());

                        Glide.with(MainActivity.this)
                        .load(body.getPoster().toString())
                        .into(imageView);*/

                    }

                    @Override
                    public void onFailure(Call<FilmSearcher> call, Throwable t) {
                        Log.d("informations", t.toString());
                    }
                });
            }
        });
    }
    void FindviewbyId(){
        editText = findViewById(R.id.edittext_searchfilm);
        button = findViewById(R.id.btn_search);
        recyclerView = findViewById(R.id.myRecycler);
       /* textView1 = findViewById(R.id.textview_title);
        textView2 = findViewById(R.id.textview_actor);
        textView3 = findViewById(R.id.textview_award);
        textView4 = findViewById(R.id.textview_director);
        textView5 = findViewById(R.id.textview_genre);
        textView6 = findViewById(R.id.textview_year);
        imageView = findViewById(R.id.img_show);*/
    }
}
