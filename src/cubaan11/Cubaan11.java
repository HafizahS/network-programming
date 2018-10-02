/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubaan11;

/**
 *
 * @author HAFIZAH
 */
import java.io.*;
import java.util.*;

public class Cubaan11 {

	public static void main(String[] args) throws FileNotFoundException {
 
        ArrayList<String> revFile = new ArrayList<>();

        File sourceFile=new File("C:/Users/HAFIZAH/Documents/study/MSc/uitm/sem3/network programming/A.CSV");
        Scanner content=new Scanner(sourceFile);
        PrintStream ps = new PrintStream(new File("B.txt"));
            while (content.hasNextLine()){
                revFile.add(content.nextLine()); 
            }
            for(int i = (revFile.size()-1); i >=0 ; i--){
                String ar[]=revFile.get(i).split(" ");

                for(int j = (ar.length-1); j >=0; j--){
                
                    
                    
                    System.setOut(ps); 
                    System.out.println(ar[j] + " "); 
              
                                    }
                
                System.out.println(" ");
                ar=null;
            }

            content.close();
            ps.close();
            System.out.println(" ");
        }
        
	
}
	