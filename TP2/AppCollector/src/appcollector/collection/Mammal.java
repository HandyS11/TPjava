package appcollector.collection;

public class Mammal extends Vertebrate {
    
    private int nbLeg;
    
    public Mammal(String specie, String gender, double weight, double length, double speed, int nbBones, int nbLeg) {
        super(specie, gender, weight, length, speed, nbBones);
        this.nbLeg = nbLeg;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\tnbLeg: " + this.nbLeg; 
    }
}
