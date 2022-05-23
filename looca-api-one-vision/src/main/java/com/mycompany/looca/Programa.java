package com.mycompany.looca;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Programa {

    private Integer idPrograma;
    private String nomePrograma;
    private Integer fkMaquina;
    private Integer isProibido;

    Connection config = new Connection();
    JdbcTemplate template = new JdbcTemplate(config.getDataSource());

    public Programa(Integer idPrograma, String nomePrograma, Integer fkMaquina) {
        this.idPrograma = idPrograma;
        this.nomePrograma = nomePrograma;
        this.fkMaquina = fkMaquina;
        this.isProibido = 0;
    }

    public Programa() {
    }

    public Integer getIdPrograma(Maquina maquina, Usuario usuario, Integer index) {
        List<Programa> listaPrograma = template.query("SELECT idPrograma FROM Programa"
                + " INNER JOIN Maquina"
                + " ON fkMaquina = idMaquina where "
                + "Maquina.idMaquina = " + maquina.getIdMaquina(usuario) + ";", new BeanPropertyRowMapper<>(Programa.class));

        return listaPrograma.get(index).idPrograma;
    }

    public Integer getIsProibido(Integer index) {
       List<Programa> listaProibido = template.query("SELECT idPrograma FROM Programa WHERE isProibido = 1",new BeanPropertyRowMapper<>(Programa.class)) ;
       return listaProibido.get(index).isProibido;
    }

    public void setIsProibido(Integer isProibido) {
        this.isProibido = isProibido;
    }

    public void setIdPrograma(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNomePrograma() {
        return nomePrograma;
    }

    public void setNomePrograma(String nomePrograma) {
        this.nomePrograma = nomePrograma;
    }

    public Integer getFkMaquina() {
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    @Override
    public String toString() {
        return "Programa{" + "idPrograma=" + idPrograma + ", nomePrograma=" + nomePrograma + ", fkMaquina=" + fkMaquina + ", isProibido=" + isProibido + '}';
    }

}
