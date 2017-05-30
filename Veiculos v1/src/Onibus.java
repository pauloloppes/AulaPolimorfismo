/**
 * Classe que representa um Onibus.
 * Onibus herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta a quantidade passageiros que o onibus pode levar.
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Onibus extends Veiculo {
    // quantidade de passageiros que o onibus pode levar
    private int capacidadePassageiros;

    /**
     * Controi objeto da classe Onibus a partir dos parametros passados
     * Obs: a velocidade inicial do onibus eh definida na classe Veiculo
     * 
     * @param modelo Modelo do onibus a ser criado.
     * @param marca Marca do onibus a ser criado.
     * @param placa Placa do onibus a ser criado.
     * @param capacidadePassageiros Quantidade de passageiros que o onibus pode carregar.
     */
    public Onibus(String modelo, String marca, String placa, int capacidadePassageiros) {
        super(modelo, marca, placa, Integer.toString(capacidadePassageiros));
        this.capacidadePassageiros = capacidadePassageiros;
    }
    
    /**
     * Calcula o imposto do veículo de acordo com seu tipo e características.
     * Ônibus com capacidade para menos que 30 passageiros não pagam imposto.
     * O resto dos ônibus pagam imposto base.
     * @param cond Condição para cálculo do imposto (carga, nº de passageiros, flex, etc)
     * @return Valor do imposto do veículo
     */
    @Override
    protected double calculaImposto(String cond) {
        int capacidadePassageiros = Integer.valueOf(cond);
        if (capacidadePassageiros < 30) {
            return 0;
        }
        return Veiculo.getImpostoBase();
    }

    /**
     * Retorna a quantidade de passageiros que o onibus pode levar
	 *
	 * @return A quantidade de passageiros que o onibus pode levar
     */
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    
    /**
     * Retorna a descricao do onibus no formato:
     *  Placa   Modelo  Marca   Velocidade km/h     Capacidade
	 * 
	 * @return A descricao do onibus (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\t" + capacidadePassageiros;
    }
}