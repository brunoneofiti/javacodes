//204 - Count Primes
class S204 {
    public int countPrimes(int n) {
        boolean[] primes= new boolean[n];
        for(int i=0; i<n; i++){
            primes[i] = true; 
        }

        for(int i=2; i*i<n; i++){
            if(primes[i]){                
                for(int j=i; i*j<primes.length; j++){
                    //i*j is not a prime number
                    primes[i * j] = false; 
                }
            }
        }

        int primesCount = 0;
        for(int i=2; i<primes.length; i++){
            if(primes[i]){
                primesCount++;
            }
        }
        return primesCount;
    }
}