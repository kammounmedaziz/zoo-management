package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class SocieteArrayList implements IGestion<Employe> {
    List<Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }


    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getFirstName().equals(nom))
                return true;
        }
        return false;
    }


    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }





    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes,
                new ComparatorParDepartement()
                        .thenComparing(new ComparatorParGrade()));
    }
}
