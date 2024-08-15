public abstract class Terreno {

    protected float area;
    protected float valorBase;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getValorBase() {
        return valorBase;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public float calcularValorVenda() {
        float valorImpostos = calcularImpostos();
        float valorFinal = calcularValorFinal(valorImpostos);
        return valorFinal;
    }

    public abstract float calcularImpostos();

    public float calcularValorFinal(float valorImpostos) {
        return valorBase + valorImpostos;
    }

    public String getTipoTerreno() {
        return "Terreno urbano";
    }

    public String getInfoTerreno() {
        return getTipoTerreno() + "{" +
                "area = " + this.area +
                ", valor base = '" + this.valorBase + '\'' +
                ", resultado=" + this.calcularValorVenda() +
                '}';
    }
}
