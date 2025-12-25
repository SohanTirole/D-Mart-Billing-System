/*Item Name	Quantity    Price	Total   After-Discount		                      
     Item-1	   5	      10        50 Rs       47.5 Rs
     Item-2	   3	      20	60 RS       60.0 RS	
       .
       .
       .
       .
       .
       .
       .
     Item-10	  20        100         2000       300.0 Rs*/
import java.util.Scanner;
import java.time.LocalDate;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know your name :");
        String Name = sc.nextLine();

        System.out.println("Please let us know your gender(M/F):");
        char Gander = sc.next().toLowerCase().charAt(0);
        System.out.println();

        System.out.println("-----------------------------PRODUCT'S-----------------------------");

        int CarryCharge;

        int i=1;
        String gift,space;
        space = " ";
        int Quantity1,Quantity2,Quantity3,Quantity4,Quantity5,Quantity6,Quantity7,Quantity8,Quantity9,Quantity10;
        float Price1,Price2,Price3,Price4,Price5,Price6,Price7,Price8,Price9,Price10;
        float Total1,Total2,Total3,Total4,Total5,Total6,Total7,Total8,Total9,Total10, GrandTotal;
        float TAD1, TAD2,TAD3,TAD4,TAD5,TAD6,TAD7,TAD8,TAD9,TAD10;
        float FinalTAD,GST,FinalPayableAMT;
        String Item1,Item2,Item3,Item4,Item5,Item6,Item7,Item8,Item9,Item10;
        GrandTotal = 0;
        
        System.out.println("Enter Item-"+i);
        Item1 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity1 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price1 = sc.nextFloat();
        /*on first product purchase if quantitiy greater then
        4 then you have to offer 5% discount on total price of that product*/
        Total1 = (float)(Quantity1*Price1);
        if(Quantity1>4)
            TAD1 = Total1-(Total1*5.0f/100);
        else
            TAD1 = Total1-0;  
        
        GrandTotal = GrandTotal+TAD1;
        i++;


        System.out.println();
        System.out.println("Enter Item-"+i);
        Item2 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity2 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price2 = sc.nextFloat();
        Total2 = (float)(Quantity2*Price2);
        TAD2 = Total2;
        GrandTotal = GrandTotal+TAD2;
        i++;

        System.out.println();
        System.out.println("Enter Item-"+i);
        Item3 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity3 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price3 = sc.nextFloat();
        Total3 = (float)(Quantity3*Price3);
        TAD3 = Total3;
        GrandTotal = GrandTotal+TAD3;
        i++;

        System.out.println();
        System.out.println("Enter Item-"+i);
        Item4 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity4 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price4 = sc.nextFloat();
        Total4 = (float)(Quantity4*Price4);
        TAD4 = Total4;
        GrandTotal = GrandTotal+TAD4;
        i++;
    
        System.out.println();
        System.out.println("Enter Item-"+i);
        Item5 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity5 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price5 = sc.nextFloat();
        Total5 = (float)(Quantity5*Price5);
    
        /* on 5th product purchase you have to offer 10% discount on totalprice.*/
           TAD5 = Total5 -((Total5*10.0f)/100);
        GrandTotal = GrandTotal+TAD5;
        i++;
    
        System.out.println();
        System.out.println("Enter Item-"+i);
        Item6 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity6 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price6 = sc.nextFloat();
        Total6 = (float)(Quantity6*Price6);
        TAD6 = Total6;
        GrandTotal = GrandTotal+TAD6;
        i++;
    
        System.out.println();
        System.out.println("Enter Item-"+i);
        Item7 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity7 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price7 = sc.nextFloat();
        Total7 = (float)(Quantity7*Price7);
        TAD7 = Total7;
        GrandTotal = GrandTotal+TAD7;
        i++;
    
        System.out.println();
        System.out.println("Enter Item-"+i);
        Item8 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity8 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price8 = sc.nextFloat();
        Total8 = (float)(Quantity8*Price8);
        TAD8 = Total8;
        GrandTotal = GrandTotal+TAD8;
        i++;
    
        System.out.println();
        System.out.println("Enter Item-"+i);
        Item9 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity9 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price9 = sc.nextFloat();
        Total9 = (float)(Quantity9*Price9);
        TAD9 = Total9;
        GrandTotal = GrandTotal+TAD9;
        i++;
    
        System.out.println();
        System.out.println("Enter Item-"+i);
        Item10 = sc.next();
        System.out.println("Enter the Quantity of Item-"+i);
        Quantity10 = sc.nextInt();
        System.out.println("Enter the Price of Item-"+i);
        Price10 = sc.nextFloat();
        Total10 = (float)(Quantity10*Price10);
        /*on 10th product purchase you have to offer 15% discount on total
        price of that product..*/
        TAD10 = Total10 - ((Total10*15.0f)/100);
        GrandTotal = GrandTotal+TAD10;

        /* if Total Bill amount is greater then 10000 then you have
        to offer 15% of total bill amount
        if total Bill amount is between 5000 and 10000 then 
        you have to offer 10% of total bill amount
        */
        if(GrandTotal>10000)
        {
            FinalTAD = GrandTotal-(GrandTotal*15.0f/100);
        }
        else if(GrandTotal>=5000&&GrandTotal<=10000)
        {
            FinalTAD = GrandTotal-(GrandTotal*10.0f/100);
        }
        else
            FinalTAD = GrandTotal;

        //Also 10% GST of total Bill Amount
        GST = FinalTAD*10/100;
        FinalPayableAMT = FinalTAD+GST;

        /*Then you have to ask for carry bag to customer
         if he/she yes then add 10 rupees in total bill amount.
        */
       System.out.println();
        System.out.println("Do you want Carry Bag(Y/N):");
        char Carry = sc.next().charAt(0);
        if(Carry=='Y'||Carry=='y')
            CarryCharge = 10;
        else if(Carry=='N'||Carry=='n')
            CarryCharge = 0;
        else
            CarryCharge = 0;

        /*if the customer is female then you have to gift a Cadeberry
        If the customer is mael then you have to gift a Ladger Wallet
        */
        if(Gander=='M'||Gander=='m')
          gift = "Cadeberry";
        else if(Gander=='Y'||Gander=='y')
          gift = "Ladger Wallet";
        else
          gift = "Null";



        //--------------------------------FORMAT------------------------------------

        System.out.println("\n\n\t\t\tD-Mart");
        System.out.print("Name : "+Name);
        LocalDate myObj = LocalDate.now();
        System.out.println("\t\t\t\tDate : "+ myObj);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Item Name-\t");
        System.out.printf("Quantity\t");
        System.out.printf("Price\t");
        System.out.printf("Total\t");
        System.out.println("After-Discount");
        System.out.println("-----------------------------------------------------------");

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item1,Quantity1,Price1,Total1,TAD1);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item2,Quantity2,Price2,Total2,TAD2);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item3,Quantity3,Price3,Total3,TAD3);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item4,Quantity4,Price4,Total4,TAD4);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item5,Quantity5,Price5,Total5,TAD5);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item6,Quantity6,Price6,Total6,TAD6);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item7,Quantity7,Price7,Total7,TAD7);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item8,Quantity8,Price8,Total8,TAD8);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item9,Quantity9,Price9,Total9,TAD9);

        System.out.printf("%-17s %-14d %-7.2f %-9.2f %-10.2f \n",Item10,Quantity10,Price10,Total10,TAD10);
         
        System.out.println("-----------------------------------------------------------");
        String result;
        System.out.printf("%-40s  A.P%-6sD.P",space,space);System.out.println();
        System.out.printf("%-40s %-8.2f %-8.2f",space,GrandTotal,FinalPayableAMT);System.out.println();
        float Gift =0.0f;
        System.out.printf("Gift : %-33s %-8.2f %-8.2f",gift, Gift, Gift);System.out.println();
        result=(Carry=='Y'||Carry=='y')?"Yes":"NO";
        System.out.printf("Carry Bag : %-30s %-8d %d\n",result,CarryCharge,CarryCharge);System.out.println();
        System.out.printf("GST (10)  %-30s %-8.2f %.2f",space,GST,GST);System.out.println();
        System.out.println("-----------------------------------------------------------");
        float GrandTotalWithout = GrandTotal+CarryCharge+GST;
        float GrandTotalWith = FinalPayableAMT+CarryCharge+GST;

        System.out.printf("%-40s %-8.2f %-8.2f",space,GrandTotalWithout,GrandTotalWith);System.out.println();
         
        System.out.println("\t\t\tThank You\n\t\t\t To Visit\n\t\t\t  D-Mart\n");
        System.out.println("-----------------------------------------------------------");       
    }
}