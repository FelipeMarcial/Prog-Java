package edu.dio.intro;

/*

Começa com a classe, as classes começam com Letra Maiscula e a cada palavra Maiscula novamente
Link útil: https://glysns.gitbook.io/java-basico/sintaxe/anatomia-das-classes

*/
public class Convencoes {
    //Dentro das classes ficam os métodos e cada classe precisa ter um método principal (main)
    
    //Este método em String [] dizemos que ele é um array que contém argumentos (args)
    public static void main (String [] args ){
        //Classe do sistema que tem várias ações
        System.out.println("Olá turma, sejam bem-vindos");

        String primeiroNome;
        String segundoNome;
        
        primeiroNome = "Felipe";
        segundoNome = "Marcial";
        
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);     

        System.out.println(nomeCompleto);

    }

//Método que concatena o primeiro nome com o segundo nome e é chamado dentro do main
    public static String nomeCompleto ( String primeiroNome, String segundoNome){
        return ("O resultado foi: " + primeiroNome + " " + segundoNome);
    }
}
