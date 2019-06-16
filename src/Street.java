public class Street {
    public String Street;

    public Street(String street) {
        Street = street;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    @Override
    public String toString() {
        return "Street{" +
                "Street='" + Street + '\'' +
                '}';
    }
}
