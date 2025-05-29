package com.pluralsight;

import com.pluralsight.Order;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

//                +------------------+
//                |  ReceiptWriter   |
//                +------------------+
//                | +writeReceipt()  |
//                +------------------+
//

    public static void writeReceipt(Order order) {
        // this creates the file for receipts
        File receiptsDir = new File("receipts");
        if (!receiptsDir.exists()){
            receiptsDir.mkdirs();
        }

        // adds timestamp to receipt
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmm");
        String timestamp = LocalDateTime.now().format(formatter);
        String filename = "receipts/receipt_" + timestamp + ".txt";

        try (FileWriter writer = new FileWriter(filename)){
             // write header
            writer.write("☆ THE DOLL'S DELI ☆\n");
            writer.write("-----------------------\n");
            writer.write("DATE: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a")));

            // write order details
            writer.write(order.getDescription());

            // footer
            writer.write("\n ---------------------\n");
            writer.write("THANK YOU FOR DINING WITH THE DOLLS\n");

            // confirmation
            System.out.println("\u001B[95m☆ RECEIPT SAVED TO " + filename + " ☆\u001B[0m");
        }
        catch (IOException e){
            System.out.println("ERROR WRITING RECEIPT: " + e.getMessage());
        }
    }

}
