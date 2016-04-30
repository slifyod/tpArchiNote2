package fr.polytech.di4.si.tp.model;

/**
 * Created by linux on 30/04/16.
 */
public class Team {
    private long id;
    private String name;

    //TODO relationship take care when we modify a player team we need to remove it from the team


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
