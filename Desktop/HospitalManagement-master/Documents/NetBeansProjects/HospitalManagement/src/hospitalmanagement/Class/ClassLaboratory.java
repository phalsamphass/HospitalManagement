
package hospitalmanagement.Class;


public class ClassLaboratory {
    public int LabID,RoomNo,DoctorID;
    public String LabName,Remark;

    public int getLabID() {
        return LabID;
    }

    public void setLabID(int LabID) {
        this.LabID = LabID;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo) {
        this.RoomNo = RoomNo;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getLabName() {
        return LabName;
    }

    public void setLabName(String LabName) {
        this.LabName = LabName;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }
}
