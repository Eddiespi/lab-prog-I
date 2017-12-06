package exercício1;

public class Pesquisa {

	private char[] 	sexo;
	private char[] 	opcao;
	
	private int 	contM = 0;
	private int 	contF = 0;
	private int		mSim = 0;
	private int		mNao = 0;
	private int		fSim = 0;
	private int		fNao = 0;
	
	private int		totalS = 0;
	private int		totalN = 0;
	private double	perMascNao = 0;
	
	private double	perMascSim = 0;
	private double	perFemSim = 0;
	private String	mensagem = "";

	Masc m = new Masc();
	Fem f = new Fem();
	
	public Pesquisa(int n) {
		sexo = new char[n];	
		opcao = new char[n];
	}
	
	public void setSexo(char sexo, int i){
		this.sexo[i] = sexo;
	}
	
	public void setOpcao(char opcao, int i){
		this.opcao[i] = opcao;
	}
	
	
	public void Calculo(int i){		
		if(this.sexo[i] == 'm' || this.sexo[i] == 'M'){
			this.contM = contM + 1;
			
			if(this.opcao[i] == 's' || this.opcao[i] == 'S'){
				this.mSim = mSim + 1;
			}else{
				this.mNao = mNao + 1;
			}
		}else{
			this.contF = contF + 1;
			
			if(this.opcao[i] == 's' || this.opcao[i] == 'S'){
				this.fSim = fSim + 1;
			}else{
				this.fNao = fNao + 1;
			}
		}
	}
	
	public void Gostaram(){
		this.totalS = this.mSim + this.fSim;
	}
	public int getGostaram() {
		return this.totalS;
	}
	
	
	/*	public void NaoGostaram(){
		this.totalN = this.mNao + this.fNao;
	}
	public int getNaoGostaram() {
		return this.totalN;
	}
	
	
	public void PerMascNao(){
		this.perMascNao = (mNao * 100) / contM;
	}
	public double getPerMascNao(){
		return this.perMascNao;
	}
	
	
	public void PerMascSim(){
		this.perMascSim = (mSim * 100) / contM;
	}
	
	public void PerFemSim(){
		this.perFemSim = (fSim * 100) / contF;
	}
	
	public void setMensagem(){
		if(this.perMascSim > this.perFemSim){
			this.mensagem = "O produto teve maior aceitação entre o gênero masculino";
		}else{
			this.mensagem = "O produto teve maior aceitação entre o gênero feminino";
		}
	}
	public String getMensagem(){
		return this.mensagem;
	} */
} 
