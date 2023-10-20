public class LogSingleton {

    // Variável estatíca que guarda a instancia do log
    private static LogSingleton instance;

    // Contrutor privado que previne a criação do objeto
    private LogSingleton() {
        
    }

    // Método público que expôe a instância
    public static LogSingleton getInstance() {
        if (instance == null) {
            instance = new LogSingleton();
        }
        return instance;
    }

    public void gravaLog(String mensagem) {
        System.out.println(mensagem);
    }

}
