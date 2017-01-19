
package hospitalmanagement.Class;


public class ClassNurse {
    public int NurseID;
    public String NurseName,Skill,AvailableTime,StopWork;

    public int getNurseID() {
        return NurseID;
    }

    public void setNurseID(int NurseID) {
        this.NurseID = NurseID;
    }

    public String getNurseName() {
        return NurseName;
    }

    public void setNurseName(String NurseName) {
        this.NurseName = NurseName;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String Skill) {
        this.Skill = Skill;
    }

    public String getAvailableTime() {
        return AvailableTime;
    }

    public void setAvailableTime(String AvailableTime) {
        this.AvailableTime = AvailableTime;
    }

    public String getStopWork() {
        return StopWork;
    }

    public void setStopWork(String StopWork) {
        this.StopWork = StopWork;
    }
}
