public class StrringLength {

   public static void main(String[] args) {
       String sample = "    Hello world";

       System.out.println("the length of string: " + sample.length());

       System.out.println("is string equal to: " + sample.trim().equals(sample));

       char older = 'e';
       char newer = '0';

       String newSample = sample.replace(older, newer);
       System.out.println("replaced string: " + newSample);

       String oldSubstring = "Hello";
       String newSubstring = "Hii";

       String newSample2 = oldSubstring + newSubstring;
       System.out.println("replaced string: " + newSample2);

       String s1 = "kavi";
       String s2 = "kavi";

       System.out.println(s1 == s2);
       System.out.println(s1.equals(s2));

       String s3 = new String("kavi");
       String s4 = new String("kavi");
       System.out.println(s1 == s3);
       System.out.println(s1.equals(s3));

       String interned1 = s3.intern();
       String intern2 = s4.intern();
       System.out.println(interned1 == intern2);

       System.out.println("hello world");


   }
}
