import com.softserve.javatraining.task2.Car;
import com.softserve.javatraining.task2.Point2D;
import java.util.LinkedList;
import org.testng.Assert;

public class Test {
    @org.testng.annotations.Test
    public void getFarestPointTest() {
        LinkedList<Car> cars = new LinkedList<Car>();
        cars.add(new Car(new Point2D(1, 0)));
        cars.get(0).Move(new Point2D(2, 5));
        cars.get(0).Move(new Point2D(1, 1));
        Point2D expected = new Point2D(2.0, 5.0);
        Assert.assertEquals(cars.get(0).getFarestPoint(), expected);
    }
}
