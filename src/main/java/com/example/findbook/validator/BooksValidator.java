package com.example.findbook.validator;


import com.example.findbook.entities.Books;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BooksValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Books.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Books product = (Books) target;

		// whether file has been selected or not
		if (product.getFile() == null || product.getFile().getOriginalFilename().equals("")) {
			errors.rejectValue("file", null, "Please select an image file to upload!");
			return;
		}
		if (!(product.getFile().getContentType().equals("image/jpeg")
				|| product.getFile().getContentType().equals("image/png"))) {
			errors.rejectValue("file", null, "Please use only an image file to upload!");
			return;

		}

	}

}
