package parcial1;

import java.util.List;

public class Parcial1 {

    public static void main(String[] args) {
        
        GremioAventureros gremio = new GremioAventureros("Guardianes de Eldoria"); 
        try {    
            gremio.agregarAventurero(new Guerrero("G-01", "Arin", Rango.ORO, 30)); 
            gremio.agregarAventurero(new Mago("M-02", "Lyra", Rango.PLATA, 45)); 
            gremio.agregarAventurero(new Arquero("A-03", "Nox", Rango.BRONCE, 18)); 
            gremio.agregarAventurero(new Guerrero("G-04", "Borin", Rango.PLATA, 20)); 
            gremio.agregarAventurero(new Mago("G-01", "Arin", Rango.BRONCE, 99)); 
        } catch (AventureroDuplicadoException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Aventureros registrados:"); 
        mostrarAventureros(gremio.obtenerAventureros()); 
        System.out.println("\nAtaques:"); 
        mostrarAtaques(gremio.obtenerAventureros()); 
        System.out.println("\nEntrenamientos:"); 
        mostrarEntrenamientos(gremio.obtenerAventureros()); 
        System.out.println("\nPoder de combate:"); 
        mostrarPoderes(gremio.obtenerAventureros()); 
        System.out.println("\nAventureros de rango PLATA:"); 
        mostrarAventureros(gremio.filtrarPorRango(Rango.PLATA)); 
        System.out.println("\nAventureros con poder >= 55:"); 
        mostrarAventureros(gremio.obtenerAventurerosPoderosos(55));
        
        
    }
   /**
    * muestra la informacion de cada aventurero de la lista
    * @param aventureros  lista de aventureros
    */
   private static void mostrarAventureros(List<Aventurero> aventureros) {        
       for(Aventurero a : aventureros){
           System.out.println(a.toString());
        }
    } 
   /**
    * muestra el poder de cada aventurero de la lista
    * @param aventureros lista de aventureros
    */
    private static void mostrarAtaques(List<Aventurero> aventureros) { 
        for(Aventurero a : aventureros){
           a.mostrarAtaque();
        }
    } 
    /**
     * muestra que aventureros entrenan
     * @param aventureros lista de aventureros
     */
    private static void mostrarEntrenamientos(List<Aventurero> aventureros) { 
        for(Aventurero a : aventureros){
           if(a instanceof Entrenar e){
               e.entrenar();
           } else {
               System.out.println(a.getNombre() + " no puede entrenar");
           }
        }
    } 
    /**
     * muestra el poder de combate de los aventureros de la lista
     * @param aventureros lista de aventureros
     */
    private static void mostrarPoderes(List<Aventurero> aventureros) { 
        for(Aventurero a : aventureros){
           System.out.println("aventurero " + a.getNombre()+ " " +a.poderCombate() + " de poder");
        }
    }
    
}
