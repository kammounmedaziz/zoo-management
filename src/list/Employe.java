package list;
public class Employe implements Comparable <Employe> {
    private String firstName, lastName, departmentName;
    private int ID,grade;
    public Employe(String firstName, String lastName, String departmentName, int ID, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.ID = ID;
        this.grade = grade;
    }
    public Employe() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
@Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (o instanceof Employe employe)
            return employe.ID == ID && employe.firstName.equals(firstName);
        return false;
}
    @Override
    public int compareTo(Employe other) {
        return Integer.compare(this.ID, other.ID);
    }

}
