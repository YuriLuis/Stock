/*
    Interface a ser implementada pelas classes que "seguram" informação.
    Os métodos tem como parâmetro e retorno objetos da classe Object
    para que fique o mais genérico possível, isto é, para que
    caso uma nova classe de registros tenha que ser implementada
    futuramente não se encontrem grandes problemas na implementação.

    @version 0.1.0
    @Author Diego
     */

package com.example.stock.data.Classes;

import java.util.ArrayList;

public interface Registros {

    /*
    Verifica se o objeto está disponível

    @param o
    @return boolean

    @version 0.1.0
    @Author Diego
     */
    public boolean checar(Object o);

    /*
    Adiciona o dado em algum lugar.

    @param o
    @return void

    @version 0.1.0
    @Author Diego
     */
    public void addDado(Object o);

    /*
    Remove o objeto de onde ele está guardado
    usando uma referência.

    @param o
    @return void

    @version 0.1.0
    @Author Diego
     */
    public void removerDado(Object o);

    /*
    Remove o objeto de onde ele está guardado
    usando o parâmetro, pode ser uma posição,
    um id, etc.

    @param index
    @return void

    @version 0.1.0
    @Author Diego
     */
    public void removerDado(int index);

    /*
    Pega o objeto de onde ele está guardado
    usando o parâmetro, pode ser uma posição,
    um id, etc.

    @param index
    @return Object

    @version 0.1.0
    @Author Diego
     */
    public Object getDado(int index);
}
