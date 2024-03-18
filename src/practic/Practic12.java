package practic;

public class Practic12 {
    public static void main(String[] args) {
        String strExample = "I like Java!!!";
        System.out.println( "Входная строка - " + strExample);
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = strExample.contains("Java");
        flag2 = strExample.startsWith("I like");
        flag3 = strExample.endsWith("!!!");
        if (flag1 && flag2 && flag3){
            System.out.println(strExample.toUpperCase());
        }
        System.out.println(strExample.replace('a','o').substring(strExample.indexOf('J'),strExample.lastIndexOf('a')+1));
    }
}
