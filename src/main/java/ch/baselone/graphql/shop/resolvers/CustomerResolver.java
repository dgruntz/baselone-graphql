package ch.baselone.graphql.shop.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import ch.baselone.graphql.shop.models.Customer;
import ch.baselone.graphql.shop.models.Rating;
import ch.baselone.graphql.shop.repositories.ShopRepository;

@Component
public class CustomerResolver implements GraphQLResolver<Customer> {

	@Autowired
	private ShopRepository shopRepository;

	// retuns the ratings of this customer
	public List<Rating> ratings(Customer c) {
		return shopRepository.getRatingsForCustomer(c);
	}
}
