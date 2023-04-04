import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double fahrenheit,celsius;
        
        System.out.println("digite a temperatura em Celsius ?");
        celsius = entrada.nextDouble();
        
        fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("a temperatura em fahrenheit é: " + fahrenheit );
        entrada.close();
    }
}
