import br.com.fcamara.Contatos.modelo.Contato;
import br.com.fcamara.Contatos.modelo.ListaTelefonica;
import br.com.fcamara.Contatos.util.Builder.ContatoBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaTelefonicaTest {

    //new ContatoBuilder
    // .comNome("Joel")
    // .comTelefone("11 99999-9999")
    // .criar();

    private ListaTelefonica listaTelefonica;

    @BeforeEach
    void incializarUmaListaTelefonica() {
        this.listaTelefonica = new ListaTelefonica();
    }

    @Test
    void DeveBuscarUmContatoExistente() {
        listaTelefonica.adicionar("Joel", "11 99999-9999");
        String resultadoDaBusca = listaTelefonica.buscarContato("Joel");

        assertEquals("Nome: Joel, Telefone: 11 99999-9999", resultadoDaBusca);
    }

    @Test
    void deveAdicionarUmNovoContato() {
        listaTelefonica.adicionar("Joel", "11 99999-9999");

        assertEquals(1, listaTelefonica
                .getListaTelefonica()
                .size());
    }

    @Test
    void deveDevolverUmErroAoInserirTelefoneInvalido() {
        assertEquals("Contato não adicionado. Motivo: Telefone Invalido",
                listaTelefonica.adicionar("Joel", "11 9999-9999"));
    }

    @Test
    void deveAtualizarUmContatoExistente() {
        listaTelefonica.adicionar("Joel", "11 99999-9999");
        String atual = listaTelefonica.buscarContato("Joel");
        listaTelefonica.atualizar("Joel", "Joel Backschat", "11 00000-0000");
        String atualizado = listaTelefonica.buscarContato("Joel Backschat");

        assertNotEquals(atual, atualizado);
    }

    @Test
    void deveDeletarUmContatoExistente() {
        listaTelefonica.adicionar("Joel", "11 99999-9999");
        listaTelefonica.deletar("Joel");

        assertEquals(0, listaTelefonica.getListaTelefonica().size());
    }

}
