public class Solution {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }
    interface Desire {
    }
    interface Dream {
        Hobby HOBBY = new Hobby();
    }
    static class Hobby implements Desire, Dream {
        static int INDEX = 1;
        @Override
        public String toString() {
            return "" + INDEX++;
        }
    }
}