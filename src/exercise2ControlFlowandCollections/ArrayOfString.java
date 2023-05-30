package exercise2ControlFlowandCollections;

import java.util.Arrays;

public class ArrayOfString {
    public static void main (String[] args) {

        //Arrays? may need to import
        String sentence;
        String[] words;
        String[] sentences;


        sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //needs to figure out how tosplit sentence at delimeter setence.split(" ")



        words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // not recognizing Arrays class

//        words = sentence.split("");
//        System.out.println(Arrays.toString(words)); // not recognizing Arrays class
//
//        words = sentence.split(",");
//        System.out.println(Arrays.toString(words)); // not recognizing Arrays class

        sentences = sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
