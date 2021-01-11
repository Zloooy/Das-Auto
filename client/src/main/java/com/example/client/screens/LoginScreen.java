package com.example.client.screens;

import com.example.client.webclients.UserWebClient;
import constants.UserRoleNames;
import models.UserView;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

@Configuration
@EnableAutoConfiguration
public class LoginScreen extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel loginLabel = new JLabel("Логин");
    JLabel passwordLabel = new JLabel("Пароль");
    JTextField loginField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton managerButton = new JButton("МР");
    JButton mainMechanicButton = new JButton("ГМ");
    JButton orderManagerButton = new JButton("ЗП");
    JButton adminButton = new JButton("АД");

    public LoginScreen() throws HeadlessException {
        setSize(640,640);
        setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        container.setLayout(new BorderLayout());
        Box formBox = Box.createVerticalBox();
        Stream.of(Box.createVerticalStrut(30), loginLabel, loginField, Box.createVerticalStrut(30), passwordLabel, passwordField).forEach((label)->{
            formBox.add(label);
            label.setPreferredSize(new Dimension(600, 30));
        });
        container.add(formBox, BorderLayout.NORTH);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        Box buttonBox = Box.createHorizontalBox();
        Stream.of(managerButton, Box.createHorizontalStrut(20), mainMechanicButton, Box.createHorizontalStrut(20), orderManagerButton, Box.createHorizontalStrut(20), adminButton, Box.createHorizontalStrut(20)).forEach(buttonBox::add);
        bottomPanel.add(buttonBox, BorderLayout.EAST);
        container.add(bottomPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Stream.of(managerButton,mainMechanicButton,orderManagerButton, adminButton).forEach((button)->button.addActionListener(this));
        System.out.println("exit on close");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        UserView userView = UserWebClient.getByLogin(loginField.getText());
        System.out.println("retrieving users");
            if ((userView != null) && (userView.getPassword().equals(new String(passwordField.getPassword())))) {
                System.out.println(userView.getRole());
                if (actionEvent.getSource() == managerButton && userView.getRole().getName().equals(UserRoleNames.SALES_MANAGER)) {
                    System.out.println("Authorized");
                }
                if (actionEvent.getSource() == mainMechanicButton && userView.getRole().getName().equals(UserRoleNames.MAIN_MECHANIC)) {
                    System.out.println("Authorized");
                }
                if (actionEvent.getSource() == orderManagerButton && userView.getRole().getName().equals(UserRoleNames.ORDER_MANAGER)) {
                    System.out.println("Authorized");
                    dispose();
                    new OrderManagerScreen().setVisible(true);
                }
                if (actionEvent.getSource() == adminButton && userView.getRole().getName().equals(UserRoleNames.ADMIN)) {
                    System.out.println("Authorized");
                }
            }
            loginField.setText("");
            passwordField.setText("");
    }
}
