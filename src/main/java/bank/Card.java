package bank;

import java.util.Random;

public class Card {
        private final String CARD_NUMBER = "1234 5678 9012 3456";
        private int pinCode;

        public Card() {
            this.pinCode = generatePinCode();
        }

        public int getPinCode() {
            return pinCode;
        }

        public void setPinCode(int pinCode) {
            if (pinCode >= 1000 && pinCode <= 9999) {
                this.pinCode = pinCode;
            } else {
                System.out.println("Pin code must be a four-digit number.");
            }
        }

        private int generatePinCode() {
            Random random = new Random();
            return random.nextInt(9000) + 1000;
        }

        // Testing the Card class
    }
