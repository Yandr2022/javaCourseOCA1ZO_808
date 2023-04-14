package homework.lesson9;

public class Task1 {
    int num;

    public Task1(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1(1);
        Task1 task2 = new Task1(2);
        Task1 task3 = new Task1(3);
        Task1 task4 = new Task1(4);
        Task1 task5 = new Task1(5);
        Task1 task6 = new Task1(6);
        Task1 task7 = new Task1(7);
        Task1 task8 = new Task1(8);
        Task1[] objs = {task1, task2, task3, task4, task5, task6, task7, task8};
        for (int i = 0, count = objs.length - 1; i < objs.length - 2; i++, count--) {
            objs[i] = null;
            System.out.println(count + " objects left to exist");
        }
        System.out.println();
        for (Task1 obj:objs) {
            System.out.println(obj);
        }
    }
}
