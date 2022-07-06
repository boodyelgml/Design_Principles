package DesignPrinciples.FavorCompositionOverInheritence.ConsoleHandler;

import java.util.List;

public class ConsolePrinter {

    public static void Print(List<String> stringList){
        for (String string : stringList ){
            System.out.println((stringList.indexOf(string) + 1) + " - " + string);
        }
        System.out.println("0 - Finish");
        System.out.println("=========================");
    }

}
