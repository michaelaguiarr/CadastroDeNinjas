package dev.java10x.cadastrodeninjas.ninjas.model;


import dev.java10x.cadastrodeninjas.missoes.model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_cadastro")
public class NinjaModel {

    //teste git amend

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    // @ManyToOne - Um Ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
