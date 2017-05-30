/**
 * Classe que representa um Caminhao.
 * Caminhao herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta a capacidade de carga do caminhao em toneladas.
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Caminhao extends Veiculo
{
    // capacidade de carga do caminhao
    private double capacidadeCarga;

    /**
     * Controi objeto da classe Caminhao a partir dos parametros passados
     * Obs: a velocidade inicial do caminhao eh definida na classe Veiculo
     * 
     * @param modelo Modelo do caminhao a ser criado.
     * @param marca Marca do caminhao a ser criado.
     * @param placa Placa do caminhao a ser criado.
     * @param capacidadeCarga Capacidade de carga do caminhao (em toneladas).
     */
    public Caminhao(String modelo, String marca, String placa, double capacidadeCarga) {
        super(modelo, marca, placa, Double.toString(capacidadeCarga));
        this.capacidadeCarga = capacidadeCarga;
    }
    
    /**
     * Calcula o imposto do veículo de acordo com seu tipo e características.
     * Caminhões com capacidade de carga de menos de 10 ton. pagam 90% do imposto base.
     * Caminhões com capacidade de carga de mais de 30 ton. pagam 300% do imposto base.
     * Resto paga o valor base.
     * @param cond Condição para cálculo do imposto (carga, nº de passageiros, flex, etc)
     * @return Valor do imposto do veículo
     */
    @Override
    protected double calculaImposto(String cond) {
        double capacidadeCarga = Double.valueOf(cond);
        if (capacidadeCarga < 10) {
            return Veiculo.getImpostoBase() * 0.9;
        } else if (capacidadeCarga > 30) {
            return Veiculo.getImpostoBase() * 3;
        }
        return Veiculo.getImpostoBase();
    }

    /**
     * Retorna a capacidade de carga do caminhao (em toneladas)
	 * 
	 * @return A capacidade de carga do caminhao (em toneladas)
     */
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    /**
     * Retorna a descricao do caminhao no formato:
     *  Placa   Modelo  Marca   Velocidade km/h     Capacidade
	 * 
	 * @return A descricao do caminhao (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\t" + capacidadeCarga;
    }
}
