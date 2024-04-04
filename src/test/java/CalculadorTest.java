import org.example.Calculador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {
    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum(){
        // Arrange
        Calculador calculador1 = new Calculador();

        int numeroA = 2147483647;
        int numeroB = 1;

        long resultado = (long)calculador1.sumar(numeroA,numeroB);
        // Act
        if(resultado >= 2147483647){
            System.out.println("Ocurrio un overflow");
        }else{
            assertEquals(2147483647+1,resultado,"2147483647 + 1 deberia ser 2147483648");
        }

    }

    @Test
    public void testSum_NegativeNumbers_ShouldReturnCorrectSum(){

        Calculador calculator2 = new Calculador();

        int numeroA = -14;
        int numeroB = -1;

        long resultado2 = (long)calculator2.sumar(numeroA,numeroB);

        if(resultado2 <= -2147483647){
            System.out.println("Ocurrio un overflow");
        }else{
            assertEquals(-15,resultado2,"-14 + -1 deberia ser -15");
        }
    }

    @Test
    public void testRes_PositiveNumbers_ShouldReturnCorrectRes(){

        Calculador calculator3 = new Calculador();

        int numeroA = 15;
        int numeroB = 5;

        int resultado3 = calculator3.restar(numeroA,numeroB);

        if(resultado3 <= -2147483647 || resultado3 >= 2147483647){
            System.out.println("Ocurrio un overflow");
        }else{
            assertEquals(10, resultado3, "El resultado deberia ser 10");
        }

    }

    @Test
    public void testRes_NegativeNumbers_ShouldReturnCorrectRes(){

        Calculador calculator4 = new Calculador();

        int numeroA = -15;
        int numeroB = -5;

        int resultado4 = calculator4.restar(numeroA,numeroB);

        if(resultado4 <= -2147483647){
            System.out.println("Ocurrio un overflow");
        }else{
            assertEquals(-10,resultado4,"El resultado deberia ser -10");
        }

    }

    @Test
    public void testMul_PositiveNumbers_ShouldReturnCorrectMul(){

        Calculador calculator5 = new Calculador();

        int numeroA = 15;
        int numeroB = 5;

        int resultado5 = calculator5.multiplicacion(numeroA,numeroB);

        if(resultado5 >= 2147483647){
            System.out.println("Ocurrio un desbordamiento");
        }else{
            assertEquals(75,resultado5,"15 * 5 deberia ser 75");
        }
    }

    @Test
    public void testMul_NegativeNumbers_ShouldReturnCorrectMul(){

        Calculador calculator6 = new Calculador();

        int numerA = -24;
        int numeroB = -24;

        int resultado6 = calculator6.multiplicacion(numerA,numeroB);

        if(resultado6 >= 2147483647){
            System.out.println("Ocurrio un desbordamiento");
        }else{
            assertEquals(576,resultado6,"15 * 5 deberia ser 75");
        }
    }

    @Test
    public void testDiv_PositiveNumbers_ShouldReturnCorrectDiv(){

        Calculador calculator7 = new Calculador();

        int numeroA = 15;
        int numeroB = 5;

        double resultado7 = calculator7.division(numeroA,numeroB);

        try {
            assertEquals(3,resultado7,"El resultado deberia ser 3");
        }catch (ArithmeticException e){
            System.out.println("Division por cero");
        }
    }

    @Test
    public void testDiv_NegativeNumbers_ShouldReturnCorrectDiv(){

        Calculador calculator8 = new Calculador();

        int numeroA = -15;
        int numeroB = -3;

        double resultado8 = calculator8.division(numeroA,numeroB);

        try {
            assertEquals(5,resultado8,"El resultadodeberia ser 5");
        }catch (ArithmeticException e){
            System.out.println("Division por cero");
        }
    }

}
