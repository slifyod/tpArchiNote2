package fr.polytech.di4.si.tp.model;

import java.util.Set;

/**
 * Created by linux on 30/04/16.
 */
public class Edition {
    private long id;
    private int season;
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
