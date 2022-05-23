package com.mycompany.looca;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Usuario {
    private Integer idUsuario;
    private Integer fkEmpresa;
    private String email;
    private String senha;
    private String nome;
    public Usuario(Integer idUsuario, Integer fkEmpresa, String email, String senha,String nome) {
        this.idUsuario = idUsuario;
        this.fkEmpresa = fkEmpresa;
        this.email = email;
        this.senha = senha;
         this.nome = nome;
    }

   
    
    public Usuario(){
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", fkEmpresa=" + fkEmpresa + ", email=" + email + ", senha=" + senha + ", nome=" + nome + '}';
    }

   
    
}
