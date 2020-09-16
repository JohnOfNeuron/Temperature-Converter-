import java.util.Scanner;
public class Temperature{
public static void main(String [] args){
    int c,f,k,m,ans;
    Scanner myObj =new Scanner (System.in);
    System.out.println("Welcome!");
    do {System.out.println("Menu : ");
    System.out.println("1.Celicius to Kelvin\n2.Kelvin to Celicius\n3.Celicius to Faranhite\n4.Faranhite to Celicius\n5.Kelvin to Faranhite\n6.Farhanite to Kelvin\nChoose from the menu:");
   m = myObj.nextInt();
   switch (m){
    case 1:{
        System.out.print("Enter the value to convert :");
         c = myObj.nextInt();
        k=c+273;
        System.out.println(k +" Kelvin");
        break;

    }
    case 2:{
        System.out.print("Enter the value to convert :");
        k =myObj.nextInt();
        c=k-273;
        System.out.println(c +" Celicius");
    break;}
    case 3:{
        System.out.print("Enter the value to convert :");
        c = myObj.nextInt();
        f =9/5*c+32;
        System.out.println(f +" Farhanite");
        break;

    }
    case 4:{
        System.out.print("Enter the value to convert :");
         f =myObj.nextInt();
        c =5/9*(f-32);
        System.out.println(c +" Celicius");
    break;}
    case 5:{
        System.out.print("Enter the value to convert :");
        k =myObj.nextInt();
         c= k - 273;
        f =9/5*c+32;
        System.out.println(f + " Farhanite");
        break;

    }
    case 6:{
        System.out.print("Enter the value to convert :");
        f =myObj.nextInt();
        c = 5/9*(f-32);
        k= c + 273;
        System.out.println(k +" Kelvin");
        break;
    }
   }
   System.out.print("Do you want to go back to the menu? '1' for yes :");
    ans = myObj.nextInt();
}
   while(ans == 1);

}
}