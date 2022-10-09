package appcollector.collection;

public class Fish extends Vertebrate {
    
    private int nbTortoiseshell;
    
    public Fish(String specie, String gender, double weight, double length, double speed, int nbBones, int nbTortoiseshell) {
        super(specie, gender, weight, length, speed, nbBones);
        this.nbTortoiseshell = nbTortoiseshell;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\tnbTortoiseshell: " + this.nbTortoiseshell; 
    }
}
