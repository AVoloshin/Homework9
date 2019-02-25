public class Main {

    public static void main(String[] args){

        Bulidng build1= new Bulidng("Здание 1");
        build1.addRoom("Комната1", 20, 2);
        build1.addRoom("Комната2", 10, 0);
        build1.getRoom("Комната1").addFurniture("Стол дубовый", 5);
        build1.getRoom("Комната1").addFurniture("Стул", 1);
        build1.getRoom("Комната1").addFurniture("Стул2", 15);
        build1.getRoom("Комната1").addBulb(250);
        build1.getRoom("Комната1").addBulb(150);
        build1.getRoom("Комната1").addBulb(4150);
        build1.describeBuilding();

    }
}
