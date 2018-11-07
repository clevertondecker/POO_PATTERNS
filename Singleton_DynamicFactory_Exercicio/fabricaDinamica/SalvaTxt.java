package fabricaDinamica;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SalvaTxt implements InseriDados {

    @Override
    public void InseriDados() {
    try
 
    {
      //Gera o arquivo para armazenar o objeto
      FileOutputStream arquivoGrav =
      new FileOutputStream("file.txt");
      //Classe responsavel por inserir os objetos
      ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
      //Grava o objeto cliente no arquivo
      objGravar.writeObject("Gravando no TXT");
      objGravar.flush();
      objGravar.close();
      arquivoGrav.flush();
      arquivoGrav.close();
      System.out.println("Objeto gravado com sucesso!");
 
    }
 
    catch(Exception e) {
 
      e.printStackTrace();
 
    }
    }

    public SalvaTxt() {
        this.InseriDados();
    }

}
