package strings;
// позволяют работать с теми участками памяти которые уже есть
public class StringBuffStringBuild {
    public static void main(String[] args) {
        String string1 = "Hello";
        StringBuffer stringBuffer = new StringBuffer(string1);
        stringBuffer.ensureCapacity(32);
        System.out.println(stringBuffer.capacity());
        System.out.println("-----------------------------");
        String string2 = "elephant";
        StringBuffer stringBuffer1 = new StringBuffer(string2);
        System.out.println(stringBuffer1.capacity());
        System.out.println(stringBuffer1.length());
        System.out.println("-----------------------------");
        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        char c = stringBuffer2.charAt(0);
        System.out.println(c);
        stringBuffer2.setCharAt(0,'G');
        System.out.println(stringBuffer2);
        System.out.println("-----------------------------");


        StringBuffer stringBuffer3 = new StringBuffer("Hello");
        int start = 1;
        int end = 3;
        char[] buffer = new char[end - start];
        stringBuffer.getChars(start,end,buffer,0);
        System.out.println(buffer);
        System.out.println("-----------------------------");

        StringBuffer stringBuffer4 = new StringBuffer("Hello");
        stringBuffer4.append("World");
        System.out.println(stringBuffer4);
        stringBuffer4.insert(5,"D");
        System.out.println(stringBuffer4);
        stringBuffer4.delete(2,6);
        System.out.println(stringBuffer4);
        String s1 = stringBuffer4.substring(3);
        System.out.println(s1);




    }

}
