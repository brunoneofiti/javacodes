//28. Implement strStr()
public class S28 {

    static String haystack = "mississippi";
    static String needle = "issipi";
    static String h1 = "hello";
    static String n1 = "ll";
    static String h2 = "aaaaa";
    static String n2 = "bba";
    static String h3 = "";
    static String n3 = "";
    static String h4 = "aaa";
    static String n4 = "aaaa";
    static String h5 = "a";
    static String n5 = "a";
    static String h6 = "abc";
    static String n6 = "c";
    static String h7 = "mississippi";
    static String n7 = "pi";

    public static void main(String[] args) {

        S28 solution = new S28();
        String testResult;
        String printResult;
        
        output = solution.strStr(haystack, needle);   
        printResult = "Input:"+haystack+ " - needle:"+needle+"      /  Output:"+output;
        if(output == -1){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.strStr(h1, n1);   
        printResult = "Input:"+h1+ " - needle:"+n1+"      /  Output:"+output;
        if(output == 2){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
        output = solution.strStr(h2, n2);   
        printResult = "Input:"+h2+ " - needle:"+n2+"      /  Output:"+output;
        if(output == -1){ testResult = " ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.strStr(h3, n3);   
        printResult = "Input:"+h3+ " - needle:"+n3+"      /  Output:"+output;
        if(output == 0){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.strStr(h4, n4);   
        printResult = "Input:"+h4+ " - needle:"+n4+"      /  Output:"+output;
        if(output == -1){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

        output = solution.strStr(h5, n5);   
        printResult = "Input:"+h5+ " - needle:"+n5+"      /  Output:"+output;
        if(output == 0){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        
        output = solution.strStr(h6, n6);   
        printResult = "Input:"+h6+ " - needle:"+n6+"      /  Output:"+output;
        if(output == 2){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);
        

        output = solution.strStr(h7, n7);   
        printResult = "Input:"+h7+ " - needle:"+n7+"      /  Output:"+output;
        if(output == 9){ testResult = "  ### Correto"; } else { testResult = " ## Errado";  }
        System.out.println(printResult+testResult);

    }

    static int output;

    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;

        if(needle.length() == haystack.length() &&
            haystack.contains(needle))
                return 0;

        if(needle.length() > haystack.length())
                return -1;

        String[] h = haystack.split("");
        String[] n = needle.split("");

        for(int y=0; y<=h.length-n.length; y++){
            //System.out.println("h[y]:"+h[y]+" # n[0]:"+n[0] +" # y:"+y);
            //first letter found
            if(h[y].contains(n[0])){
                //get all string from haystack
                String s = haystack.substring(y, y+n.length);
                if(s.contains(needle))
                    return y;
                              
            }
        }
        //string not found
        return -1;
    } 
}