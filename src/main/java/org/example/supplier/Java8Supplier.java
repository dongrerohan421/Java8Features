package org.example.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Java8Supplier {
    // Supplier is a functional interface; it takes no arguments and returns a result.

    public static void main(String[] args) {
        // -------------- Supplier example to print system date -------------
        System.out.println("Supplier example to print system date:");
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());
        System.out.println();

        // -------------- Supplier example to print random OTP -------------
        System.out.println("Supplier example to print random OTP:");
        Supplier<String> supplierOTP = () -> {
            StringBuilder otp = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                otp.append((int) (Math.random() * 10));
            }
            return otp.toString();
        };

        System.out.println("Random OTP: " + supplierOTP.get());
    }
}
