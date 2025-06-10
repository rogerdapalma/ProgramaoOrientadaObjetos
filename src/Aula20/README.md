
1. **Tratamento de exceções com `try-catch`**
2. **Criação de exceções personalizadas**
3. **Implementação do desafio com a classe `Conta`, métodos `depositar` e `sacar`, e exceções personalizadas**

---

## 🌐 **1. Tratamento de exceções com `try-catch`**

```java
public class ExemploTryCatch {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        try {
            System.out.println(numeros[5]); // Tentativa de acessar índice inexistente
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do array");
        }
    }
}
```

---

## 🛠 **2. Criando exceções personalizadas**

```java
// Exceção personalizada
public class MinhaExcecao extends Exception {
    public MinhaExcecao() {
        super("Ocorreu um erro na aplicação.");
    }

    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
```

### Como lançar:

```java
public class TesteExcecao {
    public static void main(String[] args) {
        try {
            throw new MinhaExcecao("Erro personalizado lançado.");
        } catch (MinhaExcecao e) {
            System.out.println(e.getMessage());
        }
    }
}
```

---

## 💼 **3. Desafio: Classe `Conta` com exceções**

### Exceções personalizadas:

```java
public class ValorNegativoException extends Exception {
    public ValorNegativoException(String mensagem) {
        super(mensagem);
    }
}

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
```

### Classe abstrata `Conta`:

```java
public abstract class Conta {
    protected double saldo;
    protected double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public abstract void depositar(double valor) throws ValorNegativoException;
    public abstract void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException;
}
```

### Implementação concreta:

```java
public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) throws ValorNegativoException {
        if (valor < 0) {
            throw new ValorNegativoException("Depósito não pode ser negativo.");
        }
        saldo += valor;
    }

    @Override
    public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        if (valor < 0) {
            throw new ValorNegativoException("Saque não pode ser negativo.");
        }
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
    }
}
```

### Testando a classe:

```java
public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(1000, 500);

        try {
            conta.depositar(200);
            conta.sacar(1500); // Dentro do limite
            conta.sacar(300);  // Excederá saldo + limite
        } catch (ValorNegativoException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

---
* [Documentação Java - Tratamento de Exceções (Oracle)](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)
* [Herança de Exceções em Java (Oracle)](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html)
