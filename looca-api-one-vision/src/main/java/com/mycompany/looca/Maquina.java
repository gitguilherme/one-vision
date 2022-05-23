package com.mycompany.looca;


import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Maquina {
    private Integer idMaquina;
    Connection config = new Connection();
    JdbcTemplate template = new JdbcTemplate(config.getDataSource());

    public Maquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }

    public Maquina() {
        
    }

    public Integer getIdMaquina(Usuario usuario) {
        List<Maquina> listaMaquina = template.query("SELECT idMaquina FROM Maquina\n" +
                                "INNER JOIN Usuario\n" +
                                "ON fkUsuario = idUsuario where Usuario.Email = '" + usuario.getEmail() + "';",
                    new BeanPropertyRowMapper<>(Maquina.class));
        return listaMaquina.get(0).idMaquina;
    }

    public void setIdMaquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }
    

}
