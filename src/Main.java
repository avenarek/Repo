import model.Director;
import model.Worker;
import service.DirectorService;
import service.WorkerService;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.fac(5));
        main.hello(5);


//
//        WorkerService service = new WorkerService();
//        System.out.println(service.createWorker().getFullName());
//        DirectorService service1 = new DirectorService();
//        Director director = service1.createDirector();
//        System.out.println(director.getFullName() + " " + director.getAge());
    }

    public int fac(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * fac(x - 1);
    }

    public void hello(int a){
        if(a > 0){
            System.out.println("Hello");
            hello(a-1);
        }
    }
}
