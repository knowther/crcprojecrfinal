package bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tiposanguineo.class)
public abstract class Tiposanguineo_ {

	public static volatile SingularAttribute<Tiposanguineo, String> nometipo;
	public static volatile ListAttribute<Tiposanguineo, Paciente> pacientes;
	public static volatile SingularAttribute<Tiposanguineo, Integer> idtiposanguineo;

}

