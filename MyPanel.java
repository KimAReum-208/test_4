
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 여러가지 컴포넌트를 담고있는 panel 클래스이자 listener역활을 하는 클래스
 * 
 * @author (2017315002 김아름, 2018315036 양유석, 2018315033 태영준) 
 * @version (2019.12.02)
 */
public class MyPanel extends JPanel implements ActionListener
{
    public JTextField tfName, tfDept, tfAddress;
    public JLabel mlName, mlDept, mlAddress, mlSchoolYear;
    public JTextArea ta = new JTextArea(10, 24);
    public JButton mb, mbClear;
    public JComboBox cbSchoolYear;
    public JScrollPane sp;
    public MyPanel(){
        this.setLayout(new FlowLayout());
        tfName = new JTextField(20);
        tfDept = new JTextField("글로벌소프트웨어학과",20);
        tfAddress = new JTextField("천안시...",20);
        String[] items = {"1학년", "2학년", "3학년", "4학년"};
        cbSchoolYear = new JComboBox(items);
        
        mlName = new JLabel("이름");
        mlDept = new JLabel("학과");
        mlAddress = new JLabel("주소");
        mlSchoolYear = new JLabel("학년");
        sp = new JScrollPane(ta);
        mb = new JButton("추가");
        mbClear = new JButton("Clear");
        
        mb.addActionListener(this);
        mbClear.addActionListener(this);
        
        this.add(mlName);
        this.add(tfName);
        this.add(mlDept);
        this.add(tfDept);
        this.add(mlAddress);
        this.add(tfAddress);
        this.add(mlSchoolYear);
        this.add(cbSchoolYear);
        this.add(mb);
        this.add(mbClear);
        this.add(sp);                
    }
    public void actionPerformed(ActionEvent e){
        JButton jb = (JButton)e.getSource();
        if (jb.getText().equals("추가")){
            ta.append("이름: "+ tfName.getText()+"\n");
            ta.append("학과: "+ tfDept.getText()+"\n");
            ta.append("학년: "+ cbSchoolYear.getSelectedItem()+"\n");
            ta.append("주소: "+ tfAddress.getText()+"\n");
            ta.append("-------------------------------------------"+"\n");
        }
        else{
            tfName.setText("");
            tfDept.setText("");
            tfAddress.setText("");
            ta.setText("");
        }
    }
}
