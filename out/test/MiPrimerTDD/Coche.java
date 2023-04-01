public class Coche {
    public int velocidad;

    public void acelerar_jorgeSelva (int aceleracion){
        velocidad += aceleracion;
    }
    public void decelerar_jorgeSelva (int deceleracion){
        velocidad -= deceleracion;
        if (velocidad < 0) velocidad = 0;
    }
}
