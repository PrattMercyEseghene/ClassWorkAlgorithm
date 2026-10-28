public class StringAlgorithm {
    public static String shortestWord(String sentence) {
        String[] words = sentence.split(" ");
        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        return shortest;
    }
}
