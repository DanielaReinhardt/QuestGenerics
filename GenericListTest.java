package QuestJavaGenerics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GenericListTest {

   private final GenericList<Integer> object = new GenericList<>(); 
   
   @Test
   void square(){
       
   assertEquals(16, object.square()); 
   }

   @Test
   void addition(){
      assertEquals(101, object.addition());
   }

  
}

