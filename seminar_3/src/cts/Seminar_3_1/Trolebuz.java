package cts.Seminar_3_1;

public class Trolebuz extends MijlocTrasnportComun{
    public Trolebuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trolebuz{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
