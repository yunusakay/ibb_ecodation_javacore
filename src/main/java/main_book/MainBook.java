package main_book;

import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.Locale;
import java.util.Date;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        String name, firstText = " randomSimple text ";
        char charVariable = '\u4125';
        System.out.println(charVariable);
        String camelCase = "for use variables and primative class";
        String PascalCase = "for use wrapper class";
        String snake_case = "for use objects";
        final String UPPER_SNAKE_CASE = "for use const variables";
        String javaStructure = "jdk>jre>jvm>jit";
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println(name);
        System.out.println(firstText.length());
        System.out.println(firstText.toUpperCase());
        System.out.println(firstText.toLowerCase());
        System.out.println(firstText.trim());
        System.out.println(firstText.trim().length());
        System.out.println(firstText.equals(firstText));
        System.out.println(firstText == firstText);
        System.out.println(firstText.charAt(1));
        System.out.println(firstText.trim().substring(1));
        System.out.println(firstText.contains("text"));
        System.out.println(firstText.replace("text", "next"));
        System.out.println(firstText.concat("first").concat("second"));
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("first").append("second");
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.hashCode());
        //accessModifier keyword returnType funchName(parameterType parameter){
        //return parameter
        //}
        LocalDateTime now =LocalDateTime.now();
        System.out.println(now.toString());
        Formatter formatter=new Formatter();
        formatter.format("Hi your name is ½s, your tc is %d, price is %f","Yunus",514544564,55.25);
        System.out.println(formatter);//or you can use printf
        formatter.close();//we are close objects for let free cache
        throw new NullPointerException("boş değer");//oluşturulan hatayı fırlatma
    }
}
