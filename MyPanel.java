import javax.swing.*;
import java.awt.*;
/**
 * 여기에 MtPanel 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyPanel extends JPanel
{
    public JTextField tfName, tfDept, tfAddress;
    public JLabel mlName, mlDept, mlAddress, mlSchoolYear;
    public JTextArea ta;
    public JButton mb, mbClear;
    public JComboBox cbSchoolYear;
    public MyPanel(){
        this.setLayout(new FlowLayout());
        tfName = new JTextField(15);
        tfDept = new JTextField("글로벌소프트웨어학과",15);
        tfAddress = new JTextField("천안시...",15);
        
        mlName = new JLabel("이름");
        mlDept = new JLabel("학과");
        mlAddress = new JLabel("주소");
        
        this.add(mlName);
        this.add(tfName);
        this.add(mlDept);
        this.add(tfDept);
        this.add(mlAddress);
        this.add(tfAddress);
    }
}
