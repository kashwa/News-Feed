package com.example.android.newsfeed;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aabedxx on 12/2/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context) {
        super(context, 0, new ArrayList<News>());
    }

    public NewsAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //find TextView named title with id title
        TextView title = (TextView)listItemView.findViewById(R.id.title);
        //find TextView named author with id author
        TextView author = (TextView)listItemView.findViewById(R.id.author);
        //find TextView named date with id date
        TextView date = (TextView)listItemView.findViewById(R.id.date);
        //find TextView named section with id section
        TextView section = (TextView)listItemView.findViewById(R.id.section);

        // Get the {@link News} object located at this position in the list
        News currentNews = getItem(position);
        // Get the title name from the current News object and
        // set this text on the name TextView
        title.setText(currentNews.getTitle());
        //the same for the author
        author.setText(currentNews.getAuthor());
        //the same for section
        section.setText(currentNews.getSection());
        //the same for date
        date.setText(currentNews.getDate());

        return listItemView;
    }
}
