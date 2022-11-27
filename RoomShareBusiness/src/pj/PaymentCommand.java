package pj;


interface PaymentCommand {
    void pay();
}

class Payment {
    private PaymentCommand paymentCommand;
    public Payment(PaymentCommand paymentCommand) {
        setCommand(paymentCommand);
    }
    public void setCommand(PaymentCommand paymentCommand) {
        this.paymentCommand = paymentCommand;
    }
    public void register() {
        paymentCommand.pay();
    }
}

class QR {
    public void qrPay(){
        System.out.println("QR 결제");
    }
}

class PayQR implements PaymentCommand {
    private final QR qr;

    PayQR(QR qr) {
        this.qr = qr;
    }

    @Override
    public void pay() {
        qr.qrPay();
    }
}

class Card {
    public void cardPay(){
        System.out.println("신용카드 결제");
    }
}

class PayCard implements PaymentCommand {
    private final Card card;

    PayCard(Card card) {
        this.card = card;
    }


    @Override
    public void pay() {
        card.cardPay();
    }
}

class Money{
    public void moneyPay(){
        System.out.println("현금 결제");
    }
}

class PayMoney implements PaymentCommand{
    private final Money money;

    PayMoney(Money money) {
        this.money=money;
    }

    @Override
    public void pay() {
        money.moneyPay();
    }
}




