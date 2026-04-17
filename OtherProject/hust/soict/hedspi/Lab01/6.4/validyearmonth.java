import java.util.Scanner;

public class validyearmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year = 0;
        int days = 0;

        while (true) {
            System.out.print("Enter a month: ");
            month = scanner.nextLine().trim();

            System.out.print("Enter a year: ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("Invalid month/year. Please enter again.\n");
                    continue; 
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid month/year. Please enter again.\n");
                continue; 
            }

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            switch (month.toLowerCase()) {
                case "january": case "jan.": case "jan": case "1":
                case "march": case "mar.": case "mar": case "3":
                case "may": case "5":
                case "july": case "jul.": case "jul": case "7":
                case "august": case "aug.": case "aug": case "8":
                case "october": case "oct.": case "oct": case "10":
                case "december": case "dec.": case "dec": case "12":
                    days = 31;
                    break;

                case "april": case "apr.": case "apr": case "4":
                case "june": case "jun.": case "jun": case "6":
                case "september": case "sept.": case "sep": case "9":
                case "november": case "nov.": case "nov": case "11":
                    days = 30;
                    break;

                case "february": case "feb.": case "feb": case "2":
                    if (isLeapYear) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;

                default:
                    days = -1; 
                    break;
            }

            if (days != -1) {
                System.out.println("Number of days: " + days);
                break; 
            } else {
                System.out.println("Invalid month/year. Please enter again.\n");
            }
        }
        
        scanner.close();
    }
}