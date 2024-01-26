public class Studnet {
    private String name;
    private int age;

    public Studnet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if ((age < 0) || (age > 100)){
            System.out.println("invalid age");
            return;
        }
        this.age = age;
    }
}
