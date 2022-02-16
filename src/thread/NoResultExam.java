package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExam {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업처리요청]");

		Callable<Integer> task = new Callable<Integer>() { //runnable과 다르게 리턴값 존재
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}
		};

		Future<Integer> future = es.submit(task);

		try {
			int sum = future.get();
			System.out.println("[처리결과]" + sum);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("[실행예외 에러발생]" + e.getMessage());
		}
		es.shutdown();
	}

}
