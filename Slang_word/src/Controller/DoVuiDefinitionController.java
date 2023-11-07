package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.DoVuiDefinition;

public class DoVuiDefinitionController implements ActionListener {
	DoVuiDefinition dvd;
	public DoVuiDefinitionController(DoVuiDefinition dvd) {
		this.dvd=dvd;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src=e.getActionCommand();
		JOptionPane.showMessageDialog(this.dvd, "Bạn đã nhấn:" + src);
		if(e.getSource()==this.dvd.btn_choi) {
			this.dvd.showRanDomAnser();
		}else if(e.getSource()==this.dvd.btn_ketthuc) {
			JOptionPane.showMessageDialog(this.dvd, "Thoát game");
			this.dvd.setVisible(false);
		}else if(e.getSource()==this.dvd.btn_answer1) {
			if(this.dvd.btn_answer1.getText()==this.dvd.key) {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi dung:");
				this.dvd.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi sai thoat game:");
				this.dvd.setVisible(false);
			}
		}else if(e.getSource()==this.dvd.btn_answer2) {
			if(this.dvd.btn_answer2.getText()==this.dvd.key) {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi dung:");
				this.dvd.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi sai thoat game:");
				this.dvd.setVisible(false);
			}
		}else if(e.getSource()==this.dvd.btn_answer3) {
			if(this.dvd.btn_answer3.getText()==this.dvd.key) {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi dung:");
				this.dvd.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi sai thoat game:");
				this.dvd.setVisible(false);
			}
		}else if(e.getSource()==this.dvd.btn_answer4) {
			if(this.dvd.btn_answer4.getText()==this.dvd.key) {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi dung:");
				this.dvd.showRanDomAnser();
			}else {
				JOptionPane.showMessageDialog(this.dvd, "Ban da tra loi sai thoat game:");
				this.dvd.setVisible(false);
			}
		}
	}

}
