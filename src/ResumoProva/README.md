# 🧠 Revisão Java: Programação Orientada a Objetos


---

## 📌 Classe `Pessoa`

```java
class Pessoa {
    protected String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método que pode ser sobrescrito por subclasses
    public void trabalhar() {
        System.out.println("A pessoa está trabalhando.");
    }
}
```

---

## 👨‍💼 Classe `Funcionario` (Herança de Pessoa)

```java
class Funcionario extends Pessoa {
    public Funcionario(String nome) {
        super(nome); // chama o construtor da superclasse
    }

    @Override
    public void trabalhar() {
        System.out.println("O funcionário está trabalhando.");
    }
}
```

---

## 🐾 Classe `Animal`

```java
class Animal {
    protected String nome;
    protected int idade;
    protected String som;

    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }
}
```

---

## 🐶 Classe `Cachorro` (Herança de Animal)

```java
class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String som, String raca) {
        super(nome, idade, som);
        this.raca = raca;
    }

    public void latir() {
        System.out.println("O cachorro faz: " + som);
    }
}
```

---

## 🎓 Classe `Aluno` (Encapsulamento)

```java
class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }

    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }

    // Método para calcular a média
    public double calculaMedia() {
        return (nota1 + nota2) / 2;
    }
}
```

---

## 🟪 Classe `Figura`

```java
class Figura {
    protected String cor;
    protected boolean preenchido;

    public Figura(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }
}
```

---

## 📐 Classe `Retangulo` (Herança de Figura)

```java
class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(String cor, boolean preenchido, double largura, double altura) {
        super(cor, preenchido);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}
```

---

## ⚠️ Classe `ExemploExcecao` (Tratamento de Erros)

```java
import java.util.InputMismatchException;
import java.util.Scanner;

class ExemploExcecao {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                throw new ArithmeticException("Número negativo não pode ter raiz real.");
            }

            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        } catch (InputMismatchException e) {
            System.out.println("Erro: valor digitado não é um número inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Erro matemático: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
```

---

## 🏁 Classe `RevisaoPOO` (Principal)

```java
public class RevisaoPOO {
    public static void main(String[] args) {
        // Herança com sobrescrita
        Funcionario f = new Funcionario("João");
        f.trabalhar();

        // Herança com atributos adicionais
        Cachorro dog = new Cachorro("Rex", 3, "Au au!", "Labrador");
        dog.latir();

        // Encapsulamento com get/set
        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setNota1(8.5);
        aluno.setNota2(7.0);
        System.out.println("Média da aluna " + aluno.getNome() + ": " + aluno.calculaMedia());

        // Polimorfismo com herança
        Retangulo r = new Retangulo("Azul", true, 5, 10);
        System.out.println("Área do retângulo: " + r.calcularArea());

        // Tratamento de exceções
        ExemploExcecao.executar();
    }
}
```

---
