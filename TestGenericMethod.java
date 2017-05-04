import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by nata on 04.05.2017.
 */
public class TestGenericMethod {

    static LinkedList<RetiredEmployee> lsRE = new LinkedList<>();
    static LinkedList<Employee> lsE = new LinkedList<>();

    public static void main(String[] args) {
        lsRE.add(new RetiredEmployee("First Employee"));
        lsRE.add(new RetiredEmployee("Second Employee"));
        lsRE.add(new RetiredEmployee("Third Employee"));
        lsRE.add(new RetiredEmployee("Forth Employee"));
        lsRE.add(new RetiredEmployee("Fifth Employee"));

        lsE = copyRetired(lsRE);

        lsRE.get(1).changeName("AAA");

        for (Employee e:lsE){
            System.out.println(e.getName());
        }
    }

    static LinkedList<Employee> copyRetired(LinkedList<RetiredEmployee> ls){
        LinkedList<Employee> res = new LinkedList<>();
        res.addAll(ls);
        return res;
    }
}
