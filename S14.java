import java.util.ArrayList;

//14. Longest Common Prefix
class S14 {

    static String[] input1 =  {"flower","flow","flight"};
    static String[] input2 = {"dog","racecar","car"};
    static String[] input3 = {"a"};
    static String[] input4 = {"a","a"};
    static String[] input5 = {"flower","oflow"};
    static String[] input6 = {"flower","fl"};
    static String[] input7 = {};
    static String[] input8 = {"",""};
    static String[] input9 = {""};
    static String output;
/*
0 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.*/

    public static void main(String[] args) {

        String testResult;
        String printResult;

        S14 solution = new S14();
        
        output = solution.longestCommonPrefix(input1);
        printResult = "Input:"+input1+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("fl")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.longestCommonPrefix(input2);
        printResult = "Input:"+input2+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.longestCommonPrefix(input3);
        printResult = "Input:"+input3+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("a")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
        output = solution.longestCommonPrefix(input4);
        printResult = "Input:"+input4+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("a")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
        output = solution.longestCommonPrefix(input5);
        printResult = "Input:"+input5+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
        output = solution.longestCommonPrefix(input6);
        printResult = "Input:"+input6+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("fl")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.longestCommonPrefix(input7);
        printResult = "Input:"+input7+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.longestCommonPrefix(input8);
        printResult = "Input:"+input8+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.longestCommonPrefix(input9);
        printResult = "Input:"+input9+ "      /  Output:"+output;
        if(output.equalsIgnoreCase("")){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
    }


    public String longestCommonPrefix(String[] strs) {

        if(strs.length < 1)
            return "";

        if(strs.length == 1)
            return strs[0];
        
        int smallestPrefix = strs[0].length();
        for(int b=1; b<strs.length; b++){
            if(strs[b].length()<smallestPrefix)
                smallestPrefix = strs[b].length();
        }

        if(smallestPrefix == 0)
            return "";

        String prefix = "";
        String prefixTry = "";
        ArrayList<String> al = new ArrayList<String>(); 
        for(int prefixSize=1; prefixSize<=smallestPrefix; prefixSize++){
            if(prefixSize == 1){
                for(int y=0; y<strs.length; y++){
                    al.add(strs[y].substring(0, prefixSize));
                }
                for(String p : al){
                    if(al.get(0).equalsIgnoreCase(p))
                        prefixTry = al.get(0);
                    else
                        return prefix;
                }
                prefix = prefixTry;
            }else{
                
                for(int y=0; y<strs.length; y++){
                    al.set(y, strs[y].substring(0, prefixSize));
                }
                for(String p : al){
                    if(al.get(0).equalsIgnoreCase(p))
                        prefixTry = al.get(0);
                    else
                        return prefix;
                }
                prefix = prefixTry;
            }
        }
        return prefix;
    }
}
