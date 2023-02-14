package br.com.project.shoppinglist.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbl_lista")
public class Lista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista")
    private Integer id;

    @Column(name = "data_criacao", nullable = false)
    private LocalDate data;

    @Column(name = "id_lista", length = 150)
    private String nomeMercado;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "status")
    private Integer status;

    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    private List<ItemLista> itens;

    public List<ItemLista> getItens() {
        return itens;
    }

    public void setItens(List<ItemLista> itens) {
        this.itens = itens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
