import java.util.Locale;

public class Main {

    public static String concatStrings(String s1, String s2) {
        if (s1 != null && s2 != null) {
            return s1.concat(s2);
        } if (s1 != null && s2 == null) {
            return s1;
        } if (s1 == null && s2 != null) {
            return s2;
        }
        //return "";
        else {
            return "";
           }
    }

    public static String toUpperCase(String s3) {
          if (s3 != null) {
            return s3;
        } if (s3 == null) {
            return s3;
        }
        return s3.toUpperCase(Locale.ENGLISH);

    }

    public static void printLength(String name) {

        if (name == null) {
           System.out.println("Voldemar");
        }
        System.out.println(name.length());
    }



    public static void main(String[] args) {

        /*String string = null;
        System.out.println(string == null ? 0 : string.length() );
        System.out.println(
        /*if (string == null);
                    0;
        } else {
                    string.length();
        }*/
        /*String string = null;
        if ("abc".equals(string)) {
            System.out.println("Одинаковы");
        }*/

        String s1 = "a";
        String s2 = "b";
        if (java.util.Objects.equals(s1,s2)) {
            System.out.println("Кто я");
        }
        System.out.println(concatStrings(s1, s2));
        String s3 = "bruh";
        System.out.println(toUpperCase(s3));
        String name = "null";
    }
}