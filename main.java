import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class main extends JFrame implements ActionListener{

    JFrame mainFrame = new JFrame();

    //gets the pic for qadd which adds questions
    private Icon qadd = new ImageIcon(getClass().getResource("img/qadd.png")); 

    String[] oldQuestions = {};

    public main() {
        setLayout();
    }

    private void setLayout() {
        mainFrame.setTitle("Learner");
        mainFrame.setBounds(0, 0, 1000, 800);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().add(optionsPanel(), BorderLayout.NORTH);
        mainFrame.getContentPane().add(menuPanel(), BorderLayout.WEST);
        mainFrame.setVisible(true);
    }

    private JPanel optionsPanel() {
        JPanel optionsPanel = new JPanel();
        optionsPanel.setBackground(Color.lightGray);
        optionsPanel.setPreferredSize(new Dimension(100, 60));
        optionsPanel.setLayout(null);

        JButton addQButton = new JButton(qadd);
        addQButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addQuestion(oldQuestions);
            }
        });
        addQButton.setBounds(5, 5, 50, 50);
        optionsPanel.add(addQButton);

        return optionsPanel;
    }

    private JPanel menuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.white);
        menuPanel.setPreferredSize(new Dimension(200, 100));

        JList questions = new JList(oldQuestions);
        questions.setSelectedIndex(0);
        menuPanel.add(questions);


        return menuPanel;
    }

    private String[] addQuestion(String[] oldQuestions) {
        String[] newQuestions = String[oldQuestions.length +1];

        for(int i = 0; i < oldQuestions.length; i++) {
            newQuestions[i] = oldQuestions[i];
            System.out.print(newQuestions[i]);
        }

        newQuestions[newQuestions.length - 1] = "a";
        System.out.print(newQuestions.length -1);
        return newQuestions;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}