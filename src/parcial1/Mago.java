package parcial1;

public class Mago extends Aventurero{
    private int mana;
    private static final int MANA_MINIMO = 0;

    public Mago(String codigoIdentificador, String nombre, Rango rango,int mana) {
        super(codigoIdentificador, nombre, rango);
        validarMana(mana);
        this.mana = mana;
    }
    /**
     * valida el mana
     * @param mana valor a validar
     */
    private void validarMana(int mana){
        if(mana < MANA_MINIMO){
            throw new IllegalArgumentException("Mana invalido");
        }
    }
    /**
     * regresa el valor del mana del mago
     * @return valor int de mana
     */
    public int getMana() {
        return mana;
    }
    /**
     * imprime un mensaje de consola de ataque del mago
     */
    @Override
    public void mostrarAtaque() {
        System.out.println("El mago " + nombre + " ataca con: " + poderCombate() + " de poder!");
    }
    /**
     * regresa el valor de poder de combate calculado
     * @return valor calculado de poder
     */
    @Override
    public int poderCombate() {
        return (getMana() + 10);
    }
    /**
     * regresa un String de datos del mago
     * @return String con datos del mago
     */
    @Override
    public String toString() {
        return "Mago: "+ nombre + "\nmana: " + mana + "\nrango:" + rango;
    }
    
    
    
    
            
            
}
