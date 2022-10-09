package appcollector.utils;

import java.util.Scanner;

public class KeyboardReader {
    
    Scanner sc = new Scanner(System.in);
    
    public int getIntInput() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    
    public String getData(String dataName) {
        System.out.print("\n" + dataName + ": ");
        return sc.nextLine();
    }

    public double getDouble(String dataName) {
        System.out.print("\n" + dataName + ": ");
        double choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public int getInt(String dataName) {
        System.out.print("\n" + dataName + ": ");
        return getIntInput();
    }
}
