# **Escala de Coma de Glasgow - Aplicação Java**

Este é um programa simples em Java que calcula a **Escala de Coma de Glasgow**, uma ferramenta médica usada para avaliar o nível de consciência de um paciente. O programa soma três critérios (Abertura Ocular, Resposta Verbal e Resposta Motora) e determina o nível de consciência do paciente.

---

## **Funcionalidades**
- Interface gráfica simples e intuitiva.
- Calcula a pontuação total com base nos valores inseridos.
- Classifica o nível de consciência em **Leve**, **Moderado** ou **Grave**.

---

## **Como Usar**

### **Requisitos**
- Java Development Kit (JDK) instalado (versão 8 ou superior).
- Um ambiente de desenvolvimento (IDE) como IntelliJ, Eclipse ou VS Code (opcional).

### **Passos para Executar o Programa**

1. **Clone o Repositório** (se estiver usando Git):
   ```bash
   git clone https://github.com/seu-usuario/escala-glasgow.git
   cd escala-glasgow
   ```

2. **Compile o Código**:
   - Abra o terminal na pasta do projeto.
   - Compile o código com o comando:
     ```bash
     javac EscalaGlasgow.java
     ```

3. **Execute o Programa**:
   - No terminal, execute o programa com o comando:
     ```bash
     java EscalaGlasgow
     ```

4. **Interface Gráfica**:
   - Uma janela será aberta com os seguintes campos:
     - **Abertura Ocular (1-4)**
     - **Resposta Verbal (1-5)**
     - **Resposta Motora (1-6)**
   - Preencha os campos com os valores adequados.
   - Clique no botão **CALCULAR** para ver o resultado.

5. **Resultado**:
   - O programa exibirá:
     - A pontuação total.
     - O nível de consciência (Leve, Moderado ou Grave).

---

## **Exemplo de Uso**

### **Entrada:**
- Abertura Ocular: **3**
- Resposta Verbal: **4**
- Resposta Motora: **5**

### **Saída:**
- Pontos: **12**
- Nível de Consciência: **Leve**

---

## **Estrutura do Código**

### **Classes e Métodos**
- **Classe Principal**: `EscalaGlasgow`
  - Configura a interface gráfica.
  - Implementa a lógica de cálculo da escala.
- **Métodos**:
  - `initComponents()`: Configura os componentes da interface.
  - `actionPerformed()`: Executa o cálculo quando o botão é clicado.

### **Componentes da Interface**
- **Rótulos (`JLabel`)**: Exibem textos como "Abertura Ocular".
- **Campos de Texto (`JTextField`)**: Onde o usuário digita os valores.
- **Botão (`JButton`)**: Botão "CALCULAR" para iniciar o cálculo.

## **Autor**
- **Robert Emanuel**



## **Melhorias Futuras**
- Adicionar validação de entrada (garantir que os valores estejam dentro dos intervalos permitidos).
- Melhorar o design da interface gráfica.
- Adicionar suporte para salvar os resultados em um arquivo.
