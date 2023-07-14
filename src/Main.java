public class Main
{
    public static void main(String[] args) {
        String s="afdsf2efd3f";
        String result="";
        int n=s.length();
        for(int i=0; i<n; i++){
            if(Character.isDigit(s.charAt(i)))
            {
                int count =Character.getNumericValue(s.charAt(i));
                while(count>=1)
                {
                    result+=s.charAt(i+1);
                    count--;
                }
            }
            else{
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}


//output=afdseeefdffff