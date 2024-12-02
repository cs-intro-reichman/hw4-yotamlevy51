public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        boolean[] isPrime = new boolean[n + 1]; 

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; 
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { 
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        int primeCount = 0;  
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                primeCount++;
            }
        }

        
        double percentage = ((double) primeCount / n) * 100;
        System.out.println("There are " + primeCount + " primes between 2 and " + n + " (" + (int)percentage + "% are primes)");
    }
}