package mcm.edu.ph.aguilar_wagecalc;

public class GetterSetter {  private String name, type;
    private int totalWage, OTWage, regWage, time, OT;

    //getters
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getTotalWage() {
        return totalWage;
    }
    public int getOTWage() {
        return OTWage;
    }
    public int getRegWage() {
        return regWage;
    }
    public int getTime() {
        return time;
    }
    public int getOT() {
        return OT;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
    public void setOTWage(int OTWage) {
        this.OTWage = OTWage;
    }
    public void setRegWage(int regWage) {
        this.regWage = regWage;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public void setOT(int OT) {
        this.OT = OT;
    }
}
