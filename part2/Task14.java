public class Solution {
    public static void showWeather(City city) {
        System.out.printf("In the city \"%s\" today the air temperature is \"%d\".%n", city.getName(), city.getTemperature());
    }
    public static void main(String[] args) {
        City dubai = new City("Dubai", 40);
        showWeather(dubai);
    }
    public static class City {
        private String name;
        private int temperature;
        public City(String name, int temperature) {
            this.name = name;
            this.temperature = temperature;
        }
        public String getName() {
            return name;
        }
        public int getTemperature() {
            return temperature;
        }
    }
}