public class Zip {
    String zip;

    public Zip(String zip) {
        this.zip = zip;
    }

    public Zip() {
        this.setZip("");
    }

    public Zip (Zip other){
        this.setZip(other.getZip());
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Zip{" +
                "zip='" + zip + '\'' +
                '}';
    }
}
