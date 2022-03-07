import java.util.Scanner;

public class Euler {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Please enter one integer:");
            int Int = 0;

            try {
                String integer = in.nextLine();

                if(integer.equals("exit")){
                    break;
                }

                Int = Integer.parseInt(integer);

            } catch (Exception e) {
                System.out.println("You are not entering an integer!");
                continue;
            }
            System.out.println("The Euler phi-function value of this integer is:"+Euler(Int));
        }


        in.close();

    }

    static int Euler(int Int){
        int count=0;
        for(int i=0;i<Int;i++){
            if( GCD(i,Int) < 2 ){
                count++;
            }
        }
        return count;
    }

    static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return GCD(n2, n1 % n2);
    }


}
