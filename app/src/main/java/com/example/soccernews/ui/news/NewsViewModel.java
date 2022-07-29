package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO remover moc de notícias
        List<News>news = new ArrayList<>();
        news.add(new News("Ferroviaria tem desfalque importante","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.."));
        news.add(new News("Ferrinha joga sabado","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.."));
        news.add(new News("Copa do mundo feminina está terminando","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.."));

           this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {

        return this.news;

    }
}