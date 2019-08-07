package com.example.soccerapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.soccerapp.NewsModel.Article;
import com.example.soccerapp.R;

import java.util.List;

public class SliderAdapter extends PagerAdapter {


    LayoutInflater inflater;

    WebView webView;
    List<Article> articles;
    Activity activity;
    public SliderAdapter(List<Article> articles, Activity activity) {
        this.articles = articles;
        this.activity=activity;
    }


    @Override
    public int getCount() {
        if(articles!=null && articles.size()>0){
        }
        return articles.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view== (RelativeLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.listitem_slider,container,false);

        Article article = articles.get(position);

        RelativeLayout layoutslide = view.findViewById(R.id.sliderelativelayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimage);
        TextView slidetitle = (TextView) view.findViewById(R.id.slide_title);

        webView = (WebView) view.findViewById(R.id.web_view);
        Button btn_web = (Button) view.findViewById(R.id.button);


        Glide.with(activity).load(article.getUrlToImage()).into(imgslide);

        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                webView.loadUrl(article.getUrl());

            }
        });

        if(article.getTitle()!=null){
            slidetitle.setText(article.getTitle());
        }

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      //  super.destroyItem(container, position, object);
        container.removeView((RelativeLayout)object);
    }
}
