package entities;

import entities.enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer id;
    private Mercado mercado;
    private Agricultor agricultor;
    private LocalDateTime data;
    private double valorTotalo;
    private List<ItemPedido> itensDoPedido = new ArrayList<>();
    private StatusPedido status;
}
