public class datos {
    /**
     * es el numero que se tiene que adivinar previamente generado aleatoriamente
     */
    private int numeroAleatorio;
    /**
     * es el numero que introducira el jugador y se comparara con el generado aleatoriamente para ver si es correcto
     */
    private int numeroJugador;
    /**
     * son los intentos que ha hecho al jugador que se iran mostrando por pantalla a medida que valla fallando
     */
    private int numeroIntentos;
    /**
     * es el menor numero de intentos que ha tardado el jugador en adivinar el numero
     */
    private int record;
    /**
     * es el nombre del jugador
     */
    private String nombreJugador;


    /**
     * Singleton
     */
    private static datos instance = null;


    /**
     * constructor parmetrizado con todos los datos anteriores
     */
    public datos() {
        this.numeroAleatorio = numeroAleatorio;
        this.numeroJugador = numeroJugador;
        this.numeroIntentos = numeroIntentos;
        this.record = record;
        this.nombreJugador = nombreJugador;
    }

    /**
     * @return numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * @param numeroAleatorio
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    /**
     * @return numeroJugador
     */
    public int getNumeroJugador() {
        return numeroJugador;
    }

    /**
     * @param numeroJugador
     */
    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    /**
     * @return numeroIntentos
     */
    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    /**
     * @param numeroIntentos
     */
    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    /**
     * @return record
     */
    public int getRecord() {
        return record;
    }

    /**
     * @param record
     */
    public void setRecord(int record) {
        this.record = record;
    }

    /**
     * @return nombreJugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * @param nombreJugador
     */
    public void setNombreJugador( String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public static datos getInstance(){

        if(instance == null){
            instance = new datos();
        }
        return instance;
    }

}