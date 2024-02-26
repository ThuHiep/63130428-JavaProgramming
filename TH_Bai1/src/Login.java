import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;

public class Login extends JFrame {

	private JFrame frame;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(51, 71, 144, 34);
		frame.getContentPane().add(lblNewLabel);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBounds(205, 74, 167, 34);
		frame.getContentPane().add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		JLabel lblMTKhu = new JLabel("Mật khẩu");
		lblMTKhu.setForeground(new Color(255, 255, 255));
		lblMTKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMTKhu.setBounds(51, 139, 93, 29);
		frame.getContentPane().add(lblMTKhu);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setBounds(205, 139, 167, 34);
		frame.getContentPane().add(txtMatKhau);
		txtMatKhau.setColumns(10);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(156, 201, 136, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN FORM");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(156, 10, 144, 34);
		frame.getContentPane().add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Xulydangnhap();
			}
		});
	}
	public void Xulydangnhap() {
		String ten = txtTenDangNhap.getText().toString();
		String mk = txtMatKhau.getText().toString();
		if(ten.equals("63CNTT")&& mk.equals("123")) {
			manhinhchinh f = new manhinhchinh();
			f.setVisible(true);
			this.setVisible(false);
		
		}
		else {
			JOptionPane.showMessageDialog(frame, "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin đăng nhập.");
	            txtTenDangNhap.setText("");
	            txtMatKhau.setText("");
		}
		
	}
}
