package week3.home_assignments;

public class RemoveDupeWords {

    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        String[] words = text.split(" ");
        int count = 0;

        // Remove duplicates
        for(int i = 0; i < words.length; i++) {
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    words[j] = "";
                    count++;
                }
            }
        }
        
        // Printing actual results
        if(count >= 1) {
            StringBuilder result = new StringBuilder();
            for(String word : words) {
                if(!word.equals("")) {
                    result.append(word).append(" ");
                }
            }
            System.out.println(result.toString().trim());
        }
    }
}
