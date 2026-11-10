package parcial1;

public class Guerrero extends Aventurero implements Entrenar {
    private int fuerza;
    private static final int FUERZA_MINIMA = 0;

    public Guerrero(String codigoIdentificador, String nombre, Rango rango,int fuerza) {
        super(codigoIdentificador, nombre, rango);
        validarFuerza(fuerza);
        this.fuerza = fuerza;
    }
    /**
     * valida la fuerza 
     * @param fuerza valor a validar
     */
    private void validarFuerza(int fuerza){
        if(fuerza < FUERZA_MINIMA){
            throw new IllegalArgumentException("fuerza invalida");
        }
    }
    /**
     * regresa la fuerza 
     * @return valor int de fuerza
     */
    public int getFuerza() {
        return fuerza;
    }
    /**
     * imprime un mensaje que el aventurero entrena
     */
    @Override
    public void entrenar() {
        System.out.println("El guerrero " + nombre + " esta entrenando!");
    }
    /**
     * imprime un mensaje de ataque
     */
    @Override
    public void mostrarAtaque() {
        System.out.println("El guerrero " + nombre + "ataca con " +  poderCombate() + " de poder!");
    }
    /**
     * calcula y devuelve el valor de poder de combate
     * @return valor calculado de poder decombate
     */
    @Override
    public int poderCombate() {
        return (fuerza * 2);
    }
    /**
     * regresa un String con datos del guerrero
     * @return datos del guerrero en formato String
     */
    @Override
    public String toString() {
        return "Guerrero: "+ nombre + "\nfuerza: " + fuerza + "\nrango:" + rango;
    }
    
    
    
    
    
    
    
    
    
    
}
