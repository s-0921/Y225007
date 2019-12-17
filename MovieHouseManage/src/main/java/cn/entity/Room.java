package cn.entity;

/**
 * 放映厅信息Bean
 */
public class Room {
    private Integer roomId;//编号

    private String roomName;//放映厅名

    private String roomContent;//座位布局信息

    private String roomType;//放映厅类型

    private Integer roomNum;//座位数

    private Integer cId;//影院编号

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