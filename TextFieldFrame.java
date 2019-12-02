import javax.swing.*;
/**
 * 여기에 TextFieldFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class TextFieldFrame extends JFrame
{
    public MyPanel mp;
    public TextFieldFrame(){
        this.setSize(270, 350);
        this.setTitle("실습_4");
        
        mp = new MyPanel();
        this.add(mp);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
