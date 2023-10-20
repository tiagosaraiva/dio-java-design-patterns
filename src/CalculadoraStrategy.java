interface Operacao {
    int realizaOperacao(int num1, int num2);
}

class Adicao implements Operacao {
    public int realizaOperacao(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtracao implements Operacao {
    public int realizaOperacao(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiplicacao implements Operacao {
    public int realizaOperacao(int num1, int num2) {
        return num1 * num2;
    }
}

class CalculatoraStrategy {
    private Operacao operacaoCalculadora;

    public CalculatoraStrategy(Operacao operacaoCalculadora) {
        this.operacaoCalculadora = operacaoCalculadora;
    }

    public int executeOperation(int num1, int num2) {
        return operacaoCalculadora.realizaOperacao(num1, num2);
    }
}

