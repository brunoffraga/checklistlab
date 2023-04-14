package br.com.checklistlab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChekListi {
    
    @Id
    private Long numeroChamado;
    private String chekList;
    
    public Long getNumeroChamado() {
        return numeroChamado;
    }
    public void setNumeroChamado(Long numeroChamado) {
        this.numeroChamado = numeroChamado;
    }
    public String getChekList() {
        return chekList;
    }
    public void setChekList(String chekList) {
        this.chekList = chekList;
    }
}
