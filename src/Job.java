public class Job {
    // Attributes
    private Organization organization;
    private String JobTitle;
    private Date start;
    private Date end;

    // CTORs
    public Job(Job other) {
        setOrganization(other.getOrganization());
        setJobTitle(other.getJobTitle());
        setStart(other.getStart());
        setEnd(other.getEnd());
    }

    public Job() {
        setOrganization(new Organization());
        setJobTitle(null);
        setStart(null);
        setEnd(null);
    }

    public Job(Organization organization, String jobTitle, Date start, Date end) {
        setOrganization(organization);
        setJobTitle(jobTitle);
        setStart(start);
        setEnd(end);
    }

    // getters and setters

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }


    @Override
    public String toString() {
        return "Job{" +
                "organization=" + organization +
                ", JobTitle='" + JobTitle + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
