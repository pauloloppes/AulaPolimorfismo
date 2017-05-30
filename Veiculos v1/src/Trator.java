/**
 * Classe que representa um Trator.
 * Trator herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * 
 * @author paulo
 * @version 2017-05-30
 */
public class Trator extends Veiculo {

    /**
     * Controi objeto da classe Trator a partir dos parametros passados
     * Obs: a velocidade inicial do trator eh definida na classe Veiculo
     * 
     * @param modelo Modelo do carro a ser criado.
     * @param marca Marca do carro a ser criado.
     * @param placa Placa do carro a ser criado.
     */
    public Trator(String modelo, String marca, String placa) {
        super(modelo, marca, placa, "");
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
        return 0;
    }
}
