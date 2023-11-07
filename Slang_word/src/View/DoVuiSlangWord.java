package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.DoVuiSlangWordController;
import Model.LoadDataFromFile;
import Model.SlangWordList;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;
import java.util.Random;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DoVuiSlangWord extends JFrame {

	private static final long serialVersionUID = 1L;
	public SlangWordList slangmodel;
	private JPanel contentPane;
	public JTextField textField_tu_khoa;
	public JButton btn_answer1;
	public JButton btn_Answer2;
	public JButton btn_Answer3;
	public JButton btn_Answer4;
	public JButton btn_Choi_Tiep;
	public JButton btn_KetThuc;
	public String key;
	public String definition;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DoVuiSlangWord() {
		slangmodel =LoadDataFromFile.loadFile();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 968, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		DoVuiSlangWordController dvswControll=new DoVuiSlangWordController(this);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Game  đố vui SLangWord");
		lblNewLabel.setBounds(313, 11, 347, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 47, 934, 10);
		contentPane.add(separator);
		
		JLabel lbl_TuKhoa = new JLabel("Từ Khoá");
		lbl_TuKhoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_TuKhoa.setBounds(228, 99, 89, 25);
		contentPane.add(lbl_TuKhoa);
		
		textField_tu_khoa = new JTextField();
		textField_tu_khoa.addActionListener(dvswControll);
		textField_tu_khoa.setBounds(313, 105, 286, 20);
		contentPane.add(textField_tu_khoa);
		textField_tu_khoa.setColumns(10);
		
		btn_answer1 = new JButton("New button");
		btn_answer1.addActionListener(dvswControll);
		btn_answer1.setBounds(93, 200, 249, 65);
		contentPane.add(btn_answer1);
		
		btn_Answer2 = new JButton("New button");
		btn_Answer2.addActionListener(dvswControll);
		btn_Answer2.setBounds(537, 200, 249, 65);
		contentPane.add(btn_Answer2);
		
		btn_Answer3 = new JButton("New button");
		btn_Answer3.addActionListener(dvswControll);
		btn_Answer3.setBounds(93, 320, 249, 65);
		contentPane.add(btn_Answer3);
		
		btn_Answer4 = new JButton("New button");
		btn_Answer4.addActionListener(dvswControll);
		btn_Answer4.setBounds(537, 320, 249, 65);
		contentPane.add(btn_Answer4);
		
		btn_Choi_Tiep = new JButton("Chơi");
		btn_Choi_Tiep.addActionListener(dvswControll);
		btn_Choi_Tiep.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_Choi_Tiep.setBounds(213, 455, 164, 45);
		contentPane.add(btn_Choi_Tiep);
		
		btn_KetThuc = new JButton("Kết thúc");
		btn_KetThuc.addActionListener(dvswControll);
		btn_KetThuc.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_KetThuc.setBounds(499, 455, 164, 45);
		contentPane.add(btn_KetThuc);
	}
	public void showRanDomAnser() {
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
		this.textField_tu_khoa.setText(key);
		if(answer==0) {
			this.btn_answer1.setText(definition);
			this.btn_Answer2.setText(definition1);
			this.btn_Answer3.setText(definition2);
			this.btn_Answer4.setText(definition3);
		}else if(answer==1) {
			this.btn_Answer2.setText(definition);
			this.btn_answer1.setText(definition1);
			this.btn_Answer3.setText(definition2);
			this.btn_Answer4.setText(definition3);
		}else if(answer==2) {
			this.btn_Answer3.setText(definition);
			this.btn_answer1.setText(definition1);
			this.btn_Answer2.setText(definition2);
			this.btn_Answer4.setText(definition3);
		}else if(answer==3) {
			this.btn_Answer4.setText(definition);
			this.btn_answer1.setText(definition1);
			this.btn_Answer2.setText(definition2);
			this.btn_Answer3.setText(definition3);
		}
		
	}
}
