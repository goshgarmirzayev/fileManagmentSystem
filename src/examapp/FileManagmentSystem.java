package examapp;

import service.FileService;
import service.AllUserDB;
import beans.Files;
import beans.User;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Goshgar
 */
public class FileManagmentSystem extends javax.swing.JFrame {

    public void loadListOfFiles(String path) {

        File f = new File(path);
        File[] filesInDir = f.listFiles();
        List<String> list = new ArrayList<>();
        if (f.exists()) {

            if (f.isDirectory()) {
                for (File file : filesInDir) {
                    list.add(file.getName());

                }

            } else {
                list.add(f.getName());

            }
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(list.size());

            for (int i = 0; i < list.size(); i++) {
                jTable1.setValueAt(list.get(i), i, 0);
            }
        }

    }

    public void loadDataUser() {
        ArrayList<User> userArray = (ArrayList<User>) AllUserDB.getAll();
        User user;
        Iterator<User> ito = userArray.iterator();
        DefaultTableModel dtm = (DefaultTableModel) usertable.getModel();
        int row = 0;
        while (ito.hasNext()) {
            user = (User) ito.next();
            dtm.setRowCount(AllUserDB.getAll().size());
            usertable.setValueAt(user.getId(), row, 0);
            usertable.setValueAt(user.getName(), row, 1);
            usertable.setValueAt(user.getSurname(), row, 2);
            usertable.setValueAt(user.getAge(), row, 3);
            usertable.setValueAt(user.getUsername(), row, 4);
            usertable.setValueAt(user.getPassword(), row, 5);

            row++;
        }
    }

    public void loadDataFile() {
        ArrayList<Files> fileArray = (ArrayList<Files>) AllUserDB.getAllFiles();
        Files file;
        Iterator<Files> ito = fileArray.iterator();
        DefaultTableModel dtm = (DefaultTableModel) fileTable.getModel();
        int row = 0;
        while (ito.hasNext()) {
            dtm.setRowCount(fileArray.size());
            file = (Files) ito.next();
            fileTable.setValueAt(file.getId(), row, 0);
            fileTable.setValueAt(file.getName(), row, 1);
            row++;
        }
    }

    public void loadData() {
        ArrayList<User> userArray = (ArrayList<User>) AllUserDB.getAllFromExtendedUser();
        User user;
        Iterator<User> ito = userArray.iterator();
        DefaultTableModel dtm = (DefaultTableModel) usertable.getModel();
        int row = 0;
        while (ito.hasNext()) {

            dtm.setRowCount(AllUserDB.getAllFromExtendedUser().size());
            user = (User) ito.next();
            usertable.setValueAt(user.getId(), row, 0);
            usertable.setValueAt(user.getName(), row, 1);
            usertable.setValueAt(user.getSurname(), row, 2);
            usertable.setValueAt(user.getAge(), row, 3);
            usertable.setValueAt(user.getUsername(), row, 4);
            usertable.setValueAt(user.getPassword(), row, 5);
            row++;
        }
    }

    public FileManagmentSystem() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        userpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        folderPath = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        rename = new javax.swing.JButton();
        rename1 = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        check = new javax.swing.JButton();
        fileTablePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        renameField = new javax.swing.JTextField();
        adminPanel = new javax.swing.JPanel();
        showExtendedUser = new javax.swing.JPanel();
        extendlabel = new javax.swing.JLabel();
        permit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        refreshAllUsers = new javax.swing.JButton();
        adminSetFolder = new javax.swing.JButton();
        viewUser = new javax.swing.JButton();
        setUnreachableFolders = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        adminAddReachableFolder = new javax.swing.JTextField();
        addUnreachableFolder = new javax.swing.JButton();
        unreachAbleFilePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fileTable = new javax.swing.JTable();
        viewAllUser = new javax.swing.JButton();
        viewUnreachAbleFolders = new javax.swing.JButton();
        adminLogOut = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        firstOpenedPanel = new javax.swing.JPanel();
        chooseoperation = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        exit2 = new javax.swing.JButton();
        loginpanel = new javax.swing.JPanel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        exit4 = new javax.swing.JButton();
        registers = new javax.swing.JPanel();
        registerInformation = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameuser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passworduser = new javax.swing.JTextField();
        surnameuser = new javax.swing.JTextField();
        ageuser = new javax.swing.JTextField();
        usernameuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        wait = new javax.swing.JPanel();
        reuestlabel = new javax.swing.JLabel();
        backhome = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Lucida Sans Unicode", 1, 10)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setText("Enter folder or file path");

        folderPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folderPathActionPerformed(evt);
            }
        });

        info.setText("Info selected path");

        rename.setText("Rename");
        rename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameActionPerformed(evt);
            }
        });

        rename1.setText("Delete");
        rename1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rename1ActionPerformed(evt);
            }
        });

        LogOut.setText("LogOut");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        check.setText("Check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "FileName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout fileTablePanelLayout = new javax.swing.GroupLayout(fileTablePanel);
        fileTablePanel.setLayout(fileTablePanelLayout);
        fileTablePanelLayout.setHorizontalGroup(
            fileTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );
        fileTablePanelLayout.setVerticalGroup(
            fileTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileTablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );

        renameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userpanelLayout = new javax.swing.GroupLayout(userpanel);
        userpanel.setLayout(userpanelLayout);
        userpanelLayout.setHorizontalGroup(
            userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(418, 418, 418))
            .addGroup(userpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(userpanelLayout.createSequentialGroup()
                                .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check))
                            .addGroup(userpanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(rename)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rename1)
                                .addGap(27, 27, 27)
                                .addComponent(LogOut)
                                .addGap(18, 18, 18)
                                .addComponent(exit1)))
                        .addGroup(userpanelLayout.createSequentialGroup()
                            .addComponent(renameField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(236, 236, 236)))
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userpanelLayout.setVerticalGroup(
            userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userpanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check))
                .addGap(39, 39, 39)
                .addComponent(fileTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info)
                .addGap(4, 4, 4)
                .addComponent(renameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rename)
                    .addComponent(rename1)
                    .addComponent(LogOut)
                    .addComponent(exit1))
                .addGap(97, 97, 97))
        );

        getContentPane().add(userpanel);

        extendlabel.setText("These People want to sign up Our Application");

        permit.setText("Permit");
        permit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permitActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Surname", "Age", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usertable);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        refreshAllUsers.setText("Refresh");
        refreshAllUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshAllUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showExtendedUserLayout = new javax.swing.GroupLayout(showExtendedUser);
        showExtendedUser.setLayout(showExtendedUserLayout);
        showExtendedUserLayout.setHorizontalGroup(
            showExtendedUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showExtendedUserLayout.createSequentialGroup()
                .addGroup(showExtendedUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showExtendedUserLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(permit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshAllUsers))
                    .addGroup(showExtendedUserLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showExtendedUserLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(extendlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        showExtendedUserLayout.setVerticalGroup(
            showExtendedUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showExtendedUserLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(extendlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(showExtendedUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(permit)
                    .addComponent(delete)
                    .addComponent(refresh)
                    .addComponent(refreshAllUsers))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        adminSetFolder.setText("Set Unreacable Folder");
        adminSetFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSetFolderActionPerformed(evt);
            }
        });

        viewUser.setText("View Extended User");
        viewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserActionPerformed(evt);
            }
        });

        setVisible(false);

        jLabel2.setText("Enter name of folder which users cant reach them");

        addUnreachableFolder.setText("ADD");
        addUnreachableFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUnreachableFolderActionPerformed(evt);
            }
        });

        fileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Number", "PathFile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(fileTable);

        javax.swing.GroupLayout unreachAbleFilePanelLayout = new javax.swing.GroupLayout(unreachAbleFilePanel);
        unreachAbleFilePanel.setLayout(unreachAbleFilePanelLayout);
        unreachAbleFilePanelLayout.setHorizontalGroup(
            unreachAbleFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unreachAbleFilePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        unreachAbleFilePanelLayout.setVerticalGroup(
            unreachAbleFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unreachAbleFilePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout setUnreachableFoldersLayout = new javax.swing.GroupLayout(setUnreachableFolders);
        setUnreachableFolders.setLayout(setUnreachableFoldersLayout);
        setUnreachableFoldersLayout.setHorizontalGroup(
            setUnreachableFoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setUnreachableFoldersLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(setUnreachableFoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(setUnreachableFoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(setUnreachableFoldersLayout.createSequentialGroup()
                            .addComponent(adminAddReachableFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(addUnreachableFolder)))
                    .addGroup(setUnreachableFoldersLayout.createSequentialGroup()
                        .addComponent(unreachAbleFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setUnreachableFoldersLayout.setVerticalGroup(
            setUnreachableFoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setUnreachableFoldersLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(setUnreachableFoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAddReachableFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUnreachableFolder))
                .addGap(43, 43, 43)
                .addComponent(unreachAbleFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        viewAllUser.setText("View User");
        viewAllUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllUserActionPerformed(evt);
            }
        });

        viewUnreachAbleFolders.setText("View Unreachable files");
        viewUnreachAbleFolders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUnreachAbleFoldersActionPerformed(evt);
            }
        });

        adminLogOut.setText("LogOut");
        adminLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogOutActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminPanelLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(setUnreachableFolders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(showExtendedUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(adminSetFolder)
                .addGap(18, 18, 18)
                .addComponent(viewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewAllUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewUnreachAbleFolders)
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminLogOut)
                .addGap(29, 29, 29)
                .addComponent(exit)
                .addGap(61, 61, 61))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminSetFolder)
                    .addComponent(viewUser)
                    .addComponent(viewAllUser)
                    .addComponent(viewUnreachAbleFolders))
                .addGap(30, 30, 30)
                .addComponent(showExtendedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setUnreachableFolders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLogOut)
                    .addComponent(exit))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(adminPanel);

        jLabel3.setText("What do you want?");

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        exit2.setText("Exit");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseoperationLayout = new javax.swing.GroupLayout(chooseoperation);
        chooseoperation.setLayout(chooseoperationLayout);
        chooseoperationLayout.setHorizontalGroup(
            chooseoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseoperationLayout.createSequentialGroup()
                .addGroup(chooseoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(chooseoperationLayout.createSequentialGroup()
                        .addComponent(login)
                        .addGap(18, 18, 18)
                        .addComponent(register)
                        .addGap(46, 46, 46)
                        .addComponent(exit2)))
                .addGap(0, 125, Short.MAX_VALUE))
        );
        chooseoperationLayout.setVerticalGroup(
            chooseoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseoperationLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chooseoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(chooseoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(login)
                        .addComponent(register)))
                .addContainerGap())
        );

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jLabel10.setText("Username");

        jLabel11.setText("Password");

        exit4.setText("Exit");
        exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtusername)
                    .addComponent(txtpassword)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exit4)
                .addGap(6, 6, 6))
        );

        jLabel5.setText("Enter you information");

        jLabel6.setText("Surname");

        jLabel7.setText("Age");

        jLabel8.setText("Username");

        nameuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameuserActionPerformed(evt);
            }
        });

        jLabel9.setText("Password");

        passworduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passworduserActionPerformed(evt);
            }
        });

        surnameuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameuserActionPerformed(evt);
            }
        });

        ageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageuserActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        exit3.setText("Exit");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerInformationLayout = new javax.swing.GroupLayout(registerInformation);
        registerInformation.setLayout(registerInformationLayout);
        registerInformationLayout.setHorizontalGroup(
            registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerInformationLayout.createSequentialGroup()
                        .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passworduser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit3)))
                    .addComponent(submit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerInformationLayout.setVerticalGroup(
            registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerInformationLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passworduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerInformationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit3)
                .addContainerGap())
        );

        reuestlabel.setText("Wait us. your request sending to admin");

        backhome.setText("backhome");
        backhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout waitLayout = new javax.swing.GroupLayout(wait);
        wait.setLayout(waitLayout);
        waitLayout.setHorizontalGroup(
            waitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waitLayout.createSequentialGroup()
                .addGroup(waitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(waitLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reuestlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(waitLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backhome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        waitLayout.setVerticalGroup(
            waitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waitLayout.createSequentialGroup()
                .addComponent(reuestlabel)
                .addGap(18, 18, 18)
                .addComponent(backhome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registersLayout = new javax.swing.GroupLayout(registers);
        registers.setLayout(registersLayout);
        registersLayout.setHorizontalGroup(
            registersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wait, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registersLayout.setVerticalGroup(
            registersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registersLayout.createSequentialGroup()
                .addComponent(registerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(wait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout firstOpenedPanelLayout = new javax.swing.GroupLayout(firstOpenedPanel);
        firstOpenedPanel.setLayout(firstOpenedPanelLayout);
        firstOpenedPanelLayout.setHorizontalGroup(
            firstOpenedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstOpenedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstOpenedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstOpenedPanelLayout.createSequentialGroup()
                        .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(firstOpenedPanelLayout.createSequentialGroup()
                        .addComponent(chooseoperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(registers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        firstOpenedPanelLayout.setVerticalGroup(
            firstOpenedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstOpenedPanelLayout.createSequentialGroup()
                .addComponent(chooseoperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        getContentPane().add(firstOpenedPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        renameField.setVisible(false);
        fileTablePanel.setVisible(false);
        unreachAbleFilePanel.setVisible(false);
        wait.setVisible(false);
        setUnreachableFolders.setVisible(false);
        userpanel.setVisible(false);
        adminPanel.setVisible(false);
        loginpanel.setVisible(false);
        registers.setVisible(false);
        firstOpenedPanel.setVisible(true);
        showExtendedUser.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        chooseoperation.setVisible(false);
        registers.setVisible(true);
        registerInformation.setVisible(true);
        wait.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        firstOpenedPanel.setVisible(true);
        loginpanel.setVisible(true);
        chooseoperation.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        for (User s : AllUserDB.getAll()) {

            if (s.getUsername().equals(txtusername.getText()) && s.getPassword().equals(txtpassword.getText())) {
                loginpanel.setVisible(false);
                if (s.isIsAdmin()) {
                    adminPanel.setVisible(true);
                } else {
                    userpanel.setVisible(true);

                }
            }

        }
        txtusername.setText("");
        txtpassword.setText("");
        info.setVisible(false);
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void backhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backhomeActionPerformed
        chooseoperation.setVisible(true);
        wait.setVisible(false);

    }//GEN-LAST:event_backhomeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (ageuser.getText().equals("") || nameuser.getText().equals("")
                || surnameuser.getText().equals("")
                || usernameuser.getText().equals("")
                || passworduser.getText().equals("")) {
            JOptionPane jOptionPane = new JOptionPane();
            JOptionPane.showMessageDialog(jOptionPane, "Enter all information and try again", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            User u = new User(nameuser.getText(), surnameuser.getText(), Integer.parseInt(ageuser.getText()), usernameuser.getText(), passworduser.getText(), false);
            AllUserDB.add(u);
            registerInformation.setVisible(false);
            wait.setVisible(true);
            surnameuser.setText("");
            ageuser.setText("");
            usernameuser.setText("");
            passworduser.setText("");
            nameuser.setText("");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void ageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageuserActionPerformed

    private void surnameuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameuserActionPerformed

    private void passworduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passworduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passworduserActionPerformed

    private void nameuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameuserActionPerformed

    private void folderPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folderPathActionPerformed

    }//GEN-LAST:event_folderPathActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        userpanel.setVisible(false);
        chooseoperation.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void permitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permitActionPerformed
        Integer id = (Integer) usertable.getModel().getValueAt(usertable.getSelectedRow(), 0);
        AllUserDB.addFromExtendedUser(id);
        AllUserDB.deleteExtendedUser(id);

    }//GEN-LAST:event_permitActionPerformed

    private void adminSetFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSetFolderActionPerformed
        unreachAbleFilePanel.setVisible(false);
        setUnreachableFolders.setVisible(true);
        fileTable.setVisible(false);
        jLabel2.setVisible(true);
        adminAddReachableFolder.setVisible(true);
        addUnreachableFolder.setVisible(true);
        showExtendedUser.setVisible(false);
    }//GEN-LAST:event_adminSetFolderActionPerformed

    private void viewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserActionPerformed
        DefaultTableModel dfm = (DefaultTableModel) usertable.getModel();
        dfm.getDataVector().removeAllElements();
        loadData();
        refreshAllUsers.setVisible(false);
        refresh.setVisible(true);
        showExtendedUser.setVisible(true);
        extendlabel.setVisible(true);
        permit.setVisible(true);
        delete.setVisible(true);
        setUnreachableFolders.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_viewUserActionPerformed

    private void addUnreachableFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUnreachableFolderActionPerformed
        if (adminAddReachableFolder.getText().equals("")) {
            JOptionPane jOptionPane = new JOptionPane();
            JOptionPane.showMessageDialog(jOptionPane, "Enter path and try again", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            AllUserDB.addFile(new Files(adminAddReachableFolder.getText()));
        }
        adminAddReachableFolder.setText("");
    }//GEN-LAST:event_addUnreachableFolderActionPerformed

    private void viewAllUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllUserActionPerformed
        DefaultTableModel dfm = (DefaultTableModel) usertable.getModel();
        dfm.getDataVector().removeAllElements();
        loadDataUser();
        refresh.setVisible(false);
        refreshAllUsers.setVisible(true);
        setUnreachableFolders.setVisible(false);
        showExtendedUser.setVisible(true);
        extendlabel.setVisible(false);
        permit.setVisible(false);
        delete.setVisible(false);
        setUnreachableFolders.setVisible(false);
    }//GEN-LAST:event_viewAllUserActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Integer id = (Integer) usertable.getModel().getValueAt(usertable.getSelectedRow(), 0);
        AllUserDB.deleteExtendedUser(id);
    }//GEN-LAST:event_deleteActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        DefaultTableModel dfm = (DefaultTableModel) usertable.getModel();
        dfm.getDataVector().removeAllElements();
        loadData();

    }//GEN-LAST:event_refreshActionPerformed

    private void refreshAllUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshAllUsersActionPerformed
        DefaultTableModel dfm = (DefaultTableModel) usertable.getModel();
        dfm.getDataVector().removeAllElements();
        loadDataUser();// TODO add your handling code here:
    }//GEN-LAST:event_refreshAllUsersActionPerformed

    private void viewUnreachAbleFoldersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUnreachAbleFoldersActionPerformed
        unreachAbleFilePanel.setVisible(true);
        showExtendedUser.setVisible(false);
        setUnreachableFolders.setVisible(true);
        addUnreachableFolder.setVisible(false);
        adminAddReachableFolder.setVisible(false);
        jLabel2.setVisible(false);
        loadDataFile();
        fileTable.setVisible(true);
    }//GEN-LAST:event_viewUnreachAbleFoldersActionPerformed

    private void adminLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogOutActionPerformed
        adminPanel.setVisible(false);
        chooseoperation.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_adminLogOutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(1);  // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        System.exit(1);  // TODO add your handling code here:
    }//GEN-LAST:event_exit1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        fileTablePanel.setVisible(false);
        List<Files> list = AllUserDB.getAllFiles();

        for (Files f : list) {
            if (folderPath.getText().equalsIgnoreCase(f.getName())) {
                info.setVisible(true);
                info.setText("Acces Denied");
                info.setForeground(Color.red);
                fileTablePanel.setVisible(false);

            }
            if (!folderPath.getText().equalsIgnoreCase(f.getName())) {

                String path = folderPath.getText();

                loadListOfFiles(path);
                fileTablePanel.setVisible(true);
                info.setVisible(false);
                jTable1.setVisible(true);

            }
        }


    }//GEN-LAST:event_checkActionPerformed

    private void renameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameActionPerformed
        int row = jTable1.getSelectedRow();
        int column = jTable1.getSelectedColumn();
        String name = (String) jTable1.getValueAt(row, column);
        String path = folderPath.getText() + "\\" + name;
        info.setText("Enter File or Folder new Name");
        info.setVisible(true);
        renameField.setVisible(true);
        String newname = renameField.getText();
        FileService.renameFile(path, newname);
    }//GEN-LAST:event_renameActionPerformed

    private void rename1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rename1ActionPerformed
        int row = jTable1.getSelectedRow();
        int column = jTable1.getSelectedColumn();
        String name = (String) jTable1.getValueAt(row, column);
        String path = folderPath.getText() + "\\" + name;
        System.out.println(path);
        File f = new File(path);
        f.delete();
    }//GEN-LAST:event_rename1ActionPerformed

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        System.exit(1);     // TODO add your handling code here:
    }//GEN-LAST:event_exit2ActionPerformed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed
        System.exit(1);     // TODO add your handling code here:
    }//GEN-LAST:event_exit3ActionPerformed

    private void exit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit4ActionPerformed
        System.exit(1);        // TODO add your handling code here:
    }//GEN-LAST:event_exit4ActionPerformed

    private void renameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FileManagmentSystem.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileManagmentSystem.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileManagmentSystem.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileManagmentSystem.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileManagmentSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JButton addUnreachableFolder;
    private javax.swing.JTextField adminAddReachableFolder;
    private javax.swing.JButton adminLogOut;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton adminSetFolder;
    private javax.swing.JTextField ageuser;
    private javax.swing.JButton backhome;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton check;
    private javax.swing.JPanel chooseoperation;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JButton exit2;
    private javax.swing.JButton exit3;
    private javax.swing.JButton exit4;
    private javax.swing.JLabel extendlabel;
    private javax.swing.JTable fileTable;
    private javax.swing.JPanel fileTablePanel;
    private javax.swing.JPanel firstOpenedPanel;
    private javax.swing.JTextField folderPath;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JTextField nameuser;
    private javax.swing.JTextField passworduser;
    private javax.swing.JButton permit;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refreshAllUsers;
    private javax.swing.JButton register;
    private javax.swing.JPanel registerInformation;
    private javax.swing.JPanel registers;
    private javax.swing.JButton rename;
    private javax.swing.JButton rename1;
    private javax.swing.JTextField renameField;
    private javax.swing.JLabel reuestlabel;
    private javax.swing.JPanel setUnreachableFolders;
    private javax.swing.JPanel showExtendedUser;
    private javax.swing.JButton submit;
    private javax.swing.JTextField surnameuser;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel unreachAbleFilePanel;
    private javax.swing.JTextField usernameuser;
    private javax.swing.JPanel userpanel;
    private javax.swing.JTable usertable;
    private javax.swing.JButton viewAllUser;
    private javax.swing.JButton viewUnreachAbleFolders;
    private javax.swing.JButton viewUser;
    private javax.swing.JPanel wait;
    // End of variables declaration//GEN-END:variables
}
