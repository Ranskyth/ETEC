package com.example.tasks.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasks.model.Task;

@Controller
public class TaskController {

    @GetMapping("/tasks")
    public String list(Model model) {
        var tasks = List.of(new Task(1L, "Aprender Sistema de Tipos Hindley–Milner", "Entender inferência de tipos usada em linguagens funcionais", 20, 50),
new Task(2L, "Aprender Criptografia RSA", "Estudar como funciona criptografia assimétrica com RSA", 30, 80),
new Task(3L, "Aprender Protocolos TCP/IP", "Entender a pilha de protocolos de rede e suas camadas", 40, 100),
new Task(4L, "Aprender Sistemas de Mensageria", "Estudar Kafka e RabbitMQ para comunicação assíncrona", 50, 70),
new Task(5L, "Aprender Garbage Collection", "Compreender algoritmos de coleta de lixo em linguagens de programação", 60, 90),

new Task(6L, "Aprender Paxos", "Compreender o algoritmo de consenso Paxos", 20, 60),
new Task(7L, "Aprender Raft", "Estudar o algoritmo de consenso Raft e suas aplicações", 50, 80),
new Task(8L, "Aprender Memória Virtual", "Entender como funciona paginação e segmentação em SOs", 30, 70),
new Task(9L, "Aprender Caches de CPU", "Estudar L1, L2 e L3 caches e política de substituição", 40, 100),
new Task(10L, "Aprender Compiladores", "Compreender fases de compilação: análise léxica, sintática e semântica", 60, 90),

new Task(11L, "Aprender Autômatos Finitos", "Estudar autômatos determinísticos e não determinísticos", 20, 50),
new Task(12L, "Aprender Expressões Regulares", "Relacionar autômatos com regex e teoria da computação", 30, 80),
new Task(13L, "Aprender Algoritmo de Dijkstra", "Entender busca de menor caminho em grafos", 40, 70),
new Task(14L, "Aprender Algoritmo A*", "Estudar busca heurística em grafos e jogos", 50, 90),
new Task(15L, "Aprender Deadlocks", "Entender condições para deadlock e como preveni-los", 60, 100),

new Task(16L, "Aprender Sistemas de Arquivos", "Estudar FAT, ext4 e NTFS e suas diferenças", 20, 80),
new Task(17L, "Aprender Banco de Dados Colunar", "Compreender diferença entre bancos colunares e relacionais", 30, 70),
new Task(18L, "Aprender Teoria CAP", "Estudar trade-offs entre consistência, disponibilidade e tolerância a partições", 40, 90),
new Task(19L, "Aprender Programação Reativa", "Estudar o paradigma reativo e streams de dados", 50, 100),
new Task(20L, "Aprender WebAssembly", "Entender como rodar código de baixo nível no navegador", 60, 80)
);

        model.addAttribute("tasks", tasks);

        return "tasks";
    }
}