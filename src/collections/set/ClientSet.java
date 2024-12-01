package collections.set;

import collections.model.Client;
import collections.model.Course;

import java.util.HashSet;
import java.util.Set;

public class ClientSet extends Client {

    private Set<Course> courses;

    public ClientSet(){
        this.courses = new HashSet<>();
    }

    public ClientSet(String cpf, String name, String email) {
        super(cpf, name, email);
        this.courses = new HashSet<>();
    }

    public ClientSet(String cpf, String name, String email, Set<Course> cousersList) {
        super(cpf, name, email);
        this.courses = cousersList;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "{" + super.getName() +
                ", courses=" + courses +
                '}';
    }
}
