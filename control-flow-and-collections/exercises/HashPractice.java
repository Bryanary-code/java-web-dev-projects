import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String student;
        HashMap<Integer, String> students = new HashMap<>();

        do {
            System.out.println("Enter a student name:");
            student = input.nextLine();

            if (!student.equals("")) {
                System.out.println("ID number:");
                int idNumber = input.nextInt();
                input.nextLine();
                students.put(idNumber, student);
            }
        } while (!student.equals(""));




        for (Map.Entry<Integer, String> item : students.entrySet()) {
            System.out.println(item.getKey() + " (" + item.getValue() + ")");

        }
    }
}
