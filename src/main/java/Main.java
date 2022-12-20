public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilder().
                setName("Дамир").
                setSurname("Галимов").
                setAge(29).
                setAddress("Казань").
                build();
        Person son = person.newChildBuilder().
                setName("Аскар").
                setAge(10).
                build();

        System.out.println(person);
        System.out.println();
        System.out.println(son);
    }
}
