package br.com.alura.languages.api;

public class Language {
    private String title;
    private String imageURL;
    private int ranking;

    public Language(String title, String imageURL, int ranking) {
        this.title = title;
        this.imageURL = imageURL;
        this.ranking = ranking;
    }
    
    public String getTitle() {
        return title;
    }
    public String getImageURL() {
        return imageURL;
    }
    public int getRanking() {
        return ranking;
    }    
}
