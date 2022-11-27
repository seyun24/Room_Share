package pj;

public class Test {
    public static void main(String[] args) {
        SelectionTheme selectTheme = new SelectionTheme();
        selectTheme.setThemeStrategy(new Game());
        selectTheme.selectTemplate();
    }
}



