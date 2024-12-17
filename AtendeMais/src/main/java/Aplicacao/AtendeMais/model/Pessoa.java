package Aplicacao.AtendeMais.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private Integer tipopessoa;
    private Integer tipopfpj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(Integer tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public Integer getTipopfpj() {
        return tipopfpj;
    }

    public void setTipopfpj(Integer tipopfpj) {
        this.tipopfpj = tipopfpj;
    }
}
