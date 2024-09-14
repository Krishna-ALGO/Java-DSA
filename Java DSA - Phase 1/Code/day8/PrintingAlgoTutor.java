public class PrintingAlgoTutor {
    public static void printString(String str , int index){

        if(index == str.length()){
            return;
        }
        System.out.println(str.charAt(index));
        printString(str, index + 1);
    }
    public static void main(String[] args) {
        String str = "ALGOTUTOR";

        printString(str , 0);
    }
}
