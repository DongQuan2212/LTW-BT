package com.example.bldq.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Category")
public class Category implements Serializable {
	

	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "CategoryId")
	    private Long categoryId;

	    @Column(name = "CategoryName", columnDefinition = "nvarchar(200)")
	    private String categoryName;


	    @Column(name = "Images", columnDefinition = "nvarchar(200)")
	    private String images;


	    @Column(name = "Status", columnDefinition = "nvarchar(200)")
	    private int status;

	    /* Kết nối với coffee */
	   @OneToMany(mappedBy = "category",cascade = CascadeType.ALL )
	   private Set<Coffee> coffees;
}
