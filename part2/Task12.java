public class Market {
    private static boolean hasEggs = true;
    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Bought 10 Batons");
        } else {
            System.out.println("Bought 1 loaf");
        }
    }
    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }
}