import java.awt.EventQueue;import javax.imageio.stream.MemoryCacheImageOutputStream;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTB2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTB2 window = new PTB2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PTB2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 0, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 790, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 61, 756, 258);
		frame.getContentPane().add(panel);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0)), "Nh\u1EADp a, b, c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		
		
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(206, 28, 51, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("b:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(206, 75, 51, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("c:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(206, 122, 51, 25);
		panel.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(351, 29, 337, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(351, 82, 337, 31);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(351, 129, 337, 31);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(189, 190, 99, 25);
		panel.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setBounds(351, 191, 337, 30);
		textField_3.setBorder(new LineBorder(new Color(176, 224, 230)));
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 0, 776, 40);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHƯƠNG TRÌNH BẬC HAI");
		lblNewLabel.setBounds(273, 10, 210, 22);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(255, 0, 0)), "Ch\u1ECDn thao t\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Ch\u1ECDn thao t\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 329, 756, 92);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnXaTrng = new JButton("Xóa trắng");
		btnXaTrng.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		btnXaTrng.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXaTrng.setBounds(329, 21, 116, 37);
		panel_2.add(btnXaTrng);
		
		JButton btnNewButton_1_1 = new JButton("Thoát");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(504, 21, 116, 37);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnGii = new JButton("Giải");
		btnGii.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a = Double.parseDouble(textField.getText());
				double b = Double.parseDouble(textField_1.getText());
				double c = Double.parseDouble(textField_2.getText());
				double del = b*b - 4*a*c;
				if(del>0) {
					double x1 = (Math.sqrt(del))/(2*a);
					double x2 = (Math.sqrt(del))/(2*a);
					textField_3.setText("x1 = " + x1 + " và x2 = " +x2);
				}else if (del ==0) {
					double x= -b/2*a;
					textField_3.setText("x = "+x);
					
				}else {
					textField_3.setText("Phương trình không có nghiệm");
				}
			}
		});
		btnGii.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGii.setBounds(156, 21, 116, 37);
		panel_2.add(btnGii);
	}
}
