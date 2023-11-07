package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.DoVuiDefinitionController;
import Model.LoadDataFromFile;
import Model.SlangWordList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;

public class DoVuiDefinition extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public SlangWordList slangmodel;
	public JTextField textField_def;
	public JButton btn_answer1;
	public JButton btn_answer2;
	public JButton btn_answer3;
	public JButton btn_answer4;
	public JButton btn_choi;
	public JButton btn_ketthuc;
	public String key;
	public String definition;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DoVuiDefinition() {
		slangmodel =LoadDataFromFile.loadFile();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		DoVuiDefinitionController dvdControll=new DoVuiDefinitionController(this);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đố vui definition");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(328, 22, 236, 60);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 79, 913, 26);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Definition");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(166, 130, 96, 37);
		contentPane.add(lblNewLabel_1);
		
		textField_def = new JTextField();
		textField_def.addActionListener(dvdControll);
		textField_def.setBounds(290, 142, 469, 20);
		contentPane.add(textField_def);
		textField_def.setColumns(10);
		
		btn_answer1 = new JButton("New button");
		btn_answer1.addActionListener(dvdControll);
		btn_answer1.setBounds(166, 241, 220, 44);
		contentPane.add(btn_answer1);
		
		btn_answer2 = new JButton("New button");
		btn_answer2.addActionListener(dvdControll);
		btn_answer2.setBounds(569, 241, 212, 44);
		contentPane.add(btn_answer2);
		
		btn_answer3 = new JButton("New button");
		btn_answer3.addActionListener(dvdControll);
		btn_answer3.setBounds(166, 330, 220, 44);
		contentPane.add(btn_answer3);
		
		btn_answer4 = new JButton("New button");
		btn_answer4.addActionListener(dvdControll);
		btn_answer4.setBounds(561, 330, 220, 44);
		contentPane.add(btn_answer4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 398, 913, 26);
		contentPane.add(separator_1);
		
		btn_choi = new JButton("Chơi");
		btn_choi.addActionListener(dvdControll);
		btn_choi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_choi.setBounds(250, 445, 136, 52);
		contentPane.add(btn_choi);
		
		btn_ketthuc = new JButton("Kết thúc");
		btn_ketthuc.addActionListener(dvdControll);
		btn_ketthuc.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_ketthuc.setBounds(538, 445, 143, 52);
		contentPane.add(btn_ketthuc);
	}

	public void showRanDomAnser() {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int length=slangmodel.getLength();
		int ranDomIndex=rd.nextInt(length);
		int ranDomIndex1=rd.nextInt(length);
		int ranDomIndex2=rd.nextInt(length);
		int ranDomIndex3=rd.nextInt(length);
		int answer=rd.nextInt(4);
		key="";
		definition="";
		String key1="";
		String definition1="";
		String key2="";
		String definition2="";
		String key3="";
		String definition3="";
		int vitri=0;
		for (String i : slangmodel.listSlang.keySet()) {
			List<String> list = slangmodel.listSlang.get(i);
			if(vitri==ranDomIndex) {
				key=i;
				if (list != null) {
					for (String string : list) {
						definition += string + ";";
					}
				}
			}
			vitri++;
		}
		vitri=0;
		for (String i : slangmodel.listSlang.keySet()) {
			List<String> list = slangmodel.listSlang.get(i);
			if(vitri==ranDomIndex1) {
				key1=i;
				if (list != null) {
					for (String string : list) {
						definition1 += string + ";";
					}
				}
			}
			vitri++;
		}
		vitri=0;
		for (String i : slangmodel.listSlang.keySet()) {
			List<String> list = slangmodel.listSlang.get(i);
			if(vitri==ranDomIndex2) {
				key2=i;
				if (list != null) {
					for (String string : list) {
						definition2 += string + ";";
					}
				}
			}
			vitri++;
		}
		vitri=0;
		for (String i : slangmodel.listSlang.keySet()) {
			List<String> list = slangmodel.listSlang.get(i);
			if(vitri==ranDomIndex3) {
				key3=i;
				if (list != null) {
					for (String string : list) {
						definition3 += string + ";";
					}
				}
			}
			vitri++;
		}
		this.textField_def.setText(definition);
		if(answer==0) {
			this.btn_answer1.setText(key);
			this.btn_answer2.setText(key1);
			this.btn_answer3.setText(key2);
			this.btn_answer4.setText(key3);
		}else if(answer==1) {
			this.btn_answer2.setText(key);
			this.btn_answer1.setText(key1);
			this.btn_answer3.setText(key2);
			this.btn_answer4.setText(key3);
		}else if(answer==2) {
			this.btn_answer3.setText(key);
			this.btn_answer1.setText(key1);
			this.btn_answer2.setText(key2);
			this.btn_answer4.setText(key3);
		}else if(answer==3) {
			this.btn_answer4.setText(key);
			this.btn_answer1.setText(key1);
			this.btn_answer2.setText(key2);
			this.btn_answer3.setText(key3);
		}
	}	
}
