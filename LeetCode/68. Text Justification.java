class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int letters = 0;

            while (j < words.length &&
                   letters + words[j].length() + (j - i) <= maxWidth) {
                letters += words[j].length();
                j++;
            }

            int wordCount = j - i;
            int spaces = maxWidth - letters;

            StringBuilder line = new StringBuilder();

            // Last line or single-word line
            if (j == words.length || wordCount == 1) {
                for (int k = i; k < j; k++) {
                    if (k > i) line.append(' ');
                    line.append(words[k]);
                }

                while (line.length() < maxWidth) {
                    line.append(' ');
                }
            } else {
                int gaps = wordCount - 1;
                int evenSpace = spaces / gaps;
                int extra = spaces % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        int count = evenSpace + (k - i < extra ? 1 : 0);

                        for (int s = 0; s < count; s++) {
                            line.append(' ');
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}