package texteditor.utils;

import java.util.Scanner;

public class KeyboardReader {
    Scanner sc = new Scanner(System.in);
    
    public String getData(String str) {
        System.out.println(str);
        return sc.nextLine();
    }
    
    public int getIntInput() {
        System.out.println("Witch line do you want to edit: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
}
