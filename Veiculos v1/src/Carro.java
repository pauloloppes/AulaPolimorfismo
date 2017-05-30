/**
 * Classe que representa um Carro.
 * Carro herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta se o carro é flex ou comum (em relacao ao combustivel).
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Carro extends Veiculo {
    // definimos apenas os atributos que sao especificos do carro
    private boolean ehFlex;

    /**
     * Controi objeto da classe Carro a partir dos parametros passados
     * Obs: a velocidade inicial do carro eh definida na classe Veiculo
     * 
     * @param modelo Modelo do carro a ser criado.
     * @param marca Marca do carro a ser criado.
     * @param placa Placa do carro a ser criado.
     * @param ehFlex Indica se o carro eh flex ou nao (em relacao ao combustivel)
     */
    public Carro(String modelo, String marca, String placa, boolean ehFlex) {
        super(modelo, marca, placa, Boolean.toString(ehFlex));
        this.ehFlex = ehFlex;
    }
    
    /**
     * Calcula o imposto do veículo de acordo com seu tipo e características.
     * Carros flex pagam 90% do imposto base.
     * Carros comuns pagam 105% do imposto base.
     * @param cond Condição para cálculo do imposto (carga, nº de passageiros, flex, etc)
     * @return Valor do imposto do veículo
     */
    @Override
    protected double calculaImposto(String cond) {
        boolean ehFlex = Boolean.valueOf(cond);
        if (ehFlex) {
            return Veiculo.getImpostoBase() * 0.9;
        }
        return Veiculo.getImpostoBase() * 1.05;
    }

    /**
     * Retorna se o carro eh flex ou nao (em relacao ao combustivel)
	 *
	 * @return Indicacao se o carro eh flex ou nao
     */
    public boolean getEhFlex() {
        return ehFlex;
    }
    
        /**
     * Retorna a descricao do carro no formato:
     *  Placa   Modelo  Marca   Velocidade km/h     Flex (ou Comum)
	 * 
	 * @return A descricao do carro (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricao() {
        String descricao = super.getDescricao();
        if (ehFlex) {
            descricao = descricao + "\tFlex";
        }
        else {
            descricao = descricao + "\tComum";
        }
        return descricao;
    }
}
