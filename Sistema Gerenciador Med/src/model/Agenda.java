package model;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

public class Agenda {
	Object proprietario;
	HashMap<String,Dia> dias;
	
	public Agenda() {
		dias = new HashMap<String,Dia>();
	}
	
	public HashMap<String, Dia> getDias() {
		return dias;
	}
	public void setDias(HashMap<String, Dia> dias) {
		this.dias = dias;
	}
	public Object getProprietario() {
		return proprietario;
	}
	public void setProprietario(Object proprietario) {
		this.proprietario = proprietario;
	}
	
	public void cadastrarTarefa(LocalDate d, Paciente t) {
		String key = d.toString();
		
		if(dias.containsKey(key)) {
			Dia x = dias.get(key);
			LinkList<Paciente> y = x.getPacientes();
			y.add(t);
		}else {
			Dia b = new Dia();
			b.setData(d);
			b.getPacientes().add(t);
			dias.put(key, b);
			
		}
		
	}
	
	public Object[] keys() {
		Set<String> keys = dias.keySet();
		Object[] k =  keys.toArray();
		return k;
	}
	
}
