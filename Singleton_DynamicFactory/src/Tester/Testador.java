package Tester;

import Conexao.ConexaoDB;
import fabricaDinamica.FabricaDinamica;
import Model.Livro;
import dao.LivroDao;
import java.io.IOException;
import java.sql.Connection;

public class Testador {

    public static void main(String[] args) {

        //o dinamismo ocorre porque a clase que é instanciada na linha 25
        //da fabrica dinamicaa eh o que esa no arquivo de propriedades
        //permitindo flexibilidade sem alterações no codigo ex;
        // uma classe para cada cliente
        
        try {

            FabricaDinamica fb = new FabricaDinamica("properties.txt");
            fb.criaImplementacao(fabricaDinamica.InseriDados.class);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
