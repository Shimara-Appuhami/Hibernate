package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lk.ijse.gdse.embeded.FullName;

@Entity
public class Teacher {
    @Id
    private String t_id;
    private FullName name;
    private String experience;

    public Teacher() {
    }

    public Teacher(String t_id, FullName name, String experience) {
        this.t_id = t_id;
        this.name = name;
        this.experience = experience;
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
