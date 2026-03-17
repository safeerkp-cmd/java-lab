public class Prime {

    boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args){
        Prime p = new Prime();
        for(int i=1;i<=20;i++)
            if(p.isPrime(i))
                System.out.print(i+" ");
    }
}
