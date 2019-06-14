import java.net.URL;

class Person {
    String firstName;
    String lastName;
    String maidenName;
    double age;
    Date birthday;
    //Gender gender;
    //Job[] jobs;
    URL[] facebookProfiles;
    URL[] facebookPages;
    URL[] linkedInProfiles;
    URL[] twitters;
    URL[] instagrams;
    URL[] otherWebsites;
    public Person(){
    }
    public void  age(){
    }
    public void Calculate_age(){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setFacebookProfiles(URL[] facebookProfiles) {
        this.facebookProfiles = facebookProfiles;
    }

    public void setFacebookPages(URL[] facebookPages) {
        this.facebookPages = facebookPages;
    }

    public void setLinkedInProfiles(URL[] linkedInProfiles) {
        this.linkedInProfiles = linkedInProfiles;
    }

    public void setTwitters(URL[] twitters) {
        this.twitters = twitters;
    }

    public void setInstagrams(URL[] instagrams) {
        this.instagrams = instagrams;
    }

    public void setOtherWebsites(URL[] otherWebsites) {
        this.otherWebsites = otherWebsites;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public double getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public URL[] getFacebookProfiles() {
        return facebookProfiles;
    }

    public URL[] getFacebookPages() {
        return facebookPages;
    }

    public URL[] getLinkedInProfiles() {
        return linkedInProfiles;
    }

    public URL[] getTwitters() {
        return twitters;
    }

    public URL[] getInstagrams() {
        return instagrams;
    }

    public URL[] getOtherWebsites() {
        return otherWebsites;
    }


} // Person
