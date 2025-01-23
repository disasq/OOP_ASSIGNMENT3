public class Solution {
    public static void main(String[] args) {
    }
    interface Selectable {
        void onSelect();
    }
    interface Updatable {
        void refresh();
    }
    public class Screen implements Selectable, Updatable {
        public void onSelect() {
        }
        public void refresh() {
        }
    }
}