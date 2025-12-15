public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota_final;

    public double calcularNota() {
        if (nota1 >= 0 && nota1 <= 30 &&
            nota2 >= 0 && nota2 <= 35 &&
            nota3 >= 0 && nota3 <= 35) {

            nota_final = nota1 + nota2 + nota3;
            return nota_final;

        } else {
            System.out.println("Nota fora do intervalo!");
            return 0;
        }
    }

    public void avaliacao() {
        System.out.println("FINAL GRADE = " + nota_final);

        if (nota_final >= 100 * 0.6) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println(
                "FALTANDO " + ((100 * 0.6) - nota_final) + " PONTOS."
            );
        }
    }
}
