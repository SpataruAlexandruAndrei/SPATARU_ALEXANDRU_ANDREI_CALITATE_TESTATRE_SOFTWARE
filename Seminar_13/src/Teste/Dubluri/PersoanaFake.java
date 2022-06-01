package Teste.Dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String sex;
    private int vartsa;
    private boolean checkCNP;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVartsa(int vartsa) {
        this.vartsa = vartsa;
    }

    public void setCheckCNP(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return vartsa;
    }

    @Override
    public boolean checkCNP() {
        return checkCNP;
    }
}
