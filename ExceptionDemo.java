import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExceptionDemo {
    // exception class A
    static class ExceptionA extends Exception {
        public ExceptionA(String msg) {
            super(msg);
        }
    }
    
    // exception class B, inherit from A
    static class ExceptionB extends ExceptionA {
        public ExceptionB(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        // throw ExceptionA
        try {
            System.out.print(">> Welcome to the Exception Demo.\n\n");
            System.out.println(">> Throwing ExceptionA.");
            throw new ExceptionA("Exception A occured.");
        } 
        catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName() + " with message: " + e.getMessage());
        }

        // throw ExceptionB
        try {
            System.out.println(">> Throwing ExceptionB.");
            throw new ExceptionB("Exception B occured");
        } 
        catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName() + " with message: " + e.getMessage());
        }

        // throw NullPointerException
        try {
            System.out.println(">> Runnning Null Pointer Exception.");
            String text = null;
            int len = text.length(); //  NullPointerException
        } 
        catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName() + " with message: " + e.getMessage());
        }

        // throw IOException
        try {
            System.out.println(">> Throwing IO Exception.");
            throw new java.io.IOException("IO error occurred.");
        } 
        catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName() + " with message: " + e.getMessage());
        }
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MM-dd-yyyy , (HH:mm:ss a)");
        String Date_and_time = now.format(formatter);
       
        System.out.println("\n\n>> Thank you for using Eric's Exception Demo");
        System.out.print("Time of Calculation is: " + Date_and_time+"\n");
        System.exit(0);

    }
}
