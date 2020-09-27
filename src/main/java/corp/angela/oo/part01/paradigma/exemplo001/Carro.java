package corp.angela.oo.part01.paradigma.exemplo001;

public class Carro {

    private int qtdePessoas = 0;

    /*
    Construtor aqui esta omitido
    Como seria um construtor padrao, nao ha necessidade de torna-lo explicito

    public Carro (){
    }

     */


    public int entraPessoas(int entra) {
        qtdePessoas += entra;
        if (qtdePessoas >= 4) {
            qtdePessoas = 4;
        }
        return qtdePessoas;
    }

    public int saiPessoas(int sai) {
        qtdePessoas -= sai;
        if (qtdePessoas <= 0) {
            qtdePessoas = 0;
        }
        return qtdePessoas;
    }

}
