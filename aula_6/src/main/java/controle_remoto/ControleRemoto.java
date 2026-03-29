package controle_remoto;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }

    private boolean isLigado(){
        return ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean isTocando(){
        return tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void deligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("=====MENU=====");
        System.out.println("Está Ligado?\n" + this.isLigado());
        System.out.println("Está tocando?\n" + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i=0; i <= this.getVolume(); i += 10){
            System.err.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado() == true){
            this.setVolume(this.getVolume() + 10);
        }else{
            System.out.println("Impossível aumentar");
        }
    }

    @Override
    public void menosVolume() {
                if (isLigado() == true){
            setVolume(getVolume() - 10);
        }else{
            System.out.println("Impossível diminuir");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void deligarMudo() {
        if (this.isLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() == true && this.isTocando() == false){
            this.setTocando(true);
        }else{
            System.out.println("Impossível reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() == true && this.isTocando() == true){
            this.setTocando(false);
        }else {
            System.out.println("Impossível pausar");
        }
    }
}