package pj;

//데코레이터 패턴
abstract class RoomDecorator {
    protected RoomDecorator roomDecorator;

    public RoomDecorator(){}

    public RoomDecorator(RoomDecorator roomDecorator){
        this.roomDecorator=roomDecorator;
    }

    abstract void addOption();

}

//샤워 룸
class ShowerRoom extends RoomDecorator {
    public ShowerRoom(){

    }
    public ShowerRoom(RoomDecorator room){
        super(room);
    }
    @Override
    void addOption() {
        if (roomDecorator!=null) roomDecorator.addOption();
        addShowerRoom();
    }
    void addShowerRoom(){
        System.out.println("샤워 룸 추가");
    }
}

//수면 공간
class BedRoom extends RoomDecorator {
    public BedRoom (){

    }
    public BedRoom(RoomDecorator roomDecorator){
        super(roomDecorator);
    }

    @Override
    void addOption() {
        if (roomDecorator!=null) roomDecorator.addOption();
        addBedRoom();
    }

    void addBedRoom(){
        System.out.println("수면실 추가");
    }
}

//대여시간 설정
class RoomTime extends RoomDecorator{
    public RoomTime(){

    }
    public RoomTime(RoomDecorator roomDecorator){super((roomDecorator));}
    @Override
    void addOption() {
        if (roomDecorator!=null) roomDecorator.addOption();
        addRoomTime();
    }
    void addRoomTime(){
        System.out.println("시간 추가");
    }
}

//룸사이즈 변경
class RoomSize extends RoomDecorator {
    private Size size=new DefaultRoom();

    public RoomSize(){

    }
    public RoomSize(Size size){
        this.size=size;
    }

    public RoomSize(RoomDecorator roomDecorator){
        super(roomDecorator);
    }


    @Override
    void addOption() {
        if (roomDecorator!=null) roomDecorator.addOption();
        addRoomSize();
    }
    public void addRoomSize(){
        size.changeSize();
    }

}

//방 사이즈 인터페이스
interface Size{
    void changeSize();
}

//방 사이즈별 옵션
class SmallRoom implements Size{
    @Override
    public void changeSize() {
        System.out.println("small");
    }
}
class DefaultRoom implements Size{
    @Override
    public void changeSize() {
        System.out.println("medium");
    }
}
class BigRoom implements Size{
    @Override
    public void changeSize() {
        System.out.println("Big");
    }
}
class SpecialBigSizeRoom implements Size{
    @Override
    public void changeSize() {
        System.out.println("SpecialBigSize");
    }
}

