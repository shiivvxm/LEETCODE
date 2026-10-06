class Solution {
    public int minAddToMakeValid(String s) {
        String str = s;
         int balance = 0;
         int ans = 0;
        for(int i = 0 ; i<str.length();i++){
           
            if(str.charAt(i) =='('){
            balance++;
            }
            else{
                if((balance>0)){
            balance--;
            }else
            { ans++;
            }
            }

        }
       
        return ans + balance;
    }
}