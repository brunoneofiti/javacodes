import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//125. Valid Palindrome
class S125 {

    static String input1 = "A man, a plan, a canal: Panama";
    static String input2 = "race a car";
    static String input3 = "a.";
    static String input4 = "ama";
    static String input5 = "0P";
    static String input6 = "A lupa pula";
    static String input7 = "A Daniela ama a lei? Nada!";
    static String input8 = "a";
    static boolean output;

    public static void main(String[] args) {

        String testResult;
        String printResult;

        S125 solution = new S125();
        
        output = solution.isPalindrome(input1);
        printResult = "Input:"+input1+ "      /  Output:"+output;
        if(output==true){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
        output = solution.isPalindrome(input2);
        printResult = "Input:"+input2+ "      /  Output:"+output;
        if(output==false){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.isPalindrome(input3);
        printResult = "Input:"+input3+ "      /  Output:"+output;
        if(output==true){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.isPalindrome(input4);
        printResult = "Input:"+input4+ "      /  Output:"+output;
        if(output==true){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
                
        output = solution.isPalindrome(input5);
        printResult = "Input:"+input5+ "      /  Output:"+output;
        if(output==false){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
        output = solution.isPalindrome(input6);
        printResult = "Input:"+input6+ "      /  Output:"+output;
        if(output== true){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.isPalindrome(input7);
        printResult = "Input:"+input7+ "      /  Output:"+output;
        if(output==true){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.isPalindrome(input8);
        printResult = "Input:"+input8+ "      /  Output:"+output;
        if(output==true){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
    }


    public boolean isPalindrome(String s) {

        if(s.length() < 1)
            return false;

        if(s.length() == 1)
            return true;

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("[a-z0-9]");
        for(int i=0; i<s.length(); i++){
            String letter = String.valueOf(s.charAt(i));
            Matcher m = p.matcher(letter);
            if(m.matches())
                sb.append(letter);
        }

        if(sb.length() == 1)
            return true;
        
        if(sb.length() == 2){
            String s1 = String.valueOf(sb.toString().charAt(0));  
            String s2 = String.valueOf(sb.toString().charAt(1));
            if(s1.equalsIgnoreCase(s2))
                return true;
            else
                return false;
        }

        int size;
        int rest = sb.length() % 2;

        if(rest == 0)
            size = sb.length() / 2;
        else
            size = (sb.length() - 1) / 2;
        
        for(int i=0; i<size; i++){

            String strBegin = String.valueOf(sb.toString().charAt(i));
            int y = (sb.length()-1)-i;
            String strEnd = String.valueOf(sb.toString().charAt(y));
            y--;
            if(!strBegin.equalsIgnoreCase(strEnd)){
                return false;
            }
        }
        return true;
    }
}
