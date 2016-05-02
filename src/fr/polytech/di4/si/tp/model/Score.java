package fr.polytech.di4.si.tp.model;

/**
 * Created by linux on 30/04/16.
 */
public class Score {
    private long id;
    private int score;
    private boolean victory;
    private Matche matche;
    private Edition edition;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isVictory() {
        return victory;
    }

    public void setVictory(boolean victory) {
        this.victory = victory;
    }

    public Matche getMatche() {
        return matche;
    }

    public void setMatche(Matche matche) {
        this.matche = matche;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }
}
