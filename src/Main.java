package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.HashMap;

class MainWindow extends JFrame {


    private HashMap<Integer, String> mapa;

    public void main(String[] args) {
        HashMap<Integer,String> mapa;
        mapa = new HashMap<>();
        mapa.put(0,"Kowalski");
        mapa.put(0,"Nowak");
        mapa.put(0,"Rzonca");
        JFrame jframe = new JFrame();
        JButton jbutton = new JButton("nazwisko");
        MainWindow frame = new MainWindow();
        frame.setVisible(true);
    }

    public MainWindow(){

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));



    }
}