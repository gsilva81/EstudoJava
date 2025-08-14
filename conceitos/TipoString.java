package conceitos;

public class TipoString {
    public static void main(String[] args) {

        String s = "Bom dia";

        /*charAt: Identifica a letra no inidice que vc escolher (Sempre começa a contagem no 0)
         * No exemplo abaixo, a frase "Aprendendo sobre strings", o indice 0 é o A.
        */
        System.out.println("Aprendendo sobre strings".charAt(0));

        //concat: ele faz a concatenação de dados. Podendo ser utilizado o + também
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        /*startsWith: Identifica se a string começa ou não com a palavra
         * ela retorna apenas True ou False. Exemplo do texto "Bom dia"
         * a string tem que tá 100% escrita corretamente, (letras minusculas
         * e maiúscula interferem)
        */
        System.out.println(s.startsWith("BOM"));

        /*length: Identifica quantos caracteres tem uma string*/
        System.out.println(s.length());

        /*endsWith: Identifica se a string termina ou não com a palavra
         * ela retorna apenas True ou False. Exemplo do texto "Bom dia"
         * a string tem que tá 100% escrita corretamente, (letras minusculas
         * e maiúscula interferem)
        */
        System.out.println(s.endsWith("b"));

        /*equals: Identifica se a string é igual ou não com a variavel declarada
         * ela retorna apenas True ou False. Exemplo do texto "Bom dia"
         * a string tem que tá 100% escrita corretamente, (letras minusculas
         * e maiúscula interferem)
        */
        System.out.println(s.equals("Bom dia"));

        /*equalsIgnoreCase:Identifica se a string é igual ou não com a variavel declarada
         * ela retorna apenas True ou False. Exemplo do texto "Bom dia"
         * (letras minusculas e maiúscula NÃO interferem)
         */
        System.out.println(s.equalsIgnoreCase("bom dia"));

        /*Podemos criar variaveis utilizando a função "var" e o próprio Java fará a idenficação
         * do tipo dado daquela variável e para formatação "printf". 
         * %s - formatação para strings
         * %d - formatação para inteiros
         * %f - formatação para pontos flutuantes (voce pode colocar um .quantidade de casas decimais na frente do f)
         */
        var nome = "Gabriel";
        var sobrenome = "Silva";
        var idade = 25;
        var salario = 1.500;

        System.out.printf("meu nome é: %s %s %d %.2f", nome, sobrenome, idade, salario);

    }
}