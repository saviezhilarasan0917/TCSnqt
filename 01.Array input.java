import java.util.*;

public class Main {

    public static ArrayList<Integer> readArray(Scanner sc) {
        ArrayList<Integer> list = new ArrayList<>();

        String input = sc.nextLine();

        // Remove brackets if present
        input = input.replace("[", "").replace("]", "");

        // Replace commas with spaces
        input = input.replace(",", " ");

        // Split based on space
        String[] parts = input.trim().split("\\s+");

        for (String part : parts) {
            if (!part.isEmpty()) {
                list.add(Integer.parseInt(part));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = readArray(sc);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
