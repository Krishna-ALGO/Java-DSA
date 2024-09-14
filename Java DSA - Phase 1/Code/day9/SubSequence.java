public class SubSequence {

    public static void printSubsequence(String str , int index , String current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }

        // Include the character
            printSubsequence(str, index + 1 , current + str.charAt(index)); 
            // Exclude the character 
            printSubsequence(str, index + 1 , current); 
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str , 0 , "");
    }
}
