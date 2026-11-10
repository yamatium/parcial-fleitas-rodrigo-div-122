package parcial1;

public class Arquero extends Aventurero implements Entrenar{
    private int precision;
    private static final int PRECISION_MINIMA = 0;

    public Arquero(String codigoIdentificador, String nombre, Rango rango,int precision) {
        super(codigoIdentificador, nombre, rango);
        validarPrecision(precision);
        this.precision = precision;
    }
    
    /**
     * verifica que la precisión sea mayor que cero.
     * @param precision  valor a validar
     */
    private void validarPrecision(int precision){
        if(precision < PRECISION_MINIMA){
           throw new IllegalArgumentException("precision invalida");
        }
    }
    /**
     * devuelve la precision del arquero
     * @return el valor de precision
     */
    public int getPrecision() {
        return precision;
    }
    /**
     * implementa el metodo entrenar
     */
    @Override
    public void entrenar() {
        System.out.println("El arquero " + nombre + " esta entrenando!");
    }
    /**
     * muestra el ataque 
     */
    @Override
    public void mostrarAtaque() {
        System.out.println("El arquero " + nombre + "ataca con " +  poderCombate() + " de poder!");
    }
    /**
     * calcula el poder de combate del arquero
     * @return poder calculado
     */
    @Override
    public int poderCombate() {
        return (precision * 3);
    }
    /**
     * regresa un texto describiendo al arquero creado
     * @return datos del arquero en String
     */
    @Override
    public String toString() {
        return "Arquero: "+ nombre + "\nprecision: " + precision + "\nrango:" + rango;
    }
    
    
    
    
    
}
