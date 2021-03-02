//Sqrt(x)
public class S69 {

    static int input1 = 4;
    static int input2 = 8;
    static int output;

    public static void main(String[] args) {

        String testResult;
        String printResult;

        S69 solution = new S69();

        output = solution.mySqrt(input1);
        printResult = "Input:"+input1+ "      /  Output:"+output;
        if(output == 2){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.mySqrt(input2);
        printResult = "Input:"+input2+ "      /  Output:"+output;
        if(output == 2){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
    }


    public int mySqrt(int x) {
        double r = Math.sqrt(x);
        return (int) r;
    }
}