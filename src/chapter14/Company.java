package chapter14;


import java.util.Objects;

public final class Company {

    private final String id;
    private final String name;
    private final Person director;

    public Company(Person director, String id, String name) {
        this.director = new Person(director.getName(), director.getSurname());
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person getDirector() {
        return new Person(director.getName(), director.getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(director, company.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, director);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director=" + director +
                '}';
    }
}