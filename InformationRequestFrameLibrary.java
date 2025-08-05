
package ac.tut.za.ui;

/**
 *
 * @author Mercy
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class InformationRequestFrameLibrary extends JFrame {

    // --- Panels ---
    private JPanel mainPanel; 
    private JPanel contactInfoPanel; 
    private JPanel residenceInfoPanel; 
    private JPanel disabilityInfoPanel; 
    private JPanel buttonsPanel; 

    // Sub-panels for Contact Information
    private JPanel saCellPhonePanel;
    private JPanel workTelephonePanel;
    private JPanel homeTelephonePanel;
    private JPanel emailPanel;
    private JPanel verifyEmailPanel;

    // Sub-panels for Residence Information
    private JPanel applyResidencePanel;

    // Sub-panels for Disability Information
    private JPanel disabilityPanel;

    // --- Labels ---
    private JLabel saCellPhoneLabel;
    private JLabel workTelephoneLabel;
    private JLabel homeTelephoneLabel;
    private JLabel emailLabel;
    private JLabel verifyEmailLabel;
    private JLabel applyResidenceLabel;
    private JLabel disabilityLabel;

    // --- Text Fields ---
    private JTextField workTelephoneTxtFld;
    private JTextField homeTelephoneTxtFld;
    private JTextField emailTxtFld;
    private JTextField verifyEmailTxtFld;

    // --- Combo Boxes ---
    private JComboBox<String> saCellPhoneComboBox;
    private JComboBox<String> applyResidenceComboBox;

    // --- Check Boxes ---
    private JCheckBox disabilityChkBx;

    // --- Buttons ---
    private JButton backBtn;
    private JButton nextBtn;

    public InformationRequestFrameLibrary() {
        // --- Frame Configuration ---
        setTitle("Information Request Form");
        setSize(600, 700); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); 

        // --- Panel Initializations ---
        mainPanel = new JPanel(new GridLayout(3, 1, 10, 10)); 
        mainPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1)); 

        // Contact Information Section
        contactInfoPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        contactInfoPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Contact Information"));

        saCellPhonePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        workTelephonePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        homeTelephonePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        verifyEmailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Residence Information Section
        residenceInfoPanel = new JPanel(new GridLayout(1, 1, 5, 5)); 
        residenceInfoPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Residence Information"));

        applyResidencePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Disability Information Section
        disabilityInfoPanel = new JPanel(new GridLayout(1, 1, 5, 5)); 
        disabilityInfoPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Disability Information"));

        disabilityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Buttons Panel
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); 

        // --- Label Initializations ---
        saCellPhoneLabel = new JLabel("Do you have a South African Cell Phone Number?");
        workTelephoneLabel = new JLabel("Work Telephone Number:");
        homeTelephoneLabel = new JLabel("Home Telephone Number:");
        emailLabel = new JLabel("Email:");
        verifyEmailLabel = new JLabel("Verify email:");
        applyResidenceLabel = new JLabel("Do you want to apply for residence?");
        disabilityLabel = new JLabel("Do you have a disability or impairment?");

        // --- Text Field Initializations ---
        workTelephoneTxtFld = new JTextField(20);
        homeTelephoneTxtFld = new JTextField(20);
        emailTxtFld = new JTextField(20);
        verifyEmailTxtFld = new JTextField(20);

        // --- Combo Box Initializations ---
        String[] saCellPhoneOptions = {"-- Please Select --", "Yes", "No"};
        saCellPhoneComboBox = new JComboBox<>(saCellPhoneOptions);
        
        String[] applyResidenceOptions = {"-- Please Select --", "Yes", "No"};
        applyResidenceComboBox = new JComboBox<>(applyResidenceOptions);

        // --- Check Box Initializations ---
        disabilityChkBx = new JCheckBox();

        // --- Button Initializations ---
        backBtn = new JButton("Back");
        nextBtn = new JButton("Next");

        // --- Add Components to Sub-Panels ---

        // Contact Information Sub-Panels
        saCellPhonePanel.add(saCellPhoneLabel);
        saCellPhonePanel.add(saCellPhoneComboBox);
        saCellPhonePanel.add(new JLabel("*")); // Asterisk for required field

        workTelephonePanel.add(workTelephoneLabel);
        workTelephonePanel.add(workTelephoneTxtFld);

        homeTelephonePanel.add(homeTelephoneLabel);
        homeTelephonePanel.add(homeTelephoneTxtFld);

        emailPanel.add(emailLabel);
        emailPanel.add(emailTxtFld);
        emailPanel.add(new JLabel("*")); // Asterisk for required field

        verifyEmailPanel.add(verifyEmailLabel);
        verifyEmailPanel.add(verifyEmailTxtFld);
        verifyEmailPanel.add(new JLabel("*")); // Asterisk for required field

        // Residence Information Sub-Panel
        applyResidencePanel.add(applyResidenceLabel);
        applyResidencePanel.add(applyResidenceComboBox);
        applyResidencePanel.add(new JLabel("*")); // Asterisk for required field

        // Disability Information Sub-Panel
        disabilityPanel.add(disabilityLabel);
        disabilityPanel.add(disabilityChkBx);

        // Buttons Panel
        buttonsPanel.add(backBtn);
        buttonsPanel.add(nextBtn);

        // --- Add Sub-Panels to Main Section Panels ---

        // Contact Information Section
        contactInfoPanel.add(saCellPhonePanel);
        contactInfoPanel.add(workTelephonePanel);
        contactInfoPanel.add(homeTelephonePanel);
        contactInfoPanel.add(emailPanel);
        contactInfoPanel.add(verifyEmailPanel);

        // Residence Information Section
        residenceInfoPanel.add(applyResidencePanel);

        // Disability Information Section
        disabilityInfoPanel.add(disabilityPanel);

        // --- Add Section Panels to Main Panel ---
        mainPanel.add(contactInfoPanel);
        mainPanel.add(residenceInfoPanel);
        mainPanel.add(disabilityInfoPanel);

        // --- Add Main Panel and Buttons Panel to Frame ---
        add(mainPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

        // --- Final Frame Configuration ---
        setVisible(true);
    }
}

