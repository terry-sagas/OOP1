public class Student {
    private String fName;
    private String lName;
    private int age;

    // public Student(String fName, String lName, int age) {


    //     this.fName = fName;
    //     this.lName = lName;
    //     this.age = age;
    // }
    public Student(String fName) {
        this.fName = fName;
        this.age = 0; // or any default value
        }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    // public String getLName() {
    //     return lName;
    // }

    // public void setLName(String lName) {
    //     this.lName = lName;
    //     if (lName == null || lName.isEmpty()) {
    //         System.out.println("Sorry, last name is needed.");
    //         return;
    //     }
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }
}