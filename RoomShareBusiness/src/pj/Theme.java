package pj;

import java.util.ArrayList;
import java.util.List;

//팩토리 메소드 패턴
abstract class Theme{
    private final List<Option> options = new ArrayList<>();
    public abstract void createOption();
    public List<Option> getOptions() { return options ; };
    protected void addOption(Option option) { options.add(option); }
}

//Game 테마
class Game extends Theme implements ThemeStrategy {
    @Override
    public void normalOrder() {
        //테스트 코드
        System.out.println("게임관 입장");
        createOption();
        getOptions().get(0).setGameDeviceChangeOption(new VimProjector());
        getOptions().get(0).changeOption();
        getOptions().get(1).setGameDeviceChangeOption(new StereoSound());
        getOptions().get(1).changeOption();
        getOptions().get(2).setGameDeviceChangeOption(new Playstation());
        getOptions().get(2).changeOption();
        RoomDecorator room;
        room=new ShowerRoom(new RoomTime(new BedRoom(new RoomSize(new SpecialBigSizeRoom()))));
        room.addOption();
    }
    @Override
    public void specialOrder() {
        //테스트 코드
        AddOrderBuilder addOrderBuilder = new AddOrderBuilder();

        AddOrder addOrder = addOrderBuilder.setFoodOrder("라면 주문").setTimeOrder("2시간 추가").setItemOrder("VR 추가").build();
        System.out.println(addOrder.toString());
    }

    @Override
    public void doPay() {
        //테스트 코드
        PaymentCommand paymentCommand=new PayQR(new QR());
        Payment payment=new Payment(paymentCommand);
        payment.register();
    }

    @Override
    public void createOption() {
        addOption(new Screen());
        addOption(new Speaker());
        addOption(new GameDevice());
    }
}

class DVD extends Theme implements ThemeStrategy {
    public void normalOrder() {
        //테스트 코드
        System.out.println("DVD관 입장");
        createOption();
        getOptions().get(0).setGameDeviceChangeOption(new VimProjector());
        getOptions().get(0).changeOption();
        getOptions().get(1).setGameDeviceChangeOption(new StereophonicSound());
        getOptions().get(1).changeOption();
        RoomDecorator room;
        room=new ShowerRoom(new BedRoom(new RoomTime(new RoomSize(new BigRoom()))));
        room.addOption();
    }

    public void specialOrder() {
        //테스트 코드
        AddOrderBuilder addOrderBuilder = new AddOrderBuilder();

        AddOrder addOrder = addOrderBuilder.setFoodOrder("팝콘 주문").setTimeOrder("1시간 추가").setItemOrder("쿠션 추가").build();
        System.out.println(addOrder.toString());
    }

    @Override
    public void doPay() {
        //테스트 코드
        PaymentCommand paymentCommand=new PayCard(new Card());
        Payment payment=new Payment(paymentCommand);
        payment.register();
    }

    @Override
    public void createOption() {
        addOption(new Screen());
        addOption(new Speaker());
        addOption(new Movie());
    }
}

class Song extends Theme implements ThemeStrategy {
    public void normalOrder() {
        //테스트 코드
        System.out.println("노래관 입장");
        createOption();
        getOptions().get(0).setGameDeviceChangeOption(new DynamicMike());
        getOptions().get(0).changeOption();
        getOptions().get(1).setGameDeviceChangeOption(new MonoSound());
        getOptions().get(1).changeOption();
        RoomDecorator room;
        room=new ShowerRoom(new BedRoom(new RoomTime(new RoomSize(new SmallRoom()))));
        room.addOption();
    }

    public void specialOrder() {
        //테스트 코드
        AddOrderBuilder addOrderBuilder = new AddOrderBuilder();

        AddOrder addOrder = addOrderBuilder.setFoodOrder("콜라 주문").setTimeOrder("3시간 추가").setItemOrder("탬버린 추가").build();
        System.out.println(addOrder.toString());
    }

    @Override
    public void doPay() {
        //테스트 코드
        PaymentCommand paymentCommand=new PayMoney(new Money());
        Payment payment=new Payment(paymentCommand);
        payment.register();
    }

    @Override
    public void createOption() {
        addOption(new Mike());
        addOption(new Speaker());
    }
}

class Cartoon extends Theme implements ThemeStrategy {
    public void normalOrder() {
        //테스트 코드
        System.out.println("만화관 입장");
        createOption();
        getOptions().get(0).setGameDeviceChangeOption(new Ipad());
        getOptions().get(0).changeOption();

        RoomDecorator room;
        room=new ShowerRoom(new BedRoom(new RoomTime(new RoomSize(new BigRoom()))));
        room.addOption();
    }

    public void specialOrder() {
        //테스트 코드
        AddOrderBuilder addOrderBuilder = new AddOrderBuilder();

        AddOrder addOrder = addOrderBuilder.setFoodOrder("김치볶음밥 주문").setTimeOrder("1시간 추가").setItemOrder("안대 추가").build();
        System.out.println(addOrder.toString());
    }

    @Override
    public void doPay() {
        //테스트 코드
        PaymentCommand paymentCommand=new PayCard(new Card());
        Payment payment=new Payment(paymentCommand);
        payment.register();
    }

    @Override
    public void createOption() {
        addOption(new Tablet());
    }
}


