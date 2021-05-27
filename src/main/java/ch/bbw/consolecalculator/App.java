package ch.bbw.consolecalculator;

/**
 * Console Calculator App
 * @author Peter Rutschmann
 * @version 0.0.1
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;
        
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        
        valueA = 10;
        valueB = 20;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(10, 20));

        valueA = 12;
        valueB = 5;
        System.out.println("Subthraktion " + valueA + " - " + valueB + " = " + calculator.subtraktion(valueA, valueB));

        valueA = 4;
        valueB = 3;
        System.out.println("Division " + valueA + " - " + valueB + " = " + calculator.division(valueA, valueB));
    }
}
