package ch.baselone.graphql.shop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private String id;
	private String title;
	private String description;
	private String imageUrl;
}
