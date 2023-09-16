import java.util.*;

public class Main {
    public static void Q1(Scanner input) {
        String[] nomes = { "edu", "tutu", "samuca", "pimenta", "ana" };
        int[] notas = { 3, 7, 8, 9, 10 };
        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] >= 7) {
                System.out.print(nomes[i] + " foi aprovado");
            } else {
                System.out.print(nomes[i] + " foi reprovado");
            }
        }
    }

    public static void Q2(Scanner x) {
        System.out.print("");
        int num1 = x.nextInt();
        System.out.print("");
        int num2 = x.nextInt();
        System.out.print(num1 + num2);
    }

    public static void Q3(Scanner x) {
        System.out.print("");
        int num1 = x.nextInt();
        for (int i = 0; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Q4(Scanner x) {
        double alt;
        double aux = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println();
            alt = x.nextDouble();
            aux += alt;
        }
        System.out.println(aux / 5);

    }

    public static void Q5(Scanner x) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void Q6(Scanner x) {
        int i = x.nextInt();
        int aux = 0;
        String num1 = Integer.toString(i);
        for (int a = 0; a < num1.length(); a++) {
            char b = num1.charAt(a);
            if (b % '2' == '0') {
                aux += (int) b;
            }
        }
        System.out.println(aux);
    }

    public static void Q7(Scanner x) {
        int num = x.nextInt();
        String a = Integer.toString(num);
        String a2 = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            a2 += a.charAt(i);
        }
        System.out.println(a2);
    }

    public static void Q8(Scanner x) {
        int i = 0;
        int soma = 0;
        while (i <= 100) {
            i++;
            soma += i;
            System.out.println(soma);
        }
    }

    public static void Q9(Scanner x) {
        int i = 0;
        int multi = 0;
        while (i <= 5) {
            i++;
            multi *= i;
            System.out.println(multi);
        }
    }

    public static void Q10(Scanner x) {
        int i = 0;
        int multi = 0;
        while (i <= 10) {
            multi = i * 9;
            i++;
            System.out.println(multi);
        }
    }

    public static void Q11(Scanner x) {
        int escolha = 1;
        System.out.println();
        int maior = x.nextInt();
        int menor = maior;
        int num1;
        do {
            System.out.println();
            escolha = x.nextInt();
            if (escolha == 0) {
                break;
            } else {
                num1 = x.nextInt();
                if (num1 > maior) {
                    maior = num1;
                } else if (num1 < menor) {
                    menor = num1;
                }
            }
        } while (escolha != 0);
    }

    public static void Q12(Scanner x) {
        int escolha = 0;
        System.out.println();
        int num1 = 0, i = 0;
        do {

            System.out.println();
            escolha = x.nextInt();
            if (escolha != -1) {
                System.out.println();
                num1 = x.nextInt();
                i++;
                System.out.println((num1 / i));
            }
        } while (escolha != -1);
        System.out.println((num1 / i));
    }

    public static void Q13(Scanner x) {
        System.out.println();
        int num = x.nextInt();
        int soma = 0;
        while (num > 0) {
            int dig = num % 10;
            soma += Math.pow(dig, 3);
            num /= 10;
        }
        System.out.println(soma);
    }

    public static void Q14(Scanner x) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void Q15(Scanner x) {
        int i = 0;
        while (i != 51) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void Q16(Scanner x) {
        int a, soma, b, c, d, e, i = 0;
        while (i <= 5) {
            System.out.println((i + 1) + "° aluno");
            a = x.nextInt();
            System.out.println();
            b = x.nextInt();
            System.out.println();
            c = x.nextInt();
            System.out.println();
            d = x.nextInt();
            System.out.println();
            e = x.nextInt();
            soma = (a + b + c + d + e) / 5;
            if (soma >= 7) {
                System.out.println("aprovado");
            } else {
                System.out.println("reprovado");
            }
            i++;
        }
    }

    public static void Q17(Scanner x) {
        int num, cont = 0, cont2 = 0;
        do {
            System.out.println();
            num = x.nextInt();
            if (num % 2 == 0) {
                cont++;
                cont2++;
            } else if (num % 3 == 0) {
                System.out.println(cont);
                System.out.println(cont2);
                cont = 0;
            }
        } while (num != 0);
    }

    public static void Q18(Scanner x) {
        int num, cont = 0, cont2 = 0;
        do {
            System.out.println();
            num = x.nextInt();
            if (num % 2 == 0) {
                cont++;
            } else if (num % 3 == 0) {
                cont2++;
            }
        } while (num != 0);
        System.out.println(cont);
        System.out.println(cont2);
    }

    public static void Q19(Scanner x) {
        int num, cont = 0, cont2 = 0, cont3=0;
        do {
            System.out.println();
            num = x.nextInt();
            if (num % 2 == 0) {
                cont++;
            } 
            if (num % 3 == 0) {
                cont2++;
            }
            if(num%5 ==0){
                cont3++;
            }
        } while (num != 0);
        System.out.println(cont);
        System.out.println(cont2);
        System.out.println(cont3);
    }

    public static void Q20(Scanner x) {
        int num, cont = 0, cont2 =0;
        do {
            System.out.println();
            num = x.nextInt();
           if(num % 3 == 0) {
                cont += num;
                cont2++;
            }
        } while (num != 0);
        System.out.println(cont/cont2);
    }

    public static void Q21(Scanner x) {
         int num;
        do {
            System.out.println();
            num = x.nextInt();
           if(num >999) {
            System.out.println(num);   
        }
        } while (num != 0);
     }

    public static void Q22(Scanner x) {
         int num, cont=0,cont2=0;
        do {
            System.out.println();
            num = x.nextInt();
           if(num>49 && num <101) {
               cont += num;
               cont2++;
                }
        } while (num != 0);
        System.out.println(cont/cont2);
    }

    public static void Q23(Scanner x) {
         int num, menor= -1, aux=0;
        do {
            System.out.println();
            num = x.nextInt();
           if(num%2 != 0) {
               if(aux ==0){
                menor = num;
                aux=0;
               }
               else{
                if(menor> num){
                    menor = num;
                }
               }
            }
        } while (num != 0);
        System.out.println();
    }

    public static void Q24(Scanner x) {
        int num, cont = 0, cont2 = 0;
        do {
            System.out.println();
            num = x.nextInt();
            if (num % 2 == 0) {
                cont++;
            } else if (num % 2!= 0) {
                cont2++;
            }
        } while (num != 0);
        System.out.println(cont);
        System.out.println(cont2);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // Q1(x);
        // Q2(x);
        // Q3(x);
        // Q4(x);
        // Q5(x);
        // Q6(x);
        // Q7(x);
        // Q8(x);
        // Q9(x);
        // Q10(x);
        // Q11(x);
        // Q12(x);
        // Q13(x);
        // Q14(x);
        // Q15(x);
        // Q16(x);
        // Q17(x);
        // Q18(x);
        // Q19(x);
        // Q20(x);
        // Q21(x);
        // Q22(x);
        // Q23(x);
        // Q24(x);
        x.close();
    }
}