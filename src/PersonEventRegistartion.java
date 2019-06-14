public class PersonEventRegistration {
    private String Name;
    private Person realPerson; // who paid the money
    private Person effectivePerson; // paid for, on behalf of ...
    private Money paid;


    //CTORS
    public PersonEventRegistration() {
    }

    public PersonEventRegistration(String name, Person realPerson, Person effectivePerson, Money paid) {
    }

    //SETTERS

    public void setName(String Name) {
    }

    public void setRealPerson(Person person) {
    }

    public void setEffectivePerson(Person EffectivePerson) {
    }

    public void setPaid(Money money) {
    }


    //GETTERS

    public String getName() {
        return Name;
    }

    public Person getRealPerson() {
        return realPerson;
    }

    public Person getEffectivePerson() {
        return effectivePerson;
    }

    public Money getPaid() {
        return paid;
    }


    @Override
    public String toString() {
        return "PersonEventRegistartion{" +
                "Name='" + Name + '\'' +
                ", realPerson=" + realPerson +
                ", effectivePerson=" + effectivePerson +
                ", paid=" + paid +
                '}';
    }//toString

}//PersonEventRegistration
