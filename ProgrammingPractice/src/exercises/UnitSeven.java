package exercises;

public class UnitSeven {

    public static class Vegetable implements Priceable {

        public int getPrice() {
            return 23;
        }
    }

    public static class Toy implements Priceable {

        public int getPrice() {
            return 12;
        }
    }

    public static int addPrices(Priceable v, Priceable t) {
        return v.getPrice() + t.getPrice();
    }

    public static void main (String[] args) {
        Vegetable v = new Vegetable();
        Toy t = new Toy();

        System.out.println(addPrices(v, t));

        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("aaa".compareTo("aab"));
        System.out.println("a".compareTo("a"));
    }
}
