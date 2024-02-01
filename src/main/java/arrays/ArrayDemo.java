package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String line = "-----------";
        String [] someRandomSentences = {"First one", "Second one", "Next one", "Last one"};

        int [] intArray = new int[20];

        System.out.println(someRandomSentences[3]);

        System.out.println(someRandomSentences);

        for (int i = 0; i < someRandomSentences.length; i+=2) {
            System.out.println(someRandomSentences[i]);
        }

        System.out.println(line);

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 3;
            System.out.println(intArray[i]);
        }
        System.out.println(line);

        System.out.println(intArray[intArray.length - 1]);//prints last element of any array
        System.out.println(intArray.length);
        System.out.println(someRandomSentences.length);

        System.out.println(line);

        for(String sentence : someRandomSentences){
            System.out.printf("Current line/ sentence is: \"%s\".\n", sentence);
        }

        System.out.println(line);

        for(int number : intArray){
            System.out.println("Current element is: " + number);
        }

        //two-dimensional array:
        int[][] _2dArray = {
                {9, 45, 234},
                {54, 22, 4},
                {0, 4},
                {34, 3, 3, 2, 2, 4, 45}
        };

        System.out.println(line);

        //we want to print elements from _2dArray:
        for (int i = 0; i < _2dArray.length; i++) {
            for (int j = 0; j < _2dArray[i].length; j++) {
                System.out.printf("Current index is: %d%d. Element in that position is: %d\n", i, j, _2dArray[i][j]);
            }

        }
    }
}
