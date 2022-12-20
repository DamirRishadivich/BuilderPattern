public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean hasAge() {
        if (this.age == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void happyBirthday() {
        this.age += 1;
    }

    public int getAge() {
        return age;
    }

    public boolean hasAddress() {
        if (this.address == null) {
            return false;
        } else {
            return true;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().
                setSurname(this.surname).
                setAddress(this.address);
    }

    @Override
    public String toString() {
        if (hasAge() && hasAddress()) {
            return "Имя: " + name +
                    "\nФамилия: " + surname +
                    "\nВозраст: " + age +
                    "\nАдрес: " + address;
        } else if (hasAge() && !hasAddress()) {
            return "Имя: " + name +
                    "\nФамилия: " + surname +
                    "\nВозраст: " + age +
                    "\nАдрес: Неизвестно "; // Можно так, а можно просто не выводить эти строки, если поля не заполнены
            // Тогда изменения надо будет сделать еще в методе build (PersonBuilder)
        } else if (!hasAge() && hasAddress()) {
            return "Имя: " + name +
                    "\nФамилия: " + surname +
                    "\nВозраст: Неизвестен" +
                    "\nАдрес: " + address;
        } else {
            return "Имя: " + name +
                    "\nФамилия: " + surname +
                    "\nВозраст: Неизвестен" +
                    "\nАдрес: Неизвестно";
        }



    }
}
