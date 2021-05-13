package desafio8exer1resposta;
/**
 *
 * @author Felipe
 */
public class Desafio8EXER1resposta {
   
    /*  Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé 
    tem 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo 
    que calcule e imprima quantos anos serão necessários para que Zé 
    seja maior que Chico.*/
    public static void main(String[] args) {
        double contChico, contZe, anos;
        contChico = 150;
        contZe = 110;
        anos = 0;
        while (contChico >= contZe) {
            contChico = contChico + 2;
            contZe  = contZe + 3;
            anos++;
            
        }//fim do loop
        System.out.println("Zé levou " + anos + " anos para ser" + "maior que Chico");
    }
    
}
