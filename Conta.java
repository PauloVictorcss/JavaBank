 public Conta(int agencia, int numero){
	        Conta.total++;
	        //System.out.println("O total de contas é " + Conta.total);
	        this.agencia = agencia;
	        this.numero = numero;
	        //System.out.println("Estou criando uma conta " + this.numero);
	    }

	    public abstract void deposita(double valor);

	    public boolean saca(double valor) {
	        if(this.saldo >= valor) {
	            this.saldo -= valor;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean transfere(double valor, Conta destino) {
	        if(this.saca(valor)) {
	                destino.deposita(valor);
	                return true;
	        } else {
	                return false;
	        }
	    }
