package es.pue.android.news;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import es.pue.android.news.model.News;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    static final String URL_KEY = "article_url";

    private List<News> news;
    private final Context context;

    public NewsAdapter(List<News> news, Context context) {
        this.news = news;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.news_item, viewGroup, false);

        NewsViewHolder holder = new NewsViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {
        final News n = news.get(i);
        Glide.with(newsViewHolder.image.getContext())
                .load(n.getImageUrl())
                .into(newsViewHolder.image);

        newsViewHolder.title.setText(n.getTitle());
        newsViewHolder.body.setText(n.getBody());

        newsViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: load article
                // Explicit intent
                Intent i = new Intent(context, ArticleActivity.class);
                i.putExtra(URL_KEY, n.getUrlToArticle());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.news.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        TextView body;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.imgNews);
            title = (TextView)itemView.findViewById(R.id.tvTitle);
            body = (TextView)itemView.findViewById(R.id.tvBody);
        }
    }
}
