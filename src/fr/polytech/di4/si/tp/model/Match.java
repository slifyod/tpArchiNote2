package fr.polytech.di4.si.tp.model;

import java.util.Date;

/**
 * Created by linux on 30/04/16.
 */
public class Match {
    private long id;
    private Date date;
    private String city;
    private String stadium;

    //TODO relationship


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
