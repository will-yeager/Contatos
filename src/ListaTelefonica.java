import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica {

    private List<Contato> listaTelefonica = new ArrayList<>();

    public int buscarIndice(String nome) {
        int indice = 0;
        for(Contato contato : listaTelefonica) {
            if(nome.equals(contato.getNome())){
                return indice;
            }
            indice++;
        }
        return -1;
    }

    public String buscarContato(String nome) {
        try {
            return listaTelefonica.get( buscarIndice(nome) ).toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Erro ao tentar encontar o contato";
        }
    }

    public String adicionar(String nome, String telefone) {
        listaTelefonica.add(new Contato(nome, telefone));
        return "Contato adicionado com sucesso";
    }

    public String atualizar(String nome, String nomeNovo, String telefoneNovo) {
        try {
            listaTelefonica.get( buscarIndice(nome) ).atualizar(nomeNovo, telefoneNovo);
            return "Contato atualizado com sucesso";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Contato não atualizado";
        }
    }

    public String deletar(String nome) {
        try {
            listaTelefonica.remove( buscarIndice(nome) );
            return "Contato removido com sucesso";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Erro ao tentar encontrar o contato";
        }
    }


    @Override
    public String toString() {
        return "Lista Telefonica: " +
               listaTelefonica;
    }


}
