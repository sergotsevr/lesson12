import com.Pac1.AbstractModel;
import com.Pac1.OperationStage;
import com.Pac1.OperationType;
import com.Pac1.PrintService;

public class Main {

    public static void main(String[] args)
    {
        OperationStage firstSt=new OperationStage(1);
        OperationType firstTp=new OperationType(1);
        PrintService g = new PrintService() {

        };
        g.printType(firstSt);
        g.printType(firstTp);

    }
}
