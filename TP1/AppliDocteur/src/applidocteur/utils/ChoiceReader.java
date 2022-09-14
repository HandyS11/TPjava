/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applidocteur.utils;

import java.util.Scanner;

/**
 *
 * @author vaclergue
 */
public class ChoiceReader {
    
    Scanner sc = new Scanner(System.in);
    
    public int getIntInput() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    
    public void waitToGo() {
        System.out.print("\nType something to skip..");
        sc.nextLine();
    }
    
    public String getData(String dataName) {
        System.out.print("\n" + dataName + ": ");
        return sc.nextLine();
    }
}
