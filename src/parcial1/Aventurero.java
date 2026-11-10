package parcial1;

import java.util.Objects;

public abstract class Aventurero {
    
    protected String codigoIdentificador;
    protected String nombre;
    protected Rango rango;

    public Aventurero(String codigoIdentificador, String nombre, Rango rango) {
        validarIdentificador(codigoIdentificador);
        validarNombre(nombre);
        validarRango(rango);
        this.codigoIdentificador = codigoIdentificador;
        this.nombre = nombre;
        this.rango = rango;
    }
    /**
     * devuelve el codigo de identificacion del aventurero
     * @return codigo de identificacion en String 
     */
    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }
    /**
     * devuelve el nombre del aventurero
     * @return nombre en formato String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * devuelve el rango del aventurero
     * @return rango de tipo Rango
     */
    public Rango getRango() {
        return rango;
    }
    /**
     * Verifica que el valor de identificación no sea nulo ni esté en blanco.
     * @param codigo valor del identificador 
     * @throws @throws IllegalArgumentException si es nulo o viene vacio
     */
    protected void  validarIdentificador(String codigo){
        if(codigo == null || codigo.isBlank() || codigo.isEmpty()){
            throw new IllegalArgumentException("identificador invalido");
        }
    }
    /**
     * valida el nombre
     * @param nombre valor del nombre
     * @throws @throws IllegalArgumentException si es nulo o viene vacio
     */
    protected void  validarNombre(String nombre){
        if(nombre == null || nombre.isBlank() || nombre.isEmpty()){
            throw new IllegalArgumentException("nombre invalido");
        }
    }
    /**
     * valida el rango
     * @param rango  valor del rango
     * @throws @throws IllegalArgumentException si es nulo
     */
    protected void  validarRango(Rango rango){
        if(rango == null){
            throw new IllegalArgumentException("rango invalido");
        }
    }
    
    /**
     * compara este aventurero con otro para ver si son identicos
     * @param obj aventurero a comparar
     * @return true si son iguales, false si no lo son
     */
    public boolean equals(Object obj){
    
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(obj instanceof Aventurero otro){
            return codigoIdentificador.equals(otro.codigoIdentificador) && nombre.equals(otro.nombre);
        }
        return false;
    }

    @Override
    public int hashCode() {
         return Objects.hash(codigoIdentificador,nombre);
    }
    /**
     * devuelve un texto con informacion del aventurero
     * @return String con datos del aventurero
     */
    @Override
    public String toString() {
        return "Aventurero: "+ nombre + "\ncodigoIdentificador: " + codigoIdentificador +"\nrango: " + rango;
    }
    
    
    /**
     * muestra el ataque del aventurero
     */
    public abstract void mostrarAtaque();
    /**
     * calcula el poder de combate segun su estadistica de clase
     * @return el poder calculado
     */
    public abstract int poderCombate();
    
    
    
}
