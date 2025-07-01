
# Resumo para Prova – Java & POO

---

## Fundamentos de POO

* **Classe:** Molde que define atributos e métodos.
  Ex: `class Carro { String modelo; void ligar() { ... } }`

* **Objeto:** Instância da classe.
  Ex: `Carro meuCarro = new Carro();`

* **Atributos:** Variáveis da classe (estado).

* **Métodos:** Funções da classe (comportamento).

* **Encapsulamento:**

    * Protege dados com `private`, acessados por `get` e `set`.
    * Ex:

      ```java
      private String nome;
      public String getNome() { return nome; }
      public void setNome(String nome) { this.nome = nome; }
      ```

---

## Herança

* Uma classe herda outra com `extends`.

* Ex:

  ```java
  class Animal { void emitirSom() { ... } }
  class Cachorro extends Animal { void emitirSom() { System.out.println("Latindo"); } }
  ```

* `super` chama construtor ou métodos da superclasse.

---

## Polimorfismo

* **Sobrescrita (Override):** mesmo método em classes diferentes, comportamentos diferentes.
* **Sobrecarga (Overload):** mesmo nome, parâmetros diferentes.

Ex:

```java
void som() { ... }
void som(String tipo) { ... }
```

---

## Classes Abstratas & Interfaces

* **Abstrata:**

    * Não pode instanciar, usa `abstract`.
    * Pode ter métodos implementados e abstratos.

  ```java
  abstract class Animal {
    abstract void emitirSom();
  }
  ```

* **Interface:**

    * Somente contratos (métodos sem corpo), implementa com `implements`.
    * Pode ter constantes (`public static final`).

  ```java
  interface Animal {
    void emitirSom();
  }
  ```

---

## Listas (ArrayList)

* Armazenam coleções dinâmicas.

```java
List<String> nomes = new ArrayList<>();
nomes.add("João");
System.out.println(nomes.get(0));
```

* Métodos importantes: `add`, `remove`, `get`, `size`.

---

## Arquivos

* Para escrever:

```java
FileWriter fw = new FileWriter("arquivo.txt");
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Hello");
bw.close();
```

* Para ler:

```java
FileReader fr = new FileReader("arquivo.txt");
BufferedReader br = new BufferedReader(fr);
String linha = br.readLine();
br.close();
```

---

## Serialização

* Transformar objeto em bytes para salvar ou enviar (ou JSON/XML).

```java
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dados.ser"));
out.writeObject(objeto);
out.close();
```

* E para ler:

```java
ObjectInputStream in = new ObjectInputStream(new FileInputStream("dados.ser"));
Objeto obj = (Objeto) in.readObject();
in.close();
```

---

## Tratamento & Criação de Exceções

* Usar `try-catch` para evitar que programa pare.

```java
try {
  int x = 10 / 0;
} catch (ArithmeticException e) {
  System.out.println("Erro: " + e.getMessage());
}
```

* Criar exceção personalizada:

```java
class MinhaExcecao extends Exception {
  public MinhaExcecao(String msg) { super(msg); }
}
```

* Lançar exceção: `throw new MinhaExcecao("Mensagem");`

---

* Sempre use `get`/`set` para atributos `private`.
* Use polimorfismo para tornar o código flexível (ex: `Animal a = new Cachorro();`).
* Em listas, percorra com `for-each`.
* Para exceções, capture a mais específica primeiro.

