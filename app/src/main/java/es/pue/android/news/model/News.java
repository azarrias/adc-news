package es.pue.android.news.model;

public class News {
    private String title;
    private String body;
    private String imageUrl;
    private String time;
    private String urlToArticle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrlToArticle() {
        return urlToArticle;
    }

    public void setUrlToArticle(String urlToArticle) {
        this.urlToArticle = urlToArticle;
    }

    public News(String title, String body, String imageUrl, String time, String urlToArticle) {
        this.title = title;
        this.body = body;
        this.imageUrl = imageUrl;
        this.time = time;
        this.urlToArticle = urlToArticle;
    }
}
