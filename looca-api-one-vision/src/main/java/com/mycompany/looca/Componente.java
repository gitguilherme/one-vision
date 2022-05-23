package com.mycompany.looca;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Componente {
    private Integer idComponente;
    private String nomeComponente;
    private Double totalComponente;
    
    Connection config = new Connection();
    JdbcTemplate template = new JdbcTemplate(config.getDataSource());

    // construtor para fazer registroComponente
    public Componente(Integer idComponente, String nomeComponente, Double totalComponente) {
        this.idComponente = idComponente;
        this.nomeComponente = nomeComponente;
        this.totalComponente = totalComponente;
    }
    
    
    // construtor para Componente
    public Componente(String nomeComponente, Double totalComponente) {
        this.nomeComponente = nomeComponente;
        this.totalComponente = totalComponente;
    }

    public Componente() {
    }
    public Integer getIdComponente(Maquina maquina, Usuario usuario, Integer index) {
        
        List<Componente> listaComponente = template.query("SELECT idComponente FROM Componente"
                            + " INNER JOIN Maquina"
                        + " ON fkMaquina = idMaquina where "
                        + "Maquina.idMaquina = " + maquina.getIdMaquina(usuario) + ";", new BeanPropertyRowMapper<>(Componente.class));
        
        return listaComponente.get(index).idComponente;
    }

    public String getNomeComponente() {
        return nomeComponente;
    }

    public Double getTotalComponente() {
        return totalComponente;
    }

    @Override
    public String toString() {
        return "Componente{" + "idComponente=" + idComponente + ", nomeComponente=" + nomeComponente + ", totalComponente=" + totalComponente + '}';
    }

    
    
    
}
