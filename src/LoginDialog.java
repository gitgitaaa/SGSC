import java.awt.Color;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JTextField tfId;
	private JPasswordField tfPassword;
	
	private SLogin sLogin;
	
	public LoginDialog(Frame parent) {
		super(parent);
		this.setSize(200,200);
		
		JPanel panel1 = new JPanel();
		panel1.setSize(100,100);
		panel1.setBackground(Color.blue);
		this.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setSize(100,100);
		panel2.setBackground(Color.red);
		this.add(panel2);
		
		LayoutManager layoutManager = new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS);
		this.setLayout(layoutManager);
		
//		this.setSize(200,200);
//		this.setTitle("로그인");
//		LayoutManager layoutManager = new FlowLayout();
//		this.setLayout(layoutManager);		
//   
//		JLabel lbId=new JLabel("아이디");    
//		this.add(lbId);
//		 		
//		this.tfId = new JTextField();
//		this.tfId.setColumns(10);
//		this.add(tfId);
//		
//		JLabel lbPassword =new JLabel("비밀번호");    
//		this.add(lbPassword);
//		
//		this.tfPassword = new JPasswordField();   
//		this.tfPassword.setColumns(10);
//		this.add(tfPassword);
//		
//		
//		JButton btLogin = new JButton("Login");    
//		this.add(btLogin,BorderLayout.SOUTH);
//		
//		ActionHandler actionHandler = new ActionHandler();
//		btLogin.addActionListener(actionHandler);
//		
//		this.sLogin = new SLogin();
	}
	
	void login() {
		String id = this.tfId.getText();
		VAccount vAccount = this.sLogin.login(id);
	}
	
	class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}		
	}
}
