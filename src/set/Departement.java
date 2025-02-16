package set;

public class Departement implements Comparable<Departement> {
    private int id;
    private String name;
    private int employenumber;

    public Departement() {
    }
    public Departement(int id, String name, int employenumber) {
        this.id = id;
        this.name = name;
        this.employenumber = employenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployenumber() {
        return employenumber;
    }

    public void setEmployenumber(int employenumber) {
        this.employenumber = employenumber;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employenumber=" + employenumber +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Departement d) {
            return d.id == id && d.name.equals(name);
        }
        return false;
    }

    @Override
    public int compareTo(Departement o) {
        return 0;
    }
}
