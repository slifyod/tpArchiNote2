package fr.polytech.di4.si.tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linux on 30/04/16.
 */
@Entity
@Table(name="ROLE")
public class Role {
    //relation done
    private long id;
    private String role;

    @Id
    @GeneratedValue
    @Column(name="role_id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
