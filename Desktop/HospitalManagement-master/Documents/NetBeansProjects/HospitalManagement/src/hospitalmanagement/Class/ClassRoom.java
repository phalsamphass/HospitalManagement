
package hospitalmanagement.Class;

public class ClassRoom {
    public int RoomNo,TypeID,FloorID;
    public String RoomName,RoomStatus;

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo) {
        this.RoomNo = RoomNo;
    }

    public int getTypeID() {
        return TypeID;
    }

    public void setTypeID(int TypeID) {
        this.TypeID = TypeID;
    }

    public int getFloorID() {
        return FloorID;
    }

    public void setFloorID(int FloorID) {
        this.FloorID = FloorID;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    public String getRoomStatus() {
        return RoomStatus;
    }

    public void setRoomStatus(String RoomStatus) {
        this.RoomStatus = RoomStatus;
    }
}
