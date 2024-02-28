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

public class Manhinhtinhtoan {

	private JFrame frmMnHnhTnh;
	private JTextField txtsoA;
	private JTextField txtsoB;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Manhinhtinhtoan  window = new  Manhinhtinhtoan ();
					window.frmMnHnhTnh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public  Manhinhtinhtoan () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMnHnhTnh = new JFrame();
		frmMnHnhTnh.setTitle("Màn hình tính toán");
		frmMnHnhTnh.getContentPane().setForeground(new Color(255, 0, 0));
		frmMnHnhTnh.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmMnHnhTnh.setBounds(100, 100, 790, 468);
		frmMnHnhTnh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMnHnhTnh.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 21, 756, 218);
		frmMnHnhTnh.getContentPane().add(panel);
		
		
		
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(206, 28, 51, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("b:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(206, 75, 51, 25);
		panel.add(lblNewLabel_1_1);
		
		txtsoA = new JTextField();
		txtsoA.setBounds(351, 29, 337, 31);
		panel.add(txtsoA);
		txtsoA.setColumns(10);
		
		txtsoB = new JTextField();
		txtsoB.setColumns(10);
		txtsoB.setBounds(351, 82, 337, 31);
		panel.add(txtsoB);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(185, 146, 99, 25);
		panel.add(lblNewLabel_2);
		
		txtkq = new JTextField();
		txtkq.setForeground(new Color(0, 0, 0));
		txtkq.setBounds(351, 147, 337, 30);
		txtkq.setBorder(new LineBorder(new Color(176, 224, 230)));
		panel.add(txtkq);
		txtkq.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 270, 756, 92);
		frmMnHnhTnh.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnnhan = new JButton("NHÂN");
		btnnhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				hamxulynhan();
				
			}
		});
		btnnhan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnnhan.setBounds(394, 21, 116, 37);
		panel_2.add(btnnhan);
		
		JButton btnchia = new JButton("CHIA");
		btnchia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				hamxulychia();
				
			}
		});
		btnchia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnchia.setBounds(571, 21, 116, 37);
		panel_2.add(btnchia);
		
		JButton btntru = new JButton("TRỪ");
		btntru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				hamxulytru();
			}
		});
		btntru.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btntru.setBounds(221, 21, 116, 37);
		panel_2.add(btntru);
		
		JButton btncong = new JButton("CỘNG");
		btncong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Hamxulycong();
				
				
			}
		});
		btncong.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btncong.setBounds(36, 21, 116, 37);
		panel_2.add(btncong);
	}
	void Hamxulycong(){
		String str_soA = txtsoA.getText();
		String str_soB = txtsoB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double tong = soA + soB;
		txtkq.setText(String.valueOf(tong));
		
	}
	void hamxulytru() {
		String str_soA = txtsoA.getText();
		String str_soB = txtsoB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double tru = soA - soB;
		txtkq.setText(String.valueOf(tru));
	}
	void hamxulynhan() {
		String str_soA = txtsoA.getText();
		String str_soB = txtsoB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double nhan = soA * soB;
		txtkq.setText(String.valueOf(nhan));
	}
	void hamxulychia() {
		String str_soA = txtsoA.getText();
		String str_soB = txtsoB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double chia = soA / soB;
		txtkq.setText(String.valueOf(chia));
	}
	
}
