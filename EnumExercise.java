enum House {
    FARMHOUSE(15000), DUPLEX(30000), BUNGALOW(20000);
    private int price;

    House(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

public class EnumExercise {
    public static void main(String[] args) {

        System.out.println("Name : Farmhouse" + ", Price : " + House.FARMHOUSE.getPrice());
        System.out.println("Name : Duplex" + ", Price : " + House.DUPLEX.getPrice());
        System.out.println("Name : Bungalow" + ", Price : " + House.BUNGALOW.getPrice());

    }
}
