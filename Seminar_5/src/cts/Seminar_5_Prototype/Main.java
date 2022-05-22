package cts.Seminar_5_Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz a = new Autobuz("b-237-AAA", "Dorel");
        MijlocTransport a1 = a.copiaza();

        System.out.println("Original: " + a + "\n");
        System.out.println("Copie: " + a1);
    }
}
