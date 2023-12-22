public class Fact {
    void  factorial(int x){
        int f=1;
        while(x!=0){
            f=f*x;
            x--;
        }
        System.out.println("Factorial is = "+f);

    }
    public static void main(String[] args) {
        new Fact().factorial(5);
    }
}