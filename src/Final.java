/*
 * 이 프로그램은 swing을 이용하여 스크롤 윈도우 패널에 
 * 구구단을 출력하는 간단한 프로그램입니다.
 */

// [문제1]
import javax.swing.*;
import java.awt.*;

public class Final extends JFrame {
    private JTextArea resultArea;

    public Final() {
        setTitle("구구단 출력기"); // [문제2]
        setSize(500, 400);; // [문제3] 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // [문제4] 
        setLocationRelativeTo(null);
        

        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 결과 출력 영역
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        printGugudan();
    }

    private void printGugudan() {
       
       for(int i = 2; i < 10; i++) {
            System.out.println(i + "단"); //앞글자 2~9 반복

            for(int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j); //뒤 1~9 반복
            }
            System.out.println();
       }
      
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Final(); // [문제6] 윈도우를 출력.
            } 
        });
    }
}
