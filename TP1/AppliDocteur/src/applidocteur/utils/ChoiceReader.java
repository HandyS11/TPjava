package applidocteur.utils;

import java.util.Scanner;

public class ChoiceReader {
    
    Scanner sc = new Scanner(System.in);
    
    public int getIntInput() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    
    public String getData(String dataName) {
        System.out.print(dataName + ": ");
        return sc.nextLine();
    }
}
