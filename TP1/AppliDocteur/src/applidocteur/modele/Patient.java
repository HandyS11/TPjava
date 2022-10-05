package applidocteur.modele;

import java.util.UUID;

public class Patient {

    private UUID uuid;
    private String firstName;
    private String lastName;   

    public Patient(String firstName, String lastName) {
        uuid = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public String toString() { return String.format("- %s\t%s\t%s", uuid, firstName, lastName); }
}
