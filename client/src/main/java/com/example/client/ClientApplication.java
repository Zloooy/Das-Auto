package com.example.client;

import com.example.client.screens.LoginScreen;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ClientApplication{
	public ClientApplication()
	{}

	/*private void initUI()
	{
		setSize(640,640);
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener((actionEvent -> System.exit(0)));
		this.setLayout(new GridLayout(1,2));
		JPanel leftPanel = new JPanel(new BorderLayout());
		this.add(quitButton);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}*/
	public static void main(String[] args) {
		System.out.println("starting");
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(ClientApplication.class)
				.headless(false).web(WebApplicationType.NONE).run(args);
		EventQueue.invokeLater(() -> {
			var ex = ctx.getBean(LoginScreen.class);
			ex.setVisible(true);
		});
		//SpringApplication.run(ClientApplication.class, args);
	}

}
// zuzuzu
