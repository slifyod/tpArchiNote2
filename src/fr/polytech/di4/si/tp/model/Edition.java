package fr.polytech.di4.si.tp.model;

/**
 * Created by linux on 30/04/16.
 */
public class Edition {
    private long id;
    private int season;

    //TODO relationship

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }
}
