package br.com.univille.poo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Pessoa Data Acess Object
 * @author leandersonandre
 *
 */
public class PessoaDAO extends BasicoDAO{
	

	/**
	 * Inserir uma nova pessoa
	 * @param pessoa
	 */
	public void insert(Pessoa pessoa) {

		String sql = " insert into pessoa(nome, sobrenome) values(?,?)";
		
		try (Connection conn = getConnection();
			 PreparedStatement statement = conn.prepareStatement(sql)){
			statement.setString(1, pessoa.getNome());
			statement.setString(2, pessoa.getSobrenome());
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Deletar uma pessoa pelo id
	 * @param pessoa
	 */
	public void delete(Pessoa pessoa) {
		
		String sql = " delete from pessoa where id = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setInt(1, pessoa.getId());
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Atualizar uma pessoa pelo id
	 * @param pessoa
	 */
	public void update(Pessoa pessoa) {
		String sql = " update pessoa set nome = ?, sobrenome = ? where id = ?";
		
		try (Connection conn = getConnection();
			 PreparedStatement statement = conn.prepareStatement(sql)){
			statement.setString(1, pessoa.getNome());
			statement.setString(2, pessoa.getSobrenome());
			statement.setInt(3, pessoa.getId());
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Obter uma pessoa pelo id
	 * @param id
	 * @return
	 */
	public Pessoa getById(int id) {
		Pessoa pessoa = null;
		String sql = " select id, nome, sobrenome from pessoa where id = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				pessoa = new Pessoa();
				pessoa.setId(resultSet.getInt(1));
				pessoa.setNome(resultSet.getString(2));
				pessoa.setSobrenome(resultSet.getString(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pessoa;
	}
	
	/**
	 * Obter todas as pessoas da tabel
	 * @return
	 */
	public List<Pessoa> getAll(){
		List<Pessoa> list = new ArrayList<>();
		String sql = " select id, nome, sobrenome from pessoa order by nome";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setId(resultSet.getInt(1));
				pessoa.setNome(resultSet.getString(2));
				pessoa.setSobrenome(resultSet.getString(3));
				
				list.add(pessoa);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
