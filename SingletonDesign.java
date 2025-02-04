class Netik {

    private static Netik netik;
    private String name;
    private Netik() {
        name = "Netik";
    }

    public static Netik getNetik() {
        if (netik == null) {
            netik = new Netik();
        }
        return netik;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class SingletonDesign {
    public static void main(String[] args) {
        Netik netik1 = Netik.getNetik();
        netik1.setName("Netik Kohli");
        System.out.println("Name: " + netik1.getName());

        Netik netik2 = Netik.getNetik();

        System.out.println(netik1 == netik2);
    }
}
