import java.util.Scanner;

public class newprime {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int number=dd.nextInt();  
        dd.close();   
         int i , flag =1; 
          if(number == 0 || number == 1){
            flag= 0;
          }
        for(i = 2 ; i<number/2;i++){
            if (number%i==0){
                flag= 0;
                break;
            }
        }
        if (flag==1){
            System.out.println("  prime");
        }
        else{
            System.out.println("non prime");
        }
    }
}
