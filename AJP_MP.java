import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Calendar;
class AJP_MP extends JFrame
{   AJP_MP()
    {   Font f=new Font("Serif",Font.PLAIN,40);
        Font f1=new Font("Serif",Font.PLAIN,18);
        String a[][]={{"102","Pranav S.V.","Cancer","Male","22-05-2021","47"},
                      {"106","Sumit P.D.","Cold","Male","02-09-2021","23"},
                      {"76","Alok A.P.","Dengue","Male","12-08-2021","19"}};
        String c[]={"ID","Name","Disease","Gender","Admit Date","Age"};
        DefaultTableModel m=new DefaultTableModel(a,c);
        JTable jt=new JTable(m);
        JScrollPane sp=new JScrollPane(jt);
        String a1[][]={{"53","Dr. Salunkhe","ENT","05-11 AM","MBBS,MD","101"},
                      {"12","Dr. Chhabra","Cancer","12-03 PM","MBBS,MD","115"},
                      {"42","Dr. Deore","HIV/AIDS","09-12 AM","BDM","200"},
                      {"70","Dr. Varma","Liver Disease","08-10 PM","MBBS,MS","111"}};
        String c1[]={"ID","Name","Specialist","Timing","Qualification","Room No."};
        DefaultTableModel m1=new DefaultTableModel(a1,c1);
        JTable jt1=new JTable(m1);
        JScrollPane sp1=new JScrollPane(jt1);
        String a2[][]={{"1. X-Ray","Rs. 800","105"},
                      {"2. CT Scan","Rs. 1200","110"},
                      {"3. RT-PCR","Rs. 100","222"},
                      {"4. QR-Scan","Rs. 500","125"},
                      {"5. Blood Test","Rs. 200","108"},
                      {"6. Thyroid Test","Rs. 1000","102"},
                      {"7. Sonography","Rs. 500","212"}};
        String c2[]={"Facilities","Cost","Room No."};
        DefaultTableModel m2=new DefaultTableModel(a2,c2);
        JTable jt2=new JTable(m2);
        JScrollPane sp2=new JScrollPane(jt2);
        String a3[][]={{"1.    OPD(Allopathy & Homeopathy"},
                      {"2.     Dental Facility"},
                      {"3.     Ward/Indoor Facility"},
                      {"4.     Minor OT/Dressing Room"},
                      {"5.     Physiotheraphy"},
                      {"6.     Laboratory Services"},
                      {"7.     ECG Services"}};
        String c3[]={"Facilities"};
        DefaultTableModel m3=new DefaultTableModel(a3,c3);
        JTable jt3=new JTable(m3);
        JScrollPane sp3=new JScrollPane(jt3);
        String list[]={"Cancer","Covid-19","Heart Disease","Liver Disease","Cellac Disease","Diabetes",
                    "Influenza","Pneumonia","Chickenpox","Common Cold","Diphtheria","Giardiasis",
                    "HIV/AIDS","Pneumonia","Fibromyalgia","Scabies","Chlamydia","Diverticulitis",
                    "Bronchitis","Asthma"};
        JLabel l1=new JLabel("HOSPITAL  MANAGEMENT  SYSTEM");
        l1.setBounds(170,20,800,40);
        l1.setFont(f);
        add(l1);
        JLabel l2=new JLabel("");
        l2.setBounds(10,70,1000,20);
        l2.setFont(f);
        add(l2);
        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Calendar calendar = Calendar.getInstance();
        JLabel l3=new JLabel("Date: " + months[calendar.get(Calendar.MONTH)] + " " + 
        calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        l3.setBounds(10,100,150,20);
        l3.setFont(f1);
        add(l3);
        JLabel l4=new JLabel("Time : " + calendar.get(Calendar.HOUR) + " : " + 
        calendar.get(Calendar.MINUTE) + " : " + calendar.get(Calendar.SECOND));
        l4.setBounds(820,100,150,20);
        l4.setFont(f1);
        add(l4);
        JLabel l5=new JLabel("");
        l5.setBounds(10,120,1000,20);
        l5.setFont(f);
        add(l5);
        JButton b1=new JButton("Patients");
        b1.setBounds(50,170,150,50);
        b1.setFont(f1);
        add(b1);
        JButton b2=new JButton("Doctors");
        b2.setBounds(50,270,150,50);
        b2.setFont(f1);
        add(b2);
        JButton b3=new JButton("Laboratories");
        b3.setBounds(50,370,150,50);
        b3.setFont(f1);
        add(b3);
        JButton b4=new JButton("Facilities");
        b4.setBounds(50,470,150,50);
        b4.setFont(f1);
        add(b4);
        JButton b5=new JButton("Help");
        b5.setBounds(50,570,150,50);
        b5.setFont(f1);
        add(b5);
        JPanel p1=new JPanel();
        p1.setBounds(300,170,650,440);
        add(p1);
        JButton b9=new JButton("Cancel");
        b9.setBounds(450,350,150,50);
        b9.setFont(f1);
        b9.addActionListener(new ActionListener()
        {   public void actionPerformed(ActionEvent ae)
            {   p1.removeAll();     p1.repaint();       p1.revalidate();
            }
        });
        
        JLabel l=new JLabel();
        add(l);
        b1.addActionListener(new ActionListener()
        {   public void actionPerformed(ActionEvent ae)
            {   JButton b6=new JButton("New Patient");
                b6.setBounds(50,100,150,50);
                b6.setFont(f1);
                JButton b7=new JButton("Existing Patient");
                b7.setBounds(250,100,150,50);
                b7.setFont(f1);
                JButton b8=new JButton("Cancel");
                b8.setBounds(450,100,150,50);
                b8.setFont(f1);
                p1.setBackground(Color.PINK);p1.removeAll();p1.repaint();
                p1.add(b6);p1.add(b7);p1.add(b8);
                b6.addActionListener(new ActionListener()
                {   public void actionPerformed(ActionEvent ae)
                    {   JLabel l9=new JLabel("Register");
                        l9.setBounds(300,50,100,30);
                        l9.setFont(f1);
                        JLabel l10=new JLabel("First Name :");
                        l10.setBounds(10,100,100,20);
                        l10.setFont(f1);
                            JTextField t2=new JTextField();
                            t2.setBounds(130,100,150,25);
                            t2.setFont(f1);
                        JLabel l12=new JLabel("Middle Name :");
                        l12.setBounds(10,130,120,20);
                        l12.setFont(f1);
                            JTextField t3=new JTextField();
                            t3.setBounds(130,130,150,25);
                            t3.setFont(f1);
                        JLabel l13=new JLabel("Last Name :");
                        l13.setBounds(10,160,100,20);
                        l13.setFont(f1);
                            JTextField t4=new JTextField();
                            t4.setBounds(130,160,150,25);
                            t4.setFont(f1);
                        JLabel l14=new JLabel("Mobile No. :");
                        l14.setBounds(10,190,100,20);
                        l14.setFont(f1);
                            JTextField t5=new JTextField();
                            t5.setBounds(130,190,150,25);
                            t5.setFont(f1);
                        JLabel l15=new JLabel("Disease :");
                        l15.setBounds(300,100,100,20);
                        l15.setFont(f1);
                            JComboBox jc=new JComboBox(list);
                            jc.setBounds(400,100,150,25);
                        JLabel l16=new JLabel("Age :");
                        l16.setBounds(10,220,100,20);
                        l16.setFont(f1);
                            JTextField t6=new JTextField();
                            t6.setBounds(130,220,150,25);
                            t6.setFont(f1);
                        JLabel l17=new JLabel("Gender :");
                        l17.setBounds(10,250,100,20);
                        l17.setFont(f1);
                            ButtonGroup bg=new ButtonGroup();
                            JRadioButton r1=new JRadioButton("Male");
                            r1.setBounds(130,250,60,25);
                            bg.add(r1);
                                JRadioButton r2=new JRadioButton("Female");
                                r2.setBounds(190,250,70,25);
                                bg.add(r2);
                                    JRadioButton r3=new JRadioButton("Other");
                                    r3.setBounds(130,280,70,25);
                                    bg.add(r3);
                        JLabel l18=new JLabel("Address :");
                        l18.setBounds(300,130,100,20);
                        l18.setFont(f1);
                            JTextArea t7=new JTextArea();
                            t7.setBounds(400,130,150,100);
                        JLabel l19=new JLabel("Admit Date :");
                        l19.setBounds(300,250,100,20);
                        l19.setFont(f1);
                            JTextField t8=new JTextField();
                            t8.setBounds(400,250,150,25);
                            t8.setFont(f1);
                        JLabel l20=new JLabel("Password :");
                        l20.setBounds(300,280,100,20);
                        l20.setFont(f1);
                            JPasswordField ps3=new JPasswordField();
                            ps3.setBounds(400,280,150,25);
                            ps3.setFont(f1);
                        JLabel l21=new JLabel("Email :");
                        l21.setBounds(10,310,100,20);
                        l21.setFont(f1);
                            JTextField t9=new JTextField();
                            t9.setBounds(130,310,150,25);
                            t9.setFont(f1);
                        JLabel l11=new JLabel("Confirm Password :");
                        l11.setBounds(300,310,150,20);
                        l11.setFont(f1);
                            JPasswordField ps2=new JPasswordField();
                            ps2.setBounds(450,310,150,25);
                            ps2.setFont(f1);
                        JButton b12=new JButton("Submit");
                        b12.setBounds(200,350,150,50);
                        b12.setFont(f1);
                        p1.removeAll();
                        p1.repaint();p1.add(b9);p1.add(l9);p1.add(l10);p1.add(l11);p1.add(l12);
                        p1.add(l13);p1.add(l14);p1.add(l16);p1.add(t2);p1.add(t3);p1.add(t4);
                        p1.add(t5);p1.add(t6);p1.add(jc);p1.add(ps2);p1.add(b12);p1.add(l15);
                        p1.add(l17);p1.add(r1);p1.add(r2);p1.add(r3);p1.add(t7);p1.add(l18);
                        p1.add(l19);p1.add(t8);p1.add(l20);p1.add(ps3);p1.add(l21);p1.add(t9);
                        b12.addActionListener(new ActionListener()
                        {   public void actionPerformed(ActionEvent ae)
                            {   if(ps2.getText().equals("") || ps3.getText().equals("") || t2.getText().equals("")
                                    || t4.getText().equals("") || t5.getText().equals("")
                                    || t6.getText().equals("") || t8.getText().equals(""))
                                {   JOptionPane.showMessageDialog(b7,"Enter Valid Details !");
                                }
                                else if(ps2.getText().equals(ps3.getText()))
                                {   JOptionPane.showMessageDialog(b7,"Patient Registered Successfully");
                                    p1.removeAll();p1.repaint();
                                    String s2=t2.getText() +" "+ t3.getText() +" "+ t4.getText();
                                    String s3=t5.getText();
                                    String s4=t6.getText();
                                    String s5=t8.getText();
                                    String s6=jc.getSelectedItem().toString();
                                    String s7=ps3.getText();
                                    JOptionPane.showMessageDialog(t2,"Name of Patient : "+s2+"\nMobile No. : "+s3+
                                    "\nAge : "+s4+"\nDisease : "+s6+"\nAdmit Date : "+s5+"\nPassword : "+s7);
                                }
                                else
                                {   JOptionPane.showMessageDialog(b7,"Enter Valid Details !");  }
                            }
                        });
                    }
                });
                b7.addActionListener(new ActionListener()
                {   public void actionPerformed(ActionEvent ae)
                    {   JLabel l6=new JLabel("Login");
                        l6.setBounds(300,50,100,30);
                        l6.setFont(f1);
                        JLabel l7=new JLabel("Username :");
                        l7.setBounds(150,150,100,20);
                        l7.setFont(f1);
                            JTextField t1=new JTextField();
                            t1.setBounds(350,150,150,30);
                            t1.setFont(f1);
                        JLabel l8=new JLabel("Password :");
                        l8.setBounds(150,220,100,20);
                        l8.setFont(f1);
                            JPasswordField ps1=new JPasswordField();
                            ps1.setBounds(350,220,150,30);
                            ps1.setFont(f1);
                        JButton b10=new JButton("Submit");
                        b10.setBounds(200,350,150,50);
                        b10.setFont(f1);
                        p1.removeAll();
                        p1.repaint();p1.add(l6);p1.add(l7);p1.add(l8);p1.add(t1);p1.add(ps1);
                        p1.add(b10);p1.add(b9);

                        b10.addActionListener(new ActionListener()
                        {   public void actionPerformed(ActionEvent ae)
                            {   JButton b11=new JButton("Remove");
                                b11.setBounds(150,350,150,50);
                                b11.setFont(f1);
                                if(ps1.getText().equals("") || t1.getText().equals(""))
                                {   JOptionPane.showMessageDialog(b7,"Enter Username & Password");
                                }
                                else if(ps1.getText().equals("pass123") && t1.getText().equals("user1"))
                                {   JOptionPane.showMessageDialog(b7,"Login Successful");
                                    p1.removeAll();
                                    p1.repaint();sp.setBounds(50,10,550,300);p1.add(sp);sp.setFont(f1);
                                    p1.add(b9);p1.add(b11);

                                    b11.addActionListener(new ActionListener()
                                    {   public void actionPerformed(ActionEvent ae)
                                        {   if(jt.getSelectedRow()!= -1)
                                            {   m.removeRow(jt.getSelectedRow());  }
                                        }
                                    });
                                }
                                else
                                {   JOptionPane.showMessageDialog(b7,"User not registered");    }
                            }
                        });
                    }
                });
                b8.addActionListener(new ActionListener()
                {   public void actionPerformed(ActionEvent ae)
                    {   p1.removeAll();
                        p1.repaint();
                        p1.revalidate();
                    }
                });
            }
        });
        b2.addActionListener(new ActionListener()
            {   public void actionPerformed(ActionEvent ae)
                {   JButton b13=new JButton("New Doctor");
                b13.setBounds(50,100,150,50);
                b13.setFont(f1);
                JButton b14=new JButton("Existing Doctors");
                b14.setBounds(250,100,180,50);
                b14.setFont(f1);
                JButton b15=new JButton("Cancel");
                b15.setBounds(480,100,150,50);
                b15.setFont(f1);
                p1.setBackground(Color.PINK);p1.removeAll();p1.repaint();
                p1.add(b13);p1.add(b14);p1.add(b15);
                b13.addActionListener(new ActionListener()
                {   public void actionPerformed(ActionEvent ae)
                    {   JLabel l22=new JLabel("Register");
                        l22.setBounds(300,50,100,30);
                        l22.setFont(f1);
                        JLabel l23=new JLabel("First Name :");
                        l23.setBounds(10,100,100,20);
                        l23.setFont(f1);
                            JTextField t10=new JTextField();
                            t10.setBounds(180,100,150,25);
                            t10.setFont(f1);
                        JLabel l24=new JLabel("Middle Name :");
                        l24.setBounds(10,130,120,20);
                        l24.setFont(f1);
                            JTextField t11=new JTextField();
                            t11.setBounds(180,130,150,25);
                            t11.setFont(f1);
                        JLabel l25=new JLabel("Last Name :");
                        l25.setBounds(10,160,100,20);
                        l25.setFont(f1);
                            JTextField t12=new JTextField();
                            t12.setBounds(180,160,150,25);
                            t12.setFont(f1);
                        JLabel l26=new JLabel("Mobile No. :");
                        l26.setBounds(10,190,100,20);
                        l26.setFont(f1);
                            JTextField t13=new JTextField();
                            t13.setBounds(180,190,150,25);
                            t13.setFont(f1);
                        JLabel l27=new JLabel("Password :");
                        l27.setBounds(10,250,100,20);
                        l27.setFont(f1);
                            JPasswordField ps4=new JPasswordField();
                            ps4.setBounds(180,250,150,25);
                            ps4.setFont(f1);
                        JLabel l28=new JLabel("Email :");
                        l28.setBounds(10,220,100,20);
                        l28.setFont(f1);
                            JTextField t14=new JTextField();
                            t14.setBounds(180,220,150,25);
                            t14.setFont(f1);
                        JLabel l29=new JLabel("Confirm Password :");
                        l29.setBounds(10,280,150,20);
                        l29.setFont(f1);
                            JPasswordField ps5=new JPasswordField();
                            ps5.setBounds(180,280,150,25);
                            ps5.setFont(f1);
                        JButton b16=new JButton("Submit");
                        b16.setBounds(200,350,150,50);
                        b16.setFont(f1);
                        p1.removeAll();
                        p1.repaint();p1.add(b9);p1.add(l22);p1.add(l23);p1.add(l24);p1.add(l25);
                        p1.add(l26);p1.add(l27);p1.add(l28);p1.add(t10);p1.add(t11);p1.add(t12);
                        p1.add(t13);p1.add(t14);p1.add(ps4);p1.add(ps5);p1.add(b16);p1.add(l29);
                        b16.addActionListener(new ActionListener()
                        {   public void actionPerformed(ActionEvent ae)
                            {   if(ps4.getText().equals("") || ps5.getText().equals("") || t12.getText().equals("")
                                    || t10.getText().equals("") || t13.getText().equals(""))
                                {   JOptionPane.showMessageDialog(b14,"Enter Valid Details !");
                                }
                                else if(ps4.getText().equals(ps5.getText()))
                                {   JOptionPane.showMessageDialog(b14,"Registered Successfully !");
                                    p1.removeAll();p1.repaint();
                                    String s8=t10.getText() +" "+ t12.getText();
                                    String s9=t13.getText();
                                    String s10=ps5.getText();
                                    JOptionPane.showMessageDialog(t10,"Name : "+s8+"\nMobile No. : "+s9+
                                    "\nPassword : "+s10);
                                }
                                else
                                {   JOptionPane.showMessageDialog(b14,"Enter Valid Details !");  }
                            }
                        });
                    }
                });
                b14.addActionListener(new ActionListener()
                {   public void actionPerformed(ActionEvent ae)
                    {   JLabel l30=new JLabel("Login");
                        l30.setBounds(300,50,100,30);
                        l30.setFont(f1);
                        JLabel l31=new JLabel("Username :");
                        l31.setBounds(150,150,100,20);
                        l31.setFont(f1);
                            JTextField t15=new JTextField();
                            t15.setBounds(350,150,150,30);
                            t15.setFont(f1);
                        JLabel l32=new JLabel("Password :");
                        l32.setBounds(150,220,100,20);
                        l32.setFont(f1);
                            JPasswordField ps6=new JPasswordField();
                            ps6.setBounds(350,220,150,30);
                            ps6.setFont(f1);
                        JButton b17=new JButton("Submit");
                        b17.setBounds(200,350,150,50);
                        b17.setFont(f1);
                        p1.removeAll();
                        p1.repaint();p1.add(l32);p1.add(l30);p1.add(l31);p1.add(t15);p1.add(ps6);
                        p1.add(b17);p1.add(b9);

                        b17.addActionListener(new ActionListener()
                        {   public void actionPerformed(ActionEvent ae)
                            {   JButton b18=new JButton("Remove");
                                b18.setBounds(150,350,150,50);
                                b18.setFont(f1);
                                if(ps6.getText().equals("") || t15.getText().equals(""))
                                {   JOptionPane.showMessageDialog(b14,"Enter Username & Password");
                                }
                                else if(ps6.getText().equals("pass123") && t15.getText().equals("user1"))
                                {   JOptionPane.showMessageDialog(b14,"Login Successful");
                                    p1.removeAll();
                                    p1.repaint();sp1.setBounds(50,10,550,300);p1.add(sp1);sp1.setFont(f1);
                                    p1.add(b9);p1.add(b18);

                                    b18.addActionListener(new ActionListener()
                                    {   public void actionPerformed(ActionEvent ae)
                                        {   if(jt1.getSelectedRow()!= -1)
                                            {   m1.removeRow(jt1.getSelectedRow());  }
                                        }
                                    });
                                }
                                else
                                {   JOptionPane.showMessageDialog(b14,"Name not registered");    }
                            }
                        });
                    }
                });
                b15.addActionListener(new ActionListener()
                {   public void actionPerformed(ActionEvent ae)
                    {   p1.removeAll();
                        p1.repaint();
                        p1.revalidate();
                    }
                });
                }
            });
        b3.addActionListener(new ActionListener()
            {   public void actionPerformed(ActionEvent ae)
                {   p1.removeAll();
                    p1.repaint();
                    p1.setBackground(Color.PINK);
                    sp2.setBounds(50,10,550,300);
                    p1.add(sp2);p1.add(b9);
                }
            });
        b4.addActionListener(new ActionListener()
            {   public void actionPerformed(ActionEvent ae)
                {   p1.removeAll();
                    p1.repaint();
                    p1.setBackground(Color.PINK);
                    sp3.setBounds(50,50,550,250);
                    p1.add(sp3);p1.add(b9);
                }
            });
        b5.addActionListener(new ActionListener()
            {   public void actionPerformed(ActionEvent ae)
                {   JButton b19=new JButton("Help");
                    b19.setBounds(250,100,180,50);
                    b19.setFont(f1);
                    JButton b20=new JButton("Feedback");
                    b20.setBounds(250,200,180,50);
                    b20.setFont(f1);
                    p1.removeAll();p1.repaint();
                    p1.setBackground(Color.PINK);
                    p1.add(b19);p1.add(b20);p1.add(b9);
                    b19.addActionListener(new ActionListener()
                    {   public void actionPerformed(ActionEvent ae)
                        {   JLabel l33=new JLabel("Describe your Problem :");
                            l33.setBounds(250,100,200,25);
                            l33.setFont(f1);
                            JTextArea t16=new JTextArea();
                            t16.setBounds(100,150,470,180);
                            t16.setFont(f1);
                            JButton b21=new JButton("Submit");
                            b21.setBounds(200,350,150,50);
                            b21.setFont(f1);
                            p1.removeAll();
                            p1.repaint();
                            p1.setBackground(Color.PINK);
                            p1.add(b9);p1.add(l33);p1.add(t16);p1.add(b21);
                            b21.addActionListener(new ActionListener()
                            {   public void actionPerformed(ActionEvent ae)
                                {   JOptionPane.showMessageDialog(l33,"Sorry for Inconvience !\nWe will try to Solve it");
                                }
                            });
                        }
                    });
                    b20.addActionListener(new ActionListener()
                    {   public void actionPerformed(ActionEvent ae)
                        {   JLabel l34=new JLabel("Say Something :");
                            l34.setBounds(250,100,200,25);
                            l34.setFont(f1);
                            JTextArea t17=new JTextArea();
                            t17.setBounds(100,150,400,150);
                            t17.setFont(f1);
                            JButton b22=new JButton("Submit");
                            b22.setBounds(200,350,150,50);
                            b22.setFont(f1);
                            p1.removeAll();
                            p1.repaint();
                            p1.setBackground(Color.PINK);
                            p1.add(b9);p1.add(l34);p1.add(t17);p1.add(b22);
                            b22.addActionListener(new ActionListener()
                            {   public void actionPerformed(ActionEvent ae)
                                {   JOptionPane.showMessageDialog(l34,"Thanks For Your Valuable Feedback !");
                                }
                            });
                        }
                    });
                }
            });
        setVisible(true);
        setSize(1000,700);
        setTitle("HOSPITAL MANAGEMENT SYSTEM");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] arg)
    {   AJP_MP ob=new AJP_MP();
    }
}