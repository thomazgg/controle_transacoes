# 🕹️ Controle de Transações

##

**📜 Instruções:**

> - Desenvolva um **controle de transações** onde cada `cliente` possui uma `conta` com seus `dados`.
> - A cada operação realizada pelo `cliente` uma `transação` é criada e **associada à sua respectiva conta**.
> - Cada `transação` possui um tipo `(compra a vista, compra parcelada, saque ou pagamento)`, um `valor` e uma `data de criação`.
> - Transações de tipo `​compra` e `saque` são registradas com ​**valor negativo​** `(-)`, enquanto transações de `pagamento` são registradas com **valor positivo** `(+)`​.
> - Utilize os conceitos como a **herança, interface e tratamento de erros**.
> - No final apresente um código funcional com uma `classe de teste`.
> - Crie junto ao projeto um arquivo chamado [README.txt]() e, dentro dele, escreva um texto explicando os conceitos aplicados e por que.
> - Faça uma classe de teste mostrando as funcionalidades desenvolvidas.

**‍💻 No sistema é esperado:**

> - Vários `tipos` de `conta`
> - Uma `classe` que `controle` as `transações`
> - Um `relatório` mostrando o `histórico` de todas as `transações` por `cliente`
> - Um `relatório` mostrando todas as `transações` de todos os `clientes`
> - O `saldo` do `cliente`

---

# 🔖 Informações sobre o que foi usado:

> ## [Pessoa.java]()
>
> `Nome` - `CPF` - `Idade`

> ## [Cliente.java]()
>
> Possui uma `conta` e uma **heranca** em `pessoa.java`

> ## [Transacao.java]()
>
> Possui uma **interface** com os tipos de transacao: `vista` / `parcelada` / `saque` / `pagamento` / `data`

> ## [Conta.java]()
>
> Faz as implementações da classe `transacao.java`

> ## [Main.java]()

---

# 📝 Licença

### [🔗 Link do projeto do github](https://github.com/thomazgg/controle_transacoes)

#### _Feito por:_ **Joao Victor Thomaz Cardoso**
