import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String city;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public boolean hasAge() {
        if (age > 0) {
            return true;
        } else
            return false;
    }

    public boolean hasAddress() {
        if (city != null) {
            return true;
        } else
            return false;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        if (city != null) {
            return city;
        } else
            return "Город не задан";
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return "Person{ " + '\n' +
                "name= " + name + '\n' +
                "surname= " + surname + '\n' +
                "age= " + age + '\n' +
                "city= " + city + '\n' +
                '}';
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(name, surname, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }
}
