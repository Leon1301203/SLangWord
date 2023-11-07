package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.DoVuiSlangWord;

public class DoVuiSlangWordController implements ActionListener {
	private DoVuiSlangWord dvsw;
	public DoVuiSlangWordController(DoVuiSlangWord dvsw) {
		this.dvsw=dvsw;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src=e.getActionCommand();
		JOptionPane.showMessageDialog(this.dvsw, "Bạn đã nhấn:" + src);
		if(e.getSource()==this.dvsw.btn_Choi_Tiep) {
			this.dvsw.showRanDomAnser();
		}else if(e.getSource()==this.dvsw.btn_KetThuc) {
			this.dvsw.setVisible(false);
		}else if(e.getSource()==this.dvsw.btn_answer1) {
			if(this.dvsw.btn_answer1.getText()==this.dvsw.definition) {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi dung:");
				this.dvsw.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi sai thoat game:");
				this.dvsw.setVisible(false);
			}
		}else if(e.getSource()==this.dvsw.btn_Answer2) {
			if(this.dvsw.btn_Answer2.getText()==this.dvsw.definition) {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi dung:");
				this.dvsw.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi sai thoat game:");
				this.dvsw.setVisible(false);
			}
		}else if(e.getSource()==this.dvsw.btn_Answer3) {
			if(this.dvsw.btn_Answer3.getText()==this.dvsw.definition) {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi dung:");
				this.dvsw.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi sai thoat game:");
				this.dvsw.setVisible(false);
			}
		}else if(e.getSource()==this.dvsw.btn_Answer4) {
			if(this.dvsw.btn_Answer4.getText()==this.dvsw.definition) {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi dung:");
				this.dvsw.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvsw, "Ban da tra loi sai thoat game:");
				this.dvsw.setVisible(false);
			}
		}
	}

}
