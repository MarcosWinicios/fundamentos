package enums;

public enum OperacaoAritmetica {
	ADICAO {
		@Override
		public int operaco(int x, int y) {
			return x + y;
		}
	},
	SUBTRACAO {
		@Override
		public int operaco(int x, int y) {
			return x - y;
		}
	};

	public abstract int operaco(int x, int y);
}
