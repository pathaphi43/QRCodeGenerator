package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenerateQRCode generateQRCode = new GenerateQRCode();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter message:");
        String qrCodeText = scan.nextLine();
        String filePath = "QRCode.png";
        int size = 200;
        try {
            System.out.println(qrCodeText);
            generateQRCode.createQR(qrCodeText, filePath, size, size);
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        System.out.println("DONE");
    }
}
