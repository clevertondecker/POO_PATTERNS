package fabricaDinamica;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SalvaJSON implements InseriDados{

    @Override
    public void InseriDados() {
      @SuppressWarnings("unchecked")
         
        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();
         
        FileWriter writeFile = null;
         
        //Armazena dados em um Objeto JSON
        jsonObject.put("nome", "Cleverton");
        jsonObject.put("sobrenome", "Decker");
        jsonObject.put("pais", "Brasil");
        jsonObject.put("estado", "SC");
         
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
