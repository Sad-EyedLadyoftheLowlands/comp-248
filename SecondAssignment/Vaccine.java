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

    public void printFormattedName() {
        System.out.println(this.id + " - " + this.name);
    }

    public void printBasicInformation() {
        String doseString = (this.doses == 1) ? "dose" : "doses";
        System.out.println(this.name + " (" + this.type + ", " + this.doses + " " + doseString + ").");
    }
}