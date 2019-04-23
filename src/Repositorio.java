import java.util.ArrayList;

public class Repositorio {

    ArrayList<Coima> coimas = new ArrayList<Coima>();
    ArrayList<Copia> copias = new ArrayList<Copia>();
    ArrayList<Devolucao> devolucoes = new ArrayList<Devolucao>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Notificacao> notificacoes = new ArrayList<Notificacao>();
    ArrayList<Requisicao> requisicoes = new ArrayList<Requisicao>();
    ArrayList<TipoUtilizador> tipoUtilizadores = new ArrayList<TipoUtilizador>();
    ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();

    public Repositorio() {

    }

    public void adicionaUtilizador(Utilizador utilizador){
        utilizadores.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipoUtilizador){
        tipoUtilizadores.add(tipoUtilizador);
    }

    public void adicionaRequisicao(Requisicao requisicao){
        requisicoes.add(requisicao);
    }

    public void adicionaCopia(Copia copia){
        copias.add(copia);
    }

    public void adicionaLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao){
        devolucoes.add(devolucao);
    }

    public void adicionaCoima(Coima coima){
        coimas.add(coima);
    }


    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){


        for(Emprestimo item: emprestimos){

            if(item.getRequisicao()==r){
                return item;
            }
        }
        return null;



    }


}
