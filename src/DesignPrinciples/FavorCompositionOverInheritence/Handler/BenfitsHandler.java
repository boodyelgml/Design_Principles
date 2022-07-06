package DesignPrinciples.FavorCompositionOverInheritence.Handler;

import java.util.List;

public class BenfitsHandler {

    public static String getBenfitsOf(Integer choice, List<String> stringList) {
        if (choice < stringList.size() + 1 && choice > 0) {
            return stringList.get(choice - 1);
        }else{
            return "";
        }

    }
}
