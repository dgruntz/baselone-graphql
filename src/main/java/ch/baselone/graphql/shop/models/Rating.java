package ch.baselone.graphql.shop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rating {
	private String id;
	private Product product;
	private Customer customer;
	private int score;
	private String comment;
}
