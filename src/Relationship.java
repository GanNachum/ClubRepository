public class Relationship {

    public enum RelationshipType{
        InRelationship,
        Engaged,
        Married,
        Divorced,
        Complex,
        Widow
    }
    private RelationshipType relationshipType;
    //private Person person1;
    //private Person person2; // can have null value when unknown
    private Date startDate; // can have null value when unknown
    private Date endDate; // can have null value when unknown

    public Relationship(RelationshipType relationshipType, Date startDate, Date endDate) {
        this.relationshipType = relationshipType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "relationshipType=" + relationshipType +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
} // Relationship

