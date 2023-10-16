package org.example;

import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenerateQRCode generateQRCode = new GenerateQRCode();
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter message:");
        String qrCodeText= scan.nextLine();
        String filePath = "QRCode.png";
        int size = 200;
        String fileType = "png";
        File qrFile = new File(filePath);
        try {
            generateQRCode.createQR(qrCodeText, filePath, size, size);
        }catch (Exception ex){
            System.out.println("Error"+ex.getMessage());
        }
        System.out.println("DONE");
    }
}
