import java.util.ArrayList;

public class Bulidng {
    private int square;
    private int lum;
    private String name;
    private ArrayList<Room> rooms = new ArrayList(0);

    public Bulidng(String name) {
        this.name = name;
    }

    public void addRoom(String name, int s, int windows) {
        Room room = new Room(name, s, windows);
        square += room.s;
        lum += room.lum;
        rooms.add(room);
    }

    public Room getRoom (String name){
        Room room = null;
        for(int i=0; i<rooms.size();i++){
            if(rooms.get(i).name.equals(name)){
                room = rooms.get(i);
            }
        }
        return room;
    }
    public void describeBuilding (){
        System.out.println(name);
        for(int i=0; i<rooms.size();i++){
            System.out.println(" "+rooms.get(i).name);
            System.out.print("\t Освещенность = "+rooms.get(i).lum);
            if (rooms.get(i).windows==0){
                System.out.print(" (окон нет,");
            } else {
                System.out.print(" ("+rooms.get(i).windows+" окна по 700,");
            }
            System.out.print(" лампочки ");
            if(rooms.get(i).bulbs.size()==0){
                System.out.print("0");
            } else {for(int j=0; j<rooms.get(i).bulbs.size();j++){
                            System.out.print(rooms.get(i).bulbs.get(j).lum+" люмен ");
                        }
            }
            System.out.print(")");
            System.out.print("\n\t Площадь = "+rooms.get(i).s+" м2");
            if(rooms.get(i).sFurn==0){
                System.out.print(" мебели нет, вся площадь свободна");
            } else {System.out.println(" (занято "+rooms.get(i).sFurn+"м2 гарантированно свободно "+(rooms.get(i).s-rooms.get(i).sFurn)+"м2)");
                System.out.println("\t\tМебель: ");
                for(int k=0; k<rooms.get(i).furnitures.size();k++){
                    System.out.println("\t\t "+rooms.get(i).furnitures.get(k).name+" (площадь " + rooms.get(i).furnitures.get(k).s + "м2)");
                }
            }
        }
    }
}
