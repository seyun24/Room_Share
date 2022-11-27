package pj;

//빌더 패턴
class AddOrder {
    private String foodOrder;
    private String timeOrder;
    private String itemOrder;

    public AddOrder(String foodOrder, String timeOrder, String itemOrder) {
        this.foodOrder = foodOrder;
        this.timeOrder = timeOrder;
        this.itemOrder = itemOrder;
    }

    public String toString() {
        return  foodOrder +" " + timeOrder +" "+  itemOrder ;
    }
}

class AddOrderBuilder {
    private String foodOrder;
    private String timeOrder;
    private String itemOrder;

    public AddOrderBuilder setFoodOrder(String foodOrder) {
        this.foodOrder = foodOrder;
        return this;

    }

    public AddOrderBuilder setTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
        return this;
    }

    public AddOrderBuilder setItemOrder(String itemOrder) {
        this.itemOrder = itemOrder;
        return this;
    }

    public AddOrder build() {
        AddOrder addOrder = new AddOrder(foodOrder, timeOrder, itemOrder);

        return addOrder;
    }
}
