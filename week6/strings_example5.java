package week6;

public class strings_example5 {
    String str = "Hello, World!";

    int index1 = str.indexOf('o'); // returns 4
    int index2 = str.indexOf('o', 5); // returns 8
    int index3 = str.indexOf("World"); // returns 7
    int index4 = str.indexOf("World", 8); // returns -1

    int lastIndex1 = str.lastIndexOf('o'); // returns 8
    int lastIndex2 = str.lastIndexOf('o', 7); // returns 4
    int lastIndex3 = str.lastIndexOf("World"); // returns 7
    int lastIndex4 = str.lastIndexOf("World", 6); // returns -1
}
