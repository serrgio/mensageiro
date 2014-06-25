package com.br.example.mensageiroufg.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ItemListView extends ActionBarActivity {
    private String remetente;
    private String data;
    private String textoMensagem;
    public ItemListView() {
        this("");
    }
    public ItemListView(String texto) {
        this.remetente = texto;
    }
    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTextoMensagem() {
        return textoMensagem;
    }

    public void setTextoMensagem(String textoMensagem) {
        this.textoMensagem = textoMensagem;
    }
}
