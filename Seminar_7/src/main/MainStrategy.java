package main;

import cts.strategy.CardBancar;
import cts.strategy.CardCalatorie;
import cts.strategy.SMS;
import cts.strategy.Validator;

public class MainStrategy {
    public static void main(String[] args) {
        Validator validator= new Validator(3, new CardCalatorie());
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new SMS());
        validator.platesteCalatorie();
    }
}