package week6;

public class strings_example1 {
        public static void main(String[] args) {
            char charArray[] = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
            byte byteArray[] = { (byte) 'n', (byte) 'e', (byte) 'w', (byte) ' ', (byte) 'y', (byte) 'e', (byte) 'a', (byte) 'r' };
    
            String s = new String("hello");
            // use String constructors                
            String s1 = new String();
            String s2 = new String(s);
            String s3 = new String(charArray);
            String s4 = new String(charArray, 6, 3);
            String s5 = new String(byteArray, 4, 4);
            String s6 = new String(byteArray);
    
            System.out.println(s1); //empty string
            System.out.println(s2); //hello
            System.out.println(s3); //birth day
            System.out.println(s4); //day
            System.out.println(s5); //year
            System.out.println(s6); //new year
        }
    }
    

