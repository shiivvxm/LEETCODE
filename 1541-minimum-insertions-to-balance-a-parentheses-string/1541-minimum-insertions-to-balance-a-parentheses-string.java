class Solution {
    public int minInsertions(String s) {
        int balance = 0;
        int add = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                if (balance % 2 == 1) {
                    add++;
                    balance--;
                }

                balance += 2;

            } else {
                balance--;

                if (balance < 0) {
                    add++;
                    balance = 1;
                }
            }
        }

        return balance + add;
    }
}