public class ThreadConcorrente {
	
	public ThreadConcorrente(){

	}

	public static void main(String[] args){
		Thread t = Thread.currentThread();

		t.setName("minha linha");

		System.out.println("linha concorrente: " + t);
		String nome = t.getName();
		System.out.println(nome);

		int prioridade = t.getPriority();
		System.out.println(prioridade);

		ThreadGroup grupo = t.getThreadGroup();
		System.out.println(grupo);

		try {
			for(int n = 5; n>0; n--){
				System.out.println("+++" + n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			System.out.println("interrompida!");
		}
	}
}