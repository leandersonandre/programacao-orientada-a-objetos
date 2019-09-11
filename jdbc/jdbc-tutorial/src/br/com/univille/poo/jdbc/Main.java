package br.com.univille.poo.jdbc;

public class Main {

	public static void main(String[] args) {
		PessoaDAO dao = new PessoaDAO();
		
		Pessoa p = new Pessoa();
		p.setNome("Tiago");
		p.setSobrenome("Andrioli");
		
		dao.insert(p);
		
		System.out.println(dao.getById(2));
		
		for(Pessoa pessoa : dao.getAll()) {
			System.out.println(pessoa);
		}

	}

}
