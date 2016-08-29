package trier;
 
import java.awt.BorderLayout;
import java.awt.GridLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
 
public class JEx extends JFrame {
    JTable jt;
    JTextField tx1, tx2, tx3, tx4;
    JButton b1, b2, b3, b4, b5;
    JPanel p1, p2, p3, p4;
    JEx(String s){
        super(s);
        setLayout(new BorderLayout());
        setBounds(100, 100, 500, 300);
        
        //객채 생성
        p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();p4 = new JPanel();
        tx1 = new JTextField(5);tx2 = new JTextField(5);
        tx3 = new JTextField(5);tx4 = new JTextField(5);
        JPanel pp1 = new JPanel();JPanel pp2 = new JPanel();
        JPanel pp3 = new JPanel();JPanel pp4 = new JPanel();
        
        //패널 배치
        this.add("West", p1);
        this.add("South", p2);
        this.add("Center", p3);
        this.add("North", p4);
        
        //west 패널
        p1.setLayout(new GridLayout(6,1));
        p1.add(pp1);p1.add(pp2);p1.add(pp3);p1.add(pp4);
        pp1.add(new JLabel("번      호"));pp1.add(tx1);
        pp2.add(new JLabel("이      름"));pp2.add(tx2);
        pp3.add(new JLabel("이  메  일"));pp3.add(tx3);
        pp4.add(new JLabel("전화번호"));pp4.add(tx4);
        
        //north 패널
        p4.add(new JLabel("긴급연락처!"));
        
        //center 패널
        jt = new JTable();
        JScrollPane sp = new JScrollPane(jt);
        getContentPane().add(sp);
        p3.add(jt);
        
        //south 패널
        b1 = new JButton("전체보기");b2 = new JButton("추    가");b3 = new JButton("삭    제");
        b4 = new JButton("검    색");b5 = new JButton("취    소");
        p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);p2.add(b5);
        
        
        
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new JEx("a");
    }
}