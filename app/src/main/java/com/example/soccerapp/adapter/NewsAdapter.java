package com.example.soccerapp.adapter;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.soccerapp.NewsModel.Article;
import com.example.soccerapp.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {


    List<Article> articles;

    public NewsAdapter(List<Article> article) {
        this.articles = article;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_news,parent,false);
        return new ViewHolder(view);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView date;
        ImageView imgnews;
        TextView description;
        TextView content;
        TextView link;
        public ViewHolder (View view){
            super(view);
            title = (TextView) view.findViewById(R.id.news_title);
            date = (TextView) view.findViewById(R.id.published_at);
            imgnews = (ImageView) view.findViewById(R.id.img_news);
            description = (TextView) view.findViewById(R.id.description);
            content = (TextView) view.findViewById(R.id.contentnews);
            link = (TextView) view.findViewById(R.id.link_news);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Article article = articles.get(position);

        holder.title.setText(String.valueOf(article.getTitle()));
        String publishedat = String.valueOf(article.getPublishedAt());
        String [] parts = publishedat.split("T");
        String part1 = parts[0];
        String part2 = parts[1];
        holder.date.setText(part1);
        holder.description.setText(String.valueOf(article.getDescription()));
        holder.content.setText(String.valueOf(article.getContent()));
        Glide.with(holder.itemView.getContext()).load(article.getUrlToImage()).into(holder.imgnews);
        holder.link.setText(String.valueOf(article.getUrl()));
      //  holder.link.setText(Html.fromHtml(String.valueOf(article.getUrl())));
        // holder.link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public int getItemCount() {
        if(articles!=null && articles.size()>0){
        }
        return articles.size();
       // else {return 0;}
    }
}

