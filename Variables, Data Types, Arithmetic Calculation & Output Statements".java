public class Main {
    public static void main(String[] args) {
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        String currency = " USD";

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost: " + totalCost + currency);
    }
}
