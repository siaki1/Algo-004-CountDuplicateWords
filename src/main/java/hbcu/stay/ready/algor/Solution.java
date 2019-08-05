package hbcu.stay.ready.algor;

public class Solution {

    public String countUniqueWords(String input) {

        String sentence = "";
        String[] words = sentence.split("");
        int wordCount = 1;


        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wordCount = wordCount + 1;
                    words[j] = "0";
                }

                if (words[i] != "0")

                    sentence = (words[i] + "seen" + wordCount);
                wordCount = 1;
            }

        }
        return sentence;
    }

}

