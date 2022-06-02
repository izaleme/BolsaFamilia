import java.util.*;
import java.io.*; 
import java.net.URL;

public class BolsaFamilia{
    private ArrayList<String> bolsasFamilia; 
    
    public BolsaFamilia(){
        bolsasFamilia = new ArrayList<String>();
        try{
            InputStream in = getClass().getClassLoader().getResourceAsStream("bolsaFamilia.csv"); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));   
            StringBuffer sb = new StringBuffer();   
            String line;
            while((line=reader.readLine())!=null){  
                bolsasFamilia.add(line);  
            }  
            reader.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
    
    public ArrayList<String> getBolsasFamilia(){
        return bolsasFamilia;
    }
   
}
