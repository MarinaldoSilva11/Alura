package modelo;

import com.mchange.v2.codegen.bean.PropsToStringGeneratorExtension;

public class Produto {
	
		private String nome;
		private String descricao;
		private Integer id;
		
		public Produto(String nome, String descricao) {
			
			this.nome = nome;
			this.descricao = descricao;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getDescricao() {
			return descricao;
		}
		
//		@Override
//		public String toString() {
//			return String.format("O produto criado foi: %d, %s, %s ", this.id, this.nome, this.descricao);
//		}

		public String toString() {
			return String.format("teste %s", this.nome);
			
		}
		
}