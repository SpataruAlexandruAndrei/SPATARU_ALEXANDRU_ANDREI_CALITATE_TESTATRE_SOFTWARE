package cts.Seminar_3_1;

public class Autobuz extends MijlocTrasnportComun{
    public Autobuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
