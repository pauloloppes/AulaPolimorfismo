/**
 * Classe que define um veiculo. A ideia eh que seja usada como superclasse para
 * os demais tipos de veiculos.
 * 
 * Um veiculo tem modelo, marca, placa e velocidade atual.
 * 
 * @author Julio Cesar Alves
 * @version 2016-0-19
 */
public class Veiculo {
    private String modelo;
    private String marca;
    private String placa;
    private int velocidadeAtual;
    private double imposto;
    private static final double impostoBase = 100;
    
    /*
     * Constroi o objeto a partir do modelo, marca e placa passados.
     * A velocidade inicial do veiculo sera zero km/h.
     * 
     * @param modelo Modelo do veículo a ser criado.
     * @param marca Marca do veiculo a ser criado.
     * @param placa Placa do veiculo a ser criado.
     * @param cond Condição para criação do imposto.
     */
    public Veiculo(String modelo, String marca, String placa, String cond) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        velocidadeAtual = 0;
        setImposto(cond);
    }
    
    /**
     * Determina o novo valor do imposto do determinado veículo.
     * @param cond Condição para cálculo do imposto (carga, nº de passageiros, flex, etc)
     */
    private void setImposto(String cond) {
        imposto = calculaImposto(cond);
    }
    
    /**
     * Calcula o imposto do veículo de acordo com seu tipo e características.
     * @param cond Condição para cálculo do imposto (carga, nº de passageiros, flex, etc)
     * @return Valor do imposto do veículo
     */
    protected double calculaImposto(String cond) {
        return Veiculo.getImpostoBase();
    }
    
    /**
     * Retorna o modelo do veiculo
	 *
	 * @return O modelo do veiculo
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * Retorna a marca do veiculo
	 *
	 * @return A marca do veiculo
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Retorna a placa do veiculo
	 *
	 * @return A placa do veiculo
     */
    public String getPlaca() {
        return placa;
    }
    
    /**
     * Retorna a velocidade atual do veiculo (em km/h)
	 *
	 * @return A velocidade atual do veiculo (em km/h)
     */
    public String getVelocidadeAtual() {
        return modelo;
    }
    
    /**
     * Altera a velocidade atual do veiculo.
     * So altera a velocidade se for passado valor maior ou igual a zero.
     * 
     * @param velocidade Nova velocidade do veiculo (em km/h).
     * @return Retorna se a velocidade foi realmente alterada ou nao.
     */
    public boolean setVelocidadeAtual(int velocidade) {
        if (velocidade >= 0) {
            velocidadeAtual = velocidade;
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Retorna a descricao do veiculo no formato:
     *  Placa   Modelo  Marca   Velocidade km/h
	 * 
	 * @return A descricao do veiculo (seus campos separados por tabulacoes)
     */
    public String getDescricao() {
        return placa + "\t" + modelo + "\t" + marca + "\tR$ " + imposto + "\t" + velocidadeAtual + " Km/h";
    }
    
    
    /**
     * Retorna o valor do imposto base para todos os veículos.
     * @return Valor do imposto base.
     */
    public static double getImpostoBase() {
        return Veiculo.impostoBase;
    }
}
