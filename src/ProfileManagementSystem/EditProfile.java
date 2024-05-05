/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfileManagementSystem;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author geral
 */
public class EditProfile extends javax.swing.JFrame {

    /**
     * Creates new form EditProfile
     */
    public EditProfile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        redbar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        leftside = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton()
        ;
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        barforedit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        logouphsd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        NAME1 = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        middlenamefield = new javax.swing.JTextField();
        lastnamefield = new javax.swing.JTextField();
        firstname = new javax.swing.JLabel();
        middlename = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        strand = new javax.swing.JLabel();
        strandcombobox = new javax.swing.JComboBox<>();
        levelcombobox = new javax.swing.JComboBox<>();
        level = new javax.swing.JLabel();
        sectioncombobox = new javax.swing.JComboBox<>();
        section = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        agefield = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        gendercombobox = new javax.swing.JComboBox<>();
        bday = new javax.swing.JLabel();
        schoolidd = new javax.swing.JLabel();
        schoolid = new javax.swing.JTextField();
        number = new javax.swing.JLabel();
        numberfield = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        schoolg10 = new javax.swing.JLabel();
        schoolg10field = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        residence = new javax.swing.JLabel();
        residencefield = new javax.swing.JTextField();
        city = new javax.swing.JLabel();
        cityfield = new javax.swing.JTextField();
        province = new javax.swing.JLabel();
        provincefield = new javax.swing.JTextField();
        zipcode = new javax.swing.JLabel();
        zipcodfield = new javax.swing.JTextField();
        mothername = new javax.swing.JLabel();
        mamafullname = new javax.swing.JTextField();
        mamaocc = new javax.swing.JLabel();
        mamaoccupationfield = new javax.swing.JTextField();
        numbermama = new javax.swing.JLabel();
        mamanumber = new javax.swing.JTextField();
        papaname = new javax.swing.JLabel();
        papafullname = new javax.swing.JTextField();
        papaoccupation = new javax.swing.JLabel();
        papaoccupationfield = new javax.swing.JTextField();
        numberpapa = new javax.swing.JLabel();
        papanumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redbar.setBackground(new java.awt.Color(123, 21, 20));
        redbar.setForeground(new java.awt.Color(123, 21, 20));

        javax.swing.GroupLayout redbarLayout = new javax.swing.GroupLayout(redbar);
        redbar.setLayout(redbarLayout);
        redbarLayout.setHorizontalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        redbarLayout.setVerticalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(redbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 40));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jLabel4.setText("Student Information");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 330, 30));

        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 70, -1, -1));

        leftside.setBackground(new java.awt.Color(255, 255, 255));
        leftside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setBorder(null);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        leftside.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/profileredbutton (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        leftside.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 70));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/FAQs-removebg-preview (1).png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        leftside.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 80, 60));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/attendance-removebg-preview (1).png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        leftside.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/SCHED-removebg-preview (1).png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        leftside.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, -1));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/SHSlogo (1).png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        leftside.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, -1, -1));

        jPanel1.add(leftside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 860));

        barforedit.setBackground(new java.awt.Color(153, 0, 0));
        barforedit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Currently editing profile");
        barforedit.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, 225, -1));

        jButton7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        jButton7.setText("Cancel");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        barforedit.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, -1));

        Save.setBackground(new java.awt.Color(252, 203, 10));
        Save.setText("Save & View");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        barforedit.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 110, -1));

        jPanel1.add(barforedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 970, 60));
        jPanel1.add(logouphsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

        jPanel3.setMinimumSize(new java.awt.Dimension(912, 1007));
        jPanel3.setPreferredSize(new java.awt.Dimension(912, 1007));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NAME1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        NAME1.setText("NAME:");
        jPanel3.add(NAME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        firstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefieldActionPerformed(evt);
            }
        });
        jPanel3.add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 170, 40));

        middlenamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenamefieldActionPerformed(evt);
            }
        });
        jPanel3.add(middlenamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 170, 40));

        lastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamefieldActionPerformed(evt);
            }
        });
        jPanel3.add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 170, 40));

        firstname.setText("First Name");
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        middlename.setText("Middle Name");
        jPanel3.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        lastname.setText("Last Name");
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        strand.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        strand.setText("STRAND:");
        jPanel3.add(strand, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        strandcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "HE", "AD", "HUMSS","GAS","STEM","ABM" }));
        strandcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strandcomboboxActionPerformed(evt);
            }
        });
        jPanel3.add(strandcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, 40));

        levelcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12" }));
        jPanel3.add(levelcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 40));

        level.setText("Level");
        jPanel3.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        sectioncombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04","05","06","07","08","09", "10", "11", "12", "13", "14", "15" }));
        jPanel3.add(sectioncombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 70, 40));

        section.setText("Section");
        jPanel3.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        age.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        age.setText("AGE:");
        jPanel3.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 50, -1));
        jPanel3.add(agefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 50, 40));

        gender.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        gender.setText("GENDER:");
        jPanel3.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, 20));

        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", }));
        jPanel3.add(gendercombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 110, 40));

        bday.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        bday.setText("BIRTHDAY:");
        jPanel3.add(bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 20));

        schoolidd.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        schoolidd.setText("SCHOOL ID:");
        jPanel3.add(schoolidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 130, 20));

        schoolid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolidActionPerformed(evt);
            }
        });
        jPanel3.add(schoolid, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 240, 40));

        number.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        number.setText("CONTACT INFORMATION:");
        jPanel3.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel3.add(numberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 210, 40));

        email.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        email.setText("EMAIL ADDRESS:");
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));
        jPanel3.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 310, 40));

        schoolg10.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        schoolg10.setText("SCHOOL (G10):");
        jPanel3.add(schoolg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 130, 20));

        schoolg10field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolg10fieldActionPerformed(evt);
            }
        });
        jPanel3.add(schoolg10field, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 250, 40));

        address.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        address.setText("PERMANENT ADDRESS:");
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 300, -1));
        jPanel3.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 820, 40));

        residence.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        residence.setText("RESIDENCE ADDRESS:");
        jPanel3.add(residence, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 270, -1));
        jPanel3.add(residencefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 820, 40));

        city.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        city.setText("CITY");
        jPanel3.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));
        jPanel3.add(cityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 170, 40));

        province.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        province.setText("PROVINCE");
        jPanel3.add(province, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, -1, -1));
        jPanel3.add(provincefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 170, 40));

        zipcode.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        zipcode.setText("ZIP CODE");
        jPanel3.add(zipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, -1, -1));
        jPanel3.add(zipcodfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 170, 40));

        mothername.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        mothername.setText("MOTHER'S FULL NAME");
        jPanel3.add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, -1, -1));
        jPanel3.add(mamafullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, 320, 40));

        mamaocc.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        mamaocc.setText("OCCUPATION");
        jPanel3.add(mamaocc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 730, -1, -1));
        jPanel3.add(mamaoccupationfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 750, 190, 40));

        numbermama.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        numbermama.setText("CONTACT NUMBER:");
        jPanel3.add(numbermama, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, -1, -1));
        jPanel3.add(mamanumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 750, 190, 40));

        papaname.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        papaname.setText("FATHER'S FULL NAME");
        jPanel3.add(papaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, -1, -1));
        jPanel3.add(papafullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 320, 40));

        papaoccupation.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        papaoccupation.setText("OCCUPATION");
        jPanel3.add(papaoccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 820, -1, -1));
        jPanel3.add(papaoccupationfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 840, 190, 40));

        numberpapa.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        numberpapa.setText("CONTACT NUMBER:");
        jPanel3.add(numberpapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 820, -1, -1));
        jPanel3.add(papanumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 840, 190, 40));

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 970, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/maroon logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        SigninPage v = new SigninPage();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        HomePage v = new HomePage();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
    Profile v = new Profile();
    v.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton7MouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
    
    Profile v = new Profile();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_SaveMouseClicked

    private void firstnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnamefieldActionPerformed

    private void middlenamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenamefieldActionPerformed

    private void lastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamefieldActionPerformed

    }//GEN-LAST:event_lastnamefieldActionPerformed

    private void strandcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strandcomboboxActionPerformed

    }//GEN-LAST:event_strandcomboboxActionPerformed

    private void schoolidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolidActionPerformed

    private void schoolg10fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolg10fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolg10fieldActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Profile v = new Profile();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        FAQs v = new FAQs();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Attendancee1 v = new Attendancee1();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Schedule v = new Schedule();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        HomePage v = new HomePage();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NAME1;
    private javax.swing.JButton Save;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressfield;
    private javax.swing.JLabel age;
    private javax.swing.JTextField agefield;
    private javax.swing.JPanel barforedit;
    private javax.swing.JLabel bday;
    private javax.swing.JLabel city;
    private javax.swing.JTextField cityfield;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> gendercombobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastname;
    public static javax.swing.JTextField lastnamefield;
    private javax.swing.JPanel leftside;
    private javax.swing.JLabel level;
    private javax.swing.JComboBox<String> levelcombobox;
    private javax.swing.JLabel logouphsd;
    private javax.swing.JTextField mamafullname;
    private javax.swing.JTextField mamanumber;
    private javax.swing.JLabel mamaocc;
    private javax.swing.JTextField mamaoccupationfield;
    private javax.swing.JLabel middlename;
    public static javax.swing.JTextField middlenamefield;
    private javax.swing.JLabel mothername;
    private javax.swing.JLabel number;
    private javax.swing.JTextField numberfield;
    private javax.swing.JLabel numbermama;
    private javax.swing.JLabel numberpapa;
    private javax.swing.JTextField papafullname;
    private javax.swing.JLabel papaname;
    private javax.swing.JTextField papanumber;
    private javax.swing.JLabel papaoccupation;
    private javax.swing.JTextField papaoccupationfield;
    private javax.swing.JLabel province;
    private javax.swing.JTextField provincefield;
    private javax.swing.JPanel redbar;
    private javax.swing.JLabel residence;
    private javax.swing.JTextField residencefield;
    private javax.swing.JLabel schoolg10;
    private javax.swing.JTextField schoolg10field;
    private javax.swing.JTextField schoolid;
    private javax.swing.JLabel schoolidd;
    private javax.swing.JLabel section;
    private javax.swing.JComboBox<String> sectioncombobox;
    private javax.swing.JLabel strand;
    private javax.swing.JComboBox<String> strandcombobox;
    private javax.swing.JLabel zipcode;
    private javax.swing.JTextField zipcodfield;
    // End of variables declaration//GEN-END:variables
}
