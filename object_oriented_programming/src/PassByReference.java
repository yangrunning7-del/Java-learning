public class PassByReference {
    public static void main(String[] args) {


        // 创建了以Person类为模板的对象，返回一个地址，把它命名为person
        // new一个对象就是在创建以某个类为模板的对象，拥有该对象有的模版，再返回一个地址
        Person person = new Person();
        System.out.println(person.name);     // 输出的是一个默认值null


        // 动态绑定调用
        PassByReference passByReference= new PassByReference();

        // 把person传到change里面去，此时person可以理解为一个地址值，这个地址是指向Person类的对象
        // 这个时候change就通过地址来改变person对象里面的属性，所以输出的是：what can i say
        passByReference.change(person);
        System.out.println(person.name);

    }

    public void change(Person person){
        person.name = "what can i say ?";
    }

}
class Person {
    String name; // 没有赋值，默认值为null
}
