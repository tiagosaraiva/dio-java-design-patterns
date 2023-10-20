import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        //Testando SINGLETON
        LogSingleton singleton = LogSingleton.getInstance();

        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        String msg = "Iniciando processamento...";
        singleton.gravaLog(data+" "+hora+" "+msg);

        //Testando STRATEGY
        CalculatoraStrategy calculadoraAdicao = new CalculatoraStrategy(new Adicao()); 
        int result = calculadoraAdicao.executeOperation(5, 3);
        msg = "Novo adicao efetuada. Resultado: "+result;
        singleton.gravaLog(data+" "+hora+" "+msg);

        CalculatoraStrategy calculadoraSubtracao = new CalculatoraStrategy(new Subtracao()); 
        result = calculadoraSubtracao.executeOperation(8, 2);
        msg = "Novo subtracao efetuada. Resultado: "+result;
        singleton.gravaLog(data+" "+hora+" "+msg);

        CalculatoraStrategy calculadoraMultiplicacao = new CalculatoraStrategy(new Multiplicacao()); // Change strategy to multiplication
        result = calculadoraMultiplicacao.executeOperation(4, 6);
        msg = "Novo multiplicacao efetuada. Resultado: "+result;
        singleton.gravaLog(data+" "+hora+" "+msg);

        msg = "Finalizando processamento!";
        singleton.gravaLog(data+" "+hora+" "+msg);

        //Testando FACADE
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.assistirFilme("Coringa");
        System.out.println("\nO filme terminou! Desligando o home theater...\n");
        homeTheater.terminarFilme();
    }
}
