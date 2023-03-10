public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder() {

    }

    public PersonBuilder(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Недопустимый возраст");
        } else
            this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name.isEmpty()) {
            throw new IllegalStateException("Введите имя");
        } else if (surname.isEmpty()) {
            throw new IllegalStateException("Введите фамилию");
        } else
            return new Person(name, surname, age, city);
    }
}