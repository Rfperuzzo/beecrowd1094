# ☣️ PROTOCOLO 1094
### 🩸 O LABORATÓRIO DAS COBAIAS 🩸

```text
╔══════════════════════════════════════════════╗
║                                              ║
║         ⚠️  ACESSO RESTRITO  ⚠️              ║
║                                              ║
║         PROJETO: PROTOCOLO 1094               ║
║         INSTALAÇÃO: DESCONHECIDA              ║
║         STATUS: EXPERIMENTOS ATIVOS           ║
║         CLASSIFICAÇÃO: CONFIDENCIAL           ║
║                                              ║
║         NÃO ABRA OS RECINTOS.                 ║
║         NÃO INTERROMPA A CONTAGEM.            ║
║         NÃO PERGUNTE PELOS DESAPARECIDOS.     ║
║                                              ║
╚══════════════════════════════════════════════╝
```

> *"Eles entraram como números. Saíram como estatísticas. Nenhum deles teve o direito de escolher."*

---

## 🕯️ ARQUIVO 001 — O INÍCIO DO PESADELO

Em algum lugar, abaixo de uma instalação esquecida, existe um laboratório que não aparece em nenhum mapa.

Lá, três espécies são registradas em experimentos de natureza desconhecida.

🐇 **COELHOS — Código C**  
🐀 **RATOS — Código R**  
🐸 **SAPOS — Código S**

Cada experimento acrescenta novas cobaias ao registro.

Cada número é armazenado.

Cada espécie é contabilizada.

E quando o último experimento termina...

**O SISTEMA REVELA O DESTINO ESTATÍSTICO DE TODOS.**

Este projeto implementa o exercício **1094 – Experiências**, da plataforma Beecrowd, utilizando Java para contabilizar cobaias e calcular a participação percentual de cada espécie.

---

## ☠️ ARQUIVO 002 — O CÓDIGO PROIBIDO

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cp, rp, sp;
        int i = 1, n, quantidade, quantidadeT,
            coelho = 0, rato = 0, sapo = 0;

        String c = "C", r = "R", s = "S", pergunta;

        n = scanner.nextInt();

        while (i <= n) {

            quantidade = scanner.nextInt();
            pergunta = scanner.next();

            if (pergunta.equals(c)) {
                coelho = coelho + quantidade;
            } else {
                if (pergunta.equals(r)) {
                    rato = rato + quantidade;
                } else {
                    if (pergunta.equals(s)) {
                        sapo = sapo + quantidade;
                    }
                }
            }

            i++;
        }

        quantidadeT = coelho + rato + sapo;

        cp = (coelho * 100.0) / quantidadeT;
        rp = (rato * 100.0) / quantidadeT;
        sp = (sapo * 100.0) / quantidadeT;

        System.out.println("Total: " + quantidadeT + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);

        System.out.printf("Percentual de coelhos: %.2f %%%n", cp);
        System.out.printf("Percentual de ratos: %.2f %%%n", rp);
        System.out.printf("Percentual de sapos: %.2f %%%n", sp);
    }
}
```

> ⚠️ **AVISO:** Este código não realiza experimentos reais. Apenas processa dados. O horror está inteiramente na narrativa.

---

## 🧪 ARQUIVO 003 — O RITUAL DE CONTAGEM

O sistema segue cinco etapas inevitáveis.

**I — A ABERTURA DAS CÂMARAS**

O operador informa quantos experimentos serão registrados.

```java
n = scanner.nextInt();
```

**II — A IDENTIFICAÇÃO DAS COBAIAS**

Cada experimento informa uma quantidade e uma espécie.

```java
quantidade = scanner.nextInt();
pergunta = scanner.next();
```

**III — A SEPARAÇÃO DAS ESPÉCIES**

Os registros são separados conforme seus códigos.

```java
if (pergunta.equals(c)) {
    coelho = coelho + quantidade;
}
```

O mesmo procedimento é aplicado aos ratos e sapos.

**IV — O INVENTÁRIO FINAL**

```java
quantidadeT = coelho + rato + sapo;
```

Nenhum registro válido escapa à soma.

**V — O JULGAMENTO PERCENTUAL**

```java
cp = (coelho * 100.0) / quantidadeT;
rp = (rato * 100.0) / quantidadeT;
sp = (sapo * 100.0) / quantidadeT;
```

O laboratório calcula a proporção de cada espécie em relação ao total.

Os números não mentem.

**Mas também não contam toda a história.**

---

## 🩸 ARQUIVO 004 — REGISTRO DE EXPERIMENTO

### 📥 Dados encontrados no terminal

```text
6
10 C
6 R
15 S
5 C
14 R
10 S
```

### 📤 Relatório emitido pela instalação

```text
Total: 60 cobaias
Total de coelhos: 15
Total de ratos: 20
Total de sapos: 25
Percentual de coelhos: 25.00 %
Percentual de ratos: 33.33 %
Percentual de sapos: 41.67 %
```

### ☠️ Inventário das câmaras

| Câmara | Espécie | Quantidade | Percentual |
|---|---|---:|---:|
| 🐇 001 | Coelhos | 15 | 25,00% |
| 🐀 002 | Ratos | 20 | 33,33% |
| 🐸 003 | Sapos | 25 | 41,67% |
| ⚰️ TOTAL | Todas | 60 | 100% |

**RELATÓRIO CONCLUÍDO.**

**60 COBAIAS CONTABILIZADAS.**

**NENHUMA EXPLICAÇÃO FORNECIDA.**

---

## 🔬 ARQUIVO 005 — INSTRUMENTOS UTILIZADOS

| Instrumento | Função no laboratório |
|---|---|
| `Scanner` | Captura os registros |
| `while` | Mantém a contagem ativa |
| `if / else` | Separa as espécies |
| `String.equals()` | Identifica o código |
| `int` | Armazena as quantidades |
| `double` | Calcula os percentuais |
| `printf` | Emite o relatório final |

---

## 🧟 ARQUIVO 006 — CONHECIMENTOS ADQUIRIDOS

Durante a execução do Protocolo 1094, foram utilizados:

- Estruturas de repetição com `while`.
- Condicionais aninhadas com `if/else`.
- Comparação de Strings com `.equals()`.
- Acumuladores para contabilização.
- Operações aritméticas com números inteiros e reais.
- Cálculos percentuais.
- Formatação com duas casas decimais.
- Controle da quantidade de repetições.

O uso de `100.0` nos cálculos garante que o resultado seja obtido com divisão de ponto flutuante.

O operador `%%` no `printf` permite imprimir o símbolo `%`.

---

## 🪦 ARQUIVO 007 — A ÚLTIMA ANOTAÇÃO

```text
[23:47:02] SISTEMA INICIADO
[23:47:03] AGUARDANDO REGISTROS...
[23:47:19] PRIMEIRA COBAIA REGISTRADA
[23:48:11] CONTAGEM EM ANDAMENTO
[23:49:56] TOTAL CONSOLIDADO
[23:50:00] RELATÓRIO GERADO

[23:50:01] ERRO: MOVIMENTO DETECTADO NA CÂMARA 004

[23:50:02] VERIFICANDO...

[23:50:03] CÂMARA 004 NÃO EXISTE.

[23:50:04] ...

[23:50:05] QUEM ESTÁ AÍ?

[23:50:06] CONEXÃO ENCERRADA.
```

---

## ⚰️ INFORMAÇÕES DO PROJETO

**Identificação:** Beecrowd 1094  
**Nome oficial:** Experiências  
**Codinome:** Protocolo 1094  
**Linguagem:** Java  
**Categoria:** Estruturas de repetição e contadores  
**Estado:** OPERACIONAL ☣️

---

### 🩸 FIM DO ARQUIVO

> *"O experimento terminou. O programa foi encerrado. Mas ontem à noite, às 03:17, o terminal voltou a imprimir sozinho..."*

```text
Total: 61 cobaias
```

**HAVIA APENAS 60.**

**☠️ PROTOCOLO 1094 — NUNCA EXECUTE DUAS VEZES. ☠️**
