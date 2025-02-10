package records;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);
        System.out.println(0.1 * 0.2);

        double d = 0.1 + 0.2;
        float f = 0.1f + 0.2f;

        System.out.println(d);
        System.out.println(f);


        BigDecimal bigDecimal1 = new BigDecimal("0.2");
        BigDecimal bigDecimal2 = new BigDecimal("0.1");
        BigDecimal product = bigDecimal1.multiply(bigDecimal2);
        BigDecimal sum = bigDecimal1.add(bigDecimal2);
        BigDecimal minus = bigDecimal1.subtract(bigDecimal2);
        BigDecimal division = bigDecimal1.divide(bigDecimal2);

        System.out.println(product);
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(division);

        BigDecimal one = BigDecimal.ONE;
        BigDecimal three = new BigDecimal("3");

        MathContext context = new MathContext(3, RoundingMode.HALF_UP);

        BigDecimal result = one.divide(three, 2, RoundingMode.UP);
        System.out.println(result);
        System.out.println(result.setScale(2, RoundingMode.UP));


        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            BigDecimal a = new BigDecimal("0.1");
            BigDecimal b = new BigDecimal("0.2");
            BigDecimal c = a.add(b);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);


        Animal animal1 = new Animal(true, 0, "schwarz", 0);

        Animal animal2 = new Animal(true, 0, "schwarz", 0);

        System.out.println(animal1);
        System.out.println(animal1.age());
        System.out.println(animal1.saeugetier());
        System.out.println(animal1.equals(animal2));

        Animal animal3 = new Animal(animal1.saeugetier(), animal1.countExtremtiaeten(), animal1.color(), animal1.age()+1);

        System.out.println(animal1);
        System.out.println(animal3);

//        final Animal animal4 = new Animal(true, 0, "c", 0);
//        animal4 =  new Animal(true, 0, "c", 0);
    }
}
