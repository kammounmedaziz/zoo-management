package list;
public interface IGestion <T>{
    public void ajouterEmploye(T employe);
    public boolean rechecherEmploye(String nom);
    public boolean rechecherEmployer(T t);
    public void supprimerEmploye(T employe);
    public void displayEmploye();
//    public void trierEmployeParID();
    public void trierEmployerParDepartmentNameAndGrade(String nom);
}
