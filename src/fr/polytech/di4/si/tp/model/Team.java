package fr.polytech.di4.si.tp.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by linux on 30/04/16.
 */
public class Team {
    private long id;
    private String name;
    private Set players;
    private Set rankings;
    private Set scores;

    //when we modify a player, he's updated in the team !! no need to remove him

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

    public Set getPlayers() {
        return players;
    }

    public void setPlayers(Set players) {
        this.players = players;
    }

    public Set getRankings() {
        return rankings;
    }
    public void setRankings(Set rankings) {
        rankings = rankings;
    }

    public Set getScores() {
        return scores;
    }

    public void setScores(Set scores) {
        this.scores = scores;
    }
}
