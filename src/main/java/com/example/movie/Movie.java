package com.example.movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// represent each document in a movie collection
@Document(collection = "movies")
// from Lombok, reduce boilerplate code (getters, setters, constructors)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id // as actual id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference // (manual reference relationship) reference to review collection
    private List<Review> reviews;
    // store only Ids of review, reviews store in separate collection

    public Movie(ObjectId id, String imdbId, String title, String releaseDate, String trailerLink, List<String> genres, String poster, List<String> backdrops) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.genres = genres;
        this.poster = poster;
        this.backdrops = backdrops;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
