Aqui está a transcrição completa do arquivo **"Aula 01 - Java + Revisão Lógica + Condicionais.pdf"**:

---

# **Programação Orientada a Objetos**  
### Prof. Ricardo Frohlich da Silva  

## **Ementa:**  
- Orientação a objetos  
- Sintaxe de linguagens de programação orientadas a objetos  
- Programação orientada a objetos  
- Reutilização de classes  

## **Programa:**  
### **Unidade 1 - Orientação a Objetos**  
1.1 Características de linguagens orientadas a objetos  
1.2 Compiladores e máquinas virtuais  
1.3 Boas práticas em programação orientada a objetos  

### **Unidade 2 - Sintaxe de Linguagens de Programação Orientadas a Objetos**  
2.1 Tipos de dados e operadores  
2.2 Comandos de controle de fluxo  
2.3 Tratamento de exceções  

### **Unidade 3 - Programação Orientada a Objetos**  
3.1 Classes, objetos, atributos e métodos  
3.2 Construtores e destrutores  
3.3 Encapsulamento do objeto e modificadores de acesso  

### **Unidade 4 - Reutilização de Classes**  
4.1 Herança  
4.2 Polimorfismo  
4.3 Classes abstratas e interfaces  

## **Avaliação da Disciplina**  
A avaliação será quantitativa, composta por três notas resultantes dos produtos de aprendizagem e dos exercícios realizados.  

**Cálculo das notas:**  
- **N1 =** (Produto de aprendizagem 1 * 0.6) + (Exercícios e teste * 0.4)  
- **N2 =** (Produto de aprendizagem 2 * 0.6) + (Exercícios, teste e trabalhos * 0.4)  
- **N3 =** (Produto de aprendizagem 3 * 0.6) + (Exercícios, teste e trabalhos * 0.4)  

**Nota Final = (N1 + N2 + N3) / 3**  

- Nota mínima para aprovação: **6,0**  
- Frequência mínima: **75%**  

## **Datas de Avaliações:**  
- **Produto de Aprendizagem 1:** 21/03  
- **Produto de Aprendizagem 2:** 02/05  
- **Produto de Aprendizagem 3:** 20/06  

---

## **Introdução à Programação Orientada a Objetos**  

### **Histórico das Linguagens de Programação**  
- **1950-60:** FORTRAN, ALGOL 60, COBOL  
- **1970:** Pascal, Smalltalk, C, BASIC  
- **1980:** C++, Object Pascal, Objective-C  
- **1991:** VisualBASIC, Oak, Python  
- **1995:** PHP, Ruby, Java  
- **2001:** C#  

### **Paradigmas de Programação**  
- **Linguagens Imperativas:**  
  - Estruturadas/Procedurais: COBOL, FORTRAN, C, Pascal  
  - Orientadas a Objetos: Smalltalk, C++, Python, Java, C#  
- **Linguagens Declarativas:**  
  - Funcionais: Erlang, R, XSLT  
  - Lógicas: Prolog, LISP  

### **Por que Programação Orientada a Objetos?**  
- É amplamente utilizada no mercado  
- Garante segurança e reutilização de código  
- Possibilita alta empregabilidade  

## **A Linguagem Java**  
- Similar ao C/C++  
- Possui uma vasta biblioteca pronta  
- Exige padrões modernos de desenvolvimento  
- Compatível com diversas plataformas  

**Evolução do Java:**  
- **Até 1994:** Foco em Dispositivos Embarcados  
- **1995:** Implementação em navegadores Web  
- **Atualmente:** Plataforma ampla com múltiplas soluções  

**Execução em Múltiplas Plataformas**  
- Código compilado em **Byte Code**  
- Interpretador Java traduz o código para o computador  
- Interpretador Java é chamado de **Java Virtual Machine (JVM)**  
- Para rodar aplicações Java, é necessário o **Java Runtime Environment (JRE)**  
- Para desenvolver em Java, é necessário o **Java Development Kit (JDK)**  

---

## **Primeiro Programa em Java**  

1. **Criando um Projeto no Eclipse:**  
   - Criar um novo projeto  
   - Criar uma classe com **public static void main(String[] args)**  

2. **Exibindo uma Mensagem:**  
   ```java
   System.out.println("Olá, Mundo!");
   ```
   - O `ln` no `println` quebra a linha automaticamente.  
   - Para não quebrar a linha, usar `System.out.print()`.  

---

## **Utilizando Variáveis**  
- Variáveis em Java devem ser declaradas com um tipo  
- Exemplo:  
  ```java
  int numero = 10;
  double preco = 9.99;
  String nome = "Java";
  ```

## **Atalhos Úteis no Eclipse**  
- **sysout + Ctrl + Espaço** → `System.out.println()`  
- **Alt + Shift + R** → Renomear todas as ocorrências de uma variável  
- **Ctrl + D** → Excluir linha atual  
- **Ctrl + /** → Comentar linha  
- **Ctrl + Shift + /** → Comentar bloco  
- **Ctrl + Shift + \\** → Descomentar bloco  
- **Ctrl + Shift + F** → Autoformatar código  

---

## **Leitura pelo Teclado com Scanner**  
1. Importar a biblioteca:  
   ```java
   import java.util.Scanner;
   ```
2. Criar um objeto Scanner:  
   ```java
   Scanner entrada = new Scanner(System.in);
   ```
3. Leitura de diferentes tipos de dados:  
   ```java
   int numero = entrada.nextInt();
   double valor = entrada.nextDouble();
   String texto = entrada.nextLine();
   ```

---

## **Condicionais em Java**  

### **Estrutura IF/ELSE**  
```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### **Switch Case**  
```java
switch (diaSemana) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```

---

## **Atividades Propostas**  

1. **Leia dois números e realize as quatro operações matemáticas.**  
2. **Calcule o rendimento de um táxi com base em consumo de combustível.**  
3. **Verifique se um número é par ou ímpar.**  
4. **Leia quatro valores e exiba os que são superiores à média.**  
5. **Determine em qual quadrante um ponto (x, y) está no plano cartesiano.**  
6. **Leia três valores e informe o maior deles.**  
7. **Exiba os valores do exercício 6 em ordem crescente.**  
8. **Verifique se dois números são múltiplos um do outro.**  
9. **Determine a situação de um eleitor conforme a idade:**  
   - **<16 anos:** Não apto a votar  
   - **16-18 ou >70 anos:** Voto facultativo  
   - **18-70 anos:** Voto obrigatório  
10. **Adapte o exercício 1 para usar um menu com switch case.**  

---

Essa é a transcrição completa do documento! Se precisar de algum detalhe específico ou uma explicação mais aprofundada sobre algum tópico, estou à disposição. 😊