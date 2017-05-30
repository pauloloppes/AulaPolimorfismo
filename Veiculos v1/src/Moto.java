/**
 * Classe que representa uma Moto.
 * Moto herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta a cilindrada da moto.
 * 
 * @author paulo
 * @version 2017-05-30
 */
public class Moto extends Veiculo
{
    // capacidade de carga do caminhao
    private int cilindradas;

    /**
     * Controi objeto da classe Moto a partir dos parametros passados
     * Obs: a velocidade inicial da moto eh definida na classe Veiculo
     * 
     * @param modelo Modelo da moto a ser criada.
     * @param marca Marca da moto a ser criada.
     * @param placa Placa da moto a ser criada.
     * @param cilindradas Cilindradas da moto.
     */
    public Moto(String modelo, String marca, String placa, int cilindradas) {
        super(modelo, marca, placa, Integer.toString(cilindradas));
        this.cilindradas = cilindradas;
    }
    
    /**
     * Calcula o imposto do veículo de acordo com seu tipo e características.
     * Motos com 125 cilindradas pagam 105% do imposto base.
     * Motos com 250 cilindradas pagam 115% do imposto base.
     * As demais pagam 125% do imposto base.
     * Todas as motos pagam um adicional de R$50 ao valor final.
     * @param cond Condição para cálculo do imposto (carga, nº de passageiros, flex, etc)
     * @return Valor do imposto do veículo
     */
    @Override
    protected double calculaImposto(String cond) {
        int cilindradas = Integer.valueOf(cond);
        if (cilindradas == 125) {
            return (Veiculo.getImpostoBase() * 1.05) + 50;
        } else if (cilindradas == 250) {
            return (Veiculo.getImpostoBase() * 1.15) + 50;
        }
        return (Veiculo.getImpostoBase() * 1.25) + 50;
    }

    /**
     * Retorna as cilindradas da moto
	 * 
	 * @return A capacidade de carga do caminhao (em toneladas)
     */
    public double getCilindradas() {
        return cilindradas;
    }
    
    /**
     * Retorna a descricao do caminhao no formato:
     *  Placa   Modelo  Marca   Velocidade km/h     Cilindradas
	 * 
	 * @return A descricao da moto (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\t" + cilindradas;
    }
}
