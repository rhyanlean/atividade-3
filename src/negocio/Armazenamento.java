package negocio;


import java.util.Stack;

import modelagem.Computador;

public class Armazenamento {
	
	 private Stack<Computador> pilhaComputadores;
	    
	    public Armazenamento() {
	        setPilhaComputadores(new Stack<>());
	    }
	    
	    public void empilharComputador(Computador computador) {
	        getPilhaComputadores().push(computador);
	    }
	    
	    public Computador desempilharComputador() {
	        return getPilhaComputadores().pop();
	    }

		public Stack<Computador> getPilhaComputadores() {
			return pilhaComputadores;
		}

		public void setPilhaComputadores(Stack<Computador> pilhaComputadores) {
			this.pilhaComputadores = pilhaComputadores;
		}
	}