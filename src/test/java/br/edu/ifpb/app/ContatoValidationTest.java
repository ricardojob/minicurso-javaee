package br.edu.ifpb.app;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/11/2017, 18:20:32
 */
public class ContatoValidationTest {

    private static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void contatoInvalidoTest() {

        Contato contato = new Contato();

        Set<ConstraintViolation<Contato>> constraintViolations = 
                validator.validate(contato);

        Assert.assertEquals(3, constraintViolations.size());

    }
}
