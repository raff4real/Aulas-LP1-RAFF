package semana22;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

//Conexao com o MySql
/* JDBC - Conjunto de interfaces e classes para acesso a SGBDs
 *  Java app - reunirá as classes do JDBC, cujo usará um driver (biblioteca que implementa JDBC) para executar os comandos do SGBD
 * App desktop --> JDBC  --> Driver MySQL --> MySQL
 */

public class Main {

    public static void main(String[] args) throws SQLException {
            // Abrir conexao
            String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
            Connection connection = DriverManager.getConnection(url);


            // executar a consulta SQL 
            String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);";
            Statement stm = connection.createStatement();
            stm.execute(sql);


            //fechando a conexão

            stm.close();
            connection.close();
    
    }

}