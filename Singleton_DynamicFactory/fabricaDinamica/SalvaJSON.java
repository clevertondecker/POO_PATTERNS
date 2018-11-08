package fabricaDinamica;

import java.io.FileWriter;
import java.io.IOException;
import model.Livro;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SalvaJSON implements InseriDados{

    @Override
    public void InseriDados() {
        
         Livro l2 = new Livro("MYSQL intermedium", "Beta", "kaleals", 4, 23.87);
        
        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();
         
        FileWriter writeFile = null;
         
            
        //Armazena dados em um Objeto JSON
        jsonObject.put("Titulo", l2.getTitulo());
        jsonObject.put("Autor", l2.getAutor());
        jsonObject.put("Editora", l2.getEditora());
        jsonObject.put("Avaliação", l2.getAvaliacao());
        jsonObject.put("Preço", l2.getPreco());

        try{
            writeFile = new FileWriter("saida.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
         
        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
 
    }
 
    
    public SalvaJSON() {
        this.InseriDados();
    }

}
