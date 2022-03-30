package cts.Seminar_3;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz a = new Autobuz("b-237-AAA", "Dorel");
        MijlocTransport a1 = a.copiaza();

        System.out.println("Original: " + a + "\n");
        System.out.println("Copie: " + a1);
    }
}
