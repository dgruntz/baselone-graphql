package ch.baselone.graphql.shop.resolvers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import ch.baselone.graphql.shop.models.Product;
import ch.baselone.graphql.shop.repositories.ShopRepository;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private ShopRepository shopRepository;

	public Collection<Product> products() {
		return shopRepository.getAllProducts();
	}

	public Optional<Product> product(String id) {
		return shopRepository.getProductById(id);
	}
}
