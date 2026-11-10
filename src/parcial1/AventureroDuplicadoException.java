package parcial1;


public class AventureroDuplicadoException extends RuntimeException {

    public static final String MESSAGE = "Ya existe un aventurero con el mismo codigo y nombre.";

    /** Crea la excepción con el mensaje por defecto. */
    public AventureroDuplicadoException() {
        this(MESSAGE);
    }

    /**
     * Crea la excepción con un mensaje personalizado.
     * @param mensaje descripción del error
     */
    public AventureroDuplicadoException(String mensaje) {
        super(mensaje);
    }
}