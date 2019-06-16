public class PersonEventRegistration {
    private String Name;
    private Person realPerson; // who paid the money
    private Person effectivePerson; // paid for, on behalf of ...
    private Money paid;


    //CTORS

    public PersonEventRegistration(String name, Person realPerson, Person effectivePerson, Money paid) {
        this.setName(name);
        this.setRealPerson(realPerson);
        this.setPaid(paid);
    }

    public PersonEventRegistration(Person realPerson, Money paid) {
        this.setName(realPerson.getFirstName());
        this.setRealPerson(realPerson);
        this.setPaid(paid);
    }

    //SETTERS

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setRealPerson(Person person) {
        this.realPerson = person;
    }

    public void setEffectivePerson(Person EffectivePerson) {
    }

    public void setPaid(Money money) {
        this.paid = money;
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
                "Name='" + this.Name + '\'' +
                ", realPerson=" + this.realPerson.getFirstName() + " " + this.realPerson.getLastName() +
                ", effectivePerson=" + this.effectivePerson +
                ", paid=" + this.paid.getValue() +
                '}';
    }//toString
}
