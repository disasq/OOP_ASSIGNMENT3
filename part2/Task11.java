import java.util.Arrays;
public class Memory {
    public static void executeDefragmentation(String[] array) {
        int index = 0;
        for (String element : array) {
            if (element != null) {
                array[index++] = element;
            }
        }
        while (index < array.length) {
            array[index++] = null;
        }
    }
    public static void main(String[] args) {
        String[] memory = {"object5", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
}