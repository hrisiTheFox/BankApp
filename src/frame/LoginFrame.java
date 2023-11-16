package frame;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JFrame frame;
    private JButton loginBtn;
    private JButton fpBtn;
    private JButton signInBtn;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JTextField usernameTxF;
    private JPasswordField passwordPFld;

    LoginFrame(){
        this.setTitle("Login into Bank account");
        this.setSize(400,250);
        this.setLayout(null);
        usernameLbl = new JLabel("Username");
        usernameTxF = new JTextField();
        passwordLbl = new JLabel("Password");
        passwordPFld = new JPasswordField();
        loginBtn = new JButton("Login");
        fpBtn = new JButton("Forgotten password");
        signInBtn = new JButton("Sign up");

        usernameLbl.setBounds(40, 20, 100, 20);
        usernameTxF.setBounds(140, 20, 160, 20);
        passwordLbl.setBounds(40, 60, 160, 20);
        passwordPFld.setBounds(140,60,160,20);
        loginBtn.setBounds(140, 100, 100, 20);
        signInBtn.setBounds(40, 140, 100, 20);
        fpBtn.setBounds(180, 140, 180, 20);

        this.add(usernameLbl);
        this.add(usernameTxF);
        this.add(passwordLbl);
        this.add(passwordPFld);
        this.add(loginBtn);
        this.add(fpBtn);
        this.add(signInBtn);

        this.setVisible(true);
    }
}
