
package com.mycompany.looca;

import org.springframework.jdbc.core.JdbcTemplate;


public class ComponenteMaquina {
    private Integer idComponenteMaquina;
    private String  totalComponente;
    private String unidadeMedida;
    private Integer fkMaquina;
    private Integer fkComponente;
    
    
    Connection config = new Connection();
    JdbcTemplate template = new JdbcTemplate(config.getDataSource());

    public ComponenteMaquina(Integer idComponenteMaquina, String totalComponente, String unidadeMedida, Integer fkMaquina, Integer fkComponente) {
        this.idComponenteMaquina = idComponenteMaquina;
        this.totalComponente = totalComponente;
        this.unidadeMedida = unidadeMedida;
        this.fkMaquina = fkMaquina;
        this.fkComponente = fkComponente;
    }

    public ComponenteMaquina() {
    }

    public Integer getIdComponenteMaquina() {
        return idComponenteMaquina;
    }

    public void setIdComponenteMaquina(Integer idComponenteMaquina) {
        this.idComponenteMaquina = idComponenteMaquina;
    }

    public String getTotalComponente() {
        return totalComponente;
    }

    public void setTotalComponente(String totalComponente) {
        this.totalComponente = totalComponente;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Integer getFkMaquina() {
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    public Integer getFkComponente() {
        return fkComponente;
    }

    public void setFkComponente(Integer fkComponente) {
        this.fkComponente = fkComponente;
    }

    @Override
    public String toString() {
        return "ComponenteMaquina{" + "idComponenteMaquina=" + idComponenteMaquina + ", totalComponente=" + totalComponente + ", unidadeMedida=" + unidadeMedida + ", fkMaquina=" + fkMaquina + ", fkComponente=" + fkComponente + '}';
    }
    
    
}
