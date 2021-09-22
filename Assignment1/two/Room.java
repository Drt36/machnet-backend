package question.two;

public class Room {
    int roomNo;
    String roomType;
    float roomArea;
    boolean acMachine;

    public void setData(int roomNo,String roomType,Float roomArea,boolean acMachine){
        this.roomNo=roomNo;
        this.roomType=roomType;
        this.roomArea=roomArea;
        this.acMachine=acMachine;
    }

    public void displayData(){
        System.out.println("---------Room Details-------");
        System.out.println("Room No.: "+roomNo);
        System.out.println("Room Type: "+roomType);
        System.out.println("Room Area: "+roomArea+"m square");
        System.out.println("AC availablity: "+acMachine);
    }

    public static void main(String[] args) {
        Room room=new Room();
        room.setData(1,"deluxe",12.5f,true);
        room.displayData();
    }
}
