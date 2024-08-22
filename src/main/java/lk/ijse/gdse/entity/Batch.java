package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {
    @Id
    private int batch_no;
    private String course_name;
    private int semester;
    public Batch() {
    }

    public Batch(int batch_no, String course_name, int semester) {
        this.batch_no = batch_no;
        this.course_name = course_name;
        this.semester = semester;
    }

    public int getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(int batch_no) {
        this.batch_no = batch_no;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
