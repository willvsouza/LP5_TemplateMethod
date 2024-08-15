public class TerrenoUrbano extends Terreno {

    @Override
    public float calcularImpostos() {
        float imposto = area * 10;
        return imposto;
    }

    @Override
    public float calcularValorFinal(float valorImpostos) {
        return valorBase * 1.1f + valorImpostos;
    }
}
