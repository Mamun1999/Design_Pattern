
public class Computer implements Item {

    private String name;
    private int price;
    private String model;

    public Computer(String name, int price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor) {
        
        return shoppingCartVisitor.visit(this);
    }

}
