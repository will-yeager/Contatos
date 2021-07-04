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
        }
        return -1;
    }

    public String buscarContato(String nome) {
        try {
            int indice = buscarIndice(nome);
            return listaTelefonica.get(indice).toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Erro ao tentar encontar o contato";
        }
    }

    public String adicionar(String nome, String telefone) {
        listaTelefonica.add(new Contato(nome, telefone));
        return "Contato adicionado com sucesso";
    }

    public String atualizar(String nome, String telefone) {
        int indice = buscarIndice(nome);
        listaTelefonica.get(indice).atualizar(nome, telefone);
        return "Contato atualizado com sucesso";
    }

    public String deletar(String nome) {
        try {
            int indice = buscarIndice(nome);
            listaTelefonica.remove(indice);
            return "Contato removido com sucesso";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Erro ao tentar encontar o contato";
        }
    }

    @Override
    public String toString() {
        return "Lista Telefonica: " +
                listaTelefonica;
    }
}
