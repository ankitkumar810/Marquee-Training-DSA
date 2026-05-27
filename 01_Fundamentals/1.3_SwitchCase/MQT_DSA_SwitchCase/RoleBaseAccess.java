package MQT_DSA_SwitchCase;

import java.util.Scanner;

public class RoleBaseAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();

        switch (role) {
            case "Admin":
                System.out.println("Can access anything");
                break;
            case "Teacher":
                System.out.println("Can access all student details");
                break;
            case "Student":
                System.out.println("Can access Syllabus details");
                break;
            case "Guest":
                System.out.println("Cannot access details");
                break;
            default:
                System.out.println("Wrong Role");

        }
    }
}
