package com.kaspper.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kaspper.tarefas.entity.Tarefa;

@Controller
public class TarefaController {

	@GetMapping("formulario")
	public String formulario() {
		
		return "form-tarefa";
	}
	
	@PostMapping("processa-nova-tarefa")
	public String processaNovaTarefa(Tarefa tarefa) {
		System.out.println(tarefa.getDescricao());
		
		return "lista-tarefas";
	}
	
	@GetMapping("tarefas")
	public String lista() {
		
		return "lista-tarefas";
	}
	
}
