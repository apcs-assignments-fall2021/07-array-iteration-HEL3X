import java.util.Arrays;

public class MyMain {
    // Reverses an array
    public static int[] reverse(int[] arr) {
        int [] arrOut = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
                arrOut[i] = arr[(arr.length-1)-i];
        }
        return arrOut;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
        for (int x = 0; x < dictionary.length; x++) {
            if (word.contentEquals(dictionary[x])){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] num = {1,3,2,5,7,6,9,0,45};
        int [] numb = {1,2,3,4,5,6,7,8,9,10,20,30,40,50};
        System.out.println("Test reverse: ");
        System.out.println("Expects [50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1] :   " + Arrays.toString(reverse(numb)));
        System.out.println();
        System.out.println("Test secondLargest: ");
        System.out.println("Second Largest Number (Expects 9):   " + secondLargest(num)); //9
        System.out.println("Second Largest Number (Expects 40):   " + secondLargest(numb)); //40
        System.out.println();
        System.out.println("Test spellCheck: ");
        System.out.println("Expects True: " + spellCheck("of")); //true
        System.out.println("Expects False: " + spellCheck("yes")); //false
        System.out.println("Expects True: " + spellCheck("no")); //true
        System.out.println("Expects False: " + spellCheck("Nicolas"));//false
        System.out.println("Expects True: " + spellCheck("is"));//true
        System.out.println("Expects False: " +spellCheck("cool"));//false
    }
}
