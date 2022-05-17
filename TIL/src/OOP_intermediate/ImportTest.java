package OOP_intermediate;
import OOP_intermediate.Overriding;

public class ImportTest {
    public static void main(String[] args) {
        Study studies[] = {new Study(),new Math(),new English()};

        for(Study study : studies){
            study.do_it();
        }
    }
}
