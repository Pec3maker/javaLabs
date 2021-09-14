class Kata {
    public static String high(String s) {
        java.util.Scanner scanner = new java.util.Scanner(s);
        String[] words = s.split(" ");

        int heightIndex = 0;
        int max = 0;

        for(int i = 0, wordScore; i < words.length; i++) {
            wordScore = 0;
            char[] currentWord = words[i].toCharArray();

            for(char j : currentWord) {
               wordScore += (int)j - 96;
            }

            if (wordScore > max) {
               max = wordScore;
               heightIndex = i;
            }
        }

        return words[heightIndex];
    }
}
