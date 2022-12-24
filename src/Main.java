import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        Client client = new Client();
        client.createProducts(factory1);
        client.createProducts(factory2);
    }
}
// AbstractFactory
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// ConcreteFactory1
class ConcreteFactory1 implements AbstractFactory {
    public ProductA createProductA() {
        return new ProductA1();
    }
    public ProductB createProductB() {
        return new ProductB1();
    }
}

// ConcreteFactory2
class ConcreteFactory2 implements AbstractFactory {
    public ProductA createProductA() {
        return new ProductA2();
    }
    public ProductB createProductB() {
        return new ProductB2();
    }
}

// AbstractProductA
interface ProductA {
    void operationA();
}

// ConcreteProductA1
class ProductA1 implements ProductA {
    public void operationA() {
        // Implementation of ProductA1
    }
}

// ConcreteProductA2
class ProductA2 implements ProductA {
    public void operationA() {
        // Implementation of ProductA2
    }
}

// AbstractProductB
interface ProductB {
    void operationB();
}

// ConcreteProductB1
class ProductB1 implements ProductB {
    public void operationB() {
        // Implementation of ProductB1
    }
}

// ConcreteProductB2
class ProductB2 implements ProductB {
    public void operationB() {
        // Implementation of ProductB2
    }
}

// Client
class Client {
    private List<ProductA> productsA = new ArrayList<ProductA>();
    private List<ProductB> productsB = new ArrayList<ProductB>();

    void createProducts(AbstractFactory factory) {
        productsA.add(factory.createProductA());
        productsB.add(factory.createProductB());
    }
}