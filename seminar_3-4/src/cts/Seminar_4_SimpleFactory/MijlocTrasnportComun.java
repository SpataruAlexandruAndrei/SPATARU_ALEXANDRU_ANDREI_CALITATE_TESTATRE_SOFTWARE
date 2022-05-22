package cts.Seminar_4_SimpleFactory;

public abstract class MijlocTrasnportComun {
    String numarInmatriculare;

    public MijlocTrasnportComun(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        return sb.toString();
    }
}
