package Tester;

import Conexao.ConexaoDB;
import fabricaDinamica.FabricaDinamica;
import model.Livro;
import dao.LivroDao;
import java.io.IOException;
import java.sql.Connection;

public class Testador {

    public static void main(String[] args) {

        
        try {

            FabricaDinamica fb = new FabricaDinamica("properties.txt");
            fb.criaImplementacao(fabricaDinamica.InseriDados.class);
        } catch (IOException e) {
            e.printStackTrace();

        }

        
    }
}
