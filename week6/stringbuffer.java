package week6;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello, how are you?");

        String output = "buffer = " + buffer.toString() + "\nlength = " +
                        buffer.length() + "\ncapacity = " + buffer.capacity();

        buffer.ensureCapacity(75);
        output += "\n\nNew capacity = " + buffer.capacity();

        buffer.setLength(10);
        output += "\n\nNew length = " + buffer.length() +
                  "\nbuf = " + buffer.toString();

        System.out.println(output);
    }
}
