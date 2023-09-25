import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Algoritimo4 {
    public static void main(String[] args) throws FileNotFoundException {
        int ciclos[] = new int[301];
        File myObj = new File("futminimo.txt");
        Scanner myReader = new Scanner(myObj);
        String par[] = new String[148];
        String aux;

        int index = 1;
        int auxF = 0;
        int x = 1;
        int j = 1;
        int forcaS = 0;

        while (myReader.hasNextLine()){
            String d = myReader.nextLine();  
            par[index] = d;
            //System.out.println(par[index]);
            index++; 
        }


        for(int i=1; i<147; i++){

            aux = par[i].substring(0,4);
            if(j>300){  continue; }
            //if(j>239){  break; }
            

            if(aux.equals("addx")){
                j++; 
                ciclos[j] = x;
                x = x + Integer.parseInt(par[i].substring(5));
                j++;
                ciclos[j] = x;
            }
            if(par[i].substring(0,4).equals("noop")){
                j++;
                ciclos[j] = x;
            }
        }

        for(int i=20; i<=240; i++){
            auxF = (ciclos[i]*i);
            forcaS = forcaS + (ciclos[i]*i);
            System.out.println("ciclo:" +i+" resultado:"+ciclos[i]+" Força:"+auxF);
            i = i + 39;
        }
        
        System.out.println(forcaS);
        myReader.close();;
    }
    
}
