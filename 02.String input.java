import java.util.*;

public class Main {

    public static ArrayList<String> readStringArray(Scanner sc) {
        ArrayList<String> list = new ArrayList<>();

        String input = sc.nextLine();

        // Remove brackets if present
        input = input.replace("[", "").replace("]", "");

        // Replace commas with space
        input = input.replace(",", " ");
        
        input = input.replace("'", " ");

        // Split by one or more spaces
        String[] parts = input.trim().split("\\s+");

        for(String part : parts) {
            if(!part.isEmpty()) {
                list.add(part);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arr = readStringArray(sc);

        for(String s : arr) {
            System.out.print(s + " ");
        }
    }
}
