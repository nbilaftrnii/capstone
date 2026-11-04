package main;
import view.WelcomeView; import javax.swing.*;
public class MainApp { public static void main(String[] args){ try{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}catch(Exception ignored){} SwingUtilities.invokeLater(()->new WelcomeView().setVisible(true)); } }
