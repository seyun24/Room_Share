package pj;

//옵션 변경 인터페이스
interface ChangeOption{
    public void change();
}

//Game 선택옵션
class Playstation implements ChangeOption{
    @Override
    public void change() {
        System.out.println("플레이스테이션로 변경");
    }
}

class XBOX implements ChangeOption{

    @Override
    public void change() {
        System.out.println("엑스박스로 변경");
    }
}

class Nintendo implements ChangeOption{

    @Override
    public void change() {
        System.out.println("닌텐도로 변경");
    }
}

//Movie 선택옵션
class Drama implements ChangeOption{

    @Override
    public void change() {
        System.out.println("드라마로 변경");
    }
}

class Animation implements ChangeOption{

    @Override
    public void change() {
        System.out.println("애니메이션으로 변경");
    }
}


//Screen 선택옵션
class PcMonitor implements ChangeOption{
    @Override
    public void change() {
        System.out.println("피시 모니터로 변경");
    }
}

class VimProjector implements ChangeOption{

    @Override
    public void change() {
        System.out.println("빔프로젝트로 변경");
    }
}

class TV implements ChangeOption{

    @Override
    public void change() {
        System.out.println("TV로 변경");
    }
}


//Speaker 선택옵션
class StereophonicSound implements ChangeOption{

    @Override
    public void change() {
        System.out.println("입체음향으로 변경");
    }
}

class StereoSound implements ChangeOption{

    @Override
    public void change() {
        System.out.println("스테레오로 변경");
    }
}

class MonoSound implements ChangeOption{

    @Override
    public void change() {
        System.out.println("모노사운드로 변경");
    }
}


//Mike 선택옵션
class DynamicMike implements ChangeOption{

    @Override
    public void change() {
        System.out.println("다이나믹 마이크로 변경");
    }
}

class CondenserMike implements ChangeOption{

    @Override
    public void change() {
        System.out.println("콘데서 마이크로 변경");
    }
}

class RibbonMike implements ChangeOption{

    @Override
    public void change() {
        System.out.println("리본 마이크로 변경");
    }
}


//Tablet 선택옵션
class Ipad implements ChangeOption{

    @Override
    public void change() {
        System.out.println("아이패드로 변경");
    }
}

class GalaxyTap implements ChangeOption{

    @Override
    public void change() {
        System.out.println("갤럭시 탭으로 변경");
    }
}
