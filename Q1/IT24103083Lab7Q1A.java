import java.util.Scanner;
   public class IT24103083Lab7Q1A{
     public static void main(String[] args) {
      
     	  Scanner scanner=new Scanner (System.in);
          int subject1,subject2,subject3,subject4;

          System.out.print("Enter subject Mark 1:");
           subject1=scanner.nextInt();
          
          System.out.print("Enter subject Mark2:");
          subject2=scanner.nextInt();

          System.out.print("Enter subject Mark3:");
          subject3=scanner.nextInt();
    
          System.out.print("Enter subject Mark4:");
           subject4=scanner.nextInt();
       
         double average;
           average=(subject1 + subject2 + subject3 + subject4)/4.0;
          
           if
            (average>=75 && average <=100){
             System.out.println("Overall Grade is:Distinction");
         
           } else if
              (average>=50 && average <=75){
               System.out.println("Overall Grade is:Credit");
          
          } else if
              (average>=0 && average <=50){
              System.out.println("Overall Grade is:Fail");
        
          }else
             
          {  
             System.out.println("Invalid average");
          }
      
       
     

     
    }
}  
       
  

    
     
     
     
     
   
