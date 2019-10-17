package ch.baselone.graphql.shop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
	private String id;
	private String name;
}
