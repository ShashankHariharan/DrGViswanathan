class Solution {

    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int position2 = i + j + 1;
                int position1 = i + j;

                int sum = product + result[position2];

                result[position2] = sum % 10;
                result[position1] += sum / 10;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int digit : result) {

            if (!(answer.length() == 0 && digit == 0))
                answer.append(digit);
        }

        return answer.toString();
    }
}