package practic;

import java.util.Scanner;

public class Practic13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (str.trim().isEmpty()){
            return;
        }
        String[] strMass = str.split(" ");
        String inpStr = "";
        int counter = 0;
        boolean flagIsOnlyLatinAlpha;
        for(String s: strMass){
            flagIsOnlyLatinAlpha = true;
            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                    continue;
                }
                else{
                    flagIsOnlyLatinAlpha = false;
                    break;
                }
            }
            if (flagIsOnlyLatinAlpha) {
                System.out.println(s);
                inpStr = inpStr.concat(s);
                inpStr = inpStr.concat(" ");
                counter += 1;
            }
        }
        System.out.println("Слова состоящие только из латиницы: " + inpStr + "\n" + "Количество слов на латинице " + counter );

    }
}
