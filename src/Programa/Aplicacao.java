package Programa;

public class Aplicacao {

	public static void main(String[] args) {
		Professores professores = new Professores();
		professores.setCodigo(1);
		professores.setNome("Professor misterioso");
		
		Disciplinas dspl1 = new Disciplinas();
		dspl1.setCodigo(1);
		dspl1.setNome("Programação I");
		dspl1.setFase(4);
		dspl1.setCarga(60.0);
		
		Disciplinas dspl2 = new Disciplinas();
		dspl2.setCodigo(2);
		dspl2.setNome("Banco de Dados");
		dspl2.setFase(4);
		dspl2.setCarga(60.0);
		
		Disciplinas[] disciplinas = new Disciplinas[2];
		disciplinas[0] = dspl1;
		disciplinas[1] = dspl2;
		
		professores.setDisciplinas(disciplinas);
		
		System.out.println(professores);
	}

}
