public class Patient {
    private String name;
    private int id;
    private int birthyear;
    private double height;
    private double weight;
    String bloodGroup;
    String phoneNumber;

    private Patient(int id,String name,int birthyear,double height,double weight,String bloodGroup,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;

        if(birthyear > 0 ){
            this.birthyear = birthyear;
        } else {
            this.birthyear = 2004;
            System.out.println("Invalid birthyear");
        }

        if(height > 0.0) {
            this.height = height;
        } else {
            this.height = 170;
            System.out.println("Invalid hegiht");
        }

        if(weight > 0.0) {
            this.weight = weight;
        } else {
            this.weight = 70;
            System.out.println("Invalid weight");
        }

        if(bloodGroup == "A"|| bloodGroup == "B"|| bloodGroup == "O"|| bloodGroup == "AB"){
            this.bloodGroup = bloodGroup;
        } else {
            this.bloodGroup = "B";
            System.out.println("Invalid bloodGroup");
        }

        if(phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = null;
            System.out.println("Invalid phonenumber");
        }
    }

    public int getAge(int currentYear){
        return currentYear - this.birthyear;
    }

    public double getBMI(){
        if(height <= 0 || weight <=0){
            return 0.0;
        } else {
            return weight/((height/100)*(height/100));
        }
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Bloodgroup : " + bloodGroup);
        System.out.println("Patient Phonenumber : " + phoneNumber);
        System.out.println("Patient BMI : " + getBMI());
    }

    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0,"A","0912345678");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,"C","09123456789");
        invalidPatient.displayDetails(currentYear);
    }
}
