package tfour;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    @Test
    public void  testadd(){
        Calc a=new Calc();
        assertEquals(a.add(1,2),3);

    }
    @Test
    public  void  teststruct(){
        Calc a=new Calc();
        assertEquals(a.sub(9,8),1);

    }
}