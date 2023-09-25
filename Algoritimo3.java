import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigInteger;

public class Algoritimo3 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("Simon.txt");
        Scanner myReader = new Scanner(myObj);
        String numeros[] = new String[142];
        int j;
        BigInteger valor = BigInteger.valueOf(0); 
        int total = 0;
        int s = 0; int i = 0; int m = 0; int o = 0; int n = 0; 
        //trocar por ArrayList<>
        String simon[] = new String[40]; String aux[] = new String[40];


        while (myReader.hasNextLine()){
            String d = myReader.nextLine();  
            char[] unico = d.toCharArray(); 
            j=0;
            for(int a = unico.length-1; a>=0; a--){
                if(unico[a] == 'N'){
                    valor = valor.add((-2*(int)Math.pow(5,j)));
                }
                if(unico[a] == 'O'){
                    valor = valor + (-1*(int)Math.pow(5,j));
                }
                if(unico[a] == 'M'){
                    valor = valor + (0*(int)Math.pow(5,j));
                }
                if(unico[a] == 'I'){
                    valor = valor + (1*(int)Math.pow(5,j));
                }
                if(unico[a] == 'S'){
                    valor = valor + (2*(int)Math.pow(5,j));
                }
                j++;
            } 
            
        }
        System.out.println(valor);

        //while(total != valor){
        //testar fora do while por enqnt
        //TA DANDO OVERFLOW 
            while(total<valor){
            total = total + (2*(int)Math.pow(5,s));
            s++;
            }
            System.out.println(s);
            System.out.println(total);
            simon[s] = "S";

            System.out.println(total);

            while(total>valor){
            total = total + (-2*(int)Math.pow(5,n));
            n++;
            }
            simon[n] = "N";

            while(total>valor){
            total = total + (-1*(int)Math.pow(5,o));
            o++;
            }
            simon[o] = "O";
            
            while(total<valor){
            total = total + (1*(int)Math.pow(5,i));
            i++;
            }
            simon[i] = "I";

        //}
        for(j=0; j<40; j++){
            for(int x=39; x>=0; x--){
                aux[x] = simon [j];
                simon [j] = aux[j];
            }
        }

        for(int x=0; x<40; x++){
            if(simon[x].equals(null)){
                simon[x] = "M";
            }
        }
        myReader.close();
    }  
}
