class MultiplicativeInverse
{ 

    static int modInverse(int a, int m) 
    { 
        int m0 = m; 
        int y = 0, x = 1; 
  
        if (m == 1) 
            return 0; 
  
        while (a > 1) 
        {  
            int q = a / m; 
  
            int t = m; 
   
            m = a % m; 
            a = t; 
            t = y; 
  
            y = x - q * y; 
            x = t; 
        } 
  
        if (x < 0) 
            x += m0; 
  
        return x; 
    } 
  
 
    public static void main(String args[]) 
    { 
        int a = 3, m = 11; 
  
        System.out.println("Modular multiplicative "+ 
                           "inverse using extended euclidean theorem is " + modInverse(a, m)); 
    } 
} 