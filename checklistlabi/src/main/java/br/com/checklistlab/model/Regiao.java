package br.com.checklistlab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Regiao {
    
    @Id
    private String nomeRegiao;
    private String nomeResponsavel;

    public String getNomeRegiao() {
        return nomeRegiao;
    }
    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

}
