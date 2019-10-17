package ch.baselone.graphql.shop.resolvers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInput {
	private String title;
	private String description;
	private String imageUrl;
}
