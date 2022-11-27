package pj;

//템플릿 메소드 패턴
abstract class ThemeTemplate {
    protected abstract void selectNormal();
    protected abstract void selectSpecial();
    protected abstract void selectPayment();
    public void selectTemplate() {
        selectNormal();
        System.out.println("-------------------");
        selectSpecial();
        System.out.println("-------------------");
        selectPayment();
    }
}