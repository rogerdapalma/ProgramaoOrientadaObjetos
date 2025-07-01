package pratica.ex002;

class OperacaoInvalidaException extends Exception {
    public OperacaoInvalidaException(String msg) {
        super(msg);
    }
}