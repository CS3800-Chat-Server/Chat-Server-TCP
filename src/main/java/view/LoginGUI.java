/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.main.java.view;

import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.InetAddressValidator;


import src.main.java.controller.*;

/**
 *
 * @author Squee183
 */
public class LoginGUI extends javax.swing.JFrame {

    private Controller clientHandler;

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI(Controller clientHandler) {
        this.clientHandler = clientHandler;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serverAddressInput = new java.awt.TextField();
        userNameInput = new java.awt.TextField();
        portInput = new java.awt.TextField();
        loginLabel = new javax.swing.JLabel();
        portText = new java.awt.Label();
        userNameText = new java.awt.Label();
        serverAddressText = new java.awt.Label();
        loginButton = new java.awt.Button();
        exitButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginLabel.setText("Login");

        portText.setText("Port");

        userNameText.setText("Username");

        serverAddressText.setText("Server Address");

        loginButton.setLabel("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        exitButton.setLabel("EXIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(userNameText,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                128,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(serverAddressText,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                128,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(userNameInput,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        298,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(serverAddressInput,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        298,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(portText,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(loginButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(portInput,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(loginLabel,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(exitButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                47,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                .createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginLabel)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        14,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(portText,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(serverAddressText,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(portInput,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(serverAddressInput,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(userNameText,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameInput,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(exitButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        portText.getAccessibleContext().setAccessibleName("portText");
        userNameText.getAccessibleContext().setAccessibleName("userNameText");
        serverAddressText.getAccessibleContext().setAccessibleName("serverAddressText");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginButtonActionPerformed
        String address = serverAddressInput.getText();
        String username = userNameInput.getText();
        String port = portInput.getText();

        if (address.length() == 0 || username.length() == 0 || port.length() == 0) {
            return;
        }

        // validate IP using InetAddressValidator
        InetAddressValidator validator = new InetAddressValidator();
        if (!validator.isValidInet4Address(address) && !validator.isValidInet6Address(address))
        {
            // if invalid, bring up dialog to display error message
            JOptionPane.showMessageDialog(this, "Not a valid IP address", "Error", JOptionPane.ERROR_MESSAGE);
            // clear input
            serverAddressInput.setText("");
            return;
        }

        // validate username
        String regex = "^[a-zA-Z0-9]+$";
        if(!username.matches(regex))
        {
            JOptionPane.showMessageDialog(this, "Not a valid username", "Error", JOptionPane.ERROR_MESSAGE);
            userNameInput.setText("");
        }

        // validate port number
        int p;
        try {
            p = Integer.parseInt(port);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Not a valid port number", "Error", JOptionPane.ERROR_MESSAGE);
            // clear input
            portInput.setText("");
            return;
        }

        // check if port number within valid range
        if (p < 0 || p > 65535) {
            JOptionPane.showMessageDialog(this, "Not a valid port number", "Error", JOptionPane.ERROR_MESSAGE);
            // clear input
            portInput.setText("");
            return;
        }

        /*
         * Add input validation for ip address, username, and port.
         * 
         * We can use address.matches("some regex") to match the input for ip to
         * something like xxx.xxx.xxx.xxx
         * 
         * We can use a try catch to parse the value of port and check if it is between
         * a valid port number
         * 
         * We can use username.matches("more regex") to check if the name is
         * alphanumeric, or alternatively allow the user to name themselves whatever
         * they want.
         * 
         * Any time there is an error for any of these cases we can create a error pane
         * using the following:
         * 
         * JOptionPane.showMessageDialog(this, "Error Message", "Error",
         * JOptionPane.ERROR_MESSAGE);
         * 
         * and then clear the wrong information and return out of the function before
         * handling the login message with the controller
         */

        // SEND LOGIN INFO TO CLIENT
        clientHandler.handleLoginMessage(username, address, Integer.valueOf(port));

    }// GEN-LAST:event_loginButtonActionPerformed

    public void displayLoginError() {
        JOptionPane.showMessageDialog(this, "Error connecting to server.", "Connection Error",
                JOptionPane.ERROR_MESSAGE);
        serverAddressInput.setText("");
        portInput.setText("");
        userNameInput.setText("");
    }

    public void close() {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button exitButton;
    private java.awt.Button loginButton;
    private javax.swing.JLabel loginLabel;
    private java.awt.TextField portInput;
    private java.awt.Label portText;
    private java.awt.TextField serverAddressInput;
    private java.awt.Label serverAddressText;
    private java.awt.TextField userNameInput;
    private java.awt.Label userNameText;
    // End of variables declaration//GEN-END:variables
}
