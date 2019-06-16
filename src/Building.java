public class Building {
    int buildingNum;

    public Building(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingNum=" + buildingNum +
                '}';
    }
}
