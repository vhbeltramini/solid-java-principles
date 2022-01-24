# solid-java-principles

- SOLID
  - **S**ingle Responsibility Principle
  - **O**pen Closed Principle
  - **L**iskov Substitution Principle
  - **I**nterface Segregation Principle
  - **D**ependency Inversion Principle


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

