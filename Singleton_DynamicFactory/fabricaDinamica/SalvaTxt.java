package fabricaDinamica;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import model.Livro;

public class SalvaTxt implements InseriDados {

    @Override
    public void InseriDados() {

        Livro l2 = new Livro("MYSQL intermedium", "Beta", "kaleals", 4, 23.87);
        String temp = l2.toString();
        
        try   {
   
      //Gera o arquivo para armazenar o objeto
      FileOutputStream arquivoGrav =
      new FileOutputStream("file.txt");
      //Classe responsavel por inserir os objetos
      ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
      //Grava o objeto cliente no arquivo
      objGravar.writeObject(temp);
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
