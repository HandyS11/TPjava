package appcollector.collection;

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
