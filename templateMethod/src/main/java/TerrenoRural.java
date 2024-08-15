public class TerrenoRural extends Terreno {

    @Override
    public float calcularImpostos() {
        float imposto = area * 3;
        return imposto;
    }
}
