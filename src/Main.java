import com.Pac1.AbstractModel;
import com.Pac1.OperationStage;
import com.Pac1.OperationType;
import com.Pac1.PrintService;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
        OperationStage firstSt=new OperationStage(1);
        OperationType firstTp=new OperationType(1);
        PrintService g = new PrintService() {

        };
        g.printType(firstSt);
        g.printType(firstTp);
        Integer[] arr = {1,2,3,4,5,6,7};
        List<Integer> collection= new ArrayList<Integer>(Arrays.asList(arr));
        //Optional<Integer> gt = collection.parallelStream().filter(o -> o >= 2).reduce();
        Scanner snr = new Scanner(System.in);
        Stream<String> s = Stream.generate(()->snr.next());
        //List<String> strR = s.forEach(t->(t+" ")).s.filter(str->!str.startsWith("d")).forEach((t)->t+"56");

        List<Integer> list2 = Arrays.asList(2, 3, 4);
        list2.parallelStream().forEach(System.out::println);
        // list2.forEach();
        List<Integer> collect = list2.stream().map(e -> {
            return e+1;
        }).collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
