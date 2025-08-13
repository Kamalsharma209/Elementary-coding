class FindStringCode {
    public int weightOfString(String input1,int input2){
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            word = word.toUpperCase();
            int left = 0;
            int right = word.length() - 1;
            int sum = 0;
            while (left < right) {
                int leftVal = word.charAt(left) - 'A' + 1;
                int rightVal = word.charAt(right) - 'A' + 1;
                sum += Math.abs(leftVal - rightVal);
                left++;
                right--;
            }
            if (left == right) {
                sum += (word.charAt(left) - 'A' + 1);
            }
            result.append(sum);
        }
        return Integer.parseInt(result.toString());
    }
}