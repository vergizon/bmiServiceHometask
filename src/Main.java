public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double weight = 87;
        double height = 1.76;
        double index = service.calculate(weight,height);
        System.out.println(index);

    }

}
