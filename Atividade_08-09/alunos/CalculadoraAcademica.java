public class CalculadoraAcademica {

    /**
     * Calcula a média de um aluno.
     * @param aluno O objeto Aluno cujas notas serão usadas no cálculo.
     * @return A média final do 
     */
    public static double calculaMedia(Aluno aluno) {
        double pesoProva = 2.5;
        double pesoTrabalho = 2.0;
        double somaPesos = (pesoProva * 2) + pesoTrabalho; 

        return ((aluno.getNotaProva1() * pesoProva) + 
                (aluno.getNotaProva2() * pesoProva) + 
                (aluno.getNotaTrabalho() * pesoTrabalho)) / somaPesos;
    }

    /**
     * Calcula a nota que o aluno precisa na prova final.
     * @param aluno O objeto Aluno para verificar o status.
     * @return A nota necessária. Retorna 0.0 se o aluno não for para a final.
     */
    public static double calculaNotaParaFinal(Aluno aluno) {
        double mediaSemestral = calculaMedia(aluno);
        
        if (mediaSemestral >= 7.0 || mediaSemestral < 3.0) {
            return 0.0;
        } else {
            double notaNecessaria = 10.0 - mediaSemestral;
            return Math.max(0.0, notaNecessaria);
        }
    }
}