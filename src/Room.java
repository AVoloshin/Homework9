import java.util.ArrayList;

public class Room {
    public String name;
    public int s;
    public int sFurn;
    public int lum;
    public int windows;
    public ArrayList<Bulb> bulbs = new ArrayList<>(0);
    public ArrayList<Furniture> furnitures = new ArrayList<>(0);

    public Room(String name, int s, int windows) {
        this.name = name;
        this.s = s;
        this.windows = windows;
        this.lum=windows*700;
    }
    public void addFurniture (String name, int s){
        Furniture furniture = new Furniture(name, s);
        if (this.sFurn+s<this.s*0.7){
            this.sFurn +=s;
            furnitures.add(furniture);
        } else System.out.println("Не хватает места в комнате");
    }

    public void addBulb (int lum){
        Bulb bulb = new Bulb(lum);
        if (this.lum+lum<4000){
            this.lum+=lum;
            bulbs.add(bulb);
        } else System.out.println("Слишком много освещения");
    }
}
