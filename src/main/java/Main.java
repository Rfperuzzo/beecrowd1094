
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cp, rp, sp;
        int i = 1, n, quantidade, quantidadeT, coelho = 0, rato = 0, sapo = 0;
        String c = "C", r = "R", s = "S", pergunta;

        n = scanner.nextInt();

        while (i <= n) {
            quantidade = scanner.nextInt();
            pergunta = scanner.next();
            if (pergunta.equals(c)) {
                coelho = coelho + quantidade;
            } else {
                if (pergunta.equals(r)) {
                    rato = rato + quantidade;
                } else {
                    if (pergunta.equals(s)) {
                        sapo = sapo + quantidade;
                    }
                }
            }

            i++;
        }
        quantidadeT = coelho + rato + sapo;
        cp = (coelho * 100.0) / quantidadeT;
        rp = (rato * 100.0) / quantidadeT;
        sp = (sapo * 100.0) / quantidadeT;
        System.out.println("Total: " + quantidadeT + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", cp);
        System.out.printf("Percentual de ratos: %.2f %%%n", rp);
        System.out.printf("Percentual de sapos: %.2f %%%n", sp);

    }
}
