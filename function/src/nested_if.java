import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String deparment = in.next();

//        switch (empId) {
//            case 1:
//                System.out.println("Swangi Kumari");
//                break;
//            case 2:
//                System.out.println("Sejal");
//                break;
//            case 3:
//                System.out.println("Emp no 3");
//                switch (deparment) {
//                    case "IT":
//                        System.out.println("It department");
//                        break;
//                    case "Management" :
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("no department allocated");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("Enter correct empId");
//        }

        switch (empId) {
            case 1 -> System.out.println("Swangi Kumari");
            case 2 -> System.out.println("Sejal");
            case 3 -> {
                System.out.println("Emp no 3");
                switch (deparment) {
                    case "IT" -> System.out.println("It department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("no department allocated");
                }
            }
            default -> System.out.println("Enter correct empId");
        }
    }
}
