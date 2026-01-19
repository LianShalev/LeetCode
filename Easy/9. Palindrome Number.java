/*
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
*/

class Solution {
    public boolean isPalindrome(int x) 
    {
       if(x<0) return false;
       
       int reversed = 0;
       int num = x;
       int countDig = 0;
       int countNum = x;

// revers the number 'x';
       while(num != 0)
       {
        reversed = reversed * 10 + num % 10;
        num/=10;
       }
// count the digits of num 'x' to find the middle of the digits;
       while(countNum != 0)
       {
        countDig++;
        countNum/=10;
       }
// check if num 'x' is Palindrome
       while(countDig/2 != 0)
       {
        countDig--;

        if(reversed/10 != x/10) return false;

        reversed/=10;
        x/=10;
       }
       return true;
    }
}
