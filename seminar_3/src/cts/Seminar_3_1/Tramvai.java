package cts.Seminar_3_1;

public class Tramvai extends MijlocTrasnportComun{
    public Tramvai(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
