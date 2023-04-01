import org.junit.Assert;
import org.junit.Test;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero(){
        Coche nuevoCoche = new Coche();
        Assert.assertEquals(0,nuevoCoche.velocidad);
    }
}
