package parcial1;

import java.util.ArrayList;
import java.util.List;

public class GremioAventureros {
   
    private final String nombre;
    private final ArrayList<Aventurero> aventureros;

    public GremioAventureros(String nombre) {
        this.nombre = nombre;
        aventureros = new ArrayList<>();
    }
    
    /**
     * verifica si el aventurero esta en la lista
     * @param aventurero lista de aventureros
     * @return true si esta, false sino
     */
    public boolean aventureroPresente(Aventurero aventurero){
        return aventureros.contains(aventurero);
    }
    /**
     * agrega un aventurero a la lista del gremio
     * @param aventurero adventurero a agregar
     * @throw AventureroDuplicadoException si ya esta el aventurero en la lista 
     */
    public void agregarAventurero(Aventurero aventurero){
        if(aventureroPresente(aventurero)){
            throw new AventureroDuplicadoException();
            
        }
        aventureros.add(aventurero);
    }
    /**
     * regresa una lista de aventureros
     * @return lista de aventureros
     */
    public List<Aventurero>obtenerAventureros(){
        return new ArrayList<Aventurero>(aventureros);
    }
    
    /**
     * devuelve una lista de aventureros segun el rango 
     * @param rango valor a comparar en la lista
     * @return lista de aventureros con ese rango
     */
    public ArrayList<Aventurero> filtrarPorRango(Rango rango){
        ArrayList <Aventurero> listaRango = new ArrayList<>();
        
        for(Aventurero a: aventureros){
            if(a.getRango() == rango){
                listaRango.add(a);
            }
            
        }
        return listaRango;
    }
    /**
     * regresa una lista de aventureros que tengan ese poder o mas
     * @param poder valor a comparar
     * @return lista de aventureros que cumplan con la comparacion
     */
    public ArrayList<Aventurero> obtenerAventurerosPoderosos(int poder){
        ArrayList <Aventurero> listaPoder = new ArrayList<>();
        
        for(Aventurero a : aventureros){
            if(a.poderCombate() >= poder){
                listaPoder.add(a);
            }
        }
        return listaPoder;
    }
}
