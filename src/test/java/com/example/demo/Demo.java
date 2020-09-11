package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Demo {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
   // @Column(name="name")
    private String name;
   //  @Column(name="course")
    private String course;
   //       @Column(name="fee")
    private double fee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fees) {
        this.fee = fees;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fees=" + fee +
                '}';
    }
}
