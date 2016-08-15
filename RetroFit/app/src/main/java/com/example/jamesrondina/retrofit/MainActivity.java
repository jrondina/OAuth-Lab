package com.example.jamesrondina.retrofit;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.jamesrondina.retrofit.models.ArticleList;
import com.example.jamesrondina.retrofit.models.Result;

import java.util.List;
import java.util.zip.Inflater;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    public static final String baseUrl = "https://api.nytimes.com/svc/";

    Button mHomeButton;
    Button mOpinionButton;
    Button mWorldButton;
    Button mPoliticsButton;

    String section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHomeButton = (Button) findViewById(R.id.homebutton);
        mOpinionButton = (Button) findViewById(R.id.opinion);
        mWorldButton = (Button) findViewById(R.id.world);
        mPoliticsButton = (Button) findViewById(R.id.politics);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.homebutton:
                        section = "home";
                        break;
                    case R.id.opinion:
                        section = "opinion";
                        break;
                    case R.id.politics:
                        section = "politics";
                        break;
                    case R.id.world:
                        section = "world";
                        break;
                    default:
                        section = "home";
                }
            }
        };

        mHomeButton.setOnClickListener(listener);
        mPoliticsButton.setOnClickListener(listener);
        mWorldButton.setOnClickListener(listener);
        mOpinionButton.setOnClickListener(listener);

        getArticles(section);
        
    }

    public void getArticles(String section) {
        Log.i(TAG, "getArticles: fetching Articles from API");

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null) {

            //create Retrofit service

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            //create instance of NYTimesService and get Call

            NYTimesService service = retrofit.create(NYTimesService.class);

            Call<ArticleList> call = service.getResult(section);

            //make API call

            call.enqueue(new Callback<ArticleList>() {
                @Override
                public void onResponse(Call<ArticleList> call, Response<ArticleList> response) {

                    ResultAdapter adapter = new ResultAdapter(this, response.body().getResults());

                    List<Result> results = response.body().getResults();
                    ListView listView = (ListView) findViewById(R.id.listView);

                    listView.setAdapter(adapter);







                }

                @Override
                public void onFailure(Call<ArticleList> call, Throwable t) {

                }
            });




        }

    }

}
