import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Employee employee = new Employee(1,"Sihle","Mofokeng",2000_00);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Date of birth: ");

        int Date = scanner.nextInt();


        System.out.print("Current Year: " );

        int year = scanner.nextInt();
        System.out.print("you are: ");
        System.out.println(year-Date);






    }
}
