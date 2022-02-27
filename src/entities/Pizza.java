package entities;

public class Pizza {
	
	private int tamanho;
	private boolean queijo;
	private boolean tomate;
	private boolean bacon;
	private boolean calabresa;
	private boolean catupiry;
	private boolean frango;
	private boolean manjericao;
	
	public static class Builder{
		
		private final int tamanho;
		
		private boolean queijo = false;
		private boolean tomate = false;
		private boolean bacon = false;
		private boolean calabresa = false;
		private boolean catupiry = false;
		private boolean frango = false;
		private boolean manjericao= false;
		
		public Builder(int Tamanho) {
			this.tamanho = Tamanho;
		}
		public Builder queijo() {
			this.queijo = true;
			return this;
		}
		public Builder tomate() {
			this.tomate = true;
			return this;
		}
		public Builder bacon() {
			this.bacon = true;
			return this;
		}
		public Builder calabresa() {
			this.calabresa = true;
			return this;
		}
		public Builder catupiry() {
			this.catupiry = true;
			return this;
		}
		public Builder frango() {
			this.frango = true;
			return this;
		}
		public Builder manjericao() {
			this.manjericao = true;
			return this;
		}
		public Pizza build() {
			return new Pizza(this);
		}
	
	}
	private Pizza(Builder build) {
		tamanho = build.tamanho;
		queijo = build.queijo;
		tomate = build.tomate;
		bacon = build.bacon;
		calabresa = build.calabresa;
		catupiry = build.catupiry;
		frango = build.frango;
		manjericao = build.manjericao;
	}
}
