package entities;

import entities.enums.CategoriaProduto;
import entities.enums.StatusProduto;

public class Produto {
    private String nome;
    private Integer quantidade;
    private Agricultor agricultor;
    private double preco;
    private CategoriaProduto categoria;
    private StatusProduto status;
}
