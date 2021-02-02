package Converter;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CelcuisFahrenheit extends JFrame {
	double CF;
	double CK;
	double FK;
	double FC;
	double KC;
	double KF;
	double CC;
	double FF;
	double KK;
	
	public class myevent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

		   if(r1.isSelected() && r5.isSelected()) {
				r2.setSelected(false);
				r3.setSelected(false);
				r4.setSelected(false);
				r6.setSelected(false);
			}
			else if(r1.isSelected() && r6.isSelected()) {
				r2.setSelected(false);
				r3.setSelected(false);
				r4.setSelected(false);
				r5.setSelected(false);
			}
			else if(r2.isSelected()&& r4.isSelected()) {
				r1.setSelected(false);
				r3.setSelected(false);
				r5.setSelected(false);
				r6.setSelected(false);
			}
			else if(r2.isSelected() && r6.isSelected()) {
				r1.setSelected(false);
				r3.setSelected(false);
				r4.setSelected(false);
				r5.setSelected(false);
			}
			else if(r3.isSelected() && r4.isSelected()) {
				r1.setSelected(false);
				r2.setSelected(false);
				r5.setSelected(false);
				r6.setSelected(false);
			}
			else if(r3.isSelected() && r5.isSelected()) {
				r1.setSelected(false);
				r2.setSelected(false);
				r4.setSelected(false);
				r6.setSelected(false);
			}

			
			if(e.getSource()==button) {
				if(r1.isSelected() && r5.isSelected()) {
					CF = Double.valueOf(tf.getText())*(1.8)+32;
					label.setText(CF + " Fahrenheit");
				}
				else if(r1.isSelected() && r6.isSelected()) {
					CK = (Double.valueOf(tf.getText())+273.15 );
					label.setText(CK + " Kelvin");
				}
				else if(r2.isSelected() && r4.isSelected()) {
					FC = ((Double.valueOf(tf.getText())-32)/1.8);
					label.setText(FC + " Celsius");
				}

				else if(r2.isSelected() && r6.isSelected()) {
					FK = ((Double.valueOf(tf.getText())+459.67)*0.5555555555555556);
					label.setText(FK + " Kelvin");
				}
				else if(r3.isSelected() && r4.isSelected()) {
					KC = (Double.valueOf(tf.getText())-273.15);
					label.setText(KC + " Celsius");
				}
				else if(r3.isSelected() && r5.isSelected()) {
					KF = (((Double.valueOf(tf.getText())-273.15)*1.8)+32);
					label.setText(KF + " Fahrenheit");
				}
				else if(r1.isSelected() && r4.isSelected()) {
					CC = (Double.valueOf(tf.getText()));
					label.setText(CC + " Celsius");
				}
				else if(r2.isSelected() && r5.isSelected()) {
					FF = (Double.valueOf(tf.getText()));
					label.setText(FF + " Fahrenheit");
				}
				else if(r3.isSelected() && r6.isSelected()) {
					KK = (Double.valueOf(tf.getText()));
					label.setText(KK  + " Kelvin");
				}
				
				name.setText("Emre KAVUK");
			}
		}
		
	}


	JButton button;
	JTextField tf;
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	JRadioButton r4;
	JRadioButton r5;
	JRadioButton r6;
	JLabel label;
	JLabel image;
	ImageIcon img;
	JLabel name;
	
	public CelcuisFahrenheit() {
		init();
	}
	private void init() {
		this.setTitle("Converter");
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		AddComponent();
	}
	private void AddComponent() {
		button = new JButton("Convert");
		label = new JLabel("");
		tf = new JTextField(15);
		r1  = new JRadioButton("C");
		r2 = new JRadioButton("F");
		r3 = new JRadioButton("K");
		r4  = new JRadioButton("C");
		r5 = new JRadioButton("F");
		r6 = new JRadioButton("K");
		name = new JLabel("");
		img = new ImageIcon(getClass().getResource("b9c49c804c14575075e57369183f6819.jpg"));
		image = new JLabel(img);
		r1.addActionListener(new myevent());
		r2.addActionListener(new myevent());
		r3.addActionListener(new myevent());
		r4.addActionListener(new myevent());
		r5.addActionListener(new myevent());
		r6.addActionListener(new myevent());
		button.addActionListener(new myevent());
		add(r1);
		add(r2);
		add(r3);
		add(tf);
		add(button);
		add(r4);
		add(r5);
		add(r6);
		add(label);
		add(image);
		add(name);
	}
	public static void main(String[] args) {
		new CelcuisFahrenheit();
	}
}
