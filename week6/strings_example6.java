package week6;

public class strings_example6 {
        public static void main(String[] args) {
            String s1 = new String("hello");
            String s2 = new String("GOODBYE");
            String s3 = new String("   spaces   ");
            
            String output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3;
    
            // Test method replace
            output += "\n\nReplace 'l' with 'L' in s1: " + s1.replace('l', 'L');
    
            // Test toLowerCase and toUpperCase
            output += "\n\ns1.toUpperCase() = " + s1.toUpperCase() +
                      "\ns2.toLowerCase() = " + s2.toLowerCase();
    
            // Test trim method
            output += "\n\ns3 after trim = \"" + s3.trim() + "\"";
    
            // Test toCharArray method
            char charArray[] = s1.toCharArray();
            output += "\n\ns1 as a character array = ";
            
            for (int count = 0; count < charArray.length; ++count) {
                output += charArray[count];
            }
    
            System.out.println(output);
        }
    }
    

