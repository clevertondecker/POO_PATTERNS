/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaDinamica;

import Conexao.ConexaoDB;
import Model.Livro;
import dao.LivroDao;
import java.sql.Connection;

public class SalvaDB implements InseriDados {

    @Override
    public void InseriDados() {
       
        Livro l2 = new Livro("Mongo BD2", "Beta", "kaleals", 4, 23.87);

        Connection conec = ConexaoDB.getInstance();
        Connection conec2 = ConexaoDB.getInstance();
        Connection conec3 = ConexaoDB.getInstance();

        LivroDao ldao = new LivroDao(conec);
        ldao.save(l2);
    }
    

    public SalvaDB() {
        this.InseriDados();
    }

}
