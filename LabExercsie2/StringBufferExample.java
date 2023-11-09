public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        //  append()
        stringBuffer.append(" World");
        System.out.println("Append: " + stringBuffer);

        // insert()
        stringBuffer.insert(6, " Java");
        System.out.println("Insert: " + stringBuffer);

        // replace()
        stringBuffer.replace(6, 10, " Universe");
        System.out.println("Replace: " + stringBuffer);

        // delete()
        stringBuffer.delete(6, 15);
        System.out.println("Delete: " + stringBuffer);

        // charAt()
        char charAtIndex = stringBuffer.charAt(2);
        System.out.println("Char at index 2: " + charAtIndex);

        //  setCharAt()
        stringBuffer.setCharAt(0, 'H');
        System.out.println("Set char at index 0: " + stringBuffer);

        //  length()
        int length = stringBuffer.length();
        System.out.println("Length: " + length);

        //capacity()
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity: " + capacity);

        // ensureCapacity()
        stringBuffer.ensureCapacity(20);
        System.out.println("Ensure Capacity: " + stringBuffer.capacity());

        //  toString()
        System.out.println("String Representation: " +  stringBuffer.toString());

        // substring(int start)
        System.out.println("Substring from index 2: " + stringBuffer.substring(2));

        // substring(int start, int end)
        System.out.println("12. Substring with range [0, 5): " + stringBuffer.substring(0, 5));
    }
}
