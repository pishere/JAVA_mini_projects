package passwordMatching;
import java.io.*;
import java.util.Scanner;

public class PassWord
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("password.txt"); 
      String[] words=null;  
      FileReader fr = new FileReader(f1); 
      BufferedReader br = new BufferedReader(fr); 
      String s; 
      Scanner scanner = new Scanner(System.in);
      String name = scanner.next();
      String input=name;  
      while((s=br.readLine())!=null){
         words=s.split(" "); 
         for (String word : words) {
          	if (word.equals(input))  
          	{
                	 System.out.println("Enter password");
                	 String pass = scanner.next();
                	 while((s=br.readLine())!=null){
                		 words=s.split(" "); 
                         for (String word1 : words) 
                         {
                            for(i=1;i<6;i++){
                                if (word1.equals(pass)){
                                	System.out.println("access granted");
                                	break;
                                }
                                else if(i<6){
                                   System.out.println("try again ,you have"+(6-i)+"chances left");
                                   String pass = scanner.next();                                	
                                }
                               else{
                                    System.out.println("access denied"); 
                                	break;
                                  
                               }
                            }
                         }
                         break;
                	 }
            	}
        }     
      }
   }
}
