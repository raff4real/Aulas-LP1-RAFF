package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirAluno {
    public static void main(String[] args) throws SQLException {
        // Abrir conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        int id = 1;
        String nome = "Maria da Silva";
        String email = "mariaa@gmail.com";
        boolean ativo = true;

        // Executar a consulta e usar os resultados
        String sql = "INSERT INTO alunos VALUES(?, ?, ?, ?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, ativo);
        pstm.executeUpdate();

        pstm.close();
        connection.close();
    }

}
