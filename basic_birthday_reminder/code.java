package birthday;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class birthday {
   public static void main(String[] args)throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");  
	    Date date = new Date();  
	    System.out.println("Today's Date is "+formatter.format(date)+"\nThese people have birthday today ");
        File f1=new File("bdfile.txt");
        String[] words=null;  
        FileReader fr = new FileReader(f1);  
        @SuppressWarnings("resource")
	    BufferedReader br = new BufferedReader(fr);
        String s;     
        while((s=br.readLine())!=null){
    	    words=s.split(" ");  
            for (String word : words){
        	        if (word.equals(formatter.format(date))){
                	        while((s=br.readLine())!=null){
                 		        words=s.split(" "); 
                                for (String word1 : words){
                        	        System.out.println("happy birthday "+ word1);
                                }break;
                            }
                    }
            }
        }
    }
}
