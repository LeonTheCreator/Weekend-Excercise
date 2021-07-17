public class Training {
    public static void main(String[] args) {

       // System.out.println(add(11,6,3));

        System.out.println(forLoop(6));
    }

    public static int add(int number1,int number2, int number3) {

        int result = number1 + number2 - number3;
        return result;
    }

    public static int forLoop(int inputX) {


        int[] zahlen = new int[4];

        for(int i = 0; i < zahlen.length ; i++) {
            zahlen[i] = inputX;
        }
        return zahlen[0];
    }

    public static String umweltK(String umweltInput) {
        String umweltOutput;

        switch (umweltInput) {
            case "Stufe 1" :
                 umweltOutput = "Feuer";
                break;
            case "Stufe 2" :
                umweltOutput = "Wasser";
                break;
            default:
                umweltOutput = "Erdbeben";
        }
        return umweltOutput;
    }

    // Stufe 1 : "Feuer"
    // Stufe 2 : "Wasser"
    // Stufe 3 : "Erdbeben"

}

