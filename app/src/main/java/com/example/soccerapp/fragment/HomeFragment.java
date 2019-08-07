package com.example.soccerapp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.soccerapp.NewsModel.Article;
import com.example.soccerapp.NewsModel.News;
import com.example.soccerapp.R;
import com.example.soccerapp.RetrofitHelper;
import com.example.soccerapp.WeatherModel.Result;
import com.example.soccerapp.WeatherModel.Weather;
import com.example.soccerapp.adapter.NewsAdapter;
import com.example.soccerapp.adapter.WeatherAdapter;
import com.example.soccerapp.connection.ResponsesBody;

import java.util.List;

import static com.example.soccerapp.RetrofitHelper.API_URL;
import static com.example.soccerapp.RetrofitHelper.NEWS_API_URL;

public class HomeFragment extends Fragment implements ResponsesBody {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    RecyclerView recycler;
    RetrofitHelper retrofitHelper;
    ProgressBar prgbar;

    public HomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        prgbar = (ProgressBar) view.findViewById(R.id.progressBar_news);
        prgbar.setVisibility(View.VISIBLE);

        recycler = (RecyclerView) view.findViewById(R.id.recycler_news);

        retrofitHelper = new RetrofitHelper(getActivity(),this,API_URL, NEWS_API_URL,"NEWS");
        retrofitHelper.getNews("football","bbc.co.uk,espn.com",getNews);

        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;

    }

    @Override
    public void getResponseBody(Object model, int ii) {
        prgbar.setVisibility(View.GONE);

        if(ii==getNews){
            News mod=(News)model;
            if(mod.getArticles()!=null){
                showNews(mod.getArticles());
            }
        }
    }

    private void showNews(List<Article> article) {
        NewsAdapter adapter = new NewsAdapter(article);
        recycler.setAdapter(adapter);
    }

public short getNews = 11;

}
