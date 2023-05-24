public class primeNumber{
    public static void main(String[] args) 
    {
        int n = 11;
        checkPrime(n);
    }
    
    private static void checkPrime(int n)
    {
        int count = 0;
        if (n<2)
        {
            System.out.println("the number " + n + "is not a prime");
        }
        for(int i = 1;i <= n; i++)
        {
            if(n % i == 0)
            count += 1;
        }
        if(count > 2)
        {
            System.out.println("The number " + n + " is not prime");
        }
        else
        {
            System.out.println("The number " + n + " is a prime");
        }
    }
}