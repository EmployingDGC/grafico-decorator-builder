package com.pss.presenter;

import com.pss.view.TelaPrincipal;

public class TelaPrincipalPresenter {
    private TelaPrincipal telaPrincipal;

    public TelaPrincipalPresenter() {
        this.telaPrincipal = new TelaPrincipal();

        this.telaPrincipal.setVisible(true);
    }

    public TelaPrincipal getView() {
        return this.telaPrincipal;
    }
}
