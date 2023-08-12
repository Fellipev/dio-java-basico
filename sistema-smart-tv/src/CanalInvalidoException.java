public class CanalInvalidoException extends Exception{
    
    private int canal;

    public CanalInvalidoException(int canal) {
        this.canal = canal;
    }

    @Override
    public String getMessage() {

        return "\nCanal " + canal +" invalido! canal maximo: 300\n canal minimo: 0";
    }
}
