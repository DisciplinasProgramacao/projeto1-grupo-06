package business;

public class Produto {

	private String descricao;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	private double valorImpostos;
	
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
    	setPrecoVenda(precoCusto, margemLucro, valorImpostos);
       }
    
   	public double getMargemLucro() {
		return margemLucro;
	}
	
	public void setValorImpostos(double valorImpostos) {
    	this.valorImpostos = (precoCusto + margemLucro) * 0.18;
    	}
	
	public double getValorImpostos() {
		return valorImpostos;
	}
	
	public void setPrecoVenda(double custo, double lucro, double impostos) {
		this.precoVenda = precoCusto + margemLucro + valorImpostos;
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
		valorImpostos = 10.0;
		margemLucro = 0.5;
		
	}
}

