package com.example.bldq.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coffee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CoffeeId")
    private Long CoffeeId;

    @Column(name = "active")
    private boolean active;

    @Column(name = "Description", columnDefinition = "nvarchar(500) not null" )
    private String description;

    @Column(name = "Poster" ,columnDefinition = "nvarchar(500)")
    private String poster;


    @Column(name = "Title",columnDefinition = "nvarchar(500)")
    private String title;


    @Column(name = "Views")
    private int views;

    //Kết nối với category
    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;
	

}
