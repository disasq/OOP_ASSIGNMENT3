public class Skyscraper {
    public Skyscraper() {
        System.out.println("The skyscraper is built.");
    }
    public Skyscraper(int floors) {
        System.out.println("The skyscraper is built. The number of floors is " + floors);
    }
    public Skyscraper(String developer) {
        System.out.println("Skyscraper is built. Developer - " + developer);
    }
    public static void main(String[] args) {
        new Skyscraper();
        new Skyscraper(50);
        new Skyscraper("JavaRushDevelopment");
    }
}