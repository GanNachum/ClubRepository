public class PersonEventRegistration_Main {
    public static void main(String[] args){
        Person person = new Person();
        person.setFirstName("1");
        person.setLastName("2");
        Money money = new Money(1);
        PersonEventRegistration registration = new PersonEventRegistration(person,money);
        System.out.println(registration.toString());

    }
}
