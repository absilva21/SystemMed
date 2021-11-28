package model;

import java.time.LocalDate;

public class Dia {
	
	public Dia() {
		tarefas = new LinkList<Tarefa>();
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LinkList<Tarefa> getTarefas() {
		return tarefas;
	}
	public void setTarefas(LinkList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	LocalDate data;
	LinkList<Tarefa> tarefas;
}
