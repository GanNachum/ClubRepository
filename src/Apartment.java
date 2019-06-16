public class Apartment {
    int ApartmentNum;

    public Apartment(int apartmentNum) {
        ApartmentNum = apartmentNum;

    }

    public int getApartmentNum() {
        return ApartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        ApartmentNum = apartmentNum;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "ApartmentNum=" + ApartmentNum +
                '}';
    }
}
