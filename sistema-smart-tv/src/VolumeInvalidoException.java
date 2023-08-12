public class VolumeInvalidoException extends Exception {
    private int volume;

    public VolumeInvalidoException(int volume) {

        this.volume = volume;
    }

    @Override
    public String getMessage() {

        return "\nvolume "+volume+" invalido! Volume maximo: 100 \n Volume minimo: 0";
    }
}