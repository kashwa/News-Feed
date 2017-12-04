package com.example.android.newsfeed;

/**
 * Created by aabedxx on 12/2/2017.
 */

public class News {

    //Creating variables used.
    String title;
    String author;
    String date;
    String section;
    String url;

    /**
     * Constructor of class News, here is initialization of values
     * @param title this is name of Title.
     * @param author this is Author Name.
     * @param date this is the Date.
     * @param section this is name of the section.
     * @param url this is url value.
     */
    public News(String title, String author, String date, String section, String url){
        //Initializing values.
        this.title = title;
        this.author = author;
        this.date = date;
        this.section = section;
        this.url = url;
    }


    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    public String getSection(){
        return section;
    }
    public void setSection(String section){
        this.section = section;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
