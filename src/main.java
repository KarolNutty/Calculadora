import java.util.Scanner;


public class main {

    public static void main(String[] args){

        Scanner sacnner =  new Scanner(System.in);

        int opcao;

        do {

            System.out.println("Calculadora Java");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            opcao = sacnner.nextInt();

            if (opcao >= 1 && opcao <= 4){
                System.out.println("Digite o primeiro número: ");
                double num1 =  sacnner.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 =  sacnner.nextDouble();

                double resultado = 0;

                boolean operacaoValida =  true;

                switch (opcao){
                    case 1:
                        resultado = adicionar(num1, num2);

                        break;
                    case 2:
                        resultado = subtrair(num1, num2);

                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);

                        break;
                    case 4:
                        resultado = dividir(num1, num2);

                        if (num2 != 0){
                            resultado = dividir(num1, num2);

                        }else{
                            System.out.println("Divisão por 0! ");
                            operacaoValida =  false;
                        }

                        break;

                    default:
                        operacaoValida = false;
                        break;
                }


                if (operacaoValida){
                    System.out.println("Resultado: "+ resultado);
                }



            } else if (opcao != 0) {
                System.out.println("Opção Inválida.");

            }

        }while (opcao != 0);

        System.out.println("Calculadora encerrada!");
        sacnner.close();

    }

    public static double adicionar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }
}