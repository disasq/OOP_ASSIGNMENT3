public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";
    public Bugatti() {
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public static void main(String[] args) {
        Bugatti bugatti = new Bugatti();
        System.out.println("Body: " + bugatti.getBody());
        bugatti.setBody("Convertible");
        System.out.println("Updated Body: " + bugatti.getBody());
    }
}