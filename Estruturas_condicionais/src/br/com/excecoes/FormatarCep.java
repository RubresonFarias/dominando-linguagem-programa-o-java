package br.com.excecoes;

public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //e.printStackTrace();
            System.out.println("O CEP não conrresponde!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
