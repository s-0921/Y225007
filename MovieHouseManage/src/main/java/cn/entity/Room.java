package cn.entity;

public class Room {
    private Integer roomId;

    private String roomName;

    private String roomContent;

    private String roomType;

    private Integer roomNum;

    private Integer cId;

    public Room(Integer roomId, String roomName, String roomContent, String roomType, Integer roomNum, Integer cId) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomContent = roomContent;
        this.roomType = roomType;
        this.roomNum = roomNum;
        this.cId = cId;
    }

    public Room() {
        super();
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomContent() {
        return roomContent;
    }

    public void setRoomContent(String roomContent) {
        this.roomContent = roomContent == null ? null : roomContent.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}