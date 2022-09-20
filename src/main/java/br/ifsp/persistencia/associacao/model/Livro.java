package br.ifsp.persistencia.associacao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    private float preco;
    private String titulo;
    private int numPaginas;
    private String descricao;

    // Mapeando a chave estrangeira
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_capa")
    private Capa capa;

    @OneToMany(mappedBy = "livro")
    private List<Rotulo> rotulos;

    // POJO
    public Livro(){
    }

    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Capa getCapa() {
        return capa;
    }

    public void setCapa(Capa capa) {
        this.capa = capa;
    }

    public List<Rotulo> getRotulos() {
        return rotulos;
    }

    public void setRotulos(List<Rotulo> rotulos) {
        this.rotulos = rotulos;
    }

    
}
