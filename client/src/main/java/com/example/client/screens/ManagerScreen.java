package com.example.client.screens;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class ManagerScreen extends JFrame {

    Container container2 = getContentPane();
    JButton SearchClientButton = new JButton("ПОИСК КЛИЕНТА");
    JButton OrdersButton = new JButton("Заказы");
    JButton PlaningInspectionsButton = new JButton("Планирование осмотров");
    JButton PayButton = new JButton("Оплата заказа");

    public  ManagerScreen() throws HeadlessException {
        setSize(640, 640);
        setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel bottomPanel = new JPanel(new BorderLayout());
        Box buttonBox = Box.createHorizontalBox();
        Stream.of(SearchClientButton , Box.createHorizontalStrut(105), OrdersButton , Box.createHorizontalStrut(105), PlaningInspectionsButton , Box.createHorizontalStrut(105)).forEach(buttonBox::add);
        bottomPanel.add(buttonBox, BorderLayout.PAGE_START);
        container2.add(bottomPanel, BorderLayout.PAGE_START);

        container2.add(PayButton, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println("exit on close");
    }
}
