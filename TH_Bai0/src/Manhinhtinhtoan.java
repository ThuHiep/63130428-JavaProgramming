import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Manhinhtinhtoan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQA;

	public Manhinhtinhtoan() {
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ hai");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(103, 151, 166, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập số thứ nhất");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(103, 60, 166, 57);
		contentPane.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setBounds(313, 71, 214, 40);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(313, 162, 214, 40);
		contentPane.add(txtB);
		
		JButton btncong = new JButton("CỘNG");
		btncong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Hamxulycong();
				
			}
		});
		btncong.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btncong.setBounds(90, 260, 85, 45);
		contentPane.add(btncong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Hamxulytru();
				
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTru.setBounds(233, 260, 85, 45);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Hamxulynhan();
				
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNhan.setBounds(377, 260, 85, 45);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Hamxulychia();
				
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnChia.setBounds(522, 260, 85, 45);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(103, 332, 166, 57);
		contentPane.add(lblKtQu);
		
		txtKQA = new JTextField();
		txtKQA.setColumns(10);
		txtKQA.setBounds(313, 343, 214, 40);
		contentPane.add(txtKQA);
	}
	void Hamxulycong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double tong = soA + soB;
		txtKQA.setText(String.valueOf(tong));
		
		
	}
	void Hamxulytru() {
		
	}
	void Hamxulynhan() {
		
	}
	void Hamxulychia() {
		
	}
}
