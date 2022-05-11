package cts.command;

public class ComandaPlecareTraseu implements Comanda{
    private int linie;
    private Autobuz autobuz;

    public ComandaPlecareTraseu(int linie, Autobuz autobuz) {
        this.linie = linie;
        this.autobuz = autobuz;
    }


    @Override
    public void executa() {
        autobuz.pleacaPeTraseu(linie);
    }
}
