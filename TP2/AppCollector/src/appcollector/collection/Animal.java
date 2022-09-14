/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcollector.collection;

/**
 *
 * @author vaclergue
 */
public abstract class Animal {
    
    private String specie;
    private String gender;
    private double weight;
    private double length;
    private double speed;
    
    public Animal(String specie, String gender, double weight, double length, double speed) { 
        this.specie = specie; 
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.speed = speed;
    }  
    
    @Override
    public String toString() {
        return "-->\tSpecie: " + this.specie + 
                "\tGender: " + this.gender +
                "\tWeight: " + this.weight + 
                "\tLength: " + this.length + 
                "\tSpeed: " + this.speed;
    }
}
