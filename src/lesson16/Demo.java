package lesson16;



public class Demo {
    public static void main(String[] args) {
        String s = new String("hello");// new char[]{'h','e','l','l','o'}
        System.out.println(s.length());
        System.out.println(s.charAt(2));//char index
        System.out.println(s.indexOf('h'));
        System.out.println(s.indexOf("lo"));
        System.out.println(s.indexOf("z"));//-1
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("l",3));
        System.out.println(s.startsWith("abc"));
        System.out.println(s.startsWith("he"));
        System.out.println(s.startsWith("he",2));
        System.out.println(s.endsWith("lo"));
        System.out.println(s.endsWith("ab"));
        System.out.println(s.substring(2));//2,3,4
        System.out.println(s.substring(1,3));//1,2
        String s1  = "     abc    def    ";
        System.out.println(s1.trim());//"abc   def"
        System.out.println(s.replace('l','s'));
        System.out.println(s.replace("he","mi"));
        System.out.println(s.concat(" Yuli"));
        System.out.println(5 + 6 + s);
        System.out.println(s + 5 + 6);
        String s2 = null;
        s2+="ok";
        System.out.println(s2);
        s = s.toUpperCase();
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.contains("He"));
        System.out.println(s.contains("he"));
        s = s.concat("   World ");
        s1 = "Wow!!!  ";
        s2 = s.concat(s1).trim().replace("Wow","Ураа").substring(6);
        System.out.println(s2.substring(s2.indexOf('W')));
        System.out.println(s2);
        System.out.println( "s".equals("s"));
        System.out.println( "s"=="s");
        String s3 =new String("s");
        String s4 =new String("s");
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        s3 = s3.toUpperCase();
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
