import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora Geométrica");
        System.out.println("Por favor elija la figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        int figura = scanner.nextInt();

        switch (figura) {
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularCuadrado(scanner);
                break;
            case 3:
                calcularTriangulo(scanner);
                break;
            case 4:
                calcularRectangulo(scanner);
                break;
            case 5:
                calcularPentagono(scanner);
                break;
            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        mostrarResultados(area, perimetro);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double perimetro = 4 * lado;
        mostrarResultados(area, perimetro);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        // En este caso, el perímetro no se puede calcular sin más datos.
        mostrarResultados(area, Double.NaN);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        mostrarResultados(area, perimetro);
    }

    private static void calcularPentagono(Scanner scanner) {
        System.out.println("Ingrese la longitud de un lado del pentágono:");
        double lado = scanner.nextDouble();
        System.out.println("Ingrese la apotema del pentágono:");
        double apotema = scanner.nextDouble();
        double area = (5 * lado * apotema) / 2;
        double perimetro = 5 * lado;
        mostrarResultados(area, perimetro);
    }

    private static void mostrarResultados(double area, double perimetro) {
        System.out.println("Resultados:");
        if (!Double.isNaN(area)) {
            System.out.println("Área: " + area);
        }
        if (!Double.isNaN(perimetro)) {
            System.out.println("Perímetro: " + perimetro);
        }
    }
}

