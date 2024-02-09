package week5;

public class Student {
        private String name;
        private int id;
        
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
        
        public String getName() {
            return name;
        }
        
        public int getId() {
            return id;
        }
        
        public void printInfo() {
            System.out.println(name + " " + id);
        }
           
        
        public static void main(String[] args) {
            Student[] students = new Student[5];
    
            students[0] = new Student("John", 1);
            students[1] = new Student("Jane", 2);
            students[2] = new Student("Alice", 3);
            students[3] = new Student("Bob", 4);
            students[4] = new Student("Eve", 5);
    
            for (int i = 0; i < students.length; i++) {
                students[i].printInfo();
            }
        }
    
    
    }