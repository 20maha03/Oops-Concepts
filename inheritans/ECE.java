public class ECE extends Departments {
    protected String secretary;
    public ECE(String secretaryName) {
        this.secretary = secretaryName;
    }
    protected int totalStrength = 120;
    protected String name = "jaanu";
    protected int permenentStaffCount = 10;
    public String getHODName(){
        return name;
    }
    public int getTotalStrength() {
        return totalStrength;
    }
    public int getPermenentStaffCount() {
        return permenentStaffCount;
    }
    public String getSecretaryName() {
        return secretary;
    }

}