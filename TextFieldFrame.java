import javax.swing.*;
/**
 * MyPanel을 담고있는 프레임 클래스.
 * 
 * @author (2017315002 김아름, 2018315036 양유석, 2018315033 태영준) 
 * @version (2019.12.02)
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
