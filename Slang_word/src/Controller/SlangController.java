package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.DoVuiDefinition;
import View.DoVuiSlangWord;
import View.SlangView;

public class SlangController implements ActionListener{
	private SlangView sv;
	public SlangController(SlangView sv) {
		this.sv=sv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src=e.getActionCommand();
		JOptionPane.showMessageDialog(this.sv, "Bạn đã nhấn:" + src);
		if(src.equals("Add")) {
			this.sv.addTuMoi();
			if(this.sv.checkTuCoTonTai==true) {
				JOptionPane.showMessageDialog(this.sv, "Từ đã tồn tại bạn chỉ cỏ thể chỉnh sửa định nghĩa");
			}
		}else if(src.equals("Edit")) {
			this.sv.hienThiThongTinTuBanChon();
		}else if(src.equals("Reset")) {
			this.sv.resetdata();
		}else if(src.equals("Delete")) {
			this.sv.deleteDataSelected();
		}else if(src.equals("Random")) {
			this.sv.randomTuKhoa();
		}else if(src.equals("Tim slang word")) {
			this.sv.timKiemSlangWord();
		}else if(src.equals("Tim definition")) {
			System.out.println("ban da nhan Tim definition");
			this.sv.timKiemDefinition();
		}else if(src.equals("Lịch sử tìm kiếm")) {
			this.sv.hienThiHistory();
		}else if(src.equals("Đố Vui Slang word")) {
			DoVuiSlangWord dovui=new DoVuiSlangWord();
			dovui.setVisible(true);
		}else if(src.equals("Đố Vui definition")){
			DoVuiDefinition dovui=new DoVuiDefinition();
			dovui.setVisible(true);
		}
	}
	

}
