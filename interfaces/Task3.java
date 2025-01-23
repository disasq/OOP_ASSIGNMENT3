public class Solution {
    public static void main(String[] args) {
    }
    public interface CanFly {
        void fly();
    }
    public interface CanRun {
        void run();
    }
    public interface CanSwim {
        void swim();
    }
    public class Human implements CanRun, CanSwim {
        public void run() {
        }
        public void swim() {
        }
    }
    public class Duck implements CanFly, CanRun, CanSwim {
        public void fly() {
        }
        public void run() {
        }
        public void swim() {
        }
    }
    public class Penguin implements CanRun, CanSwim {
        public void run() {
        }
        public void swim() {
        }
    }
    public class Airplane implements CanFly {
        public void fly() {
        }
    }
}