package collections.model;

import java.nio.file.Path;

public class Course {

    private int idCourse;
    private String name;
    private float value;
    private Path url;

    public Course(){}

    public Course(int idCourse, String name, float value, Path url) {
        this.idCourse = idCourse;
        this.name = name;
        this.url = url;
        this.value = value;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Path getUrl() {
        return url;
    }

    public void setUrl(Path url) {
        this.url = url;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", cdCourse=" + idCourse +
                '}';
    }
}
