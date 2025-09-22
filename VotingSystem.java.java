package mypkg;

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import java.util.*;

public class VotingSystem extends JFrame implements ActionListener {
    private JTextField voterIdField;
    private JButton voteButton, resultButton;
    private JRadioButton bjpBtn, incBtn, aapBtn, cpiBtn;
    private ButtonGroup partyGroup;

    private HashSet<String> voters;       
    private HashSet<String> voted;        
    private HashMap<String, Integer> votes; 

    public VotingSystem() {
        setTitle("Online Voting System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));

        voters = new HashSet<>();
        voted = new HashSet<>();
        votes = new HashMap<>();

        votes.put("BJP", 0);
        votes.put("INC", 0);
        votes.put("AAP", 0);
        votes.put("CPI", 0);

        for (int i = 1; i <= 1000; i++) {
            voters.add("V" + i);
        }

        JLabel idLabel = new JLabel("Enter Voter ID:");
        voterIdField = new JTextField();

        bjpBtn = new JRadioButton("BJP");
        incBtn = new JRadioButton("INC");
        aapBtn = new JRadioButton("AAP");
        cpiBtn = new JRadioButton("CPI");

        partyGroup = new ButtonGroup();
        partyGroup.add(bjpBtn);
        partyGroup.add(incBtn);
        partyGroup.add(aapBtn);
        partyGroup.add(cpiBtn);

        voteButton = new JButton("Vote");
        resultButton = new JButton("Show Results");

        add(idLabel);
        add(voterIdField);
        add(bjpBtn);
        add(incBtn);
        add(aapBtn);
        add(cpiBtn);
        add(voteButton);
        add(resultButton);

        voteButton.addActionListener(this);
        resultButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voteButton) {
            String voterId = voterIdField.getText().trim();

            if (!voters.contains(voterId)) {
                JOptionPane.showMessageDialog(this, "Invalid Voter ID!");
                return;
            }
            if (voted.contains(voterId)) {
                JOptionPane.showMessageDialog(this, "You have already voted!");
                return;
            }

            String party = null;
            if (bjpBtn.isSelected()) party = "BJP";
            else if (incBtn.isSelected()) party = "INC";
            else if (aapBtn.isSelected()) party = "AAP";
            else if (cpiBtn.isSelected()) party = "CPI";

            if (party == null) {
                JOptionPane.showMessageDialog(this, "Please select a party!");
                return;
            }

            votes.put(party, votes.get(party) + 1);
            voted.add(voterId);
            JOptionPane.showMessageDialog(this, "Vote cast successfully for " + party);
        }

        if (e.getSource() == resultButton) {
            StringBuilder result = new StringBuilder("Current Vote Count:\n");
            for (String party : votes.keySet()) {
                result.append(party).append(": ").append(votes.get(party)).append("\n");
            }
            JOptionPane.showMessageDialog(this, result.toString());
        }
    }

    public static void main(String[] args) {
        new VotingSystem().setVisible(true);
    }
}
