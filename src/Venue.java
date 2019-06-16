import java.net.URL;
import java.util.Arrays;

public class Venue {
    // Attributes
    private String name;
    private Person[] managers;
    private URL[] facebookProfiles;
    private URL[] facebookPages;
    private URL[] otherWebsites;

    // CTORs
    public Venue(Venue other) {
        setName(other.getName());
        setManagers(other.getManagers());
        setFacebookProfiles(other.getFacebookProfiles());
        setFacebookPages(other.getFacebookPages());
        setOtherWebsites(other.getOtherWebsites());
    }

    public Venue() {
        setName(null);
        setManagers(null);
        setFacebookProfiles(null);
        setFacebookPages(null);
        setOtherWebsites(null);
    }

    public Venue(String name, Person[] managers, URL[] facebookProfiles, URL[] facebookPages, URL[] otherWebsites) {
        setName(name);
        setManagers(managers);
        setFacebookProfiles(facebookProfiles);
        setFacebookPages(facebookPages);
        setOtherWebsites(otherWebsites);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person[] getManagers() {
        return managers;
    }

    public void setManagers(Person[] managers) {
        this.managers = managers;
    }

    public URL[] getFacebookProfiles() {
        return facebookProfiles;
    }

    public void setFacebookProfiles(URL[] facebookProfiles) {
        this.facebookProfiles = facebookProfiles;
    }

    public URL[] getFacebookPages() {
        return facebookPages;
    }

    public void setFacebookPages(URL[] facebookPages) {
        this.facebookPages = facebookPages;
    }

    public URL[] getOtherWebsites() {
        return otherWebsites;
    }

    public void setOtherWebsites(URL[] otherWebsites) {
        this.otherWebsites = otherWebsites;
    }

    // toString
    @Override
    public String toString() {
        return "Venue{" +
                "name='" + name + '\'' +
                ", managers=" + Arrays.toString(managers) +
                ", facebookProfiles=" + Arrays.toString(facebookProfiles) +
                ", facebookPages=" + Arrays.toString(facebookPages) +
                ", otherWebsites=" + Arrays.toString(otherWebsites) +
                '}';
    }
}
