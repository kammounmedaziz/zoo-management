import list.Employe;
import set.Departement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    Map<Employe, Departement> employeDep = new HashMap<>();
    void ajouterEmployeDepartement(Employe employe, Departement departement){
        employeDep.put(employe,departement);
    }
    void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Departement> employe : employeDep.entrySet()){
            System.out.println(employe.getKey().getFirstName() + " " +
                    employe.getKey().getLastName() + " is in the " +
                    employe.getValue().getName()+ " Departement");
        }
    }
    void supprimerEmploye(Employe employe){
        employeDep.remove(employe);
    }
    void supprimerEmployeEtDepartement(Employe employe,Departement departement){
        employeDep.remove(employe);
    }
    void afficherEmployes(){
        for (Employe employe: employeDep.keySet()) {
            System.out.println(employe);
        }
    }
    void afficherDepartement(){
        for (Departement departement: employeDep.values()) {
            System.out.println(departement);
        }
    }
    boolean rechercherEmploye(Employe employe){
        return employeDep.containsKey(employe);
    }
    boolean rechercherDepartement(Departement departement){
        return employeDep.containsValue(departement);
    }
    TreeMap<Employe, Departement> trierMap(){
        Comparator<Employe> c = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getID()- o2.getID();
            }
        };
        TreeMap<Employe, Departement> tree = new TreeMap<>(c);
        tree.putAll(employeDep);
        return tree;
       // return new TreeMap<>(employeDep);
    }
}
