import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class airtravel{
    public static void main(String[] args){
        String file = "airtravel.csv";
        String line;
        int sum1=0,sum2=0,sum3=0;
        int i=0;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))){
                        while((line = br.readLine()) != null){
                            if(i!=0){
                                String[] key=(line.split(",");
                             sum1 += Integer.parseInt(key[1].trim());
                            sum2 += Integer.parseInt(key[2].trim());
                             sum3 += Integer.parseInt(key[3].trim());
                            i=i+1;
                        }
                            else{
                                i=i+1;
                            }
                        }
                     }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("No of Fliers \n In 1958:"+(int)(sum1/i)+"\n In 1959:"+(int)(sum2/i)+"\n In 1960:"+(int)(sum3/i));
    }
}
