
package com.example.adamfazaie.omdbapi.SearchFilms.Pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilmSearcher {

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("Rated")
    @Expose
    private String rated;
    @SerializedName("Released")
    @Expose
    private String released;
    @SerializedName("Runtime")
    @Expose
    private String runtime;
    @SerializedName("Genre")
    @Expose
    private String genre;
    @SerializedName("Director")
    @Expose
    private String director;
    @SerializedName("Writer")
    @Expose
    private String writer;
    @SerializedName("Actors")
    @Expose
    private String actors;
    @SerializedName("Plot")
    @Expose
    private String plot;
    @SerializedName("Language")
    @Expose
    private String language;
    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("Awards")
    @Expose
    private String awards;
    @SerializedName("Poster")
    @Expose
    private String poster;
    @SerializedName("Ratings")
    @Expose
    private List<Rating> ratings = null;
    @SerializedName("Metascore")
    @Expose
    private String metascore;
    @SerializedName("imdbRating")
    @Expose
    private String imdbRating;
    @SerializedName("imdbVotes")
    @Expose
    private String imdbVotes;
    @SerializedName("imdbID")
    @Expose
    private String imdbID;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("DVD")
    @Expose
    private String dVD;
    @SerializedName("BoxOffice")
    @Expose
    private String boxOffice;
    @SerializedName("Production")
    @Expose
    private String production;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("Response")
    @Expose
    private String response;

    private FilmSearcher(Builder builder) {
        setTitle(builder.title);
        setYear(builder.year);
        setRated(builder.rated);
        setReleased(builder.released);
        setRuntime(builder.runtime);
        setGenre(builder.genre);
        setDirector(builder.director);
        setWriter(builder.writer);
        setActors(builder.actors);
        setPlot(builder.plot);
        setLanguage(builder.language);
        setCountry(builder.country);
        setAwards(builder.awards);
        setPoster(builder.poster);
        setRatings(builder.ratings);
        setMetascore(builder.metascore);
        setImdbRating(builder.imdbRating);
        setImdbVotes(builder.imdbVotes);
        setImdbID(builder.imdbID);
        setType(builder.type);
        dVD = builder.dVD;
        setBoxOffice(builder.boxOffice);
        setProduction(builder.production);
        setWebsite(builder.website);
        setResponse(builder.response);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDVD() {
        return dVD;
    }

    public void setDVD(String dVD) {
        this.dVD = dVD;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public FilmSearcher() {
    }

    public static final class Builder {
        private String title;
        private String year;
        private String rated;
        private String released;
        private String runtime;
        private String genre;
        private String director;
        private String writer;
        private String actors;
        private String plot;
        private String language;
        private String country;
        private String awards;
        private String poster;
        private List<Rating> ratings;
        private String metascore;
        private String imdbRating;
        private String imdbVotes;
        private String imdbID;
        private String type;
        private String dVD;
        private String boxOffice;
        private String production;
        private String website;
        private String response;

        private Builder() {
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder year(String val) {
            year = val;
            return this;
        }

        public Builder rated(String val) {
            rated = val;
            return this;
        }

        public Builder released(String val) {
            released = val;
            return this;
        }

        public Builder runtime(String val) {
            runtime = val;
            return this;
        }

        public Builder genre(String val) {
            genre = val;
            return this;
        }

        public Builder director(String val) {
            director = val;
            return this;
        }

        public Builder writer(String val) {
            writer = val;
            return this;
        }

        public Builder actors(String val) {
            actors = val;
            return this;
        }

        public Builder plot(String val) {
            plot = val;
            return this;
        }

        public Builder language(String val) {
            language = val;
            return this;
        }

        public Builder country(String val) {
            country = val;
            return this;
        }

        public Builder awards(String val) {
            awards = val;
            return this;
        }

        public Builder poster(String val) {
            poster = val;
            return this;
        }

        public Builder ratings(List<Rating> val) {
            ratings = val;
            return this;
        }

        public Builder metascore(String val) {
            metascore = val;
            return this;
        }

        public Builder imdbRating(String val) {
            imdbRating = val;
            return this;
        }

        public Builder imdbVotes(String val) {
            imdbVotes = val;
            return this;
        }

        public Builder imdbID(String val) {
            imdbID = val;
            return this;
        }

        public Builder type(String val) {
            type = val;
            return this;
        }

        public Builder dVD(String val) {
            dVD = val;
            return this;
        }

        public Builder boxOffice(String val) {
            boxOffice = val;
            return this;
        }

        public Builder production(String val) {
            production = val;
            return this;
        }

        public Builder website(String val) {
            website = val;
            return this;
        }

        public Builder response(String val) {
            response = val;
            return this;
        }

        public FilmSearcher build() {
            return new FilmSearcher(this);
        }
    }
}
