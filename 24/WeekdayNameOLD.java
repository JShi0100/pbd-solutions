public class WeekdayName {
    public static void main(String[] args) {
        int dayNumber;
        String result = "";
        
        if (dayNumber == 1) {
            result = "Monday";
       } else if (dayNumber == 2) {
            result = "Tuesday";
       } else if (dayNumber == 3) {
            result = "Wednesday";
       } else if (dayNumber == 4) {
            result = "Thursday";
       } else if (dayNumber == 5) {
            result = "Friday";
       } else if (dayNumber == 6) {
            result = "Saturday";
       } else if (dayNumber == 7) {
            result = "Sunday";
       } else {
            result = "error";
       }
            System.out.println("Today is " + result + ".");
    }
}
