package Aula18.Atividade.Ex001;

public abstract class Conta {
    protected double saldo;
    protected double limite;

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
}
