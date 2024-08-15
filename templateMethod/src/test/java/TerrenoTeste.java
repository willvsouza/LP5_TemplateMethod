import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TerrenoTeste {

    @Test
    public void deveRetornarValorVendaTerrenoRural() {
        TerrenoRural terrenoRural = new TerrenoRural();
        terrenoRural.setArea(1000);
        terrenoRural.setValorBase(100000);
        float valorVenda = terrenoRural.calcularValorVenda();
        assertEquals(103000, valorVenda, 0);
    }

    @Test
    public void deveRetornarInformacoesTerrenoRural() {
        TerrenoRural terrenoRural = new TerrenoRural();
        terrenoRural.setArea(1000);
        terrenoRural.setValorBase(100000);
        assertEquals("Terreno urbano{area = 1000.0, valor base = '100000.0', resultado=103000.0}", terrenoRural.getInfoTerreno());
    }

    @Test
    public void deveRetornarValorVendaTerrenoUrbano() {
        TerrenoUrbano terrenoUrbano = new TerrenoUrbano();
        terrenoUrbano.setArea(100);
        terrenoUrbano.setValorBase(250000);
        float valorVenda = terrenoUrbano.calcularValorVenda();
        assertEquals(276000, valorVenda, 0);
    }

    @Test
    public void deveRetornarInformacoesTerrenoUrbano() {
        TerrenoUrbano terrenoUrbano = new TerrenoUrbano();
        terrenoUrbano.setArea(100);
        terrenoUrbano.setValorBase(250000);
        assertEquals("Terreno urbano{area = 100.0, valor base = '250000.0', resultado=276000.0}", terrenoUrbano.getInfoTerreno());
    }

}
