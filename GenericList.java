package QuestJavaGenerics;

class GenericList<T extends Number> {
    public static void main(String[] args) {
        
        MyClassIntegers<Integer> object = new MyClassIntegers<>(4);
        MyClassIntegers<Integer> object2 = new MyClassIntegers<>(20);
        MyClassIntegers<Integer> object3 = new MyClassIntegers<>(30);
        MyClassIntegers<Double> object4 = new MyClassIntegers<>(40.5);
        MyClassIntegers<Double> object5= new MyClassIntegers<>(50.5);
   
        object.showType();
        object2.showType();
        object3.showType();
        object4.showType();
        object5.showType();
        
    }

    private Integer object=4;

    Integer square() {
        
        return object.intValue() * object.intValue();
    }

    private Double object5=50.5;

    Double addition(){
        return object5 + object5; 
    }
     
}