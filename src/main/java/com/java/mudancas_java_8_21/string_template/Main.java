package com.java.mudancas_java_8_21.string_template;

/*
* String Template
*
* Mudar language level para 19 Preview
*   File > Project Structure > Project > Language Level > 19 (Preview) - Record patterns, pattern matching for switch (3rd preview)
*   File > Project Structure > Modules > (seu_módulo) > Sources > Language level > 19 (Preview) - Record patterns, pattern matching for switch (3rd preview)
*   Habilitar o preview no POM.xml

*
*
*
      <configuration>
         <release>${java.version}</release>
         <enablePreview>true</enablePreview>
      </configuration>
      *

  * Esse código não executa na minha IDE.
  * Vou atualizar a IDE para ter a opção Java 21 em Language Source e corrijo esse código depois.

* * * */

public class Main {

    public static void main(String[] args) {
        String st1 = "Hello World";
        String st2 = "My name is Marcus";
    }

    static String concatenar(String firstPhrase, String secondPhrase) {
        //  A esquerda fica o processador
        //  return STR."Greeting is: \{ firstPhrase } \{ secondPhrase }";
        return "";
    }

}
