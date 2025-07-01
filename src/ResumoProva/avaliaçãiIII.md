
# 🚀 RESUMÃO - Programação Orientada a Objetos e Java

(Com base nos seus PDFs: Aulas 01 a 13)

---

## 📌 **Aula 01 - Revisão lógica, variáveis e condicionais**

* Variáveis (`int`, `double`, `String`, `boolean`).
* Entrada de dados com `Scanner`.
* Estruturas de decisão:

    * `if`, `else if`, `else`
    * `switch`
* Exemplo:

```java
Scanner sc = new Scanner(System.in);
int idade = sc.nextInt();
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

---

## 📌 **Aula 02 - Laços, Vetores e Matrizes**

* Laços: `for`, `while`, `do-while`.
* Vetores (arrays) e matrizes.
* Percorrer arrays para somar, buscar maior, calcular média.
* Exemplo `for`:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

## 📌 **Aula 03 e 04 - Classes, Métodos e Construtores**

* Introdução a POO: classe = molde, objeto = instância.
* Atributos (variáveis da classe).
* Métodos (funções dentro da classe).
* Construtores: inicializam o objeto.
* Sobrecarga: vários construtores/métodos com assinaturas diferentes.

```java
public class Pessoa {
    private String nome;
    public Pessoa(String nome) { this.nome = nome; }
}
```

---

## 📌 **Aula 05 - Tratamento de exceções**

* `try-catch` para capturar erros em tempo de execução.
* Evita que o programa quebre.
* Exemplo:

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Divisão por zero!");
}
```

---

## 📌 **Aula 06 - Encapsulamento**

* Modificadores de acesso: `private`, `public`, `protected`.
* `getters` e `setters` para acessar atributos privados.

```java
private String nome;
public String getNome() { return nome; }
public void setNome(String nome) { this.nome = nome; }
```

---

## 📌 **Aula 07 - Herança**

* `extends`: uma classe herda atributos e métodos de outra.
* `super`: chama o construtor da superclasse.

```java
class Animal { }
class Cachorro extends Animal { }
```

* Java **não suporta herança múltipla direta**, mas via cadeia (A->B->C).

---

## 📌 **Aula 08 - Polimorfismo**

* **Sobrescrita (Override)**: reimplementa método da superclasse na subclasse.
* **Sobrecarga (Overload)**: métodos com o mesmo nome mas parâmetros diferentes.

```java
@Override
public void emitirSom() { System.out.println("Au au"); }

public void emitirSom(String intensidade) { }
```

---

## 📌 **Aula 09 - Listas**

* `ArrayList` do Java:

```java
List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.get(0);
```

* Exercícios com lista de objetos (`Produto`, `Aluno`, etc).

---

## 📌 **Aula 10 - Classes abstratas e Interfaces**

* **Classe abstrata:** não pode ser instanciada, usada como modelo. Pode ter métodos concretos e abstratos.

```java
abstract class Animal {
    public abstract void emitirSom();
}
```

* **Interface:** contrato de métodos que a classe implementa. Todos métodos são públicos e abstratos.

```java
interface Exibivel {
    void exibirDetalhes();
}
```

---

## 📌 **Aula 11 - Exceções personalizadas**

* Criar exceções próprias estendendo `Exception`.

```java
class MinhaExcecao extends Exception {
    public MinhaExcecao(String msg) { super(msg); }
}
```

* `throw new MinhaExcecao("Mensagem")` para lançar.

---

## 📌 **Aula 12 - Arquivos**

* Escrever com `FileWriter` + `BufferedWriter`.
* Ler com `FileReader` + `BufferedReader`.

```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("dados.txt"))) {
    bw.write("texto");
}
```

---

## 📌 **Aula 13 - Serialização**

* **Serializar:** transformar objeto em bytes para salvar.
* JSON (Gson) ou `ObjectOutputStream` para binário.
* Desserializar: reconstruir objeto do arquivo.

---

* Classes, atributos privados + getters/setters,
* Métodos, construtores, sobrecarga,
* Herança, polimorfismo,
* Interfaces, classes abstratas,
* Try-catch e exceções próprias,
* Listas e manipulação de arquivos,

---
