package bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estado.class)
public abstract class Estado_ {

	public static volatile SingularAttribute<Estado, String> uf;
	public static volatile ListAttribute<Estado, Cidade> cidade;
	public static volatile ListAttribute<Estado, Paciente> pacientes;
	public static volatile SingularAttribute<Estado, String> nome;
	public static volatile SingularAttribute<Estado, Integer> idestado;

}

