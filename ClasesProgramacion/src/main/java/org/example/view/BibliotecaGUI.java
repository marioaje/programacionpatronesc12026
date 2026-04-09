package org.example.view;

import org.example.controller.BibliotecaController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaGUI {
    private JButton button1;

    public BibliotecaGUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BibliotecaController bibliotecaController = new BibliotecaController();
                bibliotecaController.inicioSistema();
            }
        });
    }
}
