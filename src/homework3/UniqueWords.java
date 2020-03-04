package homework3;

import java.util.*;

public class UniqueWords {

    public static void main(String[] args) {
        String[] words = new String[20];
        for(int i = 0; i < words.length; i++){
            words[i] = "[Word" + (int)(Math.random()*8) + "]";
        }
        for (String s : words){
            System.out.print(s + " ");
        }
        System.out.println();

        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);

        LinkedHashMap<String, Integer> mapWords = new LinkedHashMap<>();
        int i;
        for(String s : words){
            i = 1;
            if(mapWords.containsKey(s)){
                i = mapWords.get(s) + 1;
            }
            mapWords.put(s, i);
        }
        System.out.println(mapWords);
    }
}
