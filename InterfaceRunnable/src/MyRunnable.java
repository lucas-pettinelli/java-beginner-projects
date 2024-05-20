/*
 A interface Runnable em Java é usada para definir uma tarefa que pode ser executada por um thread. 
 Ela contém um único método, run(), que deve ser implementado pela classe que a utiliza. 

 Exemplo - Você pode usar a interface Runnable para definir o código que deve ser executado em paralelo com outras tarefas.
 */

public class MyRunnable implements Runnable { // Implementação da Interface Runnable:

    private String taskName; // Nome da tarefa

    public MyRunnable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Executando " + i);
            try {
                // Simula algum trabalho com um pequeno atraso
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(taskName + " Foi interrompido!");
            }
        }
        System.out.println(taskName + " Completo ");
    }

    public static void main(String[] args) {

        // Cria instâncias de MyRunnable
        Runnable task1 = new MyRunnable("Task 1 ");
        Runnable task2 = new MyRunnable("Task 2");

        // Cria threads para executar as tarefas
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Inicia as threads
        thread1.start();
        thread2.start();
    }
}
