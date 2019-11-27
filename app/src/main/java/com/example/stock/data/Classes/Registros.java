package com.example.stock.data.Classes;

import java.util.ArrayList;

public interface Registros {

    public boolean checar(Object o);
    public void addDado(Object o);
    public void removerDado(Object o);
    public void removerDado(int index);
    public Object getDado(int index);
}
