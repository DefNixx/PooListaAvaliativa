/*
 * Atividade número 7 da lista de pooII
 * 
 * @authors Nícolas André e Jefferson Eduardo 
 */

public class Main 
{
    public static void main(String args[]) 
   { 
      Ave ave = new Ave(); 
      PatoDeBorracha pato = new PatoDeBorrachaImpl(); 
  
      // Faz pato de borracha ter comportamento de ave
      AveDeBorracha adaptador = new Adaptador(ave); 
  
      System.out.println("Ave..."); 
      ave.voar(); 
      ave.emitirSom(); 
  
      System.out.println("Pato de Borracha..."); 
      pato.queckQueck(); 
  
      // Pato de borracha agindo como ave 
      System.out.println("Adaptador de ave..."); 
      adaptador.queckQueck(); 
   } 

}
