/**
 * Outra classe que testa a adição de veículos no simulador.
 * Ela adiciona automaticamente veículos de todos os tipos a fins de teste.
 * @author paulo
 * @version 2017-05-30
 */
public class TesteSimulador2 {
    
    /**
     * Adiciona vários veículos no simulador.
     * @param s Simulador onde veículos serão adicionados.
     */
    public static void testar(Simulador s) {
        s.adicionarMoto("CG", "Honda", "BOI1234", 125);
        s.alterarVelocidadeVeiculo("CG", 80);
        s.adicionarCarro("Corolla", "Toyota", "EVA5463", true);
        s.alterarVelocidadeVeiculo("Corolla", 90);
        s.adicionarOnibus("Apache", "Caio", "SIM9988", 40);
        s.alterarVelocidadeVeiculo("Apache", 40);
        s.adicionarMoto("Ninja", "Kawasaki", "BOA5151", 300);
        s.alterarVelocidadeVeiculo("Ninja", 110);
    }
}
