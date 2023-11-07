package View;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.SlangController;
import Model.LoadDataFromFile;
import Model.SlangWord;
import Model.SlangWordList;

public class SlangView extends JFrame {

	private static final long serialVersionUID = 1L;
	public boolean checkTuCoTonTai;
	public List<String> History;
	public JPanel contentPane;
	public JTextField textField_slangword;
	public JTextField textField_definition;
	public JTable table;
	public final JSeparator separator_1 = new JSeparator();
	public JTextField textField_tu_khoa;
	public JTextField textField_dinh_nghia;
	public SlangWordList slangmodel;
	public JButton btn_tim_slang_word;
	public JButton btn_tim_definition;
	public JButton btn_lich_su_tim_kiem;
	public JLabel lbl_tu_khoa;
	public JLabel lbl_dinh_nghia;
	public JButton btn_add;
	public JButton btn_edit;
	public JButton btn_delete;
	public JButton btn_reset;
	public JButton btn_random;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SlangView() {
		checkTuCoTonTai=false;
		History = new ArrayList<String>();
		slangmodel = LoadDataFromFile.loadFile();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		SlangController sc = new SlangController(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Slang word");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(33, 11, 114, 39);
		contentPane.add(lblNewLabel);

		textField_slangword = new JTextField();
		textField_slangword.setBounds(141, 24, 180, 20);
		contentPane.add(textField_slangword);
		textField_slangword.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Definition");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(409, 21, 145, 20);
		contentPane.add(lblNewLabel_1);

		textField_definition = new JTextField();
		textField_definition.setBounds(523, 24, 159, 20);
		contentPane.add(textField_definition);
		textField_definition.setColumns(10);

		btn_tim_slang_word = new JButton("Tim slang word");
		btn_tim_slang_word.addActionListener(sc);
		btn_tim_slang_word.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_tim_slang_word.setBounds(130, 54, 191, 33);
		contentPane.add(btn_tim_slang_word);

		btn_tim_definition = new JButton("Tim definition");
		btn_tim_definition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_tim_definition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_tim_definition.setBounds(504, 52, 191, 33);
		btn_tim_definition.addActionListener(sc);
		contentPane.add(btn_tim_definition);

		btn_lich_su_tim_kiem = new JButton("Lịch sử tìm kiếm");
		btn_lich_su_tim_kiem.addActionListener(sc);
		btn_lich_su_tim_kiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_lich_su_tim_kiem.setBounds(734, 23, 180, 55);
		contentPane.add(btn_lich_su_tim_kiem);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 111, 922, 10);
		contentPane.add(separator);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Key", "Definition" }));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(33, 135, 861, 237);
		contentPane.add(scrollPane);
		separator_1.setBounds(43, 383, 851, 10);
		contentPane.add(separator_1);

		JLabel lblNewLabel_2 = new JLabel("Thông tin từ khoá");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(37, 404, 172, 33);
		contentPane.add(lblNewLabel_2);

		lbl_tu_khoa = new JLabel("Từ khoá");
		lbl_tu_khoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_tu_khoa.setBounds(47, 448, 78, 20);
		contentPane.add(lbl_tu_khoa);

		textField_tu_khoa = new JTextField();
		textField_tu_khoa.setBounds(137, 448, 159, 20);
		contentPane.add(textField_tu_khoa);
		textField_tu_khoa.setColumns(10);

		lbl_dinh_nghia = new JLabel("Định nghĩa");
		lbl_dinh_nghia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_dinh_nghia.setBounds(409, 448, 114, 20);
		contentPane.add(lbl_dinh_nghia);

		textField_dinh_nghia = new JTextField();
		textField_dinh_nghia.setColumns(10);
		textField_dinh_nghia.setBounds(523, 448, 349, 20);
		contentPane.add(textField_dinh_nghia);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(43, 471, 851, 10);
		contentPane.add(separator_2);

		btn_add = new JButton("Add");
		btn_add.addActionListener(sc);
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_add.setBounds(36, 492, 89, 39);
		contentPane.add(btn_add);

		btn_edit = new JButton("Edit");
		btn_edit.addActionListener(sc);
		btn_edit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_edit.setBounds(227, 492, 89, 39);
		contentPane.add(btn_edit);

		btn_delete = new JButton("Delete");
		btn_delete.addActionListener(sc);
		btn_delete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_delete.setBounds(391, 492, 114, 39);
		contentPane.add(btn_delete);

		btn_reset = new JButton("Reset");
		btn_reset.addActionListener(sc);
		btn_reset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_reset.setBounds(585, 492, 89, 39);
		contentPane.add(btn_reset);

		btn_random = new JButton("Random");
		btn_random.addActionListener(sc);
		btn_random.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_random.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_random.setBounds(758, 492, 114, 39);
		contentPane.add(btn_random);
		
		JButton btn_DoVui_slang_word = new JButton("Đố Vui Slang word");
		btn_DoVui_slang_word.addActionListener(sc);
		btn_DoVui_slang_word.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_DoVui_slang_word.setBounds(112, 549, 204, 23);
		contentPane.add(btn_DoVui_slang_word);
		
		JButton btnDo_Vui_Definition = new JButton("Đố Vui definition");
		btnDo_Vui_Definition.addActionListener(sc);
		btnDo_Vui_Definition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDo_Vui_Definition.setBounds(571, 549, 204, 23);
		contentPane.add(btnDo_Vui_Definition);
		this.loadDataToTable();
		this.setVisible(true);
	}

	public void loadDataToTable() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		for (String i : slangmodel.listSlang.keySet()) {
			List<String> list = slangmodel.listSlang.get(i);
			String definition = "";
			if (list != null) {
				for (String string : list) {
					definition += string + ";";
				}
				model_table.addRow(new Object[] { i, definition });
			}
		}
	}

	public void addTuMoi() {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		String tuKhoa = this.textField_tu_khoa.getText();
		String definition = this.textField_dinh_nghia.getText();
		List<String> def = new ArrayList<String>();
		def.add(definition);
		SlangWord sw = new SlangWord(tuKhoa, def);
		if (!this.slangmodel.kiemTraTonTai(sw)) {
			this.checkTuCoTonTai=false;
			this.slangmodel.addSlangWord(sw);
			model_table.addRow(new Object[] { tuKhoa, definition });
		} else {
			this.checkTuCoTonTai=true;
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(tuKhoa)) {
					model_table.setValueAt(tuKhoa, i, 0);
					model_table.setValueAt(definition, i, 1);
				}
			}
		}

	}

	public void hienThiThongTinTuBanChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		String tukhoa = model_table.getValueAt(i_row, 0) + "";
		String definition = model_table.getValueAt(i_row, 1) + "";
		this.textField_tu_khoa.setText(tukhoa);
		this.textField_dinh_nghia.setText(definition);
	}

	public void resetdata() {
		SlangWordList slangmodel_2 = LoadDataFromFile.loadFile();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		while (true) {
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		for (String i : slangmodel_2.listSlang.keySet()) {
			List<String> list = slangmodel_2.listSlang.get(i);
			String definition = "";
			if (list != null) {
				for (String string : list) {
					definition += string + ";";
				}
				model_table.addRow(new Object[] { i, definition });
			}
		}

	}

	public void deleteDataSelected() {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắn chắn xóa dòng đã chọn?");
		if (luaChon == JOptionPane.YES_OPTION) {
			String tukhoa = model_table.getValueAt(i_row, 0) + "";
			this.slangmodel.deleteSlangWord(tukhoa);
			model_table.removeRow(i_row);
		}
	}

	public void randomTuKhoa() {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int length = this.slangmodel.getLength();
		Random rd = new Random();
		int vitri = rd.nextInt(length);
		String tukhoa = model_table.getValueAt(vitri, 0) + "";
		String definition = model_table.getValueAt(vitri, 1) + "";
		this.textField_tu_khoa.setText(tukhoa);
		this.textField_dinh_nghia.setText(definition);
	}

	public void timKiemSlangWord() {
		// TODO Auto-generated method stub
		List<String> tukhoaCanXoa = new ArrayList<String>();
		String tuKhoaCanTim = this.textField_slangword.getText();
		this.History.add(tuKhoaCanTim);
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDongTable = model_table.getRowCount();
		if (tuKhoaCanTim.length() > 0) {
			for (int i = 0; i < soLuongDongTable; i++) {
				String tukhoa = model_table.getValueAt(i, 0) + "";
				if (!tukhoa.equals(tuKhoaCanTim)) {
					tukhoaCanXoa.add(tukhoa);
				}
			}
		}
		for (String tukhoa : tukhoaCanXoa) {
			System.out.println("Tu khoa can xoa:" + tukhoa);
			soLuongDongTable = model_table.getRowCount();
			for (int i = 0; i < soLuongDongTable; i++) {
				String tukhoatrongTable = model_table.getValueAt(i, 0) + "";
				if (tukhoatrongTable.equals(tukhoa)) {
					System.out.println("Đã xóa: " + i);
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}

	public void timKiemDefinition() {
		// TODO Auto-generated method stub
		List<String> tukhoaCanXoa = new ArrayList<String>();
		String DefinitionCanTim = this.textField_definition.getText();
		System.out.println("def can tim:" + DefinitionCanTim);
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDongTable = model_table.getRowCount();
		if (DefinitionCanTim.length() > 0) {
			for (int i = 0; i < soLuongDongTable; i++) {
				String tuKhoa = model_table.getValueAt(i, 0) + "";
				String definition = model_table.getValueAt(i, 1) + "";
				if (!definition.contains(DefinitionCanTim)) {
					tukhoaCanXoa.add(tuKhoa);
				} else {
					this.History.add(tuKhoa);
				}
			}
		}
		for (String tukhoa : tukhoaCanXoa) {
			// System.out.println("Tu khoa can xoa:"+tukhoa);
			soLuongDongTable = model_table.getRowCount();
			for (int i = 0; i < soLuongDongTable; i++) {
				String tukhoatrongTable = model_table.getValueAt(i, 0) + "";
				if (tukhoatrongTable.equals(tukhoa)) {
					// System.out.println("Đã xóa: " + i);
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	public void hienThiHistory() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		while (true) {
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		for (String i : slangmodel.listSlang.keySet()) {
			List<String> list = slangmodel.listSlang.get(i);
			String definition = "";
			if (list != null) {
				for (String string : list) {
					definition += string + ";";
				}
				if(this.History.contains(i)) {
					model_table.addRow(new Object[] { i, definition });
				}
			}
		}
	}
}
