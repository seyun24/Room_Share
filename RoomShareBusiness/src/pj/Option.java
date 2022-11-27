package pj;

interface Option{
    public void changeOption();
    public void setGameDeviceChangeOption(ChangeOption changeOption);
}

class GameDevice implements Option{
    private ChangeOption gameDeviceChangeOption;
    @Override
    public void changeOption() {
        gameDeviceChangeOption.change();
    }

    @Override
    public void setGameDeviceChangeOption(ChangeOption changeOption) {
        this.gameDeviceChangeOption = changeOption;
    }

}

class Screen implements Option{
    private ChangeOption screenChangeOption;

    public void changeOption() {
        screenChangeOption.change();
    }

    public void setGameDeviceChangeOption(ChangeOption changeOption){
        this.screenChangeOption = changeOption;
    }

}

class Speaker implements Option{
    private ChangeOption speakerChangeOption;
    @Override
    public void changeOption() {
        speakerChangeOption.change();
    }

    @Override
    public void setGameDeviceChangeOption(ChangeOption changeOption) {
        this.speakerChangeOption = changeOption;
    }

}

class Mike implements Option{
    private ChangeOption changeOption;
    @Override
    public void changeOption() {
        changeOption.change();
    }

    @Override
    public void setGameDeviceChangeOption(ChangeOption changeOption) {
        this.changeOption= changeOption;
    }

}

class Movie implements Option{
    private ChangeOption changeOption;
    @Override
    public void changeOption() {
        changeOption.change();
    }

    @Override
    public void setGameDeviceChangeOption(ChangeOption changeOption) {
        this.changeOption= changeOption;
    }

}

class Tablet implements Option{
    private ChangeOption changeOption;
    @Override
    public void changeOption() {
        changeOption.change();
    }

    @Override
    public void setGameDeviceChangeOption(ChangeOption changeOption) {
        this.changeOption= changeOption;
    }

}


