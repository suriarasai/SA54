package sg.edu.iss.mystore.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import sg.edu.iss.mystore.domain.Product;

public class ProductValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Product.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Product p = (Product) target;
		//Write any business validation here if needed
		System.out.println(p.toString());
		ValidationUtils.rejectIfEmpty(errors, "productId", "Product ID cannot be left empty");
		
	}
	

}
