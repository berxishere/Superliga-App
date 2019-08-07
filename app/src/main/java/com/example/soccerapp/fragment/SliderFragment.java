package com.example.soccerapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soccerapp.NewsModel.Article;
import com.example.soccerapp.NewsModel.News;
import com.example.soccerapp.R;
import com.example.soccerapp.RetrofitHelper;
import com.example.soccerapp.adapter.SliderAdapter;
import com.example.soccerapp.connection.ResponsesBody;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

import static com.example.soccerapp.RetrofitHelper.API_URL;
import static com.example.soccerapp.RetrofitHelper.NEWS_API_URL;


public class SliderFragment extends Fragment implements ResponsesBody {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ViewPager viewPager;
    SliderAdapter adapter;
    View view;

    RetrofitHelper retrofitHelper;
    public SliderFragment() {
        // Required empty public constructor
    }


    public static SliderFragment newInstance(String param1, String param2) {
        SliderFragment fragment = new SliderFragment();
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

        view = inflater.inflate(R.layout.fragment_slider, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.news_viewpager);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);
        retrofitHelper = new RetrofitHelper(getActivity(),this,API_URL, NEWS_API_URL,"NEWS");
        retrofitHelper.getNews("football","bbc.co.uk,espn.com",getNews);

        return view;
    }

    @Override
    public void getResponseBody(Object model, int ii) {

        if(ii==getNews){
            News mod=(News)model;
            if(mod.getArticles()!=null){
                showNews(mod.getArticles());
            }
        }
    }

    private void showNews(List<Article> article) {
        SliderAdapter adapter = new SliderAdapter(article,getActivity());
        viewPager.setAdapter(adapter);
    }

    public short getNews = 11;
}
