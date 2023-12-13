package com.pss.view;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class TelaPrincipal extends JFrame {
    private JComboBox<String> seletorOpcoes;
    private JTextArea areaTexto;
    private JPanel panelMeio;
    private JLabel label;

    private JButton btnRestaurarPadrao;
    private JButton btnDesfazer;
    private JButton btnFechar;

    public TelaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Gráfico");

        JPanel panelTopo = new JPanel(new FlowLayout());
        this.label = new JLabel("Gráfico Padrão");
        this.seletorOpcoes = new JComboBox<>(new String[]{"Opção 1", "Opção 2", "Opção 3"});
        panelTopo.add(label);
        panelTopo.add(seletorOpcoes);

        this.panelMeio = new JPanel(new BorderLayout());
        JPanel panelEsquerda = new JPanel();
        JPanel panelDireita = new JPanel();

        DefaultListModel<JCheckBox> listModel = new DefaultListModel<>();
        listModel.addElement(new JCheckBox("Item 1"));
        listModel.addElement(new JCheckBox("Item 2"));
        listModel.addElement(new JCheckBox("Item 3"));

        JList<JCheckBox> checkboxList = new JList<>(listModel);
        JScrollPane scrollLista = new JScrollPane(checkboxList);
        panelEsquerda.add(scrollLista);

        this.areaTexto = new JTextArea("Texto do gráfico");
        panelDireita.add(areaTexto);

        panelMeio.add(panelEsquerda, BorderLayout.WEST);
        panelMeio.add(panelDireita, BorderLayout.CENTER);

        JPanel panelBaixo = new JPanel(new FlowLayout());
        this.btnDesfazer = new JButton("Desfazer");
        this.btnRestaurarPadrao = new JButton("Restaurar Padrão");
        this.btnFechar = new JButton("Fechar");
        panelBaixo.add(btnDesfazer);
        panelBaixo.add(btnRestaurarPadrao);
        panelBaixo.add(btnFechar);

        this.add(panelTopo, BorderLayout.NORTH);
        this.add(panelMeio, BorderLayout.CENTER);
        this.add(panelBaixo, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
    }
}
