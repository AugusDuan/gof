package priv.augus.factory.simpleFactory;

/**
 * Created by AugusDuan on 2018/8/3.
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        Food meat = FoodSimpleFactory.getFood("meat");
        System.out.println("meat:"+meat.eat());
        Food vegetables = FoodSimpleFactory.getFood("vegetables");
        System.out.println("vegetables:"+vegetables.eat());
    }
}
