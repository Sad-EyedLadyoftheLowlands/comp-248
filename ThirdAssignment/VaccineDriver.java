import java.util.Scanner;

class VaccineDriver {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Vaccine defaultVaccine = new Vaccine();

        String userInput = reader.nextLine();
        String[] userInputSplit = userInput.split(" ");

        Vaccine userChoice = new Vaccine(
            userInputSplit[0], 
            userInputSplit[1], 
            userInputSplit[3], 
            Integer.parseInt(userInputSplit[2])  
        );

        Vaccine copiedVaccine = new Vaccine(userChoice);

        System.out.println(defaultVaccine.toString());
        System.out.println(userChoice.toString());
        System.out.println(copiedVaccine.toString());

        userInput = reader.nextLine();
        userInputSplit = userInput.split(" ");

        defaultVaccine.setName(userInputSplit[0]);
        defaultVaccine.setType(userInputSplit[1]);
        defaultVaccine.setDose(Integer.parseInt(userInputSplit[2]));
        defaultVaccine.setCompany(userInputSplit[3]);

        System.out.println(defaultVaccine.toString());
    }
}

class Vaccine {
    private StringBuilder sb = new StringBuilder();
    
    // Instance variables.
    private String name;
    private String type;
    private String company;
    private int dose;

    // Getters & Setters.
    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String getType() {
        return type;
    }

    public void setCompany(String newCompany) {
        this.company = newCompany;
    }

    public String getCompany() {
        return company;
    }

    public void setDose(int newDose) {
        this.dose = newDose;
    }

    public int getDose() {
        return dose;
    }

    // Constructors.
    public Vaccine() {
        this.name = "Pfizer";
        this.type = "mRNA";
        this.company = "BioNTech";
        this.dose = 2;
    }

    public Vaccine(String name, String type, String company, int dose) {
        this.name = name;
        this.type = type;
        this.company = company;
        this.dose = dose;
    }

    public Vaccine(Vaccine vaccineToCopy) {
        this.name = vaccineToCopy.name;
        this.type = vaccineToCopy.type;
        this.company = vaccineToCopy.company;
        this.dose = vaccineToCopy.dose;
    }

    // To string method.
    public String toString() {
        if (!sb.isEmpty()) {
            sb.setLength(0);
        }

        sb.append("Name: " + this.name + "\n");
        sb.append("Type: " + this.type + "\n");
        sb.append("Dose: " + this.dose + "\n");
        sb.append("Company: " + this.company);

        return sb.toString();
    }

    // Equals test.
    public boolean equals(Vaccine vaccineTest) {
        if (vaccineTest.company.equals(this.company) 
            && vaccineTest.name.equals(this.name) 
            && vaccineTest.type.equals(this.type) 
            && vaccineTest.dose == this.dose ) {
            return true;
        }
        return false;
    }
}
