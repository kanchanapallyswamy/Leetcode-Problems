class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String vowels = "aeiou";

        int baseCount = 0;
        for (char ch : words[0].toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                baseCount++;
            }
        }

        for (int i = 1; i < words.length; i++) {
            int cnt = 0;
            for (char ch : words[i].toCharArray()) {
                if (vowels.indexOf(ch) != -1) {
                    cnt++;
                }
            }

            if (cnt == baseCount) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }
}
