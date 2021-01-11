package com.example.client.screens;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class OrderManagerScreen extends JFrame {
    Container container = getContentPane();

    JButton RequestsButton = new JButton("Запросы");
    JButton PurchaseOfPartsButton = new JButton("Закупка деталей");
    JButton TrackingButton = new JButton("Отслеживание");

    JLabel VinLabel = new JLabel("Vin");
    JLabel TypePartLabel = new JLabel("Тип детали");
    JLabel QuantityLabel = new JLabel("Количество");
    JLabel PartLabel = new JLabel("Деталь");
    JLabel PriceLabel = new JLabel("Цена");
    JLabel DefinitionLabel = new JLabel("Описание");

    JTextField VinField = new JTextField();
    JTextField TypePartField = new JTextField();
    JTextField QuantityField = new JTextField();
    JTextField PartField = new JTextField();
    JTextField PriceField = new JTextField();
    JTextField DefinitionField = new JTextField();

    JButton AddInOrderButton = new JButton("Добавить в заказ");
    JButton ViewOrderButton = new JButton("Посмотреть заказ");


    public  OrderManagerScreen() throws HeadlessException {
        setSize(640,640);
        setTitle("Работа с клиентами");
        setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JPanel bottomPanel = new JPanel(new BorderLayout());
        Box buttonBox = Box.createHorizontalBox();
        Stream.of(RequestsButton, Box.createHorizontalStrut(130), PurchaseOfPartsButton, Box.createHorizontalStrut(130), TrackingButton, Box.createHorizontalStrut(130)).forEach(buttonBox::add);
        bottomPanel.add(buttonBox, BorderLayout.PAGE_START);
        container.add(bottomPanel, BorderLayout.PAGE_START);


        Box formBox = Box.createVerticalBox();
        Stream.of(Box.createVerticalStrut(30), VinLabel, VinField, Box.createVerticalStrut(30), TypePartLabel, TypePartField,
                Box.createVerticalStrut(30), QuantityLabel, QuantityField, Box.createVerticalStrut(30), PartLabel, PartField,
                Box.createVerticalStrut(30), PriceLabel, PriceField, Box.createVerticalStrut(30), DefinitionLabel, DefinitionField).forEach((label)->{
            formBox.add(label);
            label.setPreferredSize(new Dimension(600, 30));
        });
        Box.createVerticalStrut(30);
        container.add(formBox, BorderLayout.CENTER);


        JPanel bottom2Panel = new JPanel(new BorderLayout());
        Box button2Box = Box.createHorizontalBox();
        Stream.of(AddInOrderButton, Box.createHorizontalStrut(120), ViewOrderButton, Box.createHorizontalStrut(120)).forEach(button2Box::add);
        bottom2Panel.add(button2Box, BorderLayout.SOUTH);
        container.add(bottom2Panel, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println("exit on close");
    }

}
