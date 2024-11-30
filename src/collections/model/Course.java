package collections.model;

import java.nio.file.Path;

public class Course {

    private int cdCourse;
    private String name;
    private Path url;

    public Course(){}

    public Course(int cdCourse, String name, Path url) {
        this.cdCourse = cdCourse;
        this.name = name;
        this.url = url;
    }

    public int getCdCourse() {
        return cdCourse;
    }

    public void setCdCourse(int cdCourse) {
        this.cdCourse = cdCourse;
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

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", cdCourse=" + cdCourse +
                '}';
    }
}
