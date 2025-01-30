public class Prime {
    public static boolean isPrime(int number){
            if(number<=1){
                return false;
            }
            for(int i=2;i<number;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[]args){
            int number=20;
            if(isPrime(number)){
                System.out.println(number+"is a Prime number:");
            }else{
                System.out.println(number+"is not a Prime number:");
            }
        }
    }
    
