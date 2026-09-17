//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float IVA_MEXICO = 0.16f;
        float precio = 100.0f;
        float precioConIVA = precio + (precio * IVA_MEXICO);
        System.out.println("Precio con IVA: " + precioConIVA);
    }
}