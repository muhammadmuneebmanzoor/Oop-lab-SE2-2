import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

      
        String day;
        boolean isWeekday = false;

        switch (dayNumber) {
            case 1:
                day = "Monday";
                isWeekday = true;
                break;
            case 2:
                day = "Tuesday";
                isWeekday = true;
                break;
            case 3:
                day = "Wednesday";
                isWeekday = true;
                break;
            case 4:
                day = "Thursday";
                isWeekday = true;
                break;
            case 5:
                day = "Friday";
                isWeekday = true;
                break;
            case 6:
                day = "Saturday";
                isWeekday = false;
                break;
            case 7:
                day = "Sunday";
                isWeekday = false;
                break;
            default:
                day = "Invalid input";
                System.out.println(day);
                scanner.close();
                return;  
        }

       
        System.out.println("Day: " + day);

       
        if (isWeekday) {
            System.out.println(day + " is a weekday.");
        } else {
            System.out.println(day + " is a weekend.");
        }

        scanner.close();
    }
}
