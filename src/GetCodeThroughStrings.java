class GetCodeThroughStrings {
    public int getCodeThroughStrings(String input1){
        String[] words = input1.split(" ");
            int totalLength = 0;
            for (String word : words) {
                totalLength += word.length();
            }
            while (totalLength > 9) {
                int sum = 0;
                while (totalLength > 0) {
                    sum += totalLength % 10;
                    totalLength /= 10;
                }
                totalLength = sum;
            }
            return totalLength;
        }
    }
