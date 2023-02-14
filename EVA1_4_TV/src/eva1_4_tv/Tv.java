/*

 */
package eva1_4_tv;

/**

 */
public class Tv {
    
  private int volumen;  
  private int canal;
  private boolean poder;
  //constructores
   
  public Tv (){
  volumen = 0;
  canal = 0;
  poder = false; //apagado
}
  //métodos para operar la tv (interfaz)
  
  public void cambiarEstadoPoder (){
    //verificar el estado de la TV
    if (poder==true){
     poder = false;
     System.out.println("Apagando pantalla.");
  } else {
   poder = true; 
   System.out.println("Encendiendo pantalla.");
    }
 }

  public void subirVolumen(){
      if (poder== true){
         if (volumen < 100){
         volumen ++; //acumulador
      System.out.println("Volumen: " +volumen);           
       } 
     }
  }
  
  public void bajarVolumen(){
    if (poder == true){
       if (volumen > 0){
        volumen--;
      System.out.println("Volumen: " +volumen);    
      }   
   } 
  }
  
  public void cambioMaCanal(){
   if (poder == true){
    canal++;
   System.out.println("Canal: " +canal);
     if (canal >100){
         canal=0;
     System.out.println("Canal: " +canal);
     }
   }
  }
  
  public void cambioMeCanal(){
    if (poder == true){
     canal--; 
     if (canal < 0){
      canal=100;
   System.out.println("Canal: " +canal);
      }   
    }
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
