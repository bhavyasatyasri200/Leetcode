bool isPalindrome(int x) {
    long long int rev=0;
    long long int t=x;
    while(x>0)
    {
        long long int z=x%10;
        rev=rev*10+z;
        x=x/10;
    }
    return (rev==t);
    
}