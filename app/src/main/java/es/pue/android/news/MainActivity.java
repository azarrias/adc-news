package es.pue.android.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import es.pue.android.news.model.News;

public class MainActivity extends AppCompatActivity {

    private RecyclerView newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<News> news = new ArrayList<>();
        news.add(new News("Android Course", "A new session of the Android Course is live",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2F2.bp.blogspot.com%2F-2ZMkSo7CnUs%2FWvMvSK0u9RI%2FAAAAAAAAFZA%2FzJOCZ8LUM8ol3hcHYHwVyOpc3iiYaxquACLcBGAs%2Fs1600%2FJetpack_logo.png&imgrefurl=https%3A%2F%2Fandroid-developers.googleblog.com%2F2018%2F05%2Fgoogle-io-2018-whats-new-in-android.html&docid=3_0atw3TmUdQ3M&tbnid=Ib9nmiyw87-YKM%3A&vet=10ahUKEwjz3NH3xsDeAhXBa8AKHXzfB-kQMwhMKA0wDQ..i&w=1400&h=1400&client=firefox-b-ab&bih=910&biw=1280&q=android&ved=0ahUKEwjz3NH3xsDeAhXBa8AKHXzfB-kQMwhMKA0wDQ&iact=mrc&uact=8",
                "Hoy",
                ""));

        news.add(new News("iOS Course", "New iOS course upcoming next summer",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2Fsupport.appsflyer.com%2Fhc%2Farticle_attachments%2F115011046825%2Fios.png&imgrefurl=https%3A%2F%2Fsupport.appsflyer.com%2Fhc%2Fes%2Farticles%2F207032066-Integraci%25C3%25B3n-de-SDK-de-AppsFlyer-iOS&docid=1irdMcao6ToliM&tbnid=qnnYuRJh-kWb5M%3A&vet=10ahUKEwiK4bz8x8DeAhUEQ8AKHf88CukQMwhDKAQwBA..i&w=336&h=336&client=firefox-b-ab&bih=910&biw=1280&q=ios&ved=0ahUKEwiK4bz8x8DeAhUEQ8AKHf88CukQMwhDKAQwBA&iact=mrc&uact=8",
                "Hoy",
                ""));

        newsList = (RecyclerView)findViewById(R.id.list_news);
        newsList.setLayoutManager(new LinearLayoutManager(this));

        NewsAdapter adapter = new NewsAdapter(news);
        newsList.setAdapter(adapter);
    }
}
