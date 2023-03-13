package business;

public class Produto {
	private String descricao;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	private double valorImpostos;
	private double valoresArrecadados;
	private double quantidadeAtual;
	private double quantidadeMinima;
	private boolean estoqueBaixo;

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String nomeProduto) {
		if (nomeProduto.length() >= 3)
			this.descricao = nomeProduto;
	}
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	public void setPrecoCusto(double custo) {
		this.precoCusto = custo;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setMargemLucro(double margemLucro) {
    	if(margemLucro >= 0.3 && margemLucro <= 0.8)
    		this.margemLucro = margemLucro;
       }
    
   	public double getMargemLucro() {
		return margemLucro;
	}
	
	public void setValorImpostos(double valorImpostos) {
	        double valorMargemLucro = precoCusto * margemLucro;
	        double valorBaseCalculo = precoCusto + valorMargemLucro;
	        double ValorImpostos = valorBaseCalculo * 0.18;
	        this.valorImpostos = ValorImpostos;
    	}
	
	public double getValorImpostos() {
		return valorImpostos;
	}
	

	public void setValoresArrecadados() {
		this.valoresArrecadados = precoVenda - precoCusto;
	}
	
	public double getValoresArrecadados() {
		return valoresArrecadados;
	}
	
	public void setPrecoVenda() {
		this.precoVenda = precoCusto + (precoCusto*margemLucro) + valorImpostos;
	}
	
	public Produto(String descricao, double precoCusto, double margemLucro, double valorImpostos) {
		setDescricao(descricao);
		setPrecoCusto(precoCusto);
		setValorImpostos(valorImpostos);
		setMargemLucro(margemLucro);
		
		
	}
	
	public Produto(){
		descricao = "Descricao_Padrao";
		precoCusto = 0.01f;
		valorImpostos = 0.0;
		margemLucro = 0.0;
		
	}
	
	public double getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(double quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public double getQuantidadeMinima() {
        return quantidadeMinima;
    }
    
    public void setQuantidadeMinima(double quantidadeMinima){
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public boolean isEstoqueBaixo() {
		return estoqueBaixo;
	}

	public void setEstoqueBaixo(boolean estoqueBaixo) {
		this.estoqueBaixo = estoqueBaixo;
	}
	
    public boolean estoqueBaixo() {
        return quantidadeAtual < quantidadeMinima;
    }

}
