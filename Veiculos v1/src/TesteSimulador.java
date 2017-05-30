/**
 * Classe que testa a adição de veículos no simulador.
 * Ela adiciona automaticamente veículos de todos os tipos a fins de teste.
 * @author paulo
 * @version 2017-05-30
 */
public class TesteSimulador {
    
    /**
     * Adiciona vários veículos no simulador.
     * @param s Simulador onde veículos serão adicionados.
     */
    public static void testar(Simulador s) {
        s.adicionarCarro("F50", "Ferrari", "GZA1234", true);
        s.alterarVelocidadeVeiculo("F50", 240);
        s.adicionarCarro("Fusca", "VW", "GZA1234", false);
        s.alterarVelocidadeVeiculo("Fusca", 50);
        s.adicionarCaminhao("Atego", "Mercedes", "GZB1111", 10);
        s.alterarVelocidadeVeiculo("Atego", 60);
        s.adicionarCaminhao("Brutus", "Scania", "GZB2222", 35);
        s.alterarVelocidadeVeiculo("Brutus", 60);
        s.adicionarOnibus("Apache", "Caio", "SIM9988", 25);
        s.alterarVelocidadeVeiculo("Apache", 40);
        s.adicionarTrator("4230", "Agrale", "GZA9999");
        s.alterarVelocidadeVeiculo("4230", 40);
    }
}
