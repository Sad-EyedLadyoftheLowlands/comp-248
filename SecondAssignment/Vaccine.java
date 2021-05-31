// package SecondAssignment;

public class Vaccine {
    private int id;
    private String name;
    private String type;
    private int doses;

    public Vaccine(int id, String name, String type, int doses) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.doses = doses;
    }

    public void printName() {
        System.out.println(this.name);
    }
}