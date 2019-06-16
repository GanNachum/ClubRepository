public class City {
    String CityName;

    public City(String cityName) {
        this.setCityName(cityName);
    }

    public City(){
        this.setCityName("");
    }

    public City (City other){
        this.setCityName(other.getCityName());
    }

    public String getCityName() {
        return this.CityName;
    }

    public void setCityName(String cityName) {
        this.CityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "CityName='" + CityName + '\'' +
                '}';
    }
}
