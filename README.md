# SOLID

Projeto realizado durante o curso [SOLID com Java](https://cursos.alura.com.br/course/solid-orientacao-objetos-java) para aprender conceitos de orientação a objetos e os princípios SOLID na linguagem Java.

## Princípios

### Single Responsibility Principle

- Classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida
- Uma classe deve ter um e apenas um motivo para ser alterada

### Open Closed Principle

- Cada classe deve conhecer e ser responsável por suas próprias regras de negócio
- Um sistema deve ser aberto para a extensão, mas fechado para a modificação, ou seja, devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes
- Uma classe que tende a crescer indefinidamente é uma forte candidata a sofrer alguma espécie de refatoração

### Liskov Substitution Principle

- Embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta
- Devemos poder substituir classes base por suas classes derivadas em qualquer lugar

### Interface Segregation Principle

- As interfaces devem definir apenas os métodos que fazem sentido para seu contexto
- Uma classe não deve ser obrigada a implementar um método que ela não precisa

### Dependency Inversion Principle

- É mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe
- As interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento
- Implementações devem depender de abstrações e abstrações não devem depender de implementações
