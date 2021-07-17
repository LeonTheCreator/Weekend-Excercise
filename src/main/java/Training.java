public class Training {
    public static void main(String[] args) {

       // System.out.println(add(11,6,3));

        System.out.println(forLoop());
    }

    public static int add(int number1,int number2, int number3) {

        int result = number1 + number2 - number3;
        return result;
    }

    public static int forLoop() {

        int inputX = 6;
        int[] zahlen = new int[4];

        for(int i = 0; i < zahlen.length ; i++) {
            zahlen[i] = inputX;
        }
        return zahlen[0];
    }



}

