# 💼 Sistema de Cálculo de Salários em Java (POO)

Este projeto foi desenvolvido com o objetivo de **praticar e demonstrar os principais pilares da Programação Orientada a Objetos (POO)** em Java por meio de um sistema simples de cálculo de salários de funcionários.

A aplicação simula diferentes tipos de funcionários, cada um com sua própria regra de cálculo salarial, utilizando **herança, polimorfismo, classes abstratas e sobrescrita de métodos**.

---

## 🧠 Conceitos de POO aplicados

- ✅ Classe Abstrata
- ✅ Herança
- ✅ Polimorfismo
- ✅ Override de métodos
- ✅ Reaproveitamento e organização de código
- ✅ Uso de vetores de objetos

---

## 🧩 Funcionamento

A classe abstrata `Funcionario` define a estrutura básica de um funcionário e obriga que as classes filhas implementem o método `calcularSalario()`.

As classes:

- `Gerente` → recebe salário base + bônus
- `Desenvolvedor` → recebe salário base + valor por hora extra

No `Main`, os funcionários são armazenados em um vetor do tipo `Funcionario`, demonstrando **polimorfismo**, pois cada objeto executa sua própria regra de cálculo salarial.

---

## ▶️ Como executar

1. Clone o repositório
2. Abra em sua IDE Java (IntelliJ, Eclipse, VSCode, etc.)
3. Execute a classe `Main.java`

---

## 🎯 Objetivo do Projeto

Este projeto tem caráter **didático**, focado em reforçar os fundamentos de POO na prática, sendo ideal para estudantes que estão aprendendo:

- Orientação a Objetos
- Estrutura de classes em Java
- Boas práticas de organização de código

---
