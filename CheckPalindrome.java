class Solution {
    public boolean isPalindrome(int x) {
        int palindrome=0;
        int temp=x;
        if(x<0){
            return false;
        }
        while(temp!=0){
            palindrome=palindrome*10+(temp%10);
            temp=temp/10;

        }
        return palindrome==x;

        
    }
}
