package sistemalogisticofinal;


public class Transportadora {

//Atributos
    private String nomeRemetente;
    private String nomeClienteDestino;
    private float volumeCarga ;
    private float distancaoCidadeDestino;
//Contructor
    
    public Transportadora(){
        
    }
    
    public Transportadora(String nomeRemetente, String nomeClienteDestino, float volumeCarga, float distancaoCidadeDestino) {
        this.nomeRemetente = nomeRemetente;
        this.nomeClienteDestino = nomeClienteDestino;
        this.volumeCarga = volumeCarga;
        this.distancaoCidadeDestino = distancaoCidadeDestino;
    }
    
//Metodos

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public String getNomeClienteDestino() {
        return nomeClienteDestino;
    }

    public void setNomeClienteDestino(String nomeClienteDestino) {
        this.nomeClienteDestino = nomeClienteDestino;
    }

    public float getVolumeCarga() {
        return volumeCarga;
    }

    public void setVolumeCarga(float volumeCarga) {
        this.volumeCarga = volumeCarga;
    }

    public float getDistancaoCidadeDestino() {
        return distancaoCidadeDestino;
    }

    public void setDistancaoCidadeDestino(float distancaoCidadeDestino) {
        this.distancaoCidadeDestino = distancaoCidadeDestino;
    }

//ToString

    @Override
    public String toString() {
        return "Transportadora{" + "nomeRemetente=" + nomeRemetente + ", nomeClienteDestino=" + nomeClienteDestino + ", volumeCarga=" + volumeCarga + ", distancaoCidadeDestino=" + distancaoCidadeDestino + '}' + "\n";
    }
    
    public String getString() {
        return toString();
    }
  

}
