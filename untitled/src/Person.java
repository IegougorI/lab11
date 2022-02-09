import java.util.ArrayList;

public class Person extends TextObject implements Say, EnterInTrain, ActionWithMoney, Add2PurchasesList{

    private TextObject place;

    public Person(String name, TextObject place) {
        super(name);
        this.name = name;
        this.place = place;
    }
    private String name;
    public Person(String name) {
        super(name);
        this.name = name;

    }

    private Money money;
    public void setMoney(Money money) {
        this.money = money;
    }
    public Money getMoney() {
        return money;
    }

    private Purchases purchases;
    public void setPurchases(Purchases purchases) {
        this.purchases = purchases;
    }
    public Purchases getPurchases() {
        return purchases;
    }

    private Bag bag;
    public void setBag(Bag bag) {
        this.bag = bag;
    }
    public Bag getBag() {
        return bag;
    }

    public void sayNothing(String text) {
        System.out.println(text+ " " +name);
    }

    public void sayGoodBye() {
        System.out.println(name+ " say goodbye to friends");
    }

    public void enterInTrain(){
        System.out.println(name + " enter in train");
    }

    public void collectMoney() {
        System.out.println(name + " collect all their money");
    }
    public void buy(Purchases purchases) {
        System.out.println(name+ " buy " + purchases.getName());
        purchases.setOwner(this);
        purchasesList.add(purchases);
    }

    public void setPlace(TextObject place) {
        this.place = place;
    }
    public TextObject getPlace() {
        return place;
    }

    protected ArrayList purchasesList = new ArrayList();
    public void add2list(Purchases purchases) {
        purchasesList.add(purchases);
    }

}