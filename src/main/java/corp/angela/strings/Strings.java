package corp.angela.strings;

public class Strings {

  public static void main(String[] args) {

    var nome = "André";
    var sobreNome = "Gomes";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    var string = new String(" Minha  String ");

    System.out.println("Char na posição : " + string.charAt(5));
    System.out.println("Quantidade=" + string.length());
    System.out.println("Sem Trim [" + string + "]");
    System.out.println("Com Trim [" + string.trim() + "]");
    System.out.println("Lower " + string.toLowerCase());
    System.out.println("Upper " + string.toUpperCase());
    System.out.println("Contém M? " + string.contains("M"));
    System.out.println("Contém X? " + string.contains("X"));
    System.out.println("Replace " + string.replace("n", "$"));
    System.out.println("Equals? " + string.equals(" Minha String "));
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));
    System.out.println("Substring(1,6)=" + string.substring(1, 6));

    System.out.println("A B C D E F G".toCharArray());
    System.out.println("Aula de Java".split(" "));

    String r = "Aula de Java";
    String[] s = r.split(" ");
    System.out.println(s[0]);
    System.out.println(s[1]);
    System.out.println(s[2]);
//    System.out.println(s); // resulta numa mensagem L java lang

    System.out.println("Aula".concat(" de Java"));
    System.out.println("1234 asq qw".replaceAll("[0-9]","#"));

  }
}