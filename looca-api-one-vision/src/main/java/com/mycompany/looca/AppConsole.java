package com.mycompany.looca;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.util.Conversor;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppConsole {
    public static void main(String[] args) throws InterruptedException {
        Conversor conversor = new Conversor();
        Looca looca = new Looca();
        Connection config = new Connection();
        
        ProcessosGroup grupoDeProcessos = new ProcessosGroup();
        ServicosGroup grupoDeServicos = new ServicosGroup();
        
        Sistema sistema = looca.getSistema();
        Memoria memoria = looca.getMemoria();
        Processador processador = looca.getProcessador();
        DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
        
        List <Volume> volumes = grupoDeDiscos.getVolumes();
        Long memoriaDisponivel = null;
        
        for (Volume volume : volumes) {
            memoriaDisponivel =+ volume.getDisponivel();
        }
        
        System.out.println(processador.getNome());
        System.out.println(String.format("A memoria RAM total é de: %s", conversor.formatarBytes(memoria.getTotal())));
        System.out.println(conversor.formatarBytes(grupoDeDiscos.getTamanhoTotal()));
        System.out.println(String.format("A quantidade de discos é: %d", 
                grupoDeDiscos.getQuantidadeDeDiscos()));
        System.out.println(String.format("Memoria do disco disponível: %s", conversor.formatarBytes(memoriaDisponivel)));
        
        List <Disco> discos = grupoDeDiscos.getDiscos();
        
        for (Disco disco : discos) {
            System.out.println(disco);
        }        
        
        List<Servico> servicos = grupoDeServicos.getServicos();
        Integer totalServicos = 0;
     
       for (Servico servico : servicos) {
         if(servico.getEstado().equals("RUNNING")){
           System.out.println(servico);
             totalServicos++;
           }
       }
        
        System.out.println(String.format("O tatoal de serviços em execução é %d \n"
                + "---------------------------", totalServicos));
        
        List<Processo> processos = grupoDeProcessos.getProcessos();
        Integer totalProcessos = 0;

        for (Processo processo : processos) {
            if(processo.getUsoCpu() <= 0.1 || processo.getUsoMemoria() <= 0.1){
                
            }else{
                String nomePrograma = processo.getNome();
                Double usoCPU = processo.getUsoCpu();
                Double usoMemoria = processo.getUsoMemoria();
                Date data = new Date();
                SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
                String dataFormatada = formatar.format(data);
                System.out.println(dataFormatada);
                
                
                System.out.println(processo);
                System.out.println("-----------------");
                totalProcessos++;
            }
        }
        
        System.out.println(String.format("O tatoal de processos em execução é %d \n"
                + " ------------------------------", totalProcessos));
        
        while(true){
            System.out.println(looca.getTemperatura().getTemperatura());
            System.out.println(String.format("O uso de RAM é: %s", conversor.formatarBytes(memoria.getEmUso())));
            System.out.println(conversor.formatarSegundosDecorridos(sistema.getTempoDeAtividade()));
            Thread.sleep(30000L);  
        }
    }
}
