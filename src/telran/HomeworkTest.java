package telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    @Test
    public  void test_task2(){
        String str = "200";
        assertEquals(400,Homework.function(str));

    }
    @Test
    public  void test_task2_parseExeption(){
        String str = "str";
        try{
            Homework.function(str);

        }catch (NumberFormatException e){
            assertTrue(true);
        }



    }
    @Test
    public  void test_task3_list(){

        List<Integer> result = Homework.evaluate(list,(num) -> true);
        assertEquals(list.size(),result.size());
        assertEquals(list,result);

    }

}