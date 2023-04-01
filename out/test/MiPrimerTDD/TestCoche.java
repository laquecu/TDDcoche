import org.junit.Assert;
import org.junit.Test;

public class TestCoche {
    @Test
    public void test_crear_coche_jorgeSelva(){
        Coche nuevoCoche = new Coche();
    }
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero_jorgeSelva(){
        Coche nuevoCoche = new Coche();
        Assert.assertEquals(0,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_jorgeSelva(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_jorgeSelva(30);
        Assert.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_jorgeSelva(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_jorgeSelva(20);
        Assert.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_jorgeSelva(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_jorgeSelva(80);
        Assert.assertEquals(0,nuevoCoche.velocidad);
    }
}
