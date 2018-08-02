package priv.augus.factory.simpleFactory;

/**
 * Created by AugusDuan on 2018/8/3.
 */
public class FoodSimpleFactory {
    public static Food getFood(String name) {
        Food food = null;
        switch (name) {
            // 如果需求变化，meat对应的是其他类，直接在对应的case修改即可
            case "meat":
                food = new Meat();
                break;
            case "vegetables":
                food = new Vegetables();
                break;
        }
        return food;
    }
}
