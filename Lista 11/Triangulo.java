public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        validarDimensoes();
    }

    private void validarDimensoes() throws DimensoesInvalidasException {
        if (!(Math.abs(lado2 - lado3) < lado1 && lado1 < lado2 + lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para um triângulo");
        } else if (!(Math.abs(lado1 - lado3) < lado2 && lado2 < lado1 + lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para um triângulo");
        } else if (!(Math.abs(lado1 - lado2) < lado3 && lado3 < lado1 + lado2)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para um triângulo");
        }
    }

    public void setLados(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        validarDimensoes();
    }

    public double[] getLados() {
        return new double[]{lado1, lado2, lado3};
    }

    public static void main(String[] args) {
        try {
            Triangulo triangulo1 = new Triangulo(3, 4, 5);
            triangulo1.setLados(10, triangulo1.getLados()[1], triangulo1.getLados()[2]);
            try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
                System.out.print("Digite o primeiro lado do triângulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Digite o segundo lado do triângulo: ");
                double lado2 = scanner.nextDouble();
                System.out.print("Digite o terceiro lado do triângulo: ");
                double lado3 = scanner.nextDouble();
                Triangulo triangulo2 = new Triangulo(lado1, lado2, lado3);
            }

        } catch (DimensoesInvalidasException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}