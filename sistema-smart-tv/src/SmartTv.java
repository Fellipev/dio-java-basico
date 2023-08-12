public class SmartTv {

    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv() {

        this.ligada = false;
    }

    public SmartTv(int canal, int volume) {

        this.ligada = false;
        this.canal = canal;
        this.volume = volume;
    }

    public void setLigada(boolean ligada) {

        this.ligada = ligada;
    }

    public boolean getLigada() {

        return this.ligada;
    }

    public void setCanal(int canal) {

        this.canal = canal;
    }

    public int getCanal() {

        return this.canal;
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }

    public int getVolume() {

        return this.volume;
    }

    public void mudarVolume(int volume) throws VolumeInvalidoException{

        if (volume < 0 || volume > 100) {
            throw new VolumeInvalidoException(volume);
        } else {
            this.volume = volume;
        }
    }

    public void mudarCanal(int canal) throws CanalInvalidoException{
        
        if (canal < 0 || canal > 300) {
            throw new CanalInvalidoException(canal);
        } else {
            this.canal = canal;
        }
    }

    
    @Override
    public String toString() {
        String s = "A TV esta " + (ligada ? "Ligada" : "Desligada");
        if (ligada) {
            s += "\nCanal: " + canal;
            s += "\nVolume: " + volume;
        }

        return s;
    }
}