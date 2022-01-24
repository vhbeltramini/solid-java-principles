# solid-java-principles

# en-US

- SOLID
  - **S**ingle Responsibility Principle
  - **O**pen Closed Principle
  - **L**iskov Substitution Principle
  - **I**nterface Segregation Principle
  - **D**ependency Inversion Principle

# **S**ingle Responsibility Principle
Each class should be responsible for a single part or functionality of the system.

- Benefits 
  - **Testing** – A class with one responsibility will have far fewer test cases.
  - **Lower coupling** – Less functionality in a single class will have fewer dependencies.
  - **Organization** – Smaller, well-organized classes are easier to search than monolithic ones.

# **O**pen Closed Principle
Software components should be open for extension, but not for modification

- Benefits
  - **Less Bugs** - We stop ourselves from modifying existing code and causing potential new bugs in other parts of the system that could be using that part of code that we modify 

# **L**iskov Substitution Principle
Objects of a superclass should be replaceable with objects of its subclasses without breaking the system. In other words the Liskov Substitution Principle (LSP) applies to inheritance hierarchies such that derived classes must be completely substitutable for their base classes.

- Benefits
  - **Code re-usability**
  - **Reduced coupling**
  - **Easier maintenance** 


# **I**nterface Segregation Principle
No client should be forced to depend on methods that it does not use. In other words you should not use a hierarchie of a classe that you do not need all of his propriets or methods. To do that larger interfaces should be split into smaller ones. So, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

- Benefits 
  - **Readability and Maintainability** of the code because we reduce our classes implementation only to required actions that we need without any additional or unnecessary code.

# **D**ependency Inversion Principle
High-level modules should not depend on low-level modules, both should depend on abstractions. Our code should depend on abstractions (interfaces and abstract classes) instead of concrete implementations (classes). The abstractions should not depend on details; instead, the details should depend on abstractions.

- Benefits 
  - **Flexibility and Stability** at the level of the entire architecture


# pt-BR

# Principais pontos a serem seguidos para ter um Projeto adequado aos princípios SOLID

- Coesão:
  - Uma classe coesa faz bem uma única coisa
  - Classes coesas não devem ter várias responsabilidades
  
- Encapsulamento:
  - Getters e setters não são formas eficientes de aplicar encapsulamento
  - É interessante fornecer acesso apenas ao que é necessário em nossas classes
  - O encapsulamento torna o uso das nossas classes mais fácil e intuitivo
  
- Acoplamento:
  - Acoplamento é a dependência entre classes
  - Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
  - Devemos controlar o nível de acoplamento na nossa aplicação (falaremos mais sobre isso)
  
- SRP: 
  - Classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida;
  - Segundo o Princípio de Responsabilidade Única (SRP), uma classe deve ter um e apenas um motivo para ser alterada;
  
- Open Closed Principle:
  - Cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
  - O princípio Aberto/Fechado (OCP) diz que um sistema deve ser aberto para a extensão, mas fechado para a modificação portanto devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes;
  - Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração;
  
- Liskov Substitution Principle:
  - Embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
  - O Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.  

- Interface Segregation Principle
  - É mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
  - As interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
  - O Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;
  - O Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;

# References

A Solid Guide to SOLID Principles - https://www.baeldung.com/solid-principles
What are the SOLID principles in Java? - https://www.educative.io/edpresso/what-are-the-solid-principles-in-java

