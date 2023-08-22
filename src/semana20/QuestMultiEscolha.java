import java.util.List;

public class QuestMultiEscolha extends Questao {
        private List respostasCorretas; 

        public QuestMultiEscolha(int numero, String enunciado, List respostasCorretas) 
        { 
            super(numero, enunciado); 
            this.respostasCorretas = respostasCorretas; 
        } 

        @Override 
        
        public boolean validarResposta(String resposta) 
        { 
            return respostasCorretas.contains(resposta); 
        } 

        @Override 
        public int getPontuacao() 
        { 
            return respostasCorretas.size(); 
        }
    }