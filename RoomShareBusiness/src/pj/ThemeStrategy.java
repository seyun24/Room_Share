package pj;

//전략 패턴
interface ThemeStrategy {
    abstract void normalOrder();
    abstract void specialOrder();
    abstract void doPay();
}

class SelectionTheme extends ThemeTemplate {
private ThemeStrategy themeStrategy;
public void setThemeStrategy(ThemeStrategy themeStrategy) {
        this.themeStrategy = themeStrategy;
        }

@Override
protected void selectNormal() {
        themeStrategy.normalOrder();
        }

@Override
protected void selectSpecial() {
        themeStrategy.specialOrder();
        }


    @Override
    protected void selectPayment() {
        themeStrategy.doPay();
    }

}