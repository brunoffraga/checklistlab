package br.com.checklistlab.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Fazer usuario
 */

@Entity
@Table(name="users")
public class Usuario {

    @Id
    private String username;
    private String password;
    private boolean enabled;
    private String usurioFoto;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public String getUsurioFoto() {
        return usurioFoto;
    }
    public void setUsurioFoto(String usurioFoto) {
        this.usurioFoto = usurioFoto;
    }

}
