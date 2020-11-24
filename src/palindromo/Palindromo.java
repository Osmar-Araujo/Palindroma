
package palindromo;
import java.util.*;

public class Palindromo {
    Scanner entrada = new Scanner(System.in);
   
    public void verifcaPalindromo(){
        String contra = "";
        
        System.out.println("Digite uma palavra para verificar se é palindroma: ");
        String palavra = entrada.nextLine();
        
        for (int i = (palavra.length()-1); i >= 0; i--){
            contra = contra + palavra.charAt(i);
        }
        
        if (contra.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("Essa palavra é Palindroma.");
        } else {
            System.out.println("Essa não é uma palavra Palindroma.");
        }
    }    
    
    public static void main(String[] args) {
        Palindromo plm = new Palindromo();
        plm.verifcaPalindromo();
    }
}
