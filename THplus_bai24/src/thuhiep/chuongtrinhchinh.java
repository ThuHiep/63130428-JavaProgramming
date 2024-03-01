package thuhiep;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;

public class chuongtrinhchinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JCheckBox checkbox;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chuongtrinhchinh frame = new chuongtrinhchinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public chuongtrinhchinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 711, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thao tác trên JList-Checkbox");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(181, 10, 415, 35);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0)), "Ch\u1ECDn t\u00E1c v\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 56, 286, 328);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Tô đen số chẵn");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				todensochan();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(10, 26, 174, 31);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Tô đen số số nguyên tố");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				todensonguyento();
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2_1.setBounds(10, 134, 238, 31);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_3 = new JButton("Bỏ tô đen");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.clearSelection();
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2_3.setBounds(10, 185, 131, 31);
		panel_1.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_2 = new JButton("Tô đen số lẻ");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				todensole();
			}
		});
		btnNewButton_2_2.setBounds(10, 81, 151, 31);
		panel_1.add(btnNewButton_2_2);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnxoa = new JButton("Xóa các giá trị tô đen");
		btnxoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				DefaultListModel<Integer> model = (DefaultListModel<Integer>) list.getModel();
		        int size = model.getSize();
		        for (int i = size - 1; i >= 0; i--) {
		            if (list.isSelectedIndex(i)) {
		                model.remove(i);
		            }
		        }
				
			}
		});
		btnxoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnxoa.setBounds(10, 240, 230, 31);
		panel_1.add(btnxoa);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0)), "Nh\u1EADp th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(298, 56, 433, 328);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Nhập");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = textField.getText();
				try {
					int number = Integer.parseInt(input);
					boolean oke = checkbox.isSelected();
					
					if(oke || number >=0 ) {
						DefaultListModel<Integer> model = (DefaultListModel<Integer>) list.getModel();
						model.addElement(number);
					}
					else {
						System.out.println("Vui lòng nhập số nguyên");
					}
					
				} catch (NumberFormatException e2) {
					// TODO: handle exception
					System.out.println("Vui lòng nhập số nguyên");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(10, 29, 92, 38);
		panel_2.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(112, 32, 138, 35);
		panel_2.add(textField);
		textField.setColumns(10);
		
		checkbox = new JCheckBox("Cho nhập số âm");
		checkbox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkbox.setBounds(256, 36, 168, 21);
		panel_2.add(checkbox);
		
		list = new JList();
		list.setBackground(new Color(255, 255, 255));
		DefaultListModel<Integer> model = new DefaultListModel<>();
		list.setModel(model);
		list.setBounds(10, 77, 414, 241);
		panel_2.add(list);
		
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(192, 192, 192));
		panel_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		panel_1_1.setBounds(10, 392, 721, 68);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Đóng chương trình");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		btnNewButton.setBounds(220, 10, 281, 48);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1_1.add(btnNewButton);
		
        setLocationRelativeTo(null);
	}
	public void todensochan(){
		DefaultListModel<Integer> model = (DefaultListModel<Integer>) list.getModel();
	    for (int i = 0; i < model.size(); i++) {
	        int number = model.getElementAt(i);
	        if (number % 2 == 0) {
	            list.addSelectionInterval(i, i);
	        }
	    }
	}
	public void todensole() {
		DefaultListModel<Integer> model = (DefaultListModel<Integer>) list.getModel();
	    for (int i = 0; i < model.size(); i++) {
	        int number = model.getElementAt(i);
	        if (number % 2 == 1) {
	            list.addSelectionInterval(i, i);
	        }
	    }
	}
	public boolean isnt(int num) {
		if(num<=1)return false;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public void todensonguyento() {
		DefaultListModel<Integer> model = (DefaultListModel<Integer>) list.getModel();
	    for (int i = 0; i < model.size(); i++) {
	        int number = model.get(i);
	        if(isnt(number)) {
	        	list.addSelectionInterval(i, i);
	        }
	    }
	}
}

