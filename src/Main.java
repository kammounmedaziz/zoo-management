import list.Employe;
import set.Departement;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        AffectationHashMap depHashset = new AffectationHashMap();
        Departement dep1 = new Departement(41,"informatique",0);
        Departement dep2 = new Departement(62,"marketing",0);

        Employe employe1 = new Employe(2,"aziz","kammoun","informatique",5);
        Employe employe2 = new Employe(42,"ala","zribi","marketing",2);
        Employe employe3 = new Employe(62,"mohamed","mallat","marketing",4);
        Employe employe4 = new Employe(58,"sabri","mallassine","informatique",8);

        depHashset.ajouterEmployeDepartement(employe1,dep1);
        depHashset.ajouterEmployeDepartement(employe2,dep2);
        depHashset.ajouterEmployeDepartement(employe3,dep2);
        depHashset.ajouterEmployeDepartement(employe4,dep1);

        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.afficherDepartement();
        System.out.println("-------------------------");
        depHashset.afficherEmployes();
        System.out.println("-------------------------");
        System.out.println(depHashset.rechercherEmploye(employe1));
        System.out.println(depHashset.rechercherDepartement(dep1));
        System.out.println("-------------------------");
        System.out.println(depHashset.trierMap());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(employe1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherEmploye(employe2));
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(employe2,dep1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(employe2,dep2);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(employe4);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherDepartement(dep1));
    }
}