/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcollector.collection;

/**
 *
 * @author vaclergue
 */
public class Vertebrate extends Animal {
    
    private int nbBones;
    
    public Vertebrate(String specie, String gender, double weight, double length, double speed, int nbBones) { 
        super(specie, gender, weight, length, speed);
        this.nbBones = nbBones;
    }
    
    @Override
    public String toString() {
        return super.toString() + " nbBones: " + this.nbBones;
    }
}
